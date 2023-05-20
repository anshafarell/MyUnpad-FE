package com.example.myunpadsplashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AlertDialog

//class EditPost : AppCompatActivity() {
class EditPost : ComponentActivity() {
    private lateinit var button : Button
    // Membuat alert dialog
    private lateinit var builder : AlertDialog.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_post)
        button = findViewById(R.id.hapuspost)

        builder = AlertDialog.Builder(this)

        button.setOnClickListener{
            builder.setTitle("Hapus Post")
                .setMessage("Apakah Anda yakin?")
                .setCancelable(true)
                    // atur positive button
                    // ambil dua parameter dialogInterface dan sebuah it
                .setPositiveButton("Iya"){dialogInterface, it ->
                    // finish() : untuk menutup aplikasi
                }
                .setNegativeButton("Tidak"){dialogInterface, it->
                    dialogInterface.cancel()
                }
//                .setNeutralButton("Help"){dialogInterface, it ->
//                    // hanya menunjukan sebuah toast
//                    Toast.makeText(this@EditPost, "Tombol Help", Toast.LENGTH_SHORT).show()
//                }
            // menampilkan builder
                .show()
        }
    }
}