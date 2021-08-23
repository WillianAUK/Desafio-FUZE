package com.primeiro.desafio_fuze.util

import android.content.Context
import android.content.SharedPreferences

/*
Classe responsavel por salver localmente em shared Preference o historico de pesquisa realizado.
 */

class DataHistoric(private val context: Context) {
    private val ARCHISEARCH = "historic_search.pet"

    private val TEXT_SEARCH = "TEXT"

    private val preferences: SharedPreferences
    private val editor: SharedPreferences.Editor

    // Salva o Histórico
    fun SaveTextSearch(data: String?){
        editor.putString(TEXT_SEARCH, data)
        editor.commit()
    }

    //Recupera o histórico
    fun RecoverTextSearch(): String? {
        return preferences.getString(TEXT_SEARCH, "")
    }

    // Deleta o histórico
    fun DeleteHistoricSearch(){
        SaveTextSearch("")
    }

    //inicializa o Shared Preferences
    init {
        preferences = context.getSharedPreferences(ARCHISEARCH, 0)
        editor = preferences.edit()
    }

    // Dados objeto histórico
    data class ViewHistoricText(
        val text_: String
        )

    // Construtor do objeto
    class ViewHistoricBuilder{
        var text_: String = ""

        fun build():ViewHistoricText = ViewHistoricText(text_)
    }


    fun viewHistoricSearch(block: ViewHistoricBuilder.() -> Unit): ViewHistoricText = ViewHistoricBuilder().apply(block).build()

    // Adiciona o objeto histórico a lista
    fun addViewHistoricSearch(viewHistorictext: ViewHistoricText, return_:MutableList<ViewHistoricText>): MutableList<ViewHistoricText> {
        var mut = return_
        mut.add(viewHistorictext)
        return mut
    }

}