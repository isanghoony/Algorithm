class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        val sum = a + b + c
        val squareSum = a * a + b * b + c * c
        val cubeSum = a * a * a + b * b * b + c * c * c
        
        return when {
            a == b && b == c -> sum * squareSum * cubeSum
            a == b || b == c || a == c -> sum * squareSum
            else -> sum
        }
    }
}