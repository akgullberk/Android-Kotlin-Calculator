package com.example.kotlincalculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number1 : Double? = null
    var number2 : Double? = null
    var result : Double? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }

    fun mySum(view : View){

        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if(number1 != null && number2!=null){
            result = number1!! + number2!!
            binding.resultText.text = "Result: ${result}"

        }else{
            binding.resultText.text = "Enter number!"
        }

    }

    fun mySub(view : View){

        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if(number1 != null && number2!=null){
            result = number1!! - number2!!
            binding.resultText.text = "Result: ${result}"

        }else{
            binding.resultText.text = "Enter number!"
        }

    }

    fun myMultiply(view : View){

        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if(number1 != null && number2!=null){
            result = number1!! * number2!!
            binding.resultText.text = "Result: ${result}"

        }else{
            binding.resultText.text = "Enter number!"
        }

    }

    fun myDiv(view : View){

        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if(number1 != null && number2!=null){
            result = number1!! / number2!!
            binding.resultText.text = "Result: ${result}"

        }else{
            binding.resultText.text = "Enter number!"
        }

    }
}