 fun main() {
      val number = 10

      val result1: Int = 2 to number
        println(result1)

      number.divided(2)
                                                               //HUMAM MU'ASYIR
      val result3 = getCount(1,2,3,4,number)
        println(result3)
    }
infix fun Int.to(number: Int): Int = number * 2
fun Int.divided(number: Int) = println("${this / number}")
fun getCount(vararg number: Int): Int = (number.count())
