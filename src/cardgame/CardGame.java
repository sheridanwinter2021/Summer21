/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.Scanner;

/**
 *
 * @author sivagamasrinivasan
 * date 
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Card[] deck = new Card[4];
        Scanner in = new Scanner(System.in);
        System.out.println(" enter your card values: ");
        for ( int i=0;i<deck.length;i++)
        {
            deck[i]= new Card(in.next(),in.nextInt());            
        }
    System.out.println(" your card values are: ");
        for ( int i=0;i<deck.length;i++)
        {
            System.out.println(deck[i].getSuit() +" " +  deck[i].getValue());
        }
    }
    
}
