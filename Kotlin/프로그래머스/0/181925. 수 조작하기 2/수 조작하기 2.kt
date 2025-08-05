class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        for(idx in 1 until numLog.size) {
            when(numLog[idx] - numLog[idx - 1]) {
                1 -> answer += "w"
                -1 -> answer +="s"
                10 -> answer += "d"
                -10 -> answer += "a"
            }
        }
        return answer
    }
}