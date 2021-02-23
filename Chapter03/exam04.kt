var myVar : Int = 100       // 전역변수: 선언과 동시에 값을 초기화해야 한다.

fun main() {
    var myVar : Int = 0     // 지역변수
    println(myVar)          // myVar를 출력하면 지역변수가 우선시되므로 지역변수의 값이 출력된다.

    var sum : Int = addFunction(10, 20)
    println(sum)
}

fun addFunction(num1 : Int, num2 : Int) : Int {
    var hap : Int = num1 + num2 + myVar
    return hap
}