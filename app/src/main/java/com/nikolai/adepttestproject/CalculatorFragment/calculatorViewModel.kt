package com.nikolai.adepttestproject.CalculatorFragment

class calculatorViewModel {
    private var currentFirstFragment: String = ""
    private var currentSecondFragment: String = ""
    fun plus (): Int {
        return currentFirstFragment.toInt() + currentSecondFragment.toInt()
    }
    fun minus (): Int {
        return currentFirstFragment.toInt() - currentSecondFragment.toInt()
    }
    fun divide (): Int {
        val second = currentSecondFragment
        if (second != 0){
            return currentFirstFragment.toInt() / currentSecondFragment.toInt()
        } else {
            throw Exception("Деление на ноль")
        }
    }
    fun multiply (): Int {
        val second = currentSecondFragment.toInt()
        return currentFirstFragment.toInt() * currentSecondFragment.toInt()

    }

    fun updateFirstNumber(value: String) {
        currentFirstFragment = value
    }

    fun updateSecondNumber(value: String) {
        currentSecondFragment = value
    }
}