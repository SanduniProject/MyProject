package com.example.myproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        // Find the ImageView by ID
        ImageView imageView1 = view.findViewById(R.id.imageView1);
        // Find the ImageView2 by ID
        ImageView imageView2 = view.findViewById(R.id.imageView2);
        // Find the ImageView3 by ID
        ImageView imageView3 = view.findViewById(R.id.imageView3);
        // Find the ImageView4 by ID
        ImageView imageView4 = view.findViewById(R.id.imageView4);
        // Find the ImageView5 by ID
        ImageView imageView5 = view.findViewById(R.id.imageView5);
        // Find the ImageView6 by ID
        ImageView imageView6 = view.findViewById(R.id.imageView6);
        // Find the ImageView7 by ID
        ImageView imageView7 = view.findViewById(R.id.imageView7);
        // Find the ImageView8 by ID
        ImageView imageView8 = view.findViewById(R.id.imageView8);
        // Find the ImageView9 by ID
        ImageView imageView9 = view.findViewById(R.id.imageView9);
        // Find the ImageView10 by ID
        ImageView imageView10 = view.findViewById(R.id.imageView10);

        // Set a click listener on the ImageView
        imageView1.setOnClickListener(v -> {
            // Create an intent to open MainActivity5
            Intent intent = new Intent(getActivity(), MainActivity5.class);
            startActivity(intent); // Start MainActivity5
        });
        // Set a click listener for ImageView2
        imageView2.setOnClickListener(v -> {
            // Create an intent to open MainActivity6
            Intent intent = new Intent(getActivity(), MainActivity6.class);
            startActivity(intent); // Start MainActivity6
        });
        // Set a click listener for ImageView3
        imageView3.setOnClickListener(v -> {
            // Create an intent to open MainActivity7
            Intent intent = new Intent(getActivity(), MainActivity7.class);
            startActivity(intent); // Start MainActivity7
        });
        // Set a click listener for ImageView4
        imageView4.setOnClickListener(v -> {
            // Create an intent to open MainActivity8
            Intent intent = new Intent(getActivity(), MainActivity8.class);
            startActivity(intent); // Start MainActivity8
        });
        // Set a click listener on the ImageView5
        imageView5.setOnClickListener(v -> {
            // Create an intent to open MainActivity9
            Intent intent = new Intent(getActivity(), MainActivity9.class);
            startActivity(intent); // Start MainActivity9
        });
        // Set a click listener for ImageView6
        imageView6.setOnClickListener(v -> {
            // Create an intent to open MainActivity10
            Intent intent = new Intent(getActivity(), MainActivity10.class);
            startActivity(intent); // Start MainActivity10
        });
        // Set a click listener for ImageView7
        imageView7.setOnClickListener(v -> {
            // Create an intent to open MainActivity11
            Intent intent = new Intent(getActivity(), MainActivity11.class);
            startActivity(intent); // Start MainActivity11
        });
        // Set a click listener for ImageView8
        imageView8.setOnClickListener(v -> {
            // Create an intent to open MainActivity12
            Intent intent = new Intent(getActivity(), MainActivity12.class);
            startActivity(intent); // Start MainActivity12
        });
        // Set a click listener for ImageView9
        imageView9.setOnClickListener(v -> {
            // Create an intent to open MainActivity13
            Intent intent = new Intent(getActivity(), MainActivity13.class);
            startActivity(intent); // Start MainActivity13
        });
        // Set a click listener for ImageView4
        imageView10.setOnClickListener(v -> {
            // Create an intent to open MainActivity14
            Intent intent = new Intent(getActivity(), MainActivity14.class);
            startActivity(intent); // Start MainActivity14
        });

        return view;
    }
}
