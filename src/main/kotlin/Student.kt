class Student(val name: String = "Student", var age: Int = 99) {

    val stdName: String
    var stdAge: Int

    init {
        if (name == "Student"){
            stdName = "NA"
            stdAge = 0
        } else{

            stdName = name.toUpperCase()
            stdAge = age

        }

        println("Student Name is: $stdName")
        println("Student Age is: $stdAge")

    }

}

fun main(){

    val std = Student("Nawaz",30)
    val std2 = Student("Padmanabh")
    val std3 = Student()
    /*println("Student name: ${std.name}")
    println("Student age: ${std.age}")*/
}