package com.ayberk.burcyorum

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.ayberk.burcyorum.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarkList : ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)


    }



    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: LandmarkAdapter.LandmarkHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landmarkList.get(position).name
        holder.binding.cardView.findViewById<ImageView>(R.id.cardView)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,YorumActivity::class.java)
                intent.putExtra("landmark",landmarkList.get(position))
                holder.itemView.context.startActivity(intent)

        }

    }


    override fun getItemCount(): Int {
        return landmarkList.size
    }



}