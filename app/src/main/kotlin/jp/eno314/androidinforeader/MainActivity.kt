package jp.eno314.androidinforeader

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.databinding.DataBindingUtil

import jp.eno314.androidinforeader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.mainText.text = "hello world"
    }
}
