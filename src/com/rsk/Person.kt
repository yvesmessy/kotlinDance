package com.rsk

class Person (var Name: String) {
    fun display() {
        println("The Displayed Name is: $Name")
    }

    fun displayUsingLamddaform(func: (s: String) -> Unit) {
        func(Name)
    }
}