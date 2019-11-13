package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener(){
            val input: String = car_price.text.toString()

            val input1: String = down_payment.text.toString()

            val input2: String = interest_rate.text.toString()

            val input3: String = loan_period.text.toString()

            val value: Double = input.toDouble()

            val value1: Double = input1.toDouble()

            val value2: Double = input2.toDouble()

            val value3: Double = input3.toDouble()

            val result = value - value1

            val result1 = (value - value1) * value2 * value3

            val result2 = ((value - value1) + ((value - value1) * value2 * value3)) / value3 / 12

            car_loan.text = "%.2f".format(result)

            interest.text = "%.2f".format(result1)

            mth_repayment.text = "%.2f".format(result2)
        }
    }
}
