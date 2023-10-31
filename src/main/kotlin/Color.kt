/*
open class Color {

    class Red: Color()
    class Green: Color()
    class Blue: Color()

    class Alpha: Color()
}

fun eval(c: Color)=
    when (c) {
        is Color.Red -> println("Lets paint in Red")
        is Color.Green -> println("Lets paint in Green")
        is Color.Blue -> println("Lets paint in Blue")

        else -> println("Paint in any color")

    }
*/

//Sealed Class
sealed class Color{
    class Red: Color()
    class Green: Color()
    class Blue: Color()

    //class Alpha: Color()
}

fun eval(c: Color)=
    when (c) {
        is Color.Red -> println("Lets paint in Red")
        is Color.Green -> println("Lets paint in Green")
        is Color.Blue -> println("Lets paint in Blue")

        //else -> println("Paint in any color")

    }

fun main(){

    val r = Color.Red()
    eval(r)

    /*val a = Color.Alpha()
    eval(a)
*/

}