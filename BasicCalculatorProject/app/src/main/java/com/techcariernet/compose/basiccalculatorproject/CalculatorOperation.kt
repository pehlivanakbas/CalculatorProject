package com.techcariernet.compose.basiccalculatorproject

sealed class CalculatorOperation (val symbol:String){
    object Add:CalculatorOperation("+")
    object Subtract:CalculatorOperation(" ")
    object Multiply:CalculatorOperation(" ")
    object Divide:CalculatorOperation(" ")
}