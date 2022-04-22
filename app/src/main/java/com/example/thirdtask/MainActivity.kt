@file:Suppress("CanBeVal")

package com.example.thirdtask


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        val image1 = findViewById<ImageView>(R.id.imageView1)
        val image2 = findViewById<ImageView>(R.id.imageView2)
        val image3 = findViewById<ImageView>(R.id.imageView3)

        fun rollButton() {
            val sides = 6
            var randomNo1 = (1..sides).random()
            var randomNo2 = (1..sides).random()
            var randomNo3 = (1..sides).random()

            when (randomNo1) {
                1 -> println(image1.setImageResource(R.drawable.dice1real))
                2 -> println(image1.setImageResource(R.drawable.dice2))
                3 -> println(image1.setImageResource(R.drawable.dice3))
                4 -> println(image1.setImageResource(R.drawable.dice4))
                5 -> println(image1.setImageResource(R.drawable.dice5))
                6 -> println(image1.setImageResource(R.drawable.dice6))
            }
            when (randomNo2) {
                1 -> println(image2.setImageResource(R.drawable.dice1real))
                2 -> println(image2.setImageResource(R.drawable.dice2))
                3 -> println(image2.setImageResource(R.drawable.dice3))
                4 -> println(image2.setImageResource(R.drawable.dice4))
                5 -> println(image2.setImageResource(R.drawable.dice5))
                6 -> println(image2.setImageResource(R.drawable.dice6))
            }
            when (randomNo3) {
                1 -> println(image3.setImageResource(R.drawable.dice1real))
                2 -> println(image3.setImageResource(R.drawable.dice2))
                3 -> println(image3.setImageResource(R.drawable.dice3))
                4 -> println(image3.setImageResource(R.drawable.dice4))
                5 -> println(image3.setImageResource(R.drawable.dice5))
                6 -> println(image3.setImageResource(R.drawable.dice6))
            }
            if (randomNo1 == 6 && randomNo2 == 6 || randomNo1 == 6 && randomNo3 == 6 || randomNo2 == 6 && randomNo3 == 6) {
                Toast.makeText(applicationContext, "you win", Toast.LENGTH_SHORT).show()
            } else if (randomNo1 + randomNo2 == 9 || randomNo1 + randomNo3 == 9 || randomNo2 + randomNo3 == 9) {
                Toast.makeText(applicationContext, "You lose", Toast.LENGTH_SHORT).show()
            }
        }
        rollButton.setOnClickListener {
            rollButton()
        }
        fun objectHolder() {
            val car1 = Car("Audi", "Black")
            val car2 = Car("Volkswagen", "Red")
            val money: TextView = findViewById(R.id.textView01)
            val money2: TextView = findViewById(R.id.textView02)
            var priceOfCar1 = car1.price()
            var priceOfCar2 = car2.price()
            money.text = "car1: ${priceOfCar1}"
            money2.text = "car2: ${priceOfCar2}"
        }
        objectHolder()
    }
}
open class Car(open var name:String,open var color: String){
    var priceGenerator = (3_000_000..6_000_000).random()
    open fun price() : String {
        return "Car name is $name, it has $color color and the price is $priceGenerator€"
    }
}





