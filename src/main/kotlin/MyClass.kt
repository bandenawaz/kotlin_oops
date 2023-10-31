
interface MyInterface{

    fun getMesage()
    fun getDeatils()
}

class MyClass :MyInterface{
    override fun getMesage() {
        print("I am from my class")
    }

    override fun getDeatils() {
        println("The deatils")
    }

}

fun main(){

    val myClass = MyClass()
    myClass.getMesage()
    myClass.getDeatils()
}