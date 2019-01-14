package com.example.niamhtohill.codewarquestions

import org.junit.Assert.*
import org.junit.Test

class HighAndLow {
    @Test
    fun testFixed() {
        assertEquals("42 -9", highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
    }
}


// TODO : Function that takes a string of space separated numbers, and have to return the highest and lowest number.
fun highAndLow(number: String): String {
    val noSpaceString = number.split(" ")
    val parseStringToArray = noSpaceString.map { it.toInt() }
    val maxNumber = parseStringToArray.max().toString()
    val minNumber = parseStringToArray.min().toString()
    return maxNumber + " " + minNumber
}