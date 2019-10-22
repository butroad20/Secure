package com.road20.secure.core.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.road20.secure.core.base.BaseSecureViewModel
import javax.inject.Provider

class SecureViewModelFactory constructor(
    private val creators: @JvmSuppressWildcards Map<Class<out BaseSecureViewModel>, Provider<BaseSecureViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val found = creators.entries.find { modelClass.isAssignableFrom(it.key) }
        val creator = found?.value
            ?: throw IllegalArgumentException("Unknown model class $modelClass")
        try {
            @Suppress("UNCHECKED_CAST")
            return creator.get() as T
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}