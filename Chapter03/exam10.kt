/*
*   인터페이스
*   class 키워드 대신 interface 키워드를 사용하여 정의하고, 내부에는 추상 메소드만을 선언할 수 있다.
*   Kotlin은 다중 상속을 지원하지 않지만, 인터페이스를 이용하여 다중 상속과 비슷하게 작성할 수 있다.
*/

interface iAnimal {
    abstract fun eat()
}

class iCat : iAnimal {
    override fun eat() {
        println("생선을 좋아한다.")
    }
}

// iTiger 클래스의 생성을 위해 Animal 클래스를 상속받음과 동시에 iAnimal 인터페이스를 구현.
// 즉 다중 상속과 같은 효과를 만듦.
class iTiger : Animal(), iAnimal {
    override fun move() {
        println("네 발로 이동한다.")
    }
    override fun eat() {
        println("멧돼지를 잡아먹는다.")
    }
}

fun main() {
    var cat = iCat()
    cat.eat()

    var tiger = iTiger()
    tiger.move()
    tiger.eat()
}