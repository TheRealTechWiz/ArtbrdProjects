package com.example.artbrdprojects;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private ArrayList<MyWord> list;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView name,des,progress;
        private ProgressBar pbar;

        public MyViewHolder(@NonNull View view) {
            super(view);
            this.img = view.findViewById(R.id.imageInLayout);
            //this.star = view.findViewById(R.id.imageView13);
            this.name = view.findViewById(R.id.text1InLayout);
            this.des = view.findViewById(R.id.text2InLayout);
            this.progress = view.findViewById(R.id.textView2);
            this.pbar = view.findViewById(R.id.progressBar);
        }

    }

    public CustomAdapter(ArrayList<MyWord> clist) {
        this.list = clist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.images_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MyWord crlist = list.get(position);

        int progress = crlist.getprogress();
        String showprogress = String.valueOf(progress)+"%";

        holder.img.setImageResource(crlist.getimg1());
        holder.name.setText(crlist.getitle());
        holder.des.setText(crlist.getdes());
        holder.progress.setText(showprogress);
        holder.pbar.setProgress(progress);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}




//    public CustomAdapter(Context context, ArrayList<MyWord> arrayList) {
//        super(context,0, arrayList);
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        View listitemView = convertView;
//        if (listitemView == null){listitemView = LayoutInflater.from(getContext()).inflate(R.layout.second,parent,false);
//        }
//        MyWord currentWord = getItem(position);
//        ImageView img = listitemView.findViewById(R.id.imageView11);
//        img.setImageResource(currentWord.getimg1());
//        ImageView imgstar = listitemView.findViewById(R.id.imageView13);
//        imgstar.setImageResource(currentWord.getimg2());
//        TextView tmag = listitemView.findViewById(R.id.textView10);
//        tmag.setText(currentWord.getitle());
//        TextView tloc = listitemView.findViewById(R.id.textView11);
//        tloc.setText(currentWord.getloc());
//
//        return listitemView;
//    }


