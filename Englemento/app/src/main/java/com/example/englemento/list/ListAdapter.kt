package com.example.englemento.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.englemento.R

class ListAdapter(private val context: Context,
                  private val dataSource: ArrayList<TranslateWord>,
                    private val rusActive: Boolean,
                    private val engActive: Boolean): BaseAdapter() {

    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    //1
    override fun getCount(): Int {
        return dataSource.size
    }

    //2
    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    //3
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //4
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Get view for row item
        val rowView = inflater.inflate(R.layout.layout_list, parent, false)


        val wordTextView = rowView.findViewById(R.id.textViewWord) as TextView


        val transalateTextView = rowView.findViewById(R.id.textViewTranslate) as TextView


        val numberTextView = rowView.findViewById(R.id.textNumber) as TextView

        val model = getItem(position) as TranslateWord


        numberTextView.text = model.number.toString()

        if (rusActive) {
            wordTextView.text = model.word
        } else {
            wordTextView.text = ""
        }

        if (engActive) {
            transalateTextView.text = model.translate
        } else {
            transalateTextView.text = ""
        }



        rowView.setOnClickListener(View.OnClickListener {
            rowView.setBackgroundColor(rowView.resources.getColor(R.color.on_click))
            toastMessage("Пример использования слова:\n"+
                    model.exampleUsesEng+"\n"+
                    model.exampleUsesRus)
        })

        return rowView
    }

    fun toastMessage(message:String)
    {
        var toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        toast.show()
    }

}