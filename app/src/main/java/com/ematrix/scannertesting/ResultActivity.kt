package com.ematrix.scannertesting

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val sessionId = intent.getStringExtra("RESULT")
        result.setText(sessionId)

        confirm.setOnClickListener {
            val intent = Intent(this@ResultActivity, PaymentSucessfull::class.java)
            startActivity(intent)
        }


    }
}
