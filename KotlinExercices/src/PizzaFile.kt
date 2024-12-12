fun main(){
    val pi: Float = 3.141592f
    val diametro: Float = readUserFloat()
    val radio: Float = calcularDiametro(diametro)
    val area: Float = calcularArea(pi, radio)
    println("Tu pizza es de tamaño: $area cm de area")
}

fun calcularDiametro(diametro : Float): Float{
    return diametro/2
}

fun calcularArea(pi: Float, radio: Float): Float{
    return pi * (radio * radio)
}