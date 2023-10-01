package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        //Create an object to roll the dice
        val dice = Dice(9)
        val diceRoll = dice.roll()
        val luckyNumber = 5

        //View and update the value of the dice roll
        val resultImgDiceRoll: ImageView = findViewById(R.id.imgDice)
        when(diceRoll){
            1 -> resultImgDiceRoll.setImageResource(R.drawable.dice_1)
            2 -> resultImgDiceRoll.setImageResource(R.drawable.dice_2)
            3 -> resultImgDiceRoll.setImageResource(R.drawable.dice_3)
            4 -> resultImgDiceRoll.setImageResource(R.drawable.dice_4)
            5 -> resultImgDiceRoll.setImageResource(R.drawable.dice_5)
            6 -> resultImgDiceRoll.setImageResource(R.drawable.dice_6)
        }


        if(luckyNumber == diceRoll){
            val toast = Toast.makeText(this, "You win!", Toast.LENGTH_SHORT)
            toast.show()
        } else{
            val toast = Toast.makeText(this, "Better luck next time", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}