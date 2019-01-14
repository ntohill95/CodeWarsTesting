package com.example.niamhtohill.codewarquestions

import org.junit.Assert
import org.junit.Test


class SquaredNumbers {
    @Test
    fun testFixed() {
        Assert.assertEquals(811181, square_digits(9119))
    }
}
// TODO 1: Function that square every number in integer and appends
fun square_digits(num: Int): Int {
    val digitString = num.toString()
    val arrayOfNumbers: List<Int> = digitString.map { it.toString().toInt() }
    var squaredNumberString = ""
    for (number in arrayOfNumbers) {
        squaredNumberString += (number * number).toString()
    }
    return squaredNumberString.toInt()
}