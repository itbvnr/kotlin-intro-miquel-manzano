fun main(){
    val x: Float  = ReadDiametroUser()
    val y: Float = ReadDiametroUser()
    val z: Float = ReadDiametroUser()
    val volumen: Float = CalcularVolumen(x, y, z)
    println("El volumen de la aula es: $volumen")
}

fun CalcularVolumen(x: Float, y: Float, z: Float): Float{
    return x*y*z
}

