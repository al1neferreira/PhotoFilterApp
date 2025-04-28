package com.codeapp.photofilterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import com.codeapp.photofilterapp.ui.theme.PhotoFilterAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PhotoFilterAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    Text("Hello PhotoFilterApp!")
                }
            }
        }
    }
}
