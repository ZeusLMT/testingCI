package com.wanderer.testingci

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "testing", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "testing 2", Toast.LENGTH_SHORT)
    }
}
