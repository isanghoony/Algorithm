class Solution {
    fun solution(num_list: IntArray): IntArray {
        val last = num_list[num_list.size - 1]
        val beforeLast = num_list[num_list.size - 2]

        val toAdd = if (last > beforeLast) {
            last - beforeLast
        } else {
            last * 2
        }

        return num_list + toAdd
    }
}