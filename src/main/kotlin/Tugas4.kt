fun main() {
    //membuat 1 buah kondisi
    //membuat 2 buah variable (openhours = 7, now)
    //Jika jam sekarang melewati jam 7 maka print "Office already open"
    /*
    Jika jam sekarang itu persis dengan jam buka maka print=
    "wait a minute, office will be open"
     */
    // tapi kalau tidak keduanya maka print"Office is closed"
    val openhours = 7
    val now = 6

    if (now > openhours) {
        println("Office already open")
    } else if ( now == openhours) {
        println("wait a minute, office will be open")
    } else {
        println("Office is closed")
    }
}