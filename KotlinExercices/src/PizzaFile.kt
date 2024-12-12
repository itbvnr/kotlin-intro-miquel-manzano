fun main(){
    val pi: Float = 3.141592f
    val diametro: Float = ReadDiametroUser()
    val radio: Float = CalcularDiametro(diametro)
    val area: Float = CalcularArea(pi, radio)
    println("Tu pizza es de tamaño: $area cm de area")
}

fun ReadDiametroUser(): Float{
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

fun CalcularDiametro(diametro : Float): Float{
    return diametro/2
}

fun CalcularArea(pi: Float, radio: Float): Float{
    return pi * (radio * radio)
}