
package com.dynamicisland.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.startBtn).setOnClickListener {
            startForegroundService(Intent(this, IslandService::class.java))
        }

        findViewById<Button>(R.id.stopBtn).setOnClickListener {
            stopService(Intent(this, IslandService::class.java))
        }
    }
}
