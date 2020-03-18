package com.example.artbrdprojects;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondCustomAdapter extends RecyclerView.Adapter<SecondCustomAdapter.MyViewHolder> {
    private ArrayList<MyWord> list;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name,des,progress;
        private ConstraintLayout card;


        public MyViewHolder(@NonNull View view) {
            super(view);
            this.name = view.findViewById(R.id.tvcolor);
            this.des = view.findViewById(R.id.tvrate);
            this.progress = view.findViewById(R.id.tvservice);
            this.card = view.findViewById(R.id.cardLayout);
        }

    }

    public SecondCustomAdapter(ArrayList<MyWord> clist, Context context) {
        this.list = clist;
        this.context = context.getApplicationContext();

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.plans_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MyWord crlist = list.get(position);
        Drawable drawable = holder.card.getBackground();
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        if(crlist.getitle()=="red"){
            gradientDrawable.setColor( ContextCompat.getColor(context, R.color.red));
            //            (Color.parseColor("#FC4047"));
        }
        if(crlist.getitle()=="yellow"){
            gradientDrawable.setColor( ContextCompat.getColor(context, R.color.yellow));
        }
        if(crlist.getitle()=="green"){
            gradientDrawable.setColor( ContextCompat.getColor(context, R.color.green));
        }
//        else {
//            Toast.makeText(context, "Else", Toast.LENGTH_SHORT).show();
//            holder.card.setBackgroundColor(Color.parseColor("#2BCB1F"));}

        holder.name.setText(crlist.getitle());

        holder.des.setText(crlist.getdes());
        holder.progress.setText(crlist.getlast());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
