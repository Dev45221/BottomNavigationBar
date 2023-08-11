package com.example.bottomnav;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeFragment extends Fragment {

    CircleImageView c1;
    TextView t1;

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_home, container, false);

       c1 = view.findViewById(R.id.c1);
       t1 = view.findViewById(R.id.t1);

       c1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getContext(), "Hiii Devansh", Toast.LENGTH_SHORT).show();
           }
       });
       t1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getContext(), "Hiii Devansh", Toast.LENGTH_SHORT).show();
           }
       });

        // Inflate the layout for this fragment
       return view;

    }
}