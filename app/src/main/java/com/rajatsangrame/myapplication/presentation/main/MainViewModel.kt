package com.rajatsangrame.myapplication.presentation.main

import androidx.lifecycle.viewModelScope
import com.rajatsangrame.myapplication.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : BaseViewModel() {

    fun fetch() {
        viewModelScope.launch {}
    }
}