package com.example.administrator.androidexample;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ListFragment listFragment;
    private ImageFragment imageFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        listFragment = (ListFragment)fragmentManager.findFragmentById(R.id.listFragment);

        imageFragment = (ImageFragment)fragmentManager.findFragmentById(R.id.imageFragment);

        listFragment.setAlbumNameClickListener(this::albumNameClick);
    }

    private void albumNameClick(int position) {
        int resourceId = getAlbumImage(position);
        imageFragment.setImageView(resourceId);
    }

    private int getAlbumImage(int position){

        switch (position){
            case 0:
                return R.drawable.jam;

            case 1:
                return R.drawable.metamong;

            case 2:
                return R.drawable.deta;
        }
        return position;
    }

}
