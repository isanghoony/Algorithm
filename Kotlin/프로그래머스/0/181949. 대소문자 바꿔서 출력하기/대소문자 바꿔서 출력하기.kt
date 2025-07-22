fun main(args: Array<String>) {
    val s1 = readLine()!!
    
    val str = s1.map { str ->
        if(str.isUpperCase()) {
            str.lowercase()
        } else {
            str.uppercase()
        }
    }.joinToString("")
    
    print(str)
}