package edu.temple.simplerecyclerview

import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (private val items: Array<Int>) : RecyclerView.Adapter<ImageAdapter.imageViewHoleder>/* TODO Step 3a: Provide Adapter Parent */ {
private val myview = _myView
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {
              val toImage = textView
        override fun onGreatVeiwHolder(parent: ViewParent){}


    }

    // TODO Step 3b: Complete function definitions for adapter



}