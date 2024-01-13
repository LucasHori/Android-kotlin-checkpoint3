package br.com.fiap.lucas_hori_rm89024_check

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.lucas_hori_rm89024_check.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.continueButton.setOnClickListener {
            val value = binding.valueInput.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("value", value)
            startActivity(intent)
        }
    }
}