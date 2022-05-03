package com.wz.dsl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        val id = 0
        val data = ArrayList<File>()

        data.add(File(0, -1, 0, "春", R.drawable.test))
        data.add(File(1, -1, 0, "夏", R.drawable.test))
        data.add(File(2, -1, 0, "秋", R.drawable.test))
        data.add(File(3, -1, 0, "冬", R.drawable.test))

        val ad = ArrayAdapter<File>(this, R.layout.file_item, data)
        listView.adapter = ad

    }
}
