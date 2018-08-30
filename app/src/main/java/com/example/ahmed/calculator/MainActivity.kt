package com.example.ahmed.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1 = findViewById<EditText>(R.id.num1)
        var num2 = findViewById<EditText>(R.id.num2)
        var btnadd = findViewById<Button>(R.id.plus)
        var btnsub = findViewById<Button>(R.id.minas)
        var btnby = findViewById<Button>(R.id.by)
        var btnalaa = findViewById<Button>(R.id.ala)
        var btnbaky = findViewById<Button>(R.id.baky)
        var result = findViewById<TextView>(R.id.result)


        /*

        btnadd.setOnClickListener {
            var number1 = Integer.parseInt(num1.text.toString())
            var number2 = Integer.parseInt(num2.text.toString())
            var sum = number1 + number2
            result.text = sum.toString()
        }

        btnsub.setOnClickListener {var number1 = Integer.parseInt(num1.text.toString())
            var number2 = Integer.parseInt(num2.text.toString())
           var sub = number1 - number2
            result.text = sub.toString()
        }

        btnby.setOnClickListener {var number1 = Integer.parseInt(num1.text.toString())
            var number2 = Integer.parseInt(num2.text.toString())
            var by = number1 * number2
            result.text = by.toString()
        }

        btnalaa.setOnClickListener {var number1 = Integer.parseInt(num1.text.toString())
            var number2 = Integer.parseInt(num2.text.toString())
            try {
                var ala = number1 / number2
                result.text = ala.toString()
            }catch (ex:Exception){
                Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
            }
        }

        btnbaky.setOnClickListener {var number1 = Integer.parseInt(num1.text.toString())
            var number2 = Integer.parseInt(num2.text.toString())
            var ba = number1 % number2
            result.text = ba.toString()
        }
        */




        fun calc(epo:Char){

            var number1 = Integer.parseInt(num1.text.toString())
            var number2 = Integer.parseInt(num2.text.toString())
            var r:Int = 0
            try {


            when(epo){
                '+'-> r = number1 + number2
                '-'->r = number1 - number2
                '*'->r  = number1 * number2
                '/'->r = number1 / number2
                '%'->r = number1 % number2
            }

            }catch (ex:Exception){
                Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
            }
            result.text = r.toString()
        }
        btnadd.setOnClickListener {
            calc('+')
        }

        btnsub.setOnClickListener {
            calc('-')
        }
        btnby.setOnClickListener {
            calc('*')
        }
        btnalaa.setOnClickListener {
            calc('/')
        }
        btnbaky.setOnClickListener {
            calc('%')
        }
    }
}
