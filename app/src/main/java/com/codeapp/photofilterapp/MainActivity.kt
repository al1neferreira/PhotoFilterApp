package com.codeapp.photofilterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.codeapp.photofilterapp.data.MockPhotoFilterService
import com.codeapp.photofilterapp.ui.MainScreen
import com.codeapp.photofilterapp.viewmodel.PhotoFilterViewModel

class MainActivity : ComponentActivity() {

    private val viewModel by lazy {
        PhotoFilterViewModel(MockPhotoFilterService())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen(viewModel)
        }
    }
}
