// 패키지
// 사용자가 생성한 클래스가 포함될 패키지는 *.kt 파일 첫 행에 다음과 같이 지정한다.
// package 패키지명

fun main() {
    // 제네릭스
    // 제네릭스는 데이터 형식의 안전성을 보장하는 데 사용한다.
    var strList = ArrayList<String>(4)
    strList.add("첫 번째")
    strList.add("두 번째")
//  strList.add(3)      // 컴파일 오류

    // 문자열 비교 - equals() 메소드
    var str : String = "안녕하세요"
    if (str.equals("안녕하세요"))
        println("same")
}