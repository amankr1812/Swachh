package com.example.amank.email2;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class WomanIssue extends AppCompatActivity {

    SharedPreferences pref;

    private static String CONSUMER_KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXXXX"; // Enter your consumer key
    private static String CONSUMER_SECRET = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx"; // Enter your Consumer secret key

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woman_issue);


        pref = getPreferences(0);
        SharedPreferences.Editor edit = pref.edit();
        edit.putString("CONSUMER_KEY", CONSUMER_KEY);
        edit.putString("CONSUMER_SECRET", CONSUMER_SECRET);
        edit.commit();

        Fragment login = new LoginFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.content_frame, login);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();
    }


}


