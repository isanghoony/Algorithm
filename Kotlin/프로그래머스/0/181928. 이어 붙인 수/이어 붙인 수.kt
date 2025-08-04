class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        val oddStr = num_list.filter { it % 2 == 1 }.joinToString("")
        val evenStr = num_list.filter { it % 2 == 0 }.joinToString("")
        
        return if(oddStr.isEmpty()) 0 else oddStr.toInt() + if(evenStr.isEmpty()) 0 else evenStr.toInt()
    }
}