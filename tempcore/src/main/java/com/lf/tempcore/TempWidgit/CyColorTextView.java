package com.lf.tempcore.TempWidgit;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;

import com.lf.tempcore.R;


/**
 * Created by caoyang on 2017/6/15.
 */

public class CyColorTextView extends android.support.v7.widget.AppCompatTextView {
    private int string_color = 0, string_size = 0;//弃用
    private String string_rules = "";
    private int rulesStyle,strStyle;



    public CyColorTextView(Context context) {
        super(context);
        initView(context, null, 0, 0);
    }

    public CyColorTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs, 0, R.style.CyColorTextView);
    }


    public CyColorTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs, defStyleAttr, R.style.CyColorTextView);
    }

    private void initView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CyColorTextView, defStyleAttr, defStyleRes);
        string_color = a.getColor(R.styleable.CyColorTextView_string_color, 0);
        string_size = a.getDimensionPixelSize(R.styleable.CyColorTextView_string_size, 0);
        string_rules = a.getString(R.styleable.CyColorTextView_string_rules);
        rulesStyle = a.getResourceId(R.styleable.CyColorTextView_rulesStyle,0);
        strStyle= a.getResourceId(R.styleable.CyColorTextView_strStyle,0);
        SpannableString spannableString = setStringColor(context, getText().toString(), string_rules,rulesStyle,strStyle);
//        SpannableStringBuilder bu = TempSpannableStringUtil.setStringColor(getText().toString(), TempDensityUtil.px2sp(context, getTextSize()), string_rules, string_size, string_color);
        setText(spannableString, BufferType.SPANNABLE);
        a.recycle();
    }

    private SpannableString setStringColor(Context context, String str,
                                           String rules,
                                           int rulesStyle, int strStyle) {
        SpannableString styledText = new SpannableString(str);
        if (str==null&&str.length()==0&&str.contains(rules)){
            return styledText;
        }
        final int start = str.indexOf(rules);
        styledText.setSpan(new TextAppearanceSpan(context, strStyle), 0,start, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        styledText.setSpan(new TextAppearanceSpan(context, rulesStyle), start,start+rules.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        styledText.setSpan(new TextAppearanceSpan(context,strStyle), start+rules.length(),str.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return styledText;
    }


}
