package id.ac.ukdw.damianus.pertemuan14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val berangkat = findViewById<RadioGroup>(R.id.tempatasal)
        val tujuan = findViewById<RadioGroup>(R.id.tempattujuan)
        val tanggalkeberangkatan = findViewById<EditText>(R.id.tanggalberangkat)

        val submit1 = findViewById<Button>(R.id.button1)
        submit1.setOnClickListener {
            val kotaAsal = berangkat.toString()
            val kotaTujuan = tujuan.toString()
            val tanggal = tanggalkeberangkatan.toString()


            val intent = Intent(this,MainActivity2::class.java)

            intent.putExtra("Ini Kota Asal Anda : ",kotaAsal)
            intent.putExtra("Ini Kota Tujuan Anda : ",kotaTujuan)
            intent.putExtra("Ini Tanggal Keberangkatan Anda : ",tanggal)
            startActivity(intent)
        }
    }
}