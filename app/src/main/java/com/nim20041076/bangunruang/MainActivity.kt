package com.nim20041076.bangunruang

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.support.v7.app.AppCompatActivity
import com.nim20041076.bangunruang.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveVolume_Balok: Button = findViewById(R.id.btn_move_volume_balok)
        btnMoveVolume_Balok.setOnClickListener(this)

        val btnMoveVolume_Kubus: Button = findViewById(R.id.btn_move_volume_kubus)
        btnMoveVolume_Kubus.setOnClickListener(this)

        val btnMoveVolume_Tabung: Button = findViewById(R.id.btn_move_volume_tabung)
        btnMoveVolume_Tabung.setOnClickListener(this)
    }

    override fun onClick(V: View?) {
        when (V?.id) {

            R.id.btn_move_volume_balok -> {
                val moveIntentBalok = Intent(this@MainActivity, VolumeBalok::class.java)
                startActivity(moveIntentBalok)
            }
            R.id.btn_move_volume_kubus -> {
                val moveIntentKubus = Intent(this@MainActivity, VolumeKubus::class.java)
                startActivity(moveIntentKubus)
            }
            R.id.btn_move_volume_tabung -> {
                val moveIntentTabung = Intent(this@MainActivity, VolumeTabung::class.java)
                startActivity(moveIntentTabung)
            }
        }
    }
}