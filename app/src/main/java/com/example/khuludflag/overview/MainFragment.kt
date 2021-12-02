package com.example.khuludflag.overview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.khuludflag.databinding.FragmentMainBinding

private var binding: FragmentMainBinding? = null
class MainFragment : Fragment(){
 private val viewModel: FlageViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentMainBinding.inflate(inflater)

        binding.lifecycleOwner = this
        binding.viewmdoel = viewModel
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }


}