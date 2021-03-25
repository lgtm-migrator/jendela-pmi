package com.pmi.jendelapmi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class NotifikasiFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notifikasi, container, false)
    }

    companion object {
        fun newInstance(): NotifikasiFragment{
            val fragment = NotifikasiFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}