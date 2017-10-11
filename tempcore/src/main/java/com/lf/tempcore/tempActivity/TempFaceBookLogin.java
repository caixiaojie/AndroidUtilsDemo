package com.lf.tempcore.tempActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.gson.Gson;
import com.lf.tempcore.tempModule.tempDebuger.Debug;
import com.lf.tempcore.tempResponse.ResponseFbLoginInfo;

import org.json.JSONObject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by chenlingkeji on 2016/12/29.
 */

public class TempFaceBookLogin {
    private static final String TAG ="TempFaceBookLogin";
    private Activity activity ;
    private CallbackManager callbackManager ;
    private FacebookListener facebookListener ;
    private List<String> permissions = Collections.<String>emptyList();
    private LoginManager loginManager;

    public TempFaceBookLogin(final Activity activity ){
        this.activity = activity ;

        //初始化facebook登录服务
        callbackManager = CallbackManager.Factory.create() ;
        getLoginManager().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // login success
                AccessToken accessToken = loginResult.getAccessToken();

                getLoginInfo(accessToken);
            }

            @Override
            public void onCancel() {
                Log.e("facebook","facebook login cancel");
                //取消登录
            }

            @Override
            public void onError(FacebookException error) {
                //登录出错
                Toast.makeText(activity.getBaseContext(),"facebook login error:"+error.getMessage(), Toast.LENGTH_SHORT).show();
                Log.e("facebook","facebook login error:"+error.getMessage());
            }
        });

        permissions = Arrays
                .asList("email", "user_likes", "user_status", "user_photos", "user_birthday", "public_profile", "user_friends") ;
    }

    /**
     * 登录
     */
    public void login(){
        getLoginManager().logInWithReadPermissions(
                activity, permissions);
    }

    /**
     * 退出
     */
    public void logout(){
        getLoginManager().logOut();
       /* String logout = activity.getResources().getString(
                com.facebook.R.string.com_facebook_loginview_log_out_action);
        String cancel = activity.getResources().getString(
                com.facebook.R.string.com_facebook_loginview_cancel_action);
        String message;
        Profile profile = Profile.getCurrentProfile();
        if (profile != null && profile.getName() != null) {
            message = String.format(
                    activity.getResources().getString(
                            com.facebook.R.string.com_facebook_loginview_logged_in_as),
                    profile.getName());
        } else {
            message = activity.getResources().getString(
                    com.facebook.R.string.com_facebook_loginview_logged_in_using_facebook);
        }
       AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setMessage(message)
                .setCancelable(true)
                .setPositiveButton(logout, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        getLoginManager().logOut();
                    }
                })
                .setNegativeButton(cancel, null);
        builder.create().show();*/
    }

    /**
     * 获取登录信息
     * @param accessToken
     */
    public void getLoginInfo(final AccessToken accessToken ){
        GraphRequest request = GraphRequest.newMeRequest(accessToken, new GraphRequest.GraphJSONObjectCallback() {
            @Override
            public void onCompleted(JSONObject object, GraphResponse response) {
                Gson gson = new Gson();

                if (object != null) {
                    ResponseFbLoginInfo fbLoginInfo = gson.fromJson(String.valueOf(object),ResponseFbLoginInfo.class);
                    Debug.error(fbLoginInfo.getId());
                    facebookListener.facebookLoginSuccess(fbLoginInfo);
//                    activity.finish();
                   /* String id = object.optString("id");   //比如:1565455221565
                    String name = object.optString("name");  //比如：Zhang San
                    String gender = object.optString("gender");  //性别：比如 male （男）  female （女）
                    String emali = object.optString("email");  //邮箱：比如：56236545@qq.com

                    //获取用户头像
                    JSONObject object_pic = object.optJSONObject("picture");
                    JSONObject object_data = object_pic.optJSONObject("data");
                    String photo = object_data.optString("url");

                    //获取地域信息
                    String locale = object.optString("locale");   //zh_CN 代表中文简体*/

//                    Toast.makeText(activity, "" + object.toString(), Toast.LENGTH_SHORT).show();


                    Debug.info("-------"+TAG+"----------","object.toString()");
                }
            }
        }) ;

        Bundle parameters = new Bundle();
        parameters.putString("fields", "id,name,link,gender,birthday,email,picture,locale,updated_time,timezone,age_range,first_name,last_name");
        request.setParameters(parameters);
        request.executeAsync() ;
    }

    /**
     * 获取loginMananger
     * @return
     */
    private LoginManager getLoginManager() {
        if (loginManager == null) {
            loginManager = LoginManager.getInstance();
        }
        return loginManager;
    }

    public CallbackManager getCallbackManager(){
        return callbackManager ;
    }

    /**
     * 设置登录监听器
     * @param facebookListener
     */
    public void setFacebookListener( FacebookListener facebookListener ){
        this.facebookListener =facebookListener ;
    }

    public interface FacebookListener {
        void facebookLoginSuccess(ResponseFbLoginInfo info);
        void facebookLoginFail(ResponseFbLoginInfo info) ;
    }


}
