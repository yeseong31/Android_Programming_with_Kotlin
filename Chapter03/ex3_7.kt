// [예제 3-7]의 Car 클래스를 상속받은 Truck 클래스를 다음 조건에 맞게 생성하시오.

class Truct : Car {
    var cc : Int = 0

    companion object {
        const val YEAR : Int = 2023
    }

    constructor(cc : Int) {
        this.cc = cc
    }

    override fun upSpeed(value : Int) {
        if (speed + value >= 150)
            speed = 150
        else
            speed += value
    }
}