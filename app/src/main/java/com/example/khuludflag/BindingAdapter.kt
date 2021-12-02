package com.example.khuludflag

import android.annotation.SuppressLint
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.ImageLoader
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.example.khuludflag.network.DataItem


@BindingAdapter("ImageUrl")
fun ImageView.bind(photoUrl: String?){
    photoUrl.let {
        val imageLoader = ImageLoader.Builder(this.context)
            .componentRegistry { add(SvgDecoder(context)) }
            .build()

        val request = ImageRequest.Builder(this.context)
            .crossfade(true)
            .crossfade(500)
            .data(photoUrl)
            .placeholder(R.drawable.loading_animation)
            .error(R.drawable.ic_broken_image)
            .target(this)
            .build()

        imageLoader.enqueue(request)

    }
}


@BindingAdapter("listData")
fun RecyclerView.bindrecycler(data: List<DataItem>?){
    if (this.adapter == null){
        this.adapter =Adapter()
    }
    val adapter = this.adapter as Adapter
    adapter.submitList(data)
}

