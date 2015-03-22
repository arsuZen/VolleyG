package done.it.get.volleyg.utility;

/**
 * Created by Administrator on 2015/3/22.
 */
public class DataFormat {
    public class TownGt {
        public class Info {
            private int mCountyId;
            private int mTownShipId;
            private String mCountyName;
            private String mTownName;
        }

        public class Newest {
            private String mTime;
            private int mWxIcon;
            private String mWx;
        }

        public class Current {
            private String mDataTime;
            private int mTemp;
            private int mRh;
            private float mRain;
        }

        public class Sun {
            private String mSunrise;
            private String mSunset;
        }

        public class Warn {
            private String mWarnType;
            private String mPattern;
            private String mIssuedTime;
            private String mContent;
        }
    }
}
}
