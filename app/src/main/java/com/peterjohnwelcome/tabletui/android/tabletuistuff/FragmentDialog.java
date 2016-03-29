package com.peterjohnwelcome.tabletui.android.tabletuistuff;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Peter-John on 2016-03-29.
 * TabletUIStuff
 */
public class FragmentDialog extends DialogFragment  {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_dialog,container,false);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        ChangeFragment(new FragmentOne());
    }

    public void ChangeFragment(Fragment fragment){
        FragmentTransaction t = getChildFragmentManager().beginTransaction();
        t.setCustomAnimations(R.anim.fragment_slide_left_enter,
                R.anim.fragment_slide_left_exit
                );
        t.replace(R.id.frame_container,fragment).commit();
    }
}
