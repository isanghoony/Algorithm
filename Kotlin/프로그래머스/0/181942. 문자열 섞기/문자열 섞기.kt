class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        for(i in 0 until str2.length) {
            answer += str1[i]
            answer += str2[i]
        }
        return answer
    }
}