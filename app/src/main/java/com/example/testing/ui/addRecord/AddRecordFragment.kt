package com.example.testing.ui.addRecord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.testing.databinding.RecordFormBinding

class AddRecordFragment: Fragment() {
    private var _binding: RecordFormBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val addRecordViewModel =
            ViewModelProvider(this).get(AddRecordViewModal::class.java)

        _binding = RecordFormBinding.inflate(inflater, container, false)
        val root: View = binding.root
//
//        val textView: TextView = binding.textAddRecord
//        addRecordViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }
}