package com.example.myunpadsplashscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myunpadsplashscreen.ui.theme.MyUnpadSplashScreenTheme
import android.content.Intent
import android.view.View
import android.widget.Button

//import kotlin.time.Duration.Companion.minutes



class MainActivity : ComponentActivity(), View.OnClickListener {
    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent {
//            MyUnpadSplashScreenTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }

        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)

        btnIntent.setOnClickListener(this)

        // Untuk ganti activity
//        val gotoOnboarding = Intent(this@MainActivity, onboarding::class.java)
//        startActivity(gotoOnboarding)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_intent->{
                val intentBiasa = Intent(this@MainActivity, ContinueWGoogle::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MyUnpadSplashScreenTheme {
//        Greeting("Android")
//    }
//}