package com.example.webviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val etKey = "editTextText"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    private fun initView(){
        findViewById<Button>(R.id.btn_search).setOnClickListener {
            buttonSearch()
        }
    }

    private fun buttonSearch(){
        val intent = Intent(this@MainActivity, WebViewActivity::class.java)
        intent.putExtra(etKey,findViewById<EditText>(R.id.et_search).text.toString())
        startActivity(intent)
    }

}