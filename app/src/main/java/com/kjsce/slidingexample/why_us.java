package com.kjsce.slidingexample;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class why_us extends Fragment {


    ImageView ss_left;
    ImageView ss_right;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_why_us, container, false);
        ss_left = (ImageView) v.findViewById(R.id.image_left);
        ss_right = (ImageView) v.findViewById(R.id.image_right);
        ss_right.setImageResource(getArguments().getInt("image_right"));
        ss_left.setImageResource(getArguments().getInt("image_left"));

        return v;
    }



    public void Instance(int left, int right, int pos) {
        Bundle b = new Bundle();
        b.putInt("image_left",left);
        b.putInt("image_right",right);
        this.setArguments(b);


    }


}
