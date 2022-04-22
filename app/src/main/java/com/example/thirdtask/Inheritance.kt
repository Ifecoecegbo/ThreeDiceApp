package com.example.thirdtask

class Inheritance(override var name:String, override var color:String) : Car(name, color){
    override fun price(): String {
        return "Car name is $name, it has $color color and the price is $priceGenerator€"
    }
}
fun main(){
    val inheritorOne=Inheritance("Chevrolet","yellow")
    val inheritortwo=Inheritance("Mercedes Benz","pink")
}



