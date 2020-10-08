package com.e.obc.ui.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.obc.R;

public class Vertical_Adapter extends RecyclerView.Adapter<Vertical_Adapter.VeViewModel>{

    Integer im[] = {R.drawable.applogo};


    public Vertical_Adapter(HomeFragment homeFragment) {

    }

    @NonNull
    @Override
    public VeViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VeViewModel holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class VeViewModel extends RecyclerView.ViewHolder {
        ImageView img,location;
        TextView tv,tv1,tv2,tv3,tv4,tv5;
        View view1,view2;
        public VeViewModel(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.image);
            location = itemView.findViewById(R.id.location);
            tv = itemView.findViewById(R.id.text);
            tv2 = itemView.findViewById(R.id.text2);
            tv3 = itemView.findViewById(R.id.text3);
            tv4 = itemView.findViewById(R.id.text4);
            tv5 = itemView.findViewById(R.id.text5);
            view1 = itemView.findViewById(R.id.view);
            view2 = itemView.findViewById(R.id.view2);
        }
    }
}