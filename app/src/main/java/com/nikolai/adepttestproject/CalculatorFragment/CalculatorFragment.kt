package com.nikolai.adepttestproject.CalculatorFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.nikolai.adepttestproject.R
import com.nikolai.adepttestproject.firstscreen.FirstFragment

class CalculatorFragment: Fragment() {
    private val viewModel: calculatorViewModel = calculatorViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calculater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstNumber = view.findViewById<EditText>(R.id.firstNumberInput)
        val secondNumber = view.findViewById<EditText>(R.id.secondNumberInput)


        val buttonAdd = view.findViewById<Button>(R.id.buttonAdd)
        buttonAdd.setOnClickListener {
           val resultValue = viewModel.minus()
            view.findViewById<TextView>(R.id.textView2).text = resultValue.toString()
        }

        val buttonSub = view.findViewById<Button>(R.id.buttonSub)
        buttonSub.setOnClickListener {
            val c = viewModel.minus()
            view.findViewById<TextView>(R.id.textView2).text = c.toString()
        }
        val buttonMultiply = view.findViewById<Button>(R.id.buttonMultiply)
        buttonMultiply.setOnClickListener {
            val resultValue = viewModel.multiply()
            view.findViewById<TextView>(R.id.textView2).text = resultValue.toString()
        }
        val buttonDivide = view.findViewById<Button>(R.id.buttonMultiply)
        buttonMultiply.setOnClickListener {
            try {
                val resultValue = viewModel.divide()
                view.findViewById<TextView>(R.id.textView2).text = resultValue.toString()
            } catch(error: Exception){
                view.findViewById<TextView>(R.id.textView2).text = error.message
            }
        }


    }
}