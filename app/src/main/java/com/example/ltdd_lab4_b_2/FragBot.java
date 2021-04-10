package com.example.ltdd_lab4_b_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragBot#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragBot extends Fragment {
    private ImageButton ibtBack, ibtHome, ibtView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    // TODO: Rename and change types of parameters


    public FragBot() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment FragBot.
     */
    // TODO: Rename and change types and number of parameters
    public static FragBot newInstance() {
        FragBot fragment = new FragBot();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_bot, container, false);
        ibtBack = view.findViewById(R.id.ibtBackBot);
        ibtHome = view.findViewById(R.id.ibtHome);
        ibtView = view.findViewById(R.id.ibtView);
        view.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        ibtView.setBackgroundResource(R.drawable.ic_baseline_view_headline_24);
        ibtHome.setBackgroundResource(R.drawable.ic_outline_home_24);
        ibtBack.setBackgroundResource(R.drawable.ic_baseline_subdirectory_arrow_left_24);
        return view;
    }
}