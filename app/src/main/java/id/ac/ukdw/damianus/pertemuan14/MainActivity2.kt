package id.ac.ukdw.damianus.pertemuan14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val waktu = findViewById<RadioGroup>(R.id.waktu)
        val kelas = findViewById<RadioGroup>(R.id.tipe)

        val submit2 = findViewById<Button>(R.id.button2)
        submit2.setOnClickListener {
            val kotaAsal = waktu.toString()
            val kotaTujuan = kelas.toString()


            val intent = Intent(this, MainActivity3::class.java)

            intent.putExtra("Waktu keberangkatan Anda : ", kotaAsal)
            intent.putExtra("Kelas Tiket Anda : ", kotaTujuan)

            startActivity(intent)
        }
    }
}