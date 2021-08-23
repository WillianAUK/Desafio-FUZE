package com.primeiro.desafio_fuze

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


/*
Classe que controla a activity da timeline do usuário
 */

class UserTimeline : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_timeline)
    }
}