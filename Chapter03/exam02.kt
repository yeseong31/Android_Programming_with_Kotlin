fun main() {
    var count : Int = 85
    if (count >= 90) println("if문: 합격 (장학생)")
    else if (count >= 60) println("if문: 합격")
    else println("if문: 불합격")


    // when문
    var score : Int = (count / 10) * 10
    when (score) {
        100, 90 -> println("when문: 합격(장학생)")
        80, 70, 60 -> println("when문: 합격")
        else -> println("when문: 불합격")
    }


    // when ~ in문
    var jumsu : Int = count
    when (score) {
        in 90 .. 100 -> println("when문: 합격 (장학생)")
        in 60 .. 89 -> println("when문: 합격")
        else -> println("when문: 불합격")
    }


    // 일차원 배열 선언: Array<데이터 형식>(개수, {초깃값})
    var one = Array<Int>(4, {0})
    one[0] = 10
    one[3] = 20


    // 이차원 배열 선언: Array<데이터 형식>(행 개수, {데이터 형식(열 개수)})
    var two = Array<IntArray>(3, {IntArray(4)})
    two[0][0] = 100
    two[2][3] = 200


    // 배열을 선언하면서 바로 값 대입
    var three : IntArray = intArrayOf(1, 2, 3)
}