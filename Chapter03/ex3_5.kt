// 다음 코드가 출력하는 값을 차례로 쓰시오.

var data : Int = 100

fun func1(para : Int) {
    var data : Int = para
    data++
    println(data)
}

fun main() {
    var data : Int = 200
    data++
    println(data)
    func1(data)
}