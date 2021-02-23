abstract class Animal {
    var name : String = ""
    abstract fun move()
}

class Tiger : Animal() {
    var age : Int = 0
    override fun move() {
        println("네 발로 이동합니다.")
    }
}
class Eagle : Animal() {
    var home : String = ""
    override fun move() {
        println("날개로 날아간다.")
    }
}