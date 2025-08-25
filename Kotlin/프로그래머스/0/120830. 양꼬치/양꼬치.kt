class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        answer += 12000 * n
        answer += 2000 * (k - n / 10)
        
        return answer
    }
}