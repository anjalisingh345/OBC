package com.e.obc.ui.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.e.obc.R;

public class Horizontal_Adapter extends RecyclerView.Adapter<Horizontal_Adapter.HViewHolder>{


    public Horizontal_Adapter(HomeFragment homeFragment) {

    }

    @NonNull
    @Override
    public HViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HViewHolder extends RecyclerView.ViewHolder {
        public HViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
