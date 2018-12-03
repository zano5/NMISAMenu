//package timeline.lizimumu.com.t.adapter;
//
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;
//
//public class CustomFragmentPageAdapter  extends FragmentPagerAdapter {
//
//    private static final String TAG = CustomFragmentPageAdapter.class.getSimpleName();
//    private static final int FRAGMENT_COUNT = 3;
//
//    public CustomFragmentPageAdapter(FragmentManager fm) {
//        super(fm);
//    }
//
//    @Override
//    public Fragment getItem(int position) {
//        switch (position){
//            case 0:
//                return new MobileDataFragment();
//            case 1:
//                return new WifiFragment();
//            case 2:
//                return new TotalFragment();
//        }
//        return null;
//    }
//
//    @Override
//    public int getCount() {
//        return FRAGMENT_COUNT;
//    }
//
//    @Override
//    public CharSequence getPageTitle(int position) {
//        switch (position){
//            case 0:
//                return "Mobile Data";
//            case 1:
//                return "WIFI";
//            case 2:
//                return "Total";
//        }
//        return null;
//    }
//}
