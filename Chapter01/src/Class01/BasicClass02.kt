package Class01

fun main(args : Array<String>) {

    var num1 = 0
    var num2 = 10
    var sum = 0

    for( i in 0..10) {
        sum += i
    }
    println("0부터 10까지의 덧셈" + sum)
    println("3+3")//6
    println("3" + "3")
    println("3" + 3)

    // 숫자가 앞에 오면 오류가 발생
    // println(3 + "3")

    sum = 0
    for( i in num1..num2) {
        sum += i
    }

    println( " " + num1 + "부터" + num2 + "까지" )
    println("$num1 부터 $num2 까지 덧셈=$sum") // 문자열 포멧

    println("$num1 + $num2 = ${num1 + num2}")

    var message : String = "$num1 + $num2 = ${num1 + num2}"
    println(message)

    var message1 : String = "${num1} + ${num2} = ${num1 + num2}"
    println(message1)

    var num11 : Any = 20
    var num22 : Any = 10
    println("두 값의 덧셈 ${num11 is String} ${num11 is String} ${num22 is String}")
    println(num11.toString() + num22.toString())

    println("두 값의 덧셈 ${num11 is Int} ${num22 is Int}")

    println(num11 == num22)
    println(num11 === num22)
}