package com.example.ltdd_lab4_b_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragTop#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragTop extends Fragment {
    private ImageButton ibtBack,ibtMore,ibtShopping;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    // TODO: Rename and change types of parameters


    public FragTop() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragTop.
     */
    // TODO: Rename and change types and number of parameters
    public static FragTop newInstance() {
        FragTop fragment = new FragTop();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_top, container, false);
        ibtBack =view.findViewById(R.id.ibtBackTop);
        ibtMore =view.findViewById(R.id.ibtMore);
        ibtShopping=view.findViewById(R.id.ibtShopping);
        view.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        ibtMore.setBackgroundResource(R.drawable.ic_baseline_more_horiz_24);
        ibtShopping.setBackgroundResource(R.drawable.ic_outline_shopping_cart_24);
        ibtBack.setBackgroundResource(R.drawable.ic_baseline_arrow_back_24);
        return view;
    }
}