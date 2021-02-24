// 다음은 클래스와 제네릭스를 활용하여 10+20+30의 합을 구하는 코드이다. 빈칸을 채우시오.

class MyClass(value : Int) {
    var value : Int = 0
    init {
        this.value = value
    }
}

fun main() {
    var c1 = MyClass(10)
    var c2 = MyClass(20)
    var c3 = MyClass(30)

    var myList = ArrayList<MyClass>(3)

    myList.add(c1)
    myList.add(c2)
    myList.add(c3)
    var hap = 0

    for (i in 0 until myList.size) {
        hap += myList[i].value
    }
    print(hap)
}

