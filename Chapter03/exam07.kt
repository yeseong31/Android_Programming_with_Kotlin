fun main() {
    // 생성자를 이용
    var myCar1 : Car = Car("빨강", 0)
    var myCar2 : Car = Car("파랑", 0)
    var myCar3 : Car = Car("초록", 0)

    // 정적 메소드 이용
    println("생산된 차의 대수(정적 필드) ==> " + Car.carCount)
    println("생산된 차의 대수(정적 메소드) ==> " + Car.currentCarCount())
    println("차의 최고 제한 속도 ==> " + Car.MAXSPEED)

    println("PI의 값 ==> " + Math.PI)
    println("3의 5제곱 ==> " + Math.pow(3.5, 5.0))
}