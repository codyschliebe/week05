//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Object Oriented Programming
// Java Week 05 Lab  
//
package week05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;




public class Week05OOPLab {

	// This Lab will give you a basic look at creating an Object Oriented Card Game.  
	//		The idea here is to prepare you for your Week 6 Unit Final Project.
	//		There are many ways to implement this Lab, please use the tools that you know,
	//		and go from there.
	// These exercises are intended to be coded in order 1 through 5.


	public static void main(String[] args) {


		// A standard deck of playing cards has 52 cards as specified below 
		//		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
		//				
		//	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven, 
		//									 Eight, Nine, Ten, Jack, Queen, King & Ace
		//
		//	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
		//							 to make this easy, a Two will have a value of 2, a
		//							 Three will have a value of 3, ... and an Ace will have
		//							 a value of 14.
		//


		// 1. Card Class:
		//		Create a class called Card to represent a standard playing card. 
		//		Fields:   The Card class should have the following fields:
		// 			a. name field
		//			b. suit field
		//			c. value field for comparing against other cards.
		//
		//		Methods:  This class can have any useful method.
		//			a. describe() to display the card information to the Console.
		//			b. Getters & Setters 
		//
		System.out.println("\nQuestion 1: Card Class");
		// Add your code here to instantiate a Card

		Card newCard = new Card("ace", "spades", 14);

		// Call the describe method on the newly instantiated card.

		newCard.describe();




		// 2. Deck Class:
		//		Create a class called Deck.
		//		Fields:  This class should have a list of Card field called cards 
		//				 that will hold all the cards in the deck. 
		//			List<Card> cards = new ArrayList<Card>(); 
		//
		//		Constructor: The constructor for the Deck Class should
		// 			instantiate all 52 standard playing cards and add them to the cards list.
		//
		//		Methods:  
		//			a.  describe() to describe the deck to the Console -- 
		//					print out all of the cards in the deck.
		//
		System.out.println("\nQuestion 2: Deck Class");
	    // Add your code here to instantiate a Deck	
	    Deck deck = new Deck();

	    // Call the describe method on the newly instantiated deck.
		deck.describe();


		// 3. Deck shuffle() Method:
		//		Add a shuffle method within the Deck Class
		System.out.println("\nQuestion 3: Deck shuffle() method");
		// Test your method here

		deck.shuffle();

		// Call the describe method on the newly shuffled deck.

		deck.describe();


		// 4. Deck draw() Method:
		//		Add a draw method within the Deck Class
		System.out.println("\nQuestion 4: Deck draw() method");
		// Test your method here


		deck.draw().describe();





		// 5. Create Game Board:
		//		Create and test a method that takes an int as a parameter (representing the
		// 			number of players for a game) and returns a Map<String, List<Card>>
		// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
		//			and their cards.
		//
		// 			The method should create a new instance of Deck, shuffle it,
		// 			and deal the cards out to the "players" in the Map.
		System.out.println("\nQuestion 5: Create Game");
		System.out.println("How many will be playing today?");

		Scanner sc = new Scanner(System.in);
		int players = sc.nextInt();
		sc.close();					//Close scanner so no memory leak

		// Call your method here

		Map<String,List<Card>> inPlay = gameOn(players);

		for ( Map.Entry<String, List<Card>> entry : inPlay.entrySet()) {
			List<Card> hand = inPlay.get(entry.getKey());
			System.out.println(entry.getKey() + " has ");
			for (Card handCard : hand) {
				handCard.describe();
			}
		}



	} 

	// Method 5:

	public static Map<String, List<Card>> gameOn(int players) {


		System.out.println("Okay, " + players + " players. Let's begin.");

		Map<String, List<Card>> cardsInPlay = new HashMap<>();  

		Deck deck2 = new Deck();		//Creates new deck

		deck2.shuffle();				//Shuffles new deck
		//deck2.describe();		



		for (int j = 0; j < players; j ++) {
			List<Card> hand = new ArrayList<Card>(5);		//populates arraylist with 
			for (int i = 0; i < 5; i ++) {
				hand.add(deck2.draw());
			}
			cardsInPlay.put("Player " + (j+1), hand);

			//System.out.println(hand);

		}

		return cardsInPlay;
	}



}