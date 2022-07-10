package com.company;
import java.util.Scanner;
import java.util.Random;

class Game{
    public int number, inputNumber, noOfGuesses=0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.print("Guess your number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number) {
            System.out.format("Yes! you guessed it right, it was %d\nYou guessed it in %d attempts.", number, noOfGuesses);
            return true;
        }
        else if(inputNumber>number)
            System.out.println("Too high...");
        else if(inputNumber<number)
            System.out.println("Too low...");
        return false;
    }
}
public class guessTheNumberGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }


    }
}
