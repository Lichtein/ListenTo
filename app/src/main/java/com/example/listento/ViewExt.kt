package com.example.listento

import android.widget.ImageView
import com.bumptech.glide.Glide

class ViewExt {
        companion object{
            fun ImageView.LoadImage(url: String){
                Glide.with(this,).load(url).into(this)
            }
        }
    }