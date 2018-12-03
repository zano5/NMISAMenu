package timeline.lizimumu.com.t.data;

import java.util.Locale;

/**
 * Ignore
 * Created by nmisa on 24/11/2018.
 */

public class HistoryItem {
    public String mPackageName;
    public String mName;
    public String mDate;
    public int mIsSystem;
    public long mDuration;
    public long mTimeStamp;
    public long mMobileTraffic;

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "%s %s %s %d %d %d %d", mPackageName, mName, mDate, mIsSystem, mDuration, mTimeStamp, mMobileTraffic);
    }
}
