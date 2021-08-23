package com.primeiro.desafio_fuze.util

import android.content.Context
import com.primeiro.desafio_fuze.model.TweetObj


/*
Classe responsavel pela manipulação dos dados referentes aos tweets coletados.
 */
class DataTweet (private val context: Context){
    val ima_url: String = "twitter.com"
    val tweet1 = TweetObj("@joazinho", ima_url, ima_url,
        "O dia foi louco, altas programação", 15,3,1)
    val tweet2 = TweetObj("@juca123", ima_url, ima_url,
        "Hoje foi um bom dia, Gratidão!", 254,23,10)

    val lis_tweet = listOf(tweet1, tweet2)

    //retorna o @ do usuário que fez o tweet de acordo a posição na lista
    fun getUser(id: Int?): String? {
        return lis_tweet[id!!].user
    }

    //retorna a imagem de perfil do usuário que fez o tweet de acordo a posição na lista
    fun getImaUser(id: Int?): String? {
        return lis_tweet[id!!].image_user
    }

    //retorna a imagem do tweet de acordo a posição na lista
    fun getImaTweet(id: Int?): String? {
        return lis_tweet[id!!].image_tweet
    }

    //retorna o texto do tweet de acordo a posição na lista
    fun getTextTweet(id: Int?): String? {
        return lis_tweet[id!!].text
    }

    //retorna o número de likes do tweet de acordo a posição na lista
    fun getLikes(id: Int?): Int? {
        return lis_tweet[id!!].likes
    }

    //retorna o número de comentários no tweet de acordo a posição na lista
    fun getComment(id: Int?): Int? {
        return lis_tweet[id!!].comments
    }

    //retorna o número de retweets do tweet de acordo a posição na lista
    fun getRetweet(id: Int?): Int? {
        return lis_tweet[id!!].retweets
    }

    //retorna o objeto tweet de acordo a posição na lista
    fun getListTweet(): List<TweetObj> {
        return lis_tweet
    }

    //classe de dados View de um tweet
    data class ViewTweetData(
        var user: String ,
        var image_user: String ,
        var image_tweet: String,
        var text: String ,
        var likes: Int ,
        var comments: Int ,
        var retweets: Int )

    //classe de construtor da classe de dados
    class ViewTweetDataBuilder{
        var user: String = ""
        var image_user: String = ""
        var image_tweet: String = ""
        var text: String = ""
        var likes: Int = 0
        var comments: Int = 0
        var retweets: Int = 0

        fun build():ViewTweetData = ViewTweetData(user, image_user, image_tweet, text, likes, comments, retweets)
    }

    fun viewTweetData(block: ViewTweetDataBuilder.() -> Unit): ViewTweetData = ViewTweetDataBuilder().apply(block).build()

    fun addTweetData(viewTweet: ViewTweetData, retorno:MutableList<ViewTweetData>): MutableList<ViewTweetData> {
        var listMutable = retorno
        listMutable.add(viewTweet)
        return listMutable
    }


}