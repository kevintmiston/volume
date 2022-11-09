package com.nim20041076.bangunruang

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.support.v7.app.AppCompatActivity

class VolumeBalok : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtPanjang: EditText
    private lateinit var edtLebar: EditText
    private lateinit var edtTinggi: EditText
    private lateinit var btnHitung: Button
    private lateinit var btnHapus: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume_balok)

        edtPanjang = findViewById(R.id.Panjang)
        edtLebar = findViewById(R.id.Lebar)
        edtTinggi = findViewById(R.id.Tinggi)
        btnHitung = findViewById(R.id.btn_Hitung_Balok)
        btnHapus = findViewById(R.id.btn_Hapus)
        tvHasil = findViewById(R.id.tv_hasil_balok)

        btnHitung.setOnClickListener(this)
        btnHapus.setOnClickListener(this)

    }

    override fun onClick(V: View?) {
        if (V?.id == R.id.btn_Hitung_Balok) {
                val Panjang = edtPanjang.text.toString().trim()
                val Lebar = edtLebar.text.toString().trim()
                val Tinggi = edtTinggi.text.toString().trim()
                var isEmptyField = false;

            if (TextUtils.isEmpty(Panjang)) {

                isEmptyField = true;
                edtPanjang.setError("Field ini tidak boleh kosong");

            }
                if (TextUtils.isEmpty(Lebar)) {

                isEmptyField = true;
                edtLebar.setError("Field ini tidak boleh kosong");

            }
            if (TextUtils.isEmpty(Tinggi)) {

                isEmptyField = true;
                edtTinggi.setError("Field ini tidak boleh kosong");

            }
                if (!isEmptyField) {
                val volume = Panjang.toDouble() * Lebar.toDouble() * Tinggi.toDouble()

                tvHasil.text = volume.toString()
            }
        }
        if (V?.id == R.id.btn_Hapus) {
            edtPanjang.setText("")
            edtLebar.setText("")
            edtTinggi.setText("")

            tvHasil.setText("")
        }
    }
}