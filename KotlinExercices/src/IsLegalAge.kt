fun main() {
    val userAge: Int = readUserInt()
    printResultat(userAge)
}

fun printResultat(userAge: Int){
    when {
        userAge > 0 && userAge < 18 -> println("Es menor")
        userAge >= 18 && userAge < 100 -> println("Es mayor de edad")
        userAge >= 100 -> println("Es mayor de edad.. ta viejito ya")
        userAge <= 0 -> println("Como puedes tener 0 años o menos??????????")
        else -> println("ERROR")
    }
}