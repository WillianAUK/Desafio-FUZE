package com.primeiro.desafio_fuze.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.primeiro.desafio_fuze.R
import com.primeiro.desafio_fuze.util.DataTweet
import kotlinx.android.synthetic.main.tweet_format.view.*


/*
Classe que implementa o Adapter responsál por sincronizar o recyclerView que apresenta os tweets retornados
 */

class ViewTweetAdapter(val tweets: MutableList<DataTweet.ViewTweetData>): RecyclerView.Adapter<ViewTweetAdapter.ViewTweetHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewTweetAdapter.ViewTweetHolder {

        //xml referente ao formato do tweet utilizado
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tweet_format, parent, false)
        return ViewTweetHolder(view)

    }

    //Tamanho da lista que contém os tweets
    override fun getItemCount(): Int = tweets.size


    override fun onBindViewHolder(holder: ViewTweetAdapter.ViewTweetHolder, position: Int) {
        holder.bind(tweets[position])
    }

    //Função que aplica ao front as informções dos tweets
    inner class ViewTweetHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bind(tweet: DataTweet.ViewTweetData) {
            itemView.txtUserName.text = tweet.user.toString()
            itemView.tweet_picture.invalidate()
            itemView.like_text.text = tweet.likes.toString()
            itemView.coments_text.text = tweet.comments.toString()
            itemView.retweets_text.text = tweet.retweets.toString()
            itemView.txt_tweet.text = tweet.text.toString()
        }
    }





}