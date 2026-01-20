package com.feron.app

class Exercises {

    fun parseIntSafe(raw: String): Int? =
        raw.trim().toIntOrNull()

    fun normalizeRange(min: Int, max: Int): Pair<Int, Int> =
        if (min <= max) min to max else max to min

    fun filterInRange(nums: List<Int>, min: Int, max: Int): List<Int> {
        val (lo, hi) = normalizeRange(min, max)
        return nums.filter { it in lo..hi }
    }

    fun parseManyInts(raws: List<String>): List<Int> =
        raws.mapNotNull(::parseIntSafe)

    enum class TxType { INCOME, EXPENSE }

    // Biar masuk akal, fee lebih cocok return angka (misal Int)
    fun fee(type: TxType): Int =
        when (type) {
            TxType.INCOME -> 0
            TxType.EXPENSE -> 1000
        }

    // Kalau kamu mau input String jadi TxType (opsional)
    fun parseTxTypeSafe(raw: String): TxType? =
        runCatching { TxType.valueOf(raw.trim().uppercase()) }.getOrNull()
}
