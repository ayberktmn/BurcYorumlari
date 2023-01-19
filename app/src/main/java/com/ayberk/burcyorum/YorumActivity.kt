package com.ayberk.burcyorum


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayberk.burcyorum.databinding.ActivityYorumBinding

class YorumActivity : AppCompatActivity() {

    private lateinit var binding: ActivityYorumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYorumBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        binding.BurcText.text = selectedLandmark.name
        binding.YorumText.text = selectedLandmark.comment
        binding.titleText.text = selectedLandmark.Title
        binding.imageView2.setImageResource(selectedLandmark.Image)
    }


}