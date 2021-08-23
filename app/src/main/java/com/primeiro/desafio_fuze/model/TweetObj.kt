package com.primeiro.desafio_fuze.model


/*

Classe que implementa o Objeto Tweet
 */
class TweetObj(
    var user: String?, var image_user: String?, var image_tweet: String?, var text: String?,
    var likes: Int?, var comments: Int?, var retweets: Int?){

    constructor():this(null,null,null,null,
        null,null, null)

}