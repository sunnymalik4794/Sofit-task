package com.example.sofittask.ui.sercives;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sofittask.Product;
import com.example.sofittask.ProductAdapter;
import com.example.sofittask.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel = ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);




        //getting the recyclerview from xml
        recyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        "Payment Services",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.mipmap.car));

        productList.add(
                new Product(
                        1,
                        "Payment Services",
                        "14 inch, Gray, 1.659 kg",
                        4.3,
                        60000,
                        R.mipmap.isb));

        productList.add(
                new Product(
                        1,
                        "Payment Services",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.mipmap.car));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(getActivity(), productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);







        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}