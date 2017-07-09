package com.sample;

public class OverviewFragment extends BaseFragment {

    public static OverviewFragment newInstance() {
        return new OverviewFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_overview;
    }
}
