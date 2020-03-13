package com.example.RgPg;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.RgPg.MainFragments.QuestFragment;
import com.example.RgPg.MainFragments.ShopFragment;
import com.example.RgPg.MainFragments.TaskFragment;


public class MainMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }


    public void SwitchActivities(View view)
    {
        Fragment MainFragment = null ;

        switch (view.getId())
        {
            case R.id.button:
                MainFragment = new TaskFragment();
                break;
            case R.id.button2:
                MainFragment = new QuestFragment();
                break;
            case R.id.button3:
                MainFragment = new ShopFragment();
                break;

        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.FragmentActivity , MainFragment );
        fragmentTransaction.commit();
    }


}