package com.example.sofittask.ui.home;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.sofittask.R;
import com.example.sofittask.ui.sercives.GalleryFragment;
import com.squareup.picasso.Picasso;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    ImageView gp1,gp2, gp3,gp4;
    ImageView op1,op2,op3,op4;
    LinearLayout gbox1,gbox2,gbox3,gbox4;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final Toolbar toolbar = root.findViewById(R.id.toolbar);

        gbox1=(LinearLayout)root.findViewById(R.id.gbox1);
        gbox2=(LinearLayout)root.findViewById(R.id.gbox2);
        gbox3=(LinearLayout)root.findViewById(R.id.gbox3);
        gbox4=(LinearLayout)root.findViewById(R.id.gbox4);

        gp1=(ImageView)root.findViewById(R.id.gp1);
        gp2=(ImageView)root.findViewById(R.id.gp2);
        gp3=(ImageView)root.findViewById(R.id.gp3);
        gp4=(ImageView)root.findViewById(R.id.gp4);

        op1=(ImageView)root.findViewById(R.id.op1);
        op2=(ImageView)root.findViewById(R.id.op2);
        op3=(ImageView)root.findViewById(R.id.op3);
        op4=(ImageView)root.findViewById(R.id.op4);


        Picasso.with(getContext()).load(R.mipmap.car).into(gp1);
        Picasso.with(getContext()).load(R.mipmap.car).into(gp2);
        Picasso.with(getContext()).load(R.mipmap.car).into(gp3);
        Picasso.with(getContext()).load(R.mipmap.car).into(gp4);
        Picasso.with(getContext()).load(R.mipmap.car).into(op1);
        Picasso.with(getContext()).load(R.mipmap.car).into(op2);
        Picasso.with(getContext()).load(R.mipmap.car).into(op3);
        Picasso.with(getContext()).load(R.mipmap.car).into(op4);


        gbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getContext(), "Service Fragment", Toast.LENGTH_SHORT).show();
                

                Fragment someFragment = new GalleryFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment, someFragment ); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();

            }
        });

        gbox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getContext(), "Service Fragment", Toast.LENGTH_SHORT).show();

                Fragment someFragment = new GalleryFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment, someFragment ); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();

            }
        });

        gbox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getContext(), "Service Fragment", Toast.LENGTH_SHORT).show();

                Fragment someFragment = new GalleryFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment, someFragment ); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();

            }
        });

        gbox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getContext(), "Service Fragment", Toast.LENGTH_SHORT).show();

                Fragment someFragment = new GalleryFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment, someFragment ); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();

            }
        });


        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}