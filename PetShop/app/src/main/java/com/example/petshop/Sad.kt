package com.example.petshop

class Sad(date: String): Mood(date) {
    override fun printMood(): String {
        return "I feel like a million bucks"
    }
}