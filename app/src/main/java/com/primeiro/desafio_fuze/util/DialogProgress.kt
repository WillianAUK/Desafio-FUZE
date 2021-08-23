package com.primeiro.desafio_fuze.util

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.primeiro.desafio_fuze.R

/*
Classe que implemnta o Dialog Progress quando se faz a busca por tweets
 */
class DialogProgress : DialogFragment() {
    init {
    }
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.dialog_progress,container)

        retainInstance.to(true)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        isCancelable.to(true)
    }
}