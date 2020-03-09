package com.ematrix.scannertesting

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_start_a.*


class StartAActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_a)

        pay.setOnClickListener {
            val intent = Intent(this@StartAActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
