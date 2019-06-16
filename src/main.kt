import com.rsk.Person
import kotlin.reflect.jvm.internal.impl.name.Name

fun main(args: Array<String>) {

    println("This basic Kotlin language program prints names of select folks.")

    val Yves = Person("Yves Guillaume")

    //initialize person value

    println("This person's name, via regular call is ${Yves.Name}")

    Yves.Name = "Yves Guillaume the only one there is"

    println("This person's name is ${Yves.Name}")

    Yves.display()

    //should print the name the same way Yves = Person() does

    Yves.displayUsingLamddaform(::printThisName)
}

    fun printThisName(name: String) {
        println("The following is output when it comes to using the lambda created in the person class /n")
        println(name)
    }
