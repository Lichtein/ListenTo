package com.example.listento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listento.ViewExt.Companion.LoadImage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var ListPicture = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addPicture()
        sumbitPicture()
        randomPicture()
    }

    private fun randomPicture() {
        btn_sumbit.setOnClickListener {
            imageFilterView.LoadImage(ListPicture.random())
        }
    }

    private fun sumbitPicture() {
        btn_sumbit.setOnClickListener {
            ListPicture.add(ed_url.text.toString())
        }
    }

    private fun addPicture() {
        ListPicture.add("https://bit.ly/3Dq73tW")
        ListPicture.add("https://bit.ly/2WuQjRh")
        ListPicture.add("https://bit.ly/2WpXvhn")
        ListPicture.add("https://bit.ly/3yoQryM")
        ListPicture.add("https://bit.ly/2UV2t5j")
    }
}