package com.peterjohnwelcome.tabletui.android.tabletuistuff;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements TransitionLister {
    FragmentDialog editNameDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void showEditDialog() {
        FragmentManager fm = getSupportFragmentManager();
        editNameDialog = new FragmentDialog();
        editNameDialog.show(fm, "fragment");
    }

    public void ClickMe(View view) {
        showEditDialog();
    }

    @Override
    public void CallSecondFragment() {
        editNameDialog.ChangeFragment(new FragmentTwo());
    }
}
