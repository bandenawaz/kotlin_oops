open class Animal(color: String, age: Int) {

    init {
        println("Color of the animal is ${color}")
        println("Age of the animal is ${age}")
    }

    open fun eat(){
        println("Animal eats food")
    }
}

class Dog(color: String, age: Int) : Animal(color,age){

    fun woof(){
        println("Dog makes sound woof")
    }

    override fun eat() {
        super.eat()
        println("Dog eats Pedigree")
    }
}

class Cat(color: String, age: Int) : Animal(color,age){

    fun meow(){
        println("Cat makes sound meow")
    }

    override fun eat() {
        super.eat()
        println("Cat eats fish")
    }
}

class Horse(color: String, age: Int) : Animal(color,age){

    fun heigh(){
        println("Horse makes sound heigh")
    }

    override fun eat() {
        super.eat()
        println("Horse eat grass")
    }
}

fun main(){

    val d = Dog("White",4)
    d.woof()
    d.eat()

    val c = Cat("Black",1)
    c.meow()
    c.eat()

    val h = Horse("Brown",8)
    h.heigh()
    h.eat()
}