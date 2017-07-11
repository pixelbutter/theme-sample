package com.sample;

import android.content.SharedPreferences;
import android.support.annotation.StyleRes;

import butterknife.OnClick;

import static com.sample.MainActivity.KEY_THEME_RES_ID;
import static com.sample.MainActivity.PREFS_NAME;

public class ThemeListFragment extends BaseFragment {

    public static ThemeListFragment newInstance() {
        return new ThemeListFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_theme_list;
    }

    @OnClick(R.id.sampleCardIllini)
    protected void cardClickedIllini() {
        saveAndSwitchTheme(R.style.Theme_Illini);
    }

    @OnClick(R.id.sampleCardSeaFoam)
    protected void cardClickedSeaFoam() {
        saveAndSwitchTheme(R.style.Theme_SeaFoam);
    }

    @OnClick(R.id.sampleCardTokyo)
    protected void cardClickedTokyo() {
        saveAndSwitchTheme(R.style.Theme_Tokyo);
    }

    private void saveAndSwitchTheme(@StyleRes int themeRes) {
        SharedPreferences sharedPrefs = getActivity().getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putInt(KEY_THEME_RES_ID, themeRes);
        editor.commit();
        getActivity().recreate();
    }
}
