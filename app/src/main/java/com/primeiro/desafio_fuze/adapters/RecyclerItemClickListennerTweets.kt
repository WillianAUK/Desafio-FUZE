package com.primeiro.desafio_fuze.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.tweet_format.view.*


interface OnItemClickListenerTweet {

    fun onItemClickedTweet(position: Int, view: View)

}

fun RecyclerView.addOnItemClickListenerTweet(onClickListener: OnItemClickListenerTweet) {

    this.addOnChildAttachStateChangeListener(object :

        RecyclerView.OnChildAttachStateChangeListener {
        override fun onChildViewDetachedFromWindow(view: View) {
            view.txtUserName.setOnClickListener(null)
        }

        override fun onChildViewAttachedToWindow(view: View) {

            view.txtUserName.setOnClickListener({

                val holder = getChildViewHolder(view)

                onClickListener.onItemClickedTweet(holder.adapterPosition, view)


            })

        }

    })

}