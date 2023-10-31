abstract class StudentAbstractClass(name: String, age: Int){

    init {
        println("Student name: $name")
        println("Age: $age")
    }

    //non abstract methods
    fun demo(){

        println("Its a non abstract Method")
    }

    //abstract functions
    abstract fun getMessage(message: String)
}

class College(name: String,age: Int): StudentAbstractClass(name,age)   {

    override fun getMessage(message: String) {
        println(message)
    }
}

fun main(){
    val iit = College("IIT",60)
    iit.getMessage("Best Institute in India")
    iit.demo()

}