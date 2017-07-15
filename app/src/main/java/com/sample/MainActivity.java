package com.sample;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "themePreferenceFile";
    public static final String KEY_THEME_RES_ID = "themeResId";

    @BindView(R.id.mainTabLayout)
    TabLayout tabLayout;

    @BindView(R.id.mainViewPager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        int themeResId = settings.getInt(KEY_THEME_RES_ID, -1);
        if (themeResId != -1) {
            setTheme(themeResId);
        }
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        viewPager.setAdapter(new TabAdapter(this, getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }

    private static class TabAdapter extends FragmentPagerAdapter {

        private static final int POSITION_THIS_THEME = 0;
        private static final int POSITION_LIST = 1;

        private Context context;

        TabAdapter(Context context, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.context = context;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case POSITION_LIST:
                    return ThemeListFragment.newInstance();
                case POSITION_THIS_THEME:
                default:
                    return OverviewFragment.newInstance();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case POSITION_LIST:
                    return context.getString(R.string.tab_title_other_themes);
                case POSITION_THIS_THEME:
                default:
                    return context.getString(R.string.tab_title_current_theme);
            }
        }
    }
}
