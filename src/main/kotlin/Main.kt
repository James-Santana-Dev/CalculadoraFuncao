fun main(args: Array<String>) {
    adicao (2, 3)
    subtracao(23.0, 13.0)
    multiplicacao(0.3, 2.8)
    divisao(99.7, 35.6)

}
fun adicao(num1: Int, num2: Int){
    val result = num1 + num2
    println("$num1 + $num2 = $result")
}
fun subtracao(num3: Double, num4: Double){
    val result = num3 - num4
    println("$num3 - $num4 = $result")
}
fun multiplicacao(num5: Double, num6: Double){
    val result = num5 * num6
    println("$num5 * $num6 = $result")
}
fun divisao(num7: Double, num8: Double){
    val result = num7 / num8
    println("$num7 / $num8 = $result")
}
