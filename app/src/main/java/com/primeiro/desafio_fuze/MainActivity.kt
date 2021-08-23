package com.primeiro.desafio_fuze

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.primeiro.desafio_fuze.adapters.ViewHistoricAdapter
import com.primeiro.desafio_fuze.util.DataHistoric
import com.primeiro.desafio_fuze.util.DialogProgress
import com.primeiro.desafio_fuze.util.Util
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_view_tweets.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        val historic = DataHistoric(applicationContext)
        recycler_historic.removeAllViewsInLayout()

        var retorno:MutableList<DataHistoric.ViewHistoricText> = mutableListOf()
        val text1 = historic.RecoverTextSearch().toString().split(",").toMutableList()

        //  exibe as buscas recentes
        for (i in 1..text1.count()-1) {
            var view = historic.viewHistoricSearch {
                if (text1[i].length >= 11) {
                    text_ = "Busca: " + text1.get(i).substring(0..11) + "..."
                } else {
                    text_ = "Busca: " + text1.get(i)
                }
            }
            retorno = historic.addViewHistoricSearch(view, retorno)
        }
        recycler_historic.adapter = ViewHistoricAdapter(retorno)
        recycler_historic.layoutManager = LinearLayoutManager(this)


        search_button.setOnClickListener {
            //verifica campo vazio
            if (search_text_twitter.text.toString() == "") {
                Util.exibirToast(this, "Digite sua busca!")
            } else {

                // salva busca no histórico
                var search = historic.RecoverTextSearch()
                search += "," + search_text_twitter.text.toString()
                historic.SaveTextSearch(search)

                //exibe o Progress bar quando faz a busca
                val dialogProgress = DialogProgress()
                dialogProgress.show(supportFragmentManager, "0")

                val intent: Intent = Intent(this, ViewTweets::class.java)
                startActivity(intent)
                finish()

            }

        }



    }
}