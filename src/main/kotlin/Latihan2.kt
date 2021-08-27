fun main() {
    val rangi = 1..5
    for (i in rangi) {
        for (j in i..5) {
            print(" ")
        }
        for (h in 1..i) {
            print("* ")
        }
        println()
    }
    //------------------------------------------------------------------------------------------
    val yuhu = 1..5
    for (i in yuhu) {
        for (q in i downTo 1) {
            print(" ")
        }
        for (q in 5 downTo i) {
            print("* ")
        }
        println()
    }
    //------------------------------------------------------------------------------------------
    val yeha = 5 downTo 1
    for (i in yeha) {
        for (s in i..5) {
            print(" ")
        }
        for (u in 1..i) {
            print("0 ")
        }
        println()
    }
}
