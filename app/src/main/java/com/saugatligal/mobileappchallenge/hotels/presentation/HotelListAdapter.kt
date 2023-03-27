package com.saugatligal.mobileappchallenge.hotels.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.saugatligal.mobileappchallenge.R
import com.saugatligal.mobileappchallenge.databinding.CardViewRowBinding
import com.saugatligal.mobileappchallenge.hotels.data.HotelListViewState
import com.saugatligal.mobileappchallenge.hotels.domain.Property

class HotelListAdapter(
    val onItemClicked: (HotelListViewState) -> Unit
) : RecyclerView.Adapter<HotelListAdapter.MyCustomHolder>() {

    private var data: List<HotelListViewState> = emptyList()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HotelListAdapter.MyCustomHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_row, parent, false)
        return MyCustomHolder(view)
    }

    override fun onBindViewHolder(holder: HotelListAdapter.MyCustomHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun setData(list: List<HotelListViewState>) {
        this.data = list
    }

    inner class MyCustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(viewState: HotelListViewState) {
            val bind = CardViewRowBinding.bind(itemView)
            itemView.setOnClickListener {
                onItemClicked(viewState)
            }
            bind.apply {
                textView.text = viewState.name
                viewState.offer.let {
                    offerText.text = it
                    offerText.visibility = View.VISIBLE
                }
                Glide.with(itemView)
                    .load(viewState.image)
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .into(imageView)
            }
        }
    }
}