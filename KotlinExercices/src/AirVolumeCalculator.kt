fun main(){
    val x: Float  = readUserFloat()
    val y: Float = readUserFloat()
    val z: Float = readUserFloat()
    val volumen: Float = calcularVolumen(x, y, z)
    println("El volumen de la aula es: $volumen")
}

fun calcularVolumen(x: Float, y: Float, z: Float): Float{
    return x*y*z
}

