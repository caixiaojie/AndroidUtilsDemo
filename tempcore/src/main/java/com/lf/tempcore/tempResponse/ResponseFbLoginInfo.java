package com.lf.tempcore.tempResponse;

/**
 * facebook 登录信息
 * Created by chenlingkeji on 2017/1/7.
 */

public class ResponseFbLoginInfo {

    /**
     * id : 121651738338043
     * name : Chuck Cao
     * link : https://www.facebook.com/app_scoped_user_id/121651738338043/
     * gender : male
     * birthday : 10/28/1993
     * email : 3276342958@qq.com
     * picture : {"data":{"is_silhouette":false,"url":"https://fb-s-a-a.akamaihd.net/h-ak-xpf1/v/t1.0-1/p50x50/15895181_121598595010024_9037677817959328851_n.jpg?oh=527007c0768e73e93e818ee9fb1f037f&oe=58D8D9FA&__gda__=1490878295_ca81312c32f7d57a718933dc0e7c84b7"}}
     * locale : zh_CN
     * updated_time : 2017-01-07T08:49:46+0000
     * timezone : 8
     * age_range : {"min":21}
     * first_name : Chuck
     * last_name : Cao
     */

    private String id;
    private String name;
    private String link;
    private String gender;
    private String birthday;
    private String email;
    private PictureEntity picture;
    private String locale;
    private String updated_time;
    private int timezone;
    private AgeRangeEntity age_range;
    private String first_name;
    private String last_name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PictureEntity getPicture() {
        return picture;
    }

    public void setPicture(PictureEntity picture) {
        this.picture = picture;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public AgeRangeEntity getAge_range() {
        return age_range;
    }

    public void setAge_range(AgeRangeEntity age_range) {
        this.age_range = age_range;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public static class PictureEntity {
        /**
         * data : {"is_silhouette":false,"url":"https://fb-s-a-a.akamaihd.net/h-ak-xpf1/v/t1.0-1/p50x50/15895181_121598595010024_9037677817959328851_n.jpg?oh=527007c0768e73e93e818ee9fb1f037f&oe=58D8D9FA&__gda__=1490878295_ca81312c32f7d57a718933dc0e7c84b7"}
         */

        private DataEntity data;

        public DataEntity getData() {
            return data;
        }

        public void setData(DataEntity data) {
            this.data = data;
        }

        public static class DataEntity {
            /**
             * is_silhouette : false
             * url : https://fb-s-a-a.akamaihd.net/h-ak-xpf1/v/t1.0-1/p50x50/15895181_121598595010024_9037677817959328851_n.jpg?oh=527007c0768e73e93e818ee9fb1f037f&oe=58D8D9FA&__gda__=1490878295_ca81312c32f7d57a718933dc0e7c84b7
             */

            private boolean is_silhouette;
            private String url;

            public boolean isIs_silhouette() {
                return is_silhouette;
            }

            public void setIs_silhouette(boolean is_silhouette) {
                this.is_silhouette = is_silhouette;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }

    public static class AgeRangeEntity {
        /**
         * min : 21
         */

        private int min;

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }
}
