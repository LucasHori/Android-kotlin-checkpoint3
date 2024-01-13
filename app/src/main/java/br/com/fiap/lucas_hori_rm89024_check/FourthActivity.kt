package br.com.fiap.lucas_hori_rm89024_check

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.lucas_hori_rm89024_check.databinding.ActivityFourthBinding

class FourthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val value = intent.getStringExtra("value")
        val pixKey = intent.getStringExtra("pixKey")

        val message = "R$$value,00 enviados para a chave pix $pixKey"
        binding.successMessageTextView.text = message
    }
}
