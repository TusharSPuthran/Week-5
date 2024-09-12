package com.example.menu;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class frag1_list_view extends Fragment
{

ListView list;
ImageView img2;
TextView name,period;
    public frag1_list_view() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_frag1_list_view, container, false);

        list = view.findViewById(R.id.listview);
        ArrayList<String> president = new ArrayList<>();
        president.add("Select the presdent");
        president.add("Rajendra Prasad");
        president.add("Radhakrishnan");
        president.add("Zakir Husen");
        president.add("Abdul Kalam");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(requireActivity(), android.R.layout.simple_list_item_1, president);
        list.setAdapter(arrayAdapter);




        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               if(i==1)
               {
                   loadfragment(new frag_raj_pra());
               } else if (i==2) {
                   loadfragment(new frag_radha());

               } else if (i==3) {
                   loadfragment(new frag_zakir() );

               } else if (i==4) {
                   loadfragment(new frag_kalam());

               }

            }
        });

        return view;
    }

    private void loadfragment(Fragment frag) {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frag2,frag);
        ft.commit();



    }
}