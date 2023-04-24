package com.example.myunpadsplashscreen

//import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity

class ContinueWGoogle : ComponentActivity(), View.OnClickListener {
    private lateinit var btnContinue : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_continue_wgoogle)

        setContentView(R.layout.activity_continue_wgoogle)

        btnContinue = findViewById(R.id.btn_continue)

        btnContinue.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_continue->{
                val continueGoogle = Intent(this@ContinueWGoogle, BerhasilMasuk::class.java)
                startActivity(continueGoogle)
            }
        }
    }
}