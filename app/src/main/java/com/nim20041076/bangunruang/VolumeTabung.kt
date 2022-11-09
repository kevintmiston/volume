package com.nim20041076.bangunruang

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.support.v7.app.AppCompatActivity

class VolumeTabung : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtJari: EditText
    private lateinit var edtTinggi: EditText
    private lateinit var btnHitung: Button
    private lateinit var btnHapus: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume_tabung)

        edtJari = findViewById(R.id.edt_Jarijari_Tabung)
        edtTinggi = findViewById(R.id.edt_Tinggi_Tabung)
        btnHitung = findViewById(R.id.btn_Hitung_Tabung)
        btnHapus = findViewById(R.id.btn_Hapus_Tabung)
        tvHasil = findViewById(R.id.tv_Hasil_Tabung)

        btnHitung.setOnClickListener(this)
        btnHapus.setOnClickListener(this)
    }

    override fun onClick(V: View?) {
        if (V?.id == R.id.btn_Hitung_Tabung) {
            val Jari = edtJari.text.toString().trim()
            val Tinggi = edtTinggi.text.toString().trim()
            var isEmptyField = false;

            if (TextUtils.isEmpty(Jari)) {

                isEmptyField = true;
                edtJari.setError("Field ini tidak boleh kosong");

            }
            if (TextUtils.isEmpty(Tinggi)) {

                isEmptyField = true;
                edtTinggi.setError("Field ini tidak boleh kosong");

            }
            if (!isEmptyField) {
                val volume = 3.14 * Jari.toDouble() * Jari.toDouble() * Tinggi.toDouble()

                tvHasil.text = volume.toString()
            }
        }
        if (V?.id == R.id.btn_Hapus) {
            edtJari.setText("")
            edtTinggi.setText("")

            tvHasil.setText("")
        }
    }
}