/*
Latihan varargs
buatlah program yang mencetak jumlah varargs yang dikalikan 2
output : 300
hint : fun main() {
       val number = sum(10,20,30,40,50)
 */

fun main() {

    println(sum(10,20,30,40,50))

}

fun sum(vararg number: Int): Int {
     val hasil = number.sum()*2
    return hasil
}