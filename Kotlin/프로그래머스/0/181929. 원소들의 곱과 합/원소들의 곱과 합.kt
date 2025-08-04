class Solution {
    fun solution(num_list: IntArray): Int {
    val product = num_list.fold(1) { acc, num -> acc * num }
    val sumSquare = num_list.sum().let { it * it }

    return if (product < sumSquare) 1 else 0
    }
}