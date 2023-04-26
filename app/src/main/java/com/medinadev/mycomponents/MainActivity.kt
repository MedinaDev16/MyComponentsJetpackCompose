package com.medinadev.mycomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.medinadev.mycomponents.custom.CustomText
import com.medinadev.mycomponents.list.PhoneDirectory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                //ImageCard()
                //PhoneDirectory()
                CustomText()
            }
        }
    }
}
