package com.stuffshuf.institute_course

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.course_list.view.*
import org.intellij.lang.annotations.Language

class CustomAdapter(val courselist:ArrayList<Data>):RecyclerView.Adapter<CustomAdapter.CustomAdapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapterViewHolder {
        val li=parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView=li.inflate(R.layout.course_list, parent, false)
        return CustomAdapterViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return courselist.size
    }

    override fun onBindViewHolder(holder: CustomAdapterViewHolder, position: Int) {

        holder.itemView.img.setImageResource(image[position].toString().toInt())

        val coursedata=courselist[position]
        holder.bind(coursedata)




    }

    class CustomAdapterViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        fun bind(data: Data)
        {
            with(itemView)
            {
                lang.text=data.lang
                Desc.text=data.desc
               // img.context.resources.getDrawable(R.mipmap.ic_launcher)
                //img.setImageResource(R.mipmap.ic_launcher)


            }
        }
    }
}