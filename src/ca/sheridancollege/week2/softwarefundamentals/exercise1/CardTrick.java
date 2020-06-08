/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Simranjeet kaur. Student ID: 991548338.
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            
            c.setValue((int)((Math.random()*13)+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            
              magicHand[i] = c;        }
    }
    Scanner input = new Scanner(System.in);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    System.out.println("Enter a card number:");
    int num=input.nextInt();
    
    System.out.println("Enter the suit:");
    String suit  =input.nextLine();
    
    Card magic = new card;
    
    magic.setValue(num);
    magic.setSuit(suit);
    
    
    int magicCard = 0;
    
    for(int=0; i <magicHand.length; i++);
    
        if((magic.getValue() == magicHand[i].getvalue()) &&(magic.getSuit().equalsIgnorecase(magicHand[i]. getSuit())));            
            

    {
        magicCard=1;
        System.out.println("The card that you chose is in the magic cards");
        break;
    }
    }

if(magicCard==0)
{
System.out.println("The card that you chose is not in the magic cards ");

}


