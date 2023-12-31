/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package dukendev

import dukendev.day1.PuzzleOne
import kotlin.test.Test
import kotlin.test.assertEquals

class TestPuzzle1 {
    @Test
    fun parseNumeralsTest() {
        val puzzleOne = PuzzleOne()
        assertEquals(Pair(7, 7), puzzleOne.parseNumerals("treb7uchet"))
        assertEquals(Pair(1, 5), puzzleOne.parseNumerals("a1b2c3d4e5f"))
    }

    @Test
    fun exampleSumTest() {
        val testInput = listOf(
            "1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet"
        )
        val testInput2 = listOf(
            "two1nine",
            "eightwothree",
            "abcone2threexyz",
            "xtwone3four",
            "4nineeightseven2",
            "zoneight234",
            "7pqrstsixteen",
            "2fourghsixptk"
        )
        val puzzleOne = PuzzleOne()
        assertEquals(142, puzzleOne.getSumOfCalibrationValues(testInput))
        assertEquals(307, puzzleOne.getSumOfCalibrationValues(testInput2))
    }
    @Test fun parseSpellTest() {
        val puzzleOne = PuzzleOne()
        assertEquals(Pair(3, 4), puzzleOne.parseSpelledNumerals("cpxtthree14"))
        assertEquals(Pair(8,3),puzzleOne.parseSpelledNumerals("eightwothree"))
        assertEquals(Pair(3,2),puzzleOne.parseSpelledNumerals("3oneeighttwo"))
        assertEquals(Pair(2,6),puzzleOne.parseSpelledNumerals("2fourghsixptk"))
        assertEquals(Pair(6,5),puzzleOne.parseSpelledNumerals("sixsix35"))
        assertEquals(Pair(2,2),puzzleOne.parseSpelledNumerals("two"))
        assertEquals(Pair(3,2),puzzleOne.parseSpelledNumerals("3tworxcbnqlhv"))
    }

}
