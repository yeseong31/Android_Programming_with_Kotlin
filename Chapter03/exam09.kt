// 다형성: 서브클래스에서 생성한 인스턴스를 자신의 클래스 변수에 대입할 수 있는 것

fun main() {
    var animal : Animal
    
    animal = Tiger()
    animal.move()

    animal = Eagle()
    animal.move()
}