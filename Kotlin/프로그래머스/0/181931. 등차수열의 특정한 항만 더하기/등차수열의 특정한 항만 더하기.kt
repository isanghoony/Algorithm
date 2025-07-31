class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var temp: Int = 0
        for(i in 0 until included.size) {
            if(i == 0) temp += a
            else temp += d
            
            if(included[i]) {
                answer += temp
            }
        }
        return answer
    }
}