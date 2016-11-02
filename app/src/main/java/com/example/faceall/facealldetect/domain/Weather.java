package com.example.faceall.facealldetect.domain;

import java.util.List;

/**
 * Created by D.bj on 2016/10/8.
 */
public class Weather {


    /**
     * aqi : {"city":{"aqi":"15","co":"0","no2":"18","o3":"40","pm10":"14","pm25":"14","qlty":"优","so2":"2"}}
     * basic : {"city":"北京","cnty":"中国","id":"CN101010100","lat":"39.904000","lon":"116.391000","update":{"loc":"2016-10-08 10:52","utc":"2016-10-08 02:52"}}
     * daily_forecast : [{"astro":{"sr":"06:17","ss":"17:45"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2016-10-08","hum":"39","pcpn":"0.0","pop":"0","pres":"1023","tmp":{"max":"19","min":"5"},"vis":"10","wind":{"deg":"329","dir":"北风","sc":"4-5","spd":"18"}},{"astro":{"sr":"06:18","ss":"17:44"},"cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},"date":"2016-10-09","hum":"42","pcpn":"0.0","pop":"0","pres":"1023","tmp":{"max":"19","min":"8"},"vis":"10","wind":{"deg":"204","dir":"无持续风向","sc":"微风","spd":"7"}},{"astro":{"sr":"06:19","ss":"17:42"},"cond":{"code_d":"101","code_n":"100","txt_d":"多云","txt_n":"晴"},"date":"2016-10-10","hum":"54","pcpn":"0.0","pop":"0","pres":"1017","tmp":{"max":"21","min":"10"},"vis":"10","wind":{"deg":"184","dir":"无持续风向","sc":"微风","spd":"5"}},{"astro":{"sr":"06:20","ss":"17:41"},"cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},"date":"2016-10-11","hum":"40","pcpn":"0.0","pop":"0","pres":"1024","tmp":{"max":"20","min":"10"},"vis":"10","wind":{"deg":"129","dir":"无持续风向","sc":"微风","spd":"3"}},{"astro":{"sr":"06:22","ss":"17:39"},"cond":{"code_d":"101","code_n":"100","txt_d":"多云","txt_n":"晴"},"date":"2016-10-12","hum":"71","pcpn":"0.0","pop":"9","pres":"1023","tmp":{"max":"21","min":"11"},"vis":"10","wind":{"deg":"196","dir":"无持续风向","sc":"微风","spd":"4"}},{"astro":{"sr":"06:23","ss":"17:38"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2016-10-13","hum":"52","pcpn":"0.0","pop":"0","pres":"1021","tmp":{"max":"22","min":"12"},"vis":"10","wind":{"deg":"54","dir":"无持续风向","sc":"微风","spd":"3"}},{"astro":{"sr":"06:24","ss":"17:36"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2016-10-14","hum":"67","pcpn":"0.0","pop":"0","pres":"1024","tmp":{"max":"23","min":"13"},"vis":"10","wind":{"deg":"146","dir":"无持续风向","sc":"微风","spd":"4"}}]
     * hourly_forecast : [{"date":"2016-10-08 13:00","hum":"25","pop":"0","pres":"1023","tmp":"18","wind":{"deg":"328","dir":"西北风","sc":"3-4","spd":"26"}},{"date":"2016-10-08 16:00","hum":"31","pop":"0","pres":"1022","tmp":"19","wind":{"deg":"111","dir":"东南风","sc":"3-4","spd":"17"}},{"date":"2016-10-08 19:00","hum":"37","pop":"0","pres":"1024","tmp":"14","wind":{"deg":"7","dir":"北风","sc":"微风","spd":"9"}},{"date":"2016-10-08 22:00","hum":"42","pop":"0","pres":"1025","tmp":"11","wind":{"deg":"22","dir":"东北风","sc":"微风","spd":"5"}}]
     * now : {"cond":{"code":"101","txt":"多云"},"fl":"11","hum":"33","pcpn":"0","pres":"1024","tmp":"12","vis":"10","wind":{"deg":"310","dir":"北风","sc":"5-6","spd":"27"}}
     * status : ok
     * suggestion : {"comf":{"brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"},"cw":{"brf":"较不宜","txt":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"},"drsg":{"brf":"较舒适","txt":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},"flu":{"brf":"极易发","txt":"昼夜温差极大，且风力较强，极易发生感冒，请特别注意增减衣服保暖防寒。"},"sport":{"brf":"较不宜","txt":"天气较好，但考虑风力较大，天气寒冷，推荐您进行室内运动，若在户外运动须注意保暖。"},"trav":{"brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"},"uv":{"brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"}}
     */

    private List<HeWeatherdataserviceBean> HeWeatherdataservice;

//    private HeWeatherdataserviceBean HeWeatherdataservice;
//
//    public HeWeatherdataserviceBean getHeWeatherdataservice() {
//        return HeWeatherdataservice;
//    }
//
//    public void setHeWeatherdataservice(HeWeatherdataserviceBean heWeatherdataservice) {
//        HeWeatherdataservice = heWeatherdataservice;
//    }

        public List<HeWeatherdataserviceBean> getHeWeatherdataservice() {
        return HeWeatherdataservice;
    }

    public void setHeWeatherdataservice(List<HeWeatherdataserviceBean> HeWeatherdataservice) {
        this.HeWeatherdataservice = HeWeatherdataservice;
    }



    public static class HeWeatherdataserviceBean {
        /**
         * city : {"aqi":"15","co":"0","no2":"18","o3":"40","pm10":"14","pm25":"14","qlty":"优","so2":"2"}
         */

        private AqiBean aqi;
        /**
         * city : 北京
         * cnty : 中国
         * id : CN101010100
         * lat : 39.904000
         * lon : 116.391000
         * update : {"loc":"2016-10-08 10:52","utc":"2016-10-08 02:52"}
         */

        private BasicBean basic;
        /**
         * cond : {"code":"101","txt":"多云"}
         * fl : 11
         * hum : 33
         * pcpn : 0
         * pres : 1024
         * tmp : 12
         * vis : 10
         * wind : {"deg":"310","dir":"北风","sc":"5-6","spd":"27"}
         */

        private NowBean now;
        private String status;
        /**
         * comf : {"brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"}
         * cw : {"brf":"较不宜","txt":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"}
         * drsg : {"brf":"较舒适","txt":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"}
         * flu : {"brf":"极易发","txt":"昼夜温差极大，且风力较强，极易发生感冒，请特别注意增减衣服保暖防寒。"}
         * sport : {"brf":"较不宜","txt":"天气较好，但考虑风力较大，天气寒冷，推荐您进行室内运动，若在户外运动须注意保暖。"}
         * trav : {"brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"}
         * uv : {"brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"}
         */

        private SuggestionBean suggestion;
        /**
         * astro : {"sr":"06:17","ss":"17:45"}
         * cond : {"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"}
         * date : 2016-10-08
         * hum : 39
         * pcpn : 0.0
         * pop : 0
         * pres : 1023
         * tmp : {"max":"19","min":"5"}
         * vis : 10
         * wind : {"deg":"329","dir":"北风","sc":"4-5","spd":"18"}
         */

        private List<DailyForecastBean> daily_forecast;
        /**
         * date : 2016-10-08 13:00
         * hum : 25
         * pop : 0
         * pres : 1023
         * tmp : 18
         * wind : {"deg":"328","dir":"西北风","sc":"3-4","spd":"26"}
         */

        private List<HourlyForecastBean> hourly_forecast;

        public AqiBean getAqi() {
            return aqi;
        }

        public void setAqi(AqiBean aqi) {
            this.aqi = aqi;
        }

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public NowBean getNow() {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public SuggestionBean getSuggestion() {
            return suggestion;
        }

        public void setSuggestion(SuggestionBean suggestion) {
            this.suggestion = suggestion;
        }

        public List<DailyForecastBean> getDaily_forecast() {
            return daily_forecast;
        }

        public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
            this.daily_forecast = daily_forecast;
        }

        public List<HourlyForecastBean> getHourly_forecast() {
            return hourly_forecast;
        }

        public void setHourly_forecast(List<HourlyForecastBean> hourly_forecast) {
            this.hourly_forecast = hourly_forecast;
        }

        public static class AqiBean {
            /**
             * aqi : 15
             * co : 0
             * no2 : 18
             * o3 : 40
             * pm10 : 14
             * pm25 : 14
             * qlty : 优
             * so2 : 2
             */

            private CityBean city;

            public CityBean getCity() {
                return city;
            }

            public void setCity(CityBean city) {
                this.city = city;
            }

            public static class CityBean {
                private String aqi;
                private String co;
                private String no2;
                private String o3;
                private String pm10;
                private String pm25;
                private String qlty;
                private String so2;

                public String getAqi() {
                    return aqi;
                }

                public void setAqi(String aqi) {
                    this.aqi = aqi;
                }

                public String getCo() {
                    return co;
                }

                public void setCo(String co) {
                    this.co = co;
                }

                public String getNo2() {
                    return no2;
                }

                public void setNo2(String no2) {
                    this.no2 = no2;
                }

                public String getO3() {
                    return o3;
                }

                public void setO3(String o3) {
                    this.o3 = o3;
                }

                public String getPm10() {
                    return pm10;
                }

                public void setPm10(String pm10) {
                    this.pm10 = pm10;
                }

                public String getPm25() {
                    return pm25;
                }

                public void setPm25(String pm25) {
                    this.pm25 = pm25;
                }

                public String getQlty() {
                    return qlty;
                }

                public void setQlty(String qlty) {
                    this.qlty = qlty;
                }

                public String getSo2() {
                    return so2;
                }

                public void setSo2(String so2) {
                    this.so2 = so2;
                }
            }
        }

        public static class BasicBean {
            private String city;
            private String cnty;
            private String id;
            private String lat;
            private String lon;
            /**
             * loc : 2016-10-08 10:52
             * utc : 2016-10-08 02:52
             */

            private UpdateBean update;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCnty() {
                return cnty;
            }

            public void setCnty(String cnty) {
                this.cnty = cnty;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public UpdateBean getUpdate() {
                return update;
            }

            public void setUpdate(UpdateBean update) {
                this.update = update;
            }

            public static class UpdateBean {
                private String loc;
                private String utc;

                public String getLoc() {
                    return loc;
                }

                public void setLoc(String loc) {
                    this.loc = loc;
                }

                public String getUtc() {
                    return utc;
                }

                public void setUtc(String utc) {
                    this.utc = utc;
                }
            }
        }

        public static class NowBean {
            /**
             * code : 101
             * txt : 多云
             */

            private CondBean cond;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            /**
             * deg : 310
             * dir : 北风
             * sc : 5-6
             * spd : 27
             */

            private WindBean wind;

            public CondBean getCond() {
                return cond;
            }

            public void setCond(CondBean cond) {
                this.cond = cond;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public WindBean getWind() {
                return wind;
            }

            public void setWind(WindBean wind) {
                this.wind = wind;
            }

            public static class CondBean {
                private String code;
                private String txt;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class WindBean {
                private String deg;
                private String dir;
                private String sc;
                private String spd;

                public String getDeg() {
                    return deg;
                }

                public void setDeg(String deg) {
                    this.deg = deg;
                }

                public String getDir() {
                    return dir;
                }

                public void setDir(String dir) {
                    this.dir = dir;
                }

                public String getSc() {
                    return sc;
                }

                public void setSc(String sc) {
                    this.sc = sc;
                }

                public String getSpd() {
                    return spd;
                }

                public void setSpd(String spd) {
                    this.spd = spd;
                }
            }
        }

        public static class SuggestionBean {
            /**
             * brf : 舒适
             * txt : 白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。
             */

            private ComfBean comf;
            /**
             * brf : 较不宜
             * txt : 较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。
             */

            private CwBean cw;
            /**
             * brf : 较舒适
             * txt : 建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。
             */

            private DrsgBean drsg;
            /**
             * brf : 极易发
             * txt : 昼夜温差极大，且风力较强，极易发生感冒，请特别注意增减衣服保暖防寒。
             */

            private FluBean flu;
            /**
             * brf : 较不宜
             * txt : 天气较好，但考虑风力较大，天气寒冷，推荐您进行室内运动，若在户外运动须注意保暖。
             */

            private SportBean sport;
            /**
             * brf : 适宜
             * txt : 天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。
             */

            private TravBean trav;
            /**
             * brf : 中等
             * txt : 属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。
             */

            private UvBean uv;

            public ComfBean getComf() {
                return comf;
            }

            public void setComf(ComfBean comf) {
                this.comf = comf;
            }

            public CwBean getCw() {
                return cw;
            }

            public void setCw(CwBean cw) {
                this.cw = cw;
            }

            public DrsgBean getDrsg() {
                return drsg;
            }

            public void setDrsg(DrsgBean drsg) {
                this.drsg = drsg;
            }

            public FluBean getFlu() {
                return flu;
            }

            public void setFlu(FluBean flu) {
                this.flu = flu;
            }

            public SportBean getSport() {
                return sport;
            }

            public void setSport(SportBean sport) {
                this.sport = sport;
            }

            public TravBean getTrav() {
                return trav;
            }

            public void setTrav(TravBean trav) {
                this.trav = trav;
            }

            public UvBean getUv() {
                return uv;
            }

            public void setUv(UvBean uv) {
                this.uv = uv;
            }

            public static class ComfBean {
                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class CwBean {
                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class DrsgBean {
                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class FluBean {
                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class SportBean {
                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class TravBean {
                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class UvBean {
                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }
        }

        public static class DailyForecastBean {
            /**
             * sr : 06:17
             * ss : 17:45
             */

            private AstroBean astro;
            /**
             * code_d : 100
             * code_n : 100
             * txt_d : 晴
             * txt_n : 晴
             */

            private CondBean cond;
            private String date;
            private String hum;
            private String pcpn;
            private String pop;
            private String pres;
            /**
             * max : 19
             * min : 5
             */

            private TmpBean tmp;
            private String vis;
            /**
             * deg : 329
             * dir : 北风
             * sc : 4-5
             * spd : 18
             */

            private WindBean wind;

            public AstroBean getAstro() {
                return astro;
            }

            public void setAstro(AstroBean astro) {
                this.astro = astro;
            }

            public CondBean getCond() {
                return cond;
            }

            public void setCond(CondBean cond) {
                this.cond = cond;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public TmpBean getTmp() {
                return tmp;
            }

            public void setTmp(TmpBean tmp) {
                this.tmp = tmp;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public WindBean getWind() {
                return wind;
            }

            public void setWind(WindBean wind) {
                this.wind = wind;
            }

            public static class AstroBean {
                private String sr;
                private String ss;

                public String getSr() {
                    return sr;
                }

                public void setSr(String sr) {
                    this.sr = sr;
                }

                public String getSs() {
                    return ss;
                }

                public void setSs(String ss) {
                    this.ss = ss;
                }
            }

            public static class CondBean {
                private String code_d;
                private String code_n;
                private String txt_d;
                private String txt_n;

                public String getCode_d() {
                    return code_d;
                }

                public void setCode_d(String code_d) {
                    this.code_d = code_d;
                }

                public String getCode_n() {
                    return code_n;
                }

                public void setCode_n(String code_n) {
                    this.code_n = code_n;
                }

                public String getTxt_d() {
                    return txt_d;
                }

                public void setTxt_d(String txt_d) {
                    this.txt_d = txt_d;
                }

                public String getTxt_n() {
                    return txt_n;
                }

                public void setTxt_n(String txt_n) {
                    this.txt_n = txt_n;
                }
            }

            public static class TmpBean {
                private String max;
                private String min;

                public String getMax() {
                    return max;
                }

                public void setMax(String max) {
                    this.max = max;
                }

                public String getMin() {
                    return min;
                }

                public void setMin(String min) {
                    this.min = min;
                }
            }

            public static class WindBean {
                private String deg;
                private String dir;
                private String sc;
                private String spd;

                public String getDeg() {
                    return deg;
                }

                public void setDeg(String deg) {
                    this.deg = deg;
                }

                public String getDir() {
                    return dir;
                }

                public void setDir(String dir) {
                    this.dir = dir;
                }

                public String getSc() {
                    return sc;
                }

                public void setSc(String sc) {
                    this.sc = sc;
                }

                public String getSpd() {
                    return spd;
                }

                public void setSpd(String spd) {
                    this.spd = spd;
                }
            }
        }

        public static class HourlyForecastBean {
            private String date;
            private String hum;
            private String pop;
            private String pres;
            private String tmp;
            /**
             * deg : 328
             * dir : 西北风
             * sc : 3-4
             * spd : 26
             */

            private WindBean wind;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public WindBean getWind() {
                return wind;
            }

            public void setWind(WindBean wind) {
                this.wind = wind;
            }

            public static class WindBean {
                private String deg;
                private String dir;
                private String sc;
                private String spd;

                public String getDeg() {
                    return deg;
                }

                public void setDeg(String deg) {
                    this.deg = deg;
                }

                public String getDir() {
                    return dir;
                }

                public void setDir(String dir) {
                    this.dir = dir;
                }

                public String getSc() {
                    return sc;
                }

                public void setSc(String sc) {
                    this.sc = sc;
                }

                public String getSpd() {
                    return spd;
                }

                public void setSpd(String spd) {
                    this.spd = spd;
                }
            }
        }
    }
}
