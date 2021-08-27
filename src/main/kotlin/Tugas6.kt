fun main() {
    //hint :
    //- Menggunakan for loops
    //- Membuat 1 buah variable untuk menampung data range
    val rangi = 1..5
    for (i in rangi) {
        for (h in 1..i) {
            print("* ")
        }
        println()
    }
}