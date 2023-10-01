package com.example.diceroller

class Dice (val side: Int) {
    private var sides = side
        get() {
            return field
        }
        set(value) {
            field = value
        }

    fun roll(): Int {

        return (1..sides).random()
    }
}