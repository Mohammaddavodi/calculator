package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var firstNumber:EditText
    lateinit var secondNumber:EditText
    lateinit var btnSum:Button
    lateinit var resultTv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumber=findViewById(R.id.edtFirstNumber)
        secondNumber=findViewById(R.id.edtSecondNumber)
        btnSum=findViewById(R.id.btnCalcute)
        resultTv=findViewById(R.id.tvResult)

btnSum.setOnClickListener {
    val num1=firstNumber.text.toString().toInt()
    val num2=secondNumber.text.toString().toInt()
   // val sum=num1+num2
    resultTv.text.sumOf { num1+num2 }
}



    }
}