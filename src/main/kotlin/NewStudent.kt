class NewStudent {

   /* constructor(name: String)   {

        // code for constructor
    }*/

    constructor(name: String, age: Int){
        //code inside constructor
        println("Student Name: ${name.uppercase()}")
        println("Age: ${age}")
    }

}

fun main(){

    val newStd = NewStudent("Ajeet",30)
}