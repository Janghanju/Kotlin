package Class01

fun main(argv:Array<String>) {
    var num1 : Int = 10
    var num2 : Int = 100

    var max = if(num1 > num2) num1 else num2
    println("최대값은 $max 입니다")

    max = if(num1 > num2) {
        num1
    } else {
        num2
    }
    println("최대값은 $max 입니다.")

    var num3 = 3
    when(num3) {
        1 -> println("num3 = 1")
        2 -> println("num3 = 2")
        3 -> println("num3 = 3")
        4 -> println("num3 = 4")
        else -> println("없습니다.")
    }

    var nation = "Korea"
    var nation_kr = when(nation) {
        "USA" -> "미국"
        "Korea" -> "대한민국"
        "China" -> "중국"
        else -> "???"
    }
    println("${nation}은 $nation_kr 입니다.")

    var grade = 75
    when(grade) {
        in 90..100 -> println("수")
        in 80..90 -> println("우")
        in 70..80 -> println("미")
        else -> println("낙제")
    }
}