fun main() {
    // 생성자를 이용
    var myCar1 : Car = Car("빨강", 0)
    var myCar2 : Car = Car("파랑", 0)
    var myCar3 : Car = Car("초록", 0)

    myCar1.upSpeed(50)
    println("자동차1의 색상은 " + myCar1.color + "이며, 속도는 " + myCar1.speed + "km입니다.")

    myCar2.upSpeed(20)
    println("자동차2의 색상은 " + myCar2.color + "이며, 속도는 " + myCar2.speed + "km입니다.")

    myCar3.upSpeed(250)
    println("자동차3의 색상은 " + myCar3.color + "이며, 속도는 " + myCar3.speed + "km입니다.")
}
