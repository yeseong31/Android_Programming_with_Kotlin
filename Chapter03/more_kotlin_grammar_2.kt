// 날짜 형식
// 날짜를 포현할 때 DateFormat 클래스를 사용할 수도 있지만,
// 이를 상속받은 SimpleDateFormat을 사용하면 '연월일'이나 '시분초'와 같은 일반적인 표현이 가능하다.

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    var now = Date()
    var sFormat : SimpleDateFormat = SimpleDateFormat("yyyyMMdd")
    println(sFormat.format(now))    // 202102243 형식으로 출력

    sFormat = SimpleDateFormat("HH:mm:ss")
    println(sFormat.format(now))    // 16:43:53 형식으로 출력
}