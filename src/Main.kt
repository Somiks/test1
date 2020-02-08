fun main(args: Array<String>) {
    listOf(1, 2, 3).fold(3) {
        item, fold -> item + fold
    }.also(::println)
}