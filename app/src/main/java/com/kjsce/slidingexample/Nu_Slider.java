package com.kjsce.slidingexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Nu_Slider extends Fragment {
    ImageView formerImage;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_nu__slider, container, false);

        formerImage = (ImageView) v.findViewById(R.id.FormerImage);
        formerImage.setImageResource(getArguments().getInt("image"));

        return v;
    }

    public void Nu_Instance(int img, int pos) {
        Bundle args = new Bundle();
        args.putInt("image", img);

        this.setArguments(args);

    }



}
