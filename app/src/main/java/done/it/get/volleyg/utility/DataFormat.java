package done.it.get.volleyg.utility;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/3/22.
 */
public class DataFormat {

    public class town_GT_inner {
        private info info = null;
        private newest newest = null;
        private current current = null;
        private sun sun = null;
        private ArrayList<warn_inner> warn = null;

        public class info {
            private int CountyID;
            private int TownshipID;
            private String CountyName;
            private String TownName;

            public void setCountyID(int CountyID) {
                this.CountyID = CountyID;
            }

            public void setTownshipID(int TownshipID) {
                this.TownshipID = TownshipID;
            }

            public void setCountyName(String CountyName) {
                this.CountyName = CountyName;
            }

            public void setTownName(String TownName) {
                this.TownName = TownName;
            }

            public int getCountyID() {
                return this.CountyID;
            }

            public int getTownshipID() {
                return this.TownshipID;
            }

            public String getCountyName() {
                return this.CountyName;
            }

            public String getTownName() {
                return this.TownName;
            }

        }

        public class newest {
            private String Time;
            private int Wx_Icon;
            private String Wx;

            public void setTime(String Time) {
                this.Time = Time;
            }

            public void setWx_Icon(int Wx_Icon) {
                this.Wx_Icon = Wx_Icon;
            }

            public void setWx(String Wx) {
                this.Wx = Wx;
            }

            public String getTime() {
                return this.Time;
            }

            public int getWx_Icon() {
                return this.Wx_Icon;
            }

            public String getWx() {
                return this.Wx;
            }
        }

        public class current {
            private String DataTime;
            private int Temp;
            private int RH;
            private float Rain;

            public void setDataTime(String DataTime) {
                this.DataTime = DataTime;
            }

            public void setTemp(int Temp) {
                this.Temp = Temp;
            }

            public void setRH(int RH) {
                this.RH = RH;
            }

            public void setRain(float Rain) {
                this.Rain = Rain;
            }

            public String getDataTime() {
                return this.DataTime;
            }

            public int getTemp() {
                return this.Temp;
            }

            public int getRH() {
                return this.RH;
            }

            public float getRain() {
                return this.Rain;
            }
        }

        public class sun {
            private String sunrise;
            private String sunset;

            public void setsunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public void setsunset(String sunset) {
                this.sunset = sunset;
            }

            public String getsunrise() {
                return this.sunrise;
            }

            public String getsunset() {
                return this.sunset;
            }
        }

        public class warn_inner {
            private String WarnType;
            private String Pattern;
            private String IssuedTime;
            private String Content;

            public void setWarnType(String WarnType) {
                this.WarnType = WarnType;
            }

            public void setPattern(String Pattern) {
                this.Pattern = Pattern;
            }

            public void setIssuedTime(String IssuedTime) {
                this.IssuedTime = IssuedTime;
            }

            public void setContent(String Content) {
                this.Content = Content;
            }

            public String getWarnType() {
                return this.WarnType;
            }

            public String getPattern() {
                return this.Pattern;
            }

            public String getIssuedTime() {
                return this.IssuedTime;
            }

            public String getContent() {
                return this.Content;
            }
        }


        public void setinfo(info info) {
            this.info = info;
        }

        public void setnewest(newest newest) {
            this.newest = newest;
        }

        public void setcurrent(current current) {
            this.current = current;
        }

        public void setsun(sun sun) {
            this.sun = sun;
        }

        public void setwarn(ArrayList<warn_inner> warn) {
            this.warn = warn;
        }

        public info getinfo() {
            return this.info;
        }

        public newest getnewest() {
            return this.newest;
        }

        public current getcurrent() {
            return this.current;
        }

        public sun getsun() {
            return this.sun;
        }

        public ArrayList<warn_inner> getwarn() {
            return this.warn;
        }
    }
}



