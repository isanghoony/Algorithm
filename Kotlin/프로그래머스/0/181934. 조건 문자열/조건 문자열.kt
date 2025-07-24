class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        
        answer = 
        if(ineq == ">" && eq == "=" && n >= m) 1
        else if(ineq == "<" && eq == "=" && n <= m) 1
        else if(ineq == ">" && eq == "!" && n > m) 1
        else if(ineq == "<" && eq == "!" && n < m) 1
        else 0
        
        return answer
    }
}