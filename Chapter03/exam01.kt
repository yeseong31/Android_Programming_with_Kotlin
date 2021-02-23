fun main() {
    var var1 : Int = 10         // var var1 = 10 으로 '암시적 선언'도 가능
    var var2 : Float = 10.1f
    var var3 : Double = 10.2
    var var4 : Char = '안'
    var var5 : String = "안드로이드"
    println(var1)
    println(var2)
    println(var3)
    println(var4)
    println(var5)


    // val은 선언 및 값 대입 후 변경 불가능.
    val myVal : Int = 100
//  myVal = 200     


    // 데이터 형식 변환에 캐스팅 연산자 이외에 toInt()나 toDouble() 등의 정적 메소드도 사용 가능.
    var a : Int = "100".toInt()
    var b : Double = "100.123".toDouble()


    // Kotlin은 기본적으로 변수에 null 값을 넣지 못한다.
    // 변수에 null 값을 대입하려면 변수를 선언할 때 데이터 형식 뒤에 '?'를 붙여야 한다.
    var okNull : Int? = null


    // 반대로 변수 객체가 null 값이 아니라고 표시해야 하는 경우도 있다.
    // 이는 '!!'로 나타내며, 이 경우 null 값이 들어가면 오류가 발생한다.
    var ary = ArrayList<Int>(1)     // 1개짜기 배열 리스트
    ary!!.add(100)                              // 값 100 추가
}