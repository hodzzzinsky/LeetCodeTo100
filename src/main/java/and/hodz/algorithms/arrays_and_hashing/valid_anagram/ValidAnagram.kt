package and.hodz.algorithms.arrays_and_hashing.valid_anagram



fun main() {
    val anagram = isAnagram("aaa", "aaa")
    println(anagram)

}

fun isAnagram(s: String, t: String): Boolean {
    val ss = s.toCharArray().sorted().joinToString("")
    val tt = t.toCharArray().sorted().joinToString("")
    return ss == tt;
}