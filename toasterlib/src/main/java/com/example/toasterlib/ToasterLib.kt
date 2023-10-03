        package com.example.toasterlib

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.toasterlib.ui.theme.ToasterExampleTheme

class ToasterLib : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
   fun showToast(context: Context, message: String, duration: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(context, message, duration).show()
        }
    }
}

