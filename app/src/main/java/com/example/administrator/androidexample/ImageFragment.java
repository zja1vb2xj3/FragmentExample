package com.example.administrator.androidexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017-08-01.
 */

public class ImageFragment extends Fragment{

    private ImageView imageView;
    
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup fragment = (ViewGroup)inflater.inflate(R.layout.fragment_imageview, container, false);

        imageView = (ImageView)fragment.findViewById(R.id.imageView);

        return fragment;
    }

    public void setImageView(int imageid) {
        imageView.setImageResource(imageid);
    }
}
