class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        val prefix = my_string.substring(0, s)
        val suffix = my_string.substring(s + overwrite_string.length)
        return prefix + overwrite_string + suffix
    }
}