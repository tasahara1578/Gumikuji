package jp.wings.nikkeibp.omikuji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.wings.nikkeibp.omikuji.databinding.MainBinding
import jp.wings.nikkeibp.omikuji.databinding.OmikujiBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: OmikujiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OmikujiBinding.inflate(layoutInflater)
        setContentView(binding.root)
/*
        // くじ番号の取得
        val rnd = Random()
        val number = rnd.nextInt(20)

        // おみくじ棚の準備
        val gumikujiShelf = Array<String>(20) {"吉"}
        gumikujiShelf[0] = "大吉"
        gumikujiShelf[19] = "凶"
        
        // おみくじ棚から取得
        val str = gumikujiShelf[number]
        
        binding.hellowView.text = str
*/
    }
}