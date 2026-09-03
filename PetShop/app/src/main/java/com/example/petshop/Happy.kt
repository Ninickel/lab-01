package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun printMood(): String {
        return "I feel blue today"
    }
}