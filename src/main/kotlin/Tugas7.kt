fun addOrEven(number: Int) :Int {
    if (number % 2 == 0) {
        println("$number adalah bilangan genap")
    } else {
        println("$number adalah bilangan ganjil")
    }
    return number
}

fun main() {
  //  println(check( 3))
    addOrEven (3)
    addOrEven(8)
}
//fun check(a: Int) :String {
  //  if (a % 2 == 0) {
    //    return "$a adalah bilangan genap"
   // } else {
     //   return "$a adalah bilangan ganjil"

    //}
//}

