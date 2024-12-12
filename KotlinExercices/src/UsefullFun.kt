fun readUserFloat(): Float{
    var userNum: Float = 0.0f
    var flag = true
    while(flag){
        try {
            userNum = readln().toFloat()
            flag = false
        }
        catch (e: Exception){
            println("Valor invalido")
        }
    }
    return userNum
}

fun readUserInt(): Int{
    var userNum: Int = 0
    var flag = true
    while(flag){
        try {
            userNum = readln().toInt()
            flag = false
        }
        catch (e: Exception){
            println("Valor invalido")
        }
    }
    return userNum
}