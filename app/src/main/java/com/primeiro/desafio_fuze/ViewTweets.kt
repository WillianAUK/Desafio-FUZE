package com.primeiro.desafio_fuze

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.primeiro.desafio_fuze.adapters.OnItemClickListenerTweet
import com.primeiro.desafio_fuze.adapters.ViewTweetAdapter
import com.primeiro.desafio_fuze.adapters.addOnItemClickListenerTweet
import com.primeiro.desafio_fuze.model.TweetObj
import com.primeiro.desafio_fuze.util.DataTweet
import kotlinx.android.synthetic.main.activity_view_tweets.*


/*
Calsse responsável pela Activity de vizualização dos tweets recuperados
 */

class ViewTweets : AppCompatActivity() {
    var listTweets = ArrayList<TweetObj>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_tweets)

        // A parte a seguir possui um bug que acaba por fechar a aplicação

        /*
        val tweets_ = DataTweet(applicationContext)
        //var intent = Intent(this, UserTimeline::class.java)
        recycler_tweet.removeAllViewsInLayout()
        var retorno:MutableList<DataTweet.ViewTweetData> = mutableListOf()

        listTweets = tweets_.getListTweet() as ArrayList<TweetObj>

        for (i in 1..listTweets.count()-1){
            var view = tweets_.viewTweetData {
                user = tweets_.getUser(i).toString()
                image_user = tweets_.getImaUser(i).toString()
                image_tweet = tweets_.getImaTweet(i).toString()
                text = tweets_.getTextTweet(i).toString()
                likes = tweets_.getLikes(i)!!.toInt()
                comments = tweets_.getComment(i)!!.toInt()
                retweets = tweets_.getRetweet(i)!!.toInt()
            }
            retorno = tweets_.addTweetData(view, retorno)
        }
        recycler_tweet.adapter = ViewTweetAdapter(retorno)
        recycler_tweet.layoutManager = LinearLayoutManager(this)

        // Abrir perfil do usuário que fez o tweet
        recycler_tweet.addOnItemClickListenerTweet(object: OnItemClickListenerTweet{
            override fun onItemClickedTweet(position: Int, view: View) {
                for (ii in 0..retorno.size)
                    if (position == ii){
                        intent.putExtra("position", position)
                        startActivity(intent)
                        finish()
                    }
            }

        })*/

        //voltar a tela inicial
        bt_back_menu.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }



    }


}