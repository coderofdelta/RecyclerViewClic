package com.laurentdarl.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.laurentdarl.recyclerview.databinding.ActivityMainBinding
import com.laurentdarl.recyclerview.databinding.SchoolsBinding

class SchoolAdapter( var schools: List<Student>, var clickListener:OnschoolItemClickListner):
    RecyclerView.Adapter<SchoolAdapter.ViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = SchoolsBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val school = schools[position]
        holder.bind(school)
        holder.initialize(schools[position], clickListener)
    }

    override fun getItemCount(): Int {
      return schools.size
    }


    class ViewHolder(var binding: SchoolsBinding): RecyclerView.ViewHolder(binding.root) {

         fun bind(schools: Student) {
             binding.imageView.setImageResource(schools.images)
             binding.name.text = schools.name
             binding.place.text = schools.lastName
         }
        fun initialize(schools: Student,action:OnschoolItemClickListner){
            binding.imageView.setImageResource(schools.images)
            binding.name.text = schools.name
            binding.place.text = schools.lastName

            binding.root.setOnClickListener {
                action.onItemClick(schools, adapterPosition)
            }
        }
    }
}
interface OnschoolItemClickListner{
    fun onItemClick(schools:Student,position: Int)
}