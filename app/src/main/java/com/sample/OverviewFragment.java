package com.sample;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import butterknife.OnClick;

public class OverviewFragment extends BaseFragment {

    public static OverviewFragment newInstance() {
        return new OverviewFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_overview;
    }

    @OnClick({R.id.buttonDefault, R.id.buttonColored, R.id.buttonBorderless})
    protected void onButtonClick() {
        AlertDialog dialog = new AlertDialog.Builder(getActivity()).setIcon(R.drawable.ic_cake)
                .setTitle(R.string.dialog_title)
                .setMessage(R.string.dialog_text)
                .setPositiveButton(R.string.dialog_action, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        dialog.show();
    }

}
