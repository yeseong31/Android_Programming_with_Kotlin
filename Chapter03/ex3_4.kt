// 3 x 3 이차원 배열을 선언하고, for 문을 이용하여 값을 대입하는 코드를 작성하라.

fun main() {
    var array = Array<IntArray>(3, {IntArray(3)})
    var n : Int = 100
    for (i in array.indices) {
        for (j in array[i].indices) {
            array[i][j] = n
            n += 10
        }
    }
    for (i in array.indices) {
        for (j in array.indices)
            print(array[i][j].toString() + " ")
        println()
    }
}