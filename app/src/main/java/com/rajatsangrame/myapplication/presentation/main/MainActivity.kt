package com.rajatsangrame.myapplication.presentation.main

import android.os.Bundle
import androidx.activity.viewModels
import com.rajatsangrame.myapplication.R
import com.rajatsangrame.myapplication.presentation.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}