package Class01

fun main(argv:Array<String>) {
    println("안녕하세요")

    var num1 : Int = 0
    var num2 : Int = 0

    num1 = 10
    num2 = 20
    println(num1+num2)

    println() // 주석

    /*
    여러번 주석
     */
    // 변수에 원래는 nll 을 저장할수 없도록
    // 어쩔수없이 null값을 저장해야할 경우에는 자료형 키워드 뒤에 ? 표 추가
    // 이 값을 나중에 초기호 하겠다.
    var nation : String? = null
}
