package com.wz.dsl

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FileAdapter(activity: Activity, val resourceId: Int, data: List<File>) :
    ArrayAdapter<File>(activity, resourceId, data) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(resourceId, parent, false)
        val fileImage: ImageView = view.findViewById(R.id.fileImage)
        val fileName: TextView = view.findViewById(R.id.fileName)
        val file = getItem(position) // 获取当前项的Fruit实例
        if (file != null) {
            fileImage.setImageResource(file.imageUrl)
            fileName.text = file.name
        }
        return view
    }
}