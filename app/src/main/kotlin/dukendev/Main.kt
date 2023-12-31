/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package dukendev

import dukendev.day1.PuzzleOne
import dukendev.day3.PuzzleThree
import dukendev.day5.PuzzleFive
import dukendev.day7.PuzzleSeven
import kotlin.system.measureTimeMillis


fun main() {
    val time = measureTimeMillis {
        solveDay7()
    }
    println("solved in $time ms")
}

fun solveDay7() {
    val puzzleSeven = PuzzleSeven()
    puzzleSeven.calcWinnings()
}

fun solveDay5() {
    val puzzleFive = PuzzleFive()
    puzzleFive.findNearestLocations()
}

fun solveDay3() {
    val puzzleThree = PuzzleThree()
    puzzleThree.findSumOfEngineParts1()
}

fun solveDay1() {
    val puzzleOne = PuzzleOne()
    println(puzzleOne.getSumOfCalibrationValues())
}
