package com.example.inflearn_viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HostFragmentViewModel : ViewModel() {

    // Expose screen UI state
    private val _numberValue = MutableStateFlow(1.0)
    val numberValue : StateFlow<Double> = _numberValue.asStateFlow()

    fun multiplyTwo() {
        _numberValue.update{
            it.times(2)
        }
    }

    fun divideTwo() {
        _numberValue.update{
            it.div(2)
        }
    }
}