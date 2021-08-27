fun main() {
    //perulangan nested
    val rahaha = 1..5
    for (i in rahaha) {
        for (h in 1..11) {
            if (h % 2 == 1) {
                print("0")
            } else {
                print("-")
            }
        }
        println()
    }
}