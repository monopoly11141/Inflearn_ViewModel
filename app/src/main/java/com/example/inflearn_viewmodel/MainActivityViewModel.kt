package com.example.inflearn_viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainActivityViewModel : ViewModel() {

    // Expose screen UI state
    private val _countValue = MutableStateFlow(0)
    val countValue: StateFlow<Int> = _countValue.asStateFlow()

    fun plus() {
        _countValue.update{
            it.plus(1)
        }

    }

    fun minus() {
        _countValue.update{
            it.minus(1)
        }
    }
}