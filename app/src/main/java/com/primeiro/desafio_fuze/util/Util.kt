package com.primeiro.desafio_fuze.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.widget.Toast

/*
Classe que implemnta algumas funções não funcionais para a aplicação. No momento só esta sendo
implementada a funcionalidade que verifica a conexão com a internet que será utilizada quando se
deseja fazer uma busca por tweets e funcionalidade de Toast que apenas simplifica e organiza no
código ao sem implementada.
 */

class Util {
    companion object staticMothod{
        fun exibirToast(context: Context, mensagem: String){
            Toast.makeText(context, mensagem , Toast.LENGTH_LONG).show()
        }

        // Verifica a conexão com a internet
        fun statusInternet(context: Context): Boolean {
            val conexao =  context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                val recursosRede = conexao.getNetworkCapabilities(conexao.activeNetwork)

                if (recursosRede != null) {
                    if (recursosRede.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                        //verifica se tem dados móveis
                        return true
                    } else if (recursosRede.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                        //verifica se tem wifi
                        return true
                    }

                    //Em caso de não conexão
                    return false
                }
            } else {
                // PARA DISPOSTIVOS ANTIGOS  (PRECAUÇÃO)
                val informacao = conexao.activeNetworkInfo
                return informacao != null && informacao.isConnected
            }
            return false
        }
    }

}