package com.example.artbrdprojects;

import android.widget.ProgressBar;

public class MyWord {

   private int mimg1;
    private String mtitle;
    private String mdes;
    private int mprogress;
    //ProgressBar mpgbar;

    //public MyWord(int img1,String title,String des,String progress,ProgressBar pgbar){
    public MyWord(int img1,String title,String des,int progress){
        mimg1=img1;
        mtitle=title;
        mdes=des;
        mprogress=progress;
       //pgbar=mpgbar;
        }

        public int getimg1(){return mimg1;}
        public String getitle(){return mtitle;}
        public String getdes(){return mdes;}
        public int getprogress(){return mprogress;}
       //public ProgressBar getpgbar(){return mpgbar;}
    }

