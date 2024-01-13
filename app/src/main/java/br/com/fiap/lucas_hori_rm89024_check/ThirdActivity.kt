package br.com.fiap.lucas_hori_rm89024_check

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.lucas_hori_rm89024_check.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val value = intent.getStringExtra("value")
        val pixKey = intent.getStringExtra("pixKey")

        binding.transferValueTextView.text = "Transferindo R$$value,00"
        binding.pixKeyTextView.text = "Chave pix: $pixKey"

        binding.confirmTransferButton.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtra("value", value)
            intent.putExtra("pixKey", pixKey)
            startActivity(intent)
        }

        binding.reviewPixButton.setOnClickListener {
            finish()
        }
    }
}