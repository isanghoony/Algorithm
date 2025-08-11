class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer = IntArray(queries.size)

        for (qi in 0 until queries.size) {
            val s = queries[qi][0]
            val e = queries[qi][1]
            val k = queries[qi][2]

            var result = -1

            for (i in s..e) {
                val v = arr[i]
                if (v > k) {
                    if (result == -1 || v < result) {
                        result = v
                    }
                }
            }
            answer[qi] = result
        }
        return answer
    }
}