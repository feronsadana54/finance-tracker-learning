package com.feron.app

fun main() {
    val ex = Exercises()

    println(ex.parseIntSafe("123"))
    println(ex.normalizeRange(12, 4))

    val nums = listOf(1, 5, 7, 10, 12, 15)
    println(ex.filterInRange(nums, 10, 3))

    val listTest = listOf("-5", "7", "abc", " 10 ")
    println(ex.parseManyInts(listTest))

    // Cara benar: kirim enum
    println(ex.fee(Exercises.TxType.EXPENSE))

    // Kalau mau dari String (opsional)
    val tx = ex.parseTxTypeSafe("income")
    println(tx)
    if (tx != null) println(ex.fee(tx))
}
