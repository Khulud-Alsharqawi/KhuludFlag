package com.example.khuludflag

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.khuludflag.databinding.FlagItemBinding
import com.example.khuludflag.network.DataItem

class Adapter: ListAdapter <DataItem, Adapter.MyViewHolder>(DiffCallback) {



    class MyViewHolder(private var binding: FlagItemBinding) :
            RecyclerView.ViewHolder(binding.root){
                fun bind (flag: DataItem){
                    binding.flagImg= flag
                    binding.executePendingBindings()
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(FlagItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val flags = getItem(position)
        holder.bind(flags)
    }

    companion object DiffCallback : DiffUtil.ItemCallback<DataItem>(){
        override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
            return oldItem == newItem
        }
    }

}