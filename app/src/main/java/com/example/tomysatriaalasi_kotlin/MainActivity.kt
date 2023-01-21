package com.example.tomysatriaalasi_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edt_Panjang: EditText
    private lateinit var edt_Lebar: EditText
    private lateinit var edt_Tinggi: EditText
    private lateinit var btn_Hitung: Button
    private lateinit var tv_Hasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edt_Panjang = findViewById(R.id.edt_Panjang)
        edt_Lebar = findViewById(R.id.edt_Lebar)
        edt_Tinggi = findViewById(R.id.edt_Tinggi)
        btn_Hitung = findViewById(R.id.btn_Hitung)
        tv_Hasil = findViewById(R.id.tv_Hasil)

        btn_Hitung.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        if (v?.id == R.id.btn_Hitung){
            val inputPanjang = edt_Panjang.text.toString().trim()
            val inputLebar = edt_Lebar.text.toString().trim()
            val inputTinggi = edt_Tinggi.text.toString().trim()
            var dataKosong = false
            if (inputPanjang.isEmpty()){
                dataKosong = true
                edt_Panjang.error = "Maaf Panjang masih kosong"
            }
            if (inputLebar.isEmpty()){
                dataKosong = true
                edt_Lebar.error = "Maaf Lebar masih kosong"
            }
            if (inputTinggi.isEmpty()){
                dataKosong = true
                edt_Tinggi.error = "Maaf Tinggi masih kosong"
            }

            if (!dataKosong){
                val hasilVolume = inputPanjang.toDouble()*inputLebar.toDouble()*inputTinggi.toDouble()
                tv_Hasil.text = hasilVolume.toString()
            }


        }

    }
}