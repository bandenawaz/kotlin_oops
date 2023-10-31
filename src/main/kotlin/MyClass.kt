class MyClass {

    //data members
    private var number: Int = 20

    //member functions
    fun calculateSquare(): Int {

        return number * number
    }

}

fun main(){

    val obj = MyClass()
    println("${obj.calculateSquare()}")
}