package br.com.fiap.lucas_hori_rm89024_check

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.lucas_hori_rm89024_check.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val value = intent.getStringExtra("value")
        binding.titleTextView.text = "Para quem você deseja enviar R$$value,00?"

        binding.continueButton.setOnClickListener {
            val pixKey = binding.pixInput.text.toString()
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("value", value)
            intent.putExtra("pixKey", pixKey)
            startActivity(intent)
        }
    }
}