package com.lf.tempcore.tempResponse;

/**
 * Created by Administrator on 2016/5/14.
 */
public class ResponseLoginInfo extends TempResponse {


    /**
     * httpStatus : 200
     * result : {"museAddress":1,"museAreaId":32220,"museAreaName":1,"museConfirmFlag":1,"museCreateTime":"1500349559000","museFirstFormTime":1,"museId":2,"museImage":1,"museLicensePlates":"渝C4520","museName":"zyl","musePassword":"e10adc3949ba59abbe56e057f20f883e","musePhone":"18223585065","museRegisterTime":"1500349559000","museStatus":15553,"museType":68671,"sysArea":1}
     */

    private String httpStatus;
    private ResultBean result;

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * museAddress : 1
         * museAreaId : 32220
         * museAreaName : 1
         * museConfirmFlag : 1
         * museCreateTime : 1500349559000
         * museFirstFormTime : 1
         * museId : 2
         * museImage : 1
         * museLicensePlates : 渝C4520
         * museName : zyl
         * musePassword : e10adc3949ba59abbe56e057f20f883e
         * musePhone : 18223585065
         * museRegisterTime : 1500349559000
         * museStatus : 15553
         * museType : 68671
         * sysArea : 1
         */

        private String museAddress;
        private String museAreaId;
        private String museAreaName;
        private String museConfirmFlag;
        private String museCreateTime;
        private String museFirstFormTime;
        private String museId;
        private String museImage;
        private String museLicensePlates;
        private String museName;
        private String musePassword;
        private String musePhone;
        private String museRegisterTime;
        private String museStatus;
        private String museType;
        private String sysArea;
        private String museOnlineTag;
        private String lat;
        private String lng;

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getMuseOnlineTag() {
            return museOnlineTag;
        }

        public void setMuseOnlineTag(String museOnlineTag) {
            this.museOnlineTag = museOnlineTag;
        }

        public String getMuseAddress() {
            return museAddress;
        }

        public void setMuseAddress(String museAddress) {
            this.museAddress = museAddress;
        }

        public String getMuseAreaId() {
            return museAreaId;
        }

        public void setMuseAreaId(String museAreaId) {
            this.museAreaId = museAreaId;
        }

        public String getMuseAreaName() {
            return museAreaName;
        }

        public void setMuseAreaName(String museAreaName) {
            this.museAreaName = museAreaName;
        }

        public String getMuseConfirmFlag() {
            return museConfirmFlag;
        }

        public void setMuseConfirmFlag(String museConfirmFlag) {
            this.museConfirmFlag = museConfirmFlag;
        }

        public String getMuseCreateTime() {
            return museCreateTime;
        }

        public void setMuseCreateTime(String museCreateTime) {
            this.museCreateTime = museCreateTime;
        }

        public String getMuseFirstFormTime() {
            return museFirstFormTime;
        }

        public void setMuseFirstFormTime(String museFirstFormTime) {
            this.museFirstFormTime = museFirstFormTime;
        }

        public String getMuseId() {
            return museId;
        }

        public void setMuseId(String museId) {
            this.museId = museId;
        }

        public String getMuseImage() {
            return museImage;
        }

        public void setMuseImage(String museImage) {
            this.museImage = museImage;
        }

        public String getMuseLicensePlates() {
            return museLicensePlates;
        }

        public void setMuseLicensePlates(String museLicensePlates) {
            this.museLicensePlates = museLicensePlates;
        }

        public String getMuseName() {
            return museName;
        }

        public void setMuseName(String museName) {
            this.museName = museName;
        }

        public String getMusePassword() {
            return musePassword;
        }

        public void setMusePassword(String musePassword) {
            this.musePassword = musePassword;
        }

        public String getMusePhone() {
            return musePhone;
        }

        public void setMusePhone(String musePhone) {
            this.musePhone = musePhone;
        }

        public String getMuseRegisterTime() {
            return museRegisterTime;
        }

        public void setMuseRegisterTime(String museRegisterTime) {
            this.museRegisterTime = museRegisterTime;
        }

        public String getMuseStatus() {
            return museStatus;
        }

        public void setMuseStatus(String museStatus) {
            this.museStatus = museStatus;
        }

        public String getMuseType() {
            return museType;
        }

        public void setMuseType(String museType) {
            this.museType = museType;
        }

        public String getSysArea() {
            return sysArea;
        }

        public void setSysArea(String sysArea) {
            this.sysArea = sysArea;
        }
    }
}
