package com.road20.secure.core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import dagger.android.support.DaggerFragment

abstract class BaseSecureFragment <BINDING: ViewDataBinding, VIEWMODEL: BaseSecureViewModel> : DaggerFragment() {

    protected abstract val layoutId: Int

    protected abstract val viewModel: VIEWMODEL

    private lateinit var binding: BINDING

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        binding.apply {
//            setVariable(BR.ViewModel, viewModel)
            executePendingBindings()
        }
        return binding.root
    }

    protected fun navigate(direction: NavDirections) = findNavController().navigate(direction)

    protected fun navigateUp() = findNavController().navigateUp()
}