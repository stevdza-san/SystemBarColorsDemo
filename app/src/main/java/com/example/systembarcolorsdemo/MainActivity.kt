package com.example.systembarcolorsdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.example.systembarcolorsdemo.ui.theme.SystemBarColorsDemoTheme
import com.example.systembarcolorsdemo.ui.theme.Teal200
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SystemBarColorsDemoTheme {
//                val systemUiController = rememberSystemUiController()
//                val darkTheme = isSystemInDarkTheme()
//                SideEffect {
//                    systemUiController.setSystemBarsColor(
//                        color = if (darkTheme) Color.LightGray else Teal200
//                    )
//                }
            }
        }
    }
}