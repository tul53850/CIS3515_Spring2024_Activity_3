package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _numbers: Array<Int>) : BaseAdapter() {

    private val context = _context
    private val numbers = _numbers

    override fun getCount(): Int {
        return numbers.size
    }

    override fun getItem(position: Int): Any {
        return numbers[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context)
        textView.text = numbers[position].toString()
        textView.textSize = 22f
        textView.setPadding(5,10,0,10)
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return super.getDropDownView(position, convertView, parent).apply{
            val textView = TextView(context)
            textView.text = numbers[position].toString()
            textView.textSize = numbers[position].toFloat()
            textView.setPadding(5,10,0,10)
            return textView
        }
    }

}