package com.e.obc.ui.home;

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
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.e.obc.R;

public class HomeFragment extends Fragment {

    RecyclerView horizontal_rc,vertical_rc;
    RecyclerView.LayoutManager layoutManager,layout;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);

        horizontal_rc = root.findViewById(R.id.horizontal_recycler);
        vertical_rc = root.findViewById(R.id.vertical_recycler);

        layoutManager =new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        horizontal_rc.setLayoutManager(layoutManager);
        Horizontal_Adapter horizontal_adapter =new Horizontal_Adapter(HomeFragment.this);
        horizontal_rc.setAdapter(horizontal_adapter);

        layout=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        vertical_rc.setLayoutManager(layout);
       Vertical_Adapter adapter =new Vertical_Adapter(HomeFragment.this);
        vertical_rc.setAdapter(adapter);






        return root;
    }
}