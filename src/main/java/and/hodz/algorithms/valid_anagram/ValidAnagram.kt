package and.hodz.algorithms.valid_anagram



fun main() {
    val anagram = isAnagram("aaa", "aaa")
    println(anagram)

}

fun isAnagram(s: String, t: String): Boolean {
    val ss = s.chars()
    val tt = t.chars()

    tt.sorted()
    ss.sorted()



    return ss.equals(tt);
}