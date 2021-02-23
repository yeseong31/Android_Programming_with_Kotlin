open class Car {    // 클래스 상속을 허용하기 위해 클래스 앖이 open 키워드를 사용(Automobile.kt)
    var color : String = ""
    var speed : Int = 0

    // 정적 필드, 상수 필드, 정적 메소드
    companion object {
        var carCount : Int = 0
        const val MAXSPEED : Int = 200
        const val MINSPEED : Int = 0
        fun currentCarCount() : Int {
            return carCount
        }
    }

    constructor(color : String, speed : Int) {
        this.color = color
        this.speed = speed
        carCount++
    }
    // 메소드 오버로딩
    constructor(speed : Int) {
        this.speed = speed
    }
    constructor() {}
    open fun upSpeed(value : Int) {     // upSpeed() 메소드의 오버라이딩을 허용하기 위해 open 키워드 사용
        if (speed + value >= 200)
            speed = 200
        else
            speed += value
    }
    fun downSpeed(value : Int) {
        if (speed - value <= 0)
            speed = 0
        else
            speed -= value
    }
}