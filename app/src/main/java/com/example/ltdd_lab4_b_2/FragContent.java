package com.example.ltdd_lab4_b_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragContent#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragContent extends Fragment {
    private ArrayList<Product> products = new ArrayList<Product>();
    private RecyclerView recyclerView;
    private ProductAdapter adapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    // TODO: Rename and change types of parameters


    public FragContent() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment FragContent.
     */
    // TODO: Rename and change types and number of parameters
    public static FragContent newInstance() {
        FragContent fragment = new FragContent();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
        products.add(new Product("1","Cáp chuyển Usb sang Ps21",15,79900,30,R.drawable.carbusbtops21));
        products.add(new Product("2","Cáp chuyển Usb sang Ps21",35,59900,10,R.drawable.daucam1));
        products.add(new Product("3","Cáp chuyển Usb sang Ps21",55,39900,40,R.drawable.dauchuyendoi1));
        products.add(new Product("4","Cáp chuyển Usb sang Ps21",10,43900,50,R.drawable.dauchuyendoipsps21));
        products.add(new Product("5","Cáp chuyển Usb sang Ps21",5,179900,75,R.drawable.daynguon1));
        products.add(new Product("6","Cáp chuyển Usb sang Ps21",115,19900,30,R.drawable.giacchuyen1));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_content, container, false);
        recyclerView = view.findViewById(R.id.rcyFrag);
        adapter = new ProductAdapter(view.getContext(),products);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(),2));
        return view;
    }
}