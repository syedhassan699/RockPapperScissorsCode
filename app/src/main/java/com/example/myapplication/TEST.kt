package com.example.myapplication

fun main() {

   while (true){
       var playerChoice = ""
       var computerChoice= ""
       println("Enter your Choice Rock Paper Scissors")
       playerChoice = readln()

       var randomNumber = (1..3).random()
       when(randomNumber){
           1 -> {
               computerChoice = "Rock"
           }
           2 -> {
               computerChoice = "Paper"
           }
           3 -> {
               computerChoice = "Scissors"
           }
       }
       println(computerChoice)

       val winner = when{
           playerChoice == computerChoice -> "Tie"
           playerChoice == "Rock" && computerChoice == "Scissors" -> "You"
           playerChoice == "Paper" && computerChoice == "Rock" -> "You"
           playerChoice == "Scissors" && computerChoice == "Paper" -> "You"
           else -> "computer"
       }
       if (winner == "Tie") {
           println("Match Tied")
       }
      else
       {println("$winner  Won")}
        println("--------------------------------------------------")
   }
}