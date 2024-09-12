package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class listview_act extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        // Replace Fragment1 with your first fragment and Fragment2 with your second fragment
        Fragment fragment1 = new frag1_list_view();

        getSupportFragmentManager().beginTransaction().replace(R.id.frag1, fragment1).commit();
    }
}