package Class01

var doubleNumber : Double = 0.0 // 64비트 실수
var floatNumber : Float = 0f // 32비트 실수
var longNumber : Long = 0 //32비트
var intNumber : Int = 0 // 32비트
var shortNumber : Short = 0 // 16비트
var byteNumber : Byte = 0 // 8비트

var binNum : Int = 0b0001 // 이진수
var octNum : Int = 0 // 8진수
var hexNum : Int = 0xFF // 16진수

var num1 : Int = 1_000_000_000
var num2 : Long = 1234_4567_9123_3333
var num3 : Long = 0xFF_00_01_02
var num4 : Long = 0b0001_010_1100_0110

fun main(argy : Array<String>) {
    // 명령어 식 함수는 main 함수나 다른 함수 내부에 있어야 한다
    println(doubleNumber)
    println(floatNumber)
    println(longNumber)
    println(intNumber)
    println(shortNumber)
    println(byteNumber)

}