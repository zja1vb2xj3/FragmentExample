package com.example.administrator.androidexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 2017-08-01.
 */

public class ListFragment extends Fragment {

    private String[] albumNames;

    public ListFragment() {
        albumNames = new String[3];
        albumNames[0] = "잠만보";
        albumNames[1] = "메타몽";
        albumNames[2] = "대타출동";
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup fragment = (ViewGroup)inflater.inflate(R.layout.fragment_listview, container, false);

        ListView listView = (ListView)fragment.findViewById(R.id.listView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, albumNames);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(this::listViewItemClick);

        return fragment;
    }

    private AlbumNameClickListener albumNameClickListener;

    public void setAlbumNameClickListener(AlbumNameClickListener albumNameClickListener) {
        this.albumNameClickListener = albumNameClickListener;
    }

    private void listViewItemClick(AdapterView<?> parent, View view, int position, long id) {
        albumNameClickListener.onClick(position);
    }

    interface AlbumNameClickListener{
        void onClick(int position);
    }

}
