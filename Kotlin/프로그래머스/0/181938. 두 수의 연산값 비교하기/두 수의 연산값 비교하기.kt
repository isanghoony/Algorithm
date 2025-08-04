class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        
        val ab = "$a$b".toInt()
        val ab2 = 2 * a * b
        
        answer = maxOf(ab, ab2)
        
        return answer
    }
}