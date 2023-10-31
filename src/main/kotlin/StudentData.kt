data class StudentData(val id: String, val name: String, val age: Int)

fun main(){

    val virat = StudentData("10187", "Virat", 36)
    val rohith = StudentData("45", "Rohith",36)

    println("Student 1 Name: " + virat.name + " age: " + virat.age)
    println("Student 2 Name :"+rohith.name + " age: " + rohith.age)

}
