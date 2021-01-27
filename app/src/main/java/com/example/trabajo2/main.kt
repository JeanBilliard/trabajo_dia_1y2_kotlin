package com.example.trabajo2

fun main() {
    obtieneIva ( )
    imprimiendoParametros()

    println("Mi Nombre es : Jenifer")

    var a = 10// variable int
    var b = 20// variable int
    var c = 30 // variable int
    var resultado = a + b + c
    println("la suma de las variables es: $resultado")

    var name = "jenifer" // variable String
    println("la variable String es : $name")
    name = "Ark Reign"
    println("la variable String es : $name")
    val x = "valor string"//
    val ArkReign = " tiene ${x.count()} caracteres"//
    println(ArkReign)// desde la linea 16 a la 18 cantidad de caracteres
    println("la variable String es : $name")
    var vocal = "U" // variable char
    println("la variable char es : $vocal")
    vocal = "A"
    println("la variable char es : $vocal")

    val floatNumber = 20.5f // variable de tipo flotante
    println("variable flotante es : $floatNumber")

    val shortMaximo = Short.MAX_VALUE
    println(shortMaximo)
    val byteMinimo = Short.MAX_VALUE
    println(byteMinimo)
    val intMinimo = Short.MIN_VALUE
    println(intMinimo)
    val longMinimo = Short.MIN_VALUE
    println(longMinimo)
    val f = true
    println("f = $f")
    val y: Boolean
    println("y = ${Boolean}")
}



fun imprimiendoParametros() {
        val casa= "valor String"
        val auto="tiene ${casa.count()}caracteres"
        println("la cantidad de caracter es : $auto  + $casa")
    }


   fun obtieneIva(){
       var d =1500
       val i= 0.19
       var result = d * i
       val iva = result
       println(" el valor del iva es :$iva")

   }










