package com.nim20041076.bangunruang

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.support.v7.app.AppCompatActivity

class VolumeKubus : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtSisi: EditText
    private lateinit var btnHitung: Button
    private lateinit var btnHapus: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume_kubus)

        edtSisi = findViewById(R.id.edt_SisiKubus)
        btnHitung = findViewById(R.id.btn_Hitung_Kubus)
        btnHapus = findViewById(R.id.btn_Hapus_Kubus)
        tvHasil = findViewById(R.id.tv_Hasil_Kubus)

        btnHitung.setOnClickListener(this)
        btnHapus.setOnClickListener(this)
    }

    override fun onClick(V: View?) {
        if (V?.id == R.id.btn_Hitung_Kubus) {
            val Sisi = edtSisi.text.toString().trim()
            var isEmptyField = false;

            if (TextUtils.isEmpty(Sisi)) {

                isEmptyField = true;
                edtSisi.setError("Field ini tidak boleh kosong");

            }
            if (!isEmptyField) {
                val volume = Sisi.toDouble() * Sisi.toDouble() * Sisi.toDouble()

                tvHasil.text = volume.toString()
            }
        }
        if (V?.id == R.id.btn_Hapus) {
            edtSisi.setText("")

            tvHasil.setText("")
        }
    }
}