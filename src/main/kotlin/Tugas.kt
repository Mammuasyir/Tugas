// Humam Mu'asyir

fun main() {
    var name1: String = "Bondan"
    var age1: Int = 20
    var name2: String = "Agus"
    var age2: Int = 18
    var kenal1: String = "adalah mahasiswa baru di politeknik IDN, dia berumur"

    var baris1: String ="$name1 $kenal1 $age1"
    var baris2: String = "$name2 $kenal1 $age2"
    println(baris1)
    println(baris2)

    //correct
    var name: String = "Bondan"
    var age: Int = 20

    println("$name adalah mahasiswa baru di politeknik idn, dia berumur $age tahun")

}