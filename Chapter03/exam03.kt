fun main() {
    var one : IntArray = intArrayOf(10, 20, 30)     // 선언과 동시에 값 대입
    
    for (i in one.indices)
        println(one[i])
    
    for (value in one)
        println(value)

    var two : Array<String> = arrayOf("하나", "둘", "셋")
    
    for (i in 0..2 step 1)      // i = 0부터 i = 2까지 1씩 증가
        println(two[i])
    
    var k : Int = 0
    while (k < two.size)
        println(two[k++])
}
