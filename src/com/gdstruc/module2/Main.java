package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // declare an ArrayList of Player objects
        List<Player> playerList = new ArrayList<>();

        // add players to the ArrayList
        Player heathCliff = new Player(1, "HeathCliff", 100);
        Player asuna = new Player(2, "Asuna", 57);
        Player lethalBacon = new Player(3, "LethalBacon", 25);
        Player hpDeskJet = new Player(4, "HPDeskJet", 13);

        // add the players to a linked list
        PlayerLinkedList linkedList = new PlayerLinkedList();

        linkedList.addToFront(hpDeskJet);
        linkedList.addToFront(lethalBacon);
        linkedList.addToFront(asuna);
        linkedList.addToFront(heathCliff);

        System.out.println("Before Removal: ");
        //Prints out the Linked List
        linkedList.printList();

        // check if HeathCliff exists the list and print the player's corresponding index
        boolean HeathCliffExists = linkedList.contains(heathCliff);
        int HeathCliffIndex = linkedList.indexOf(heathCliff);
        System.out.println("Heathcliff Exists? " + HeathCliffExists + " At Index: " + HeathCliffIndex);

        //Removes the first player
        linkedList.removeFront();
        System.out.println("==============================");


        System.out.println("After Removal: ");
        //Prints out the Linked List
        linkedList.printList();

        // check if HeathCliff exists the list and print the player's corresponding index
        HeathCliffExists = linkedList.contains(heathCliff);
        HeathCliffIndex = linkedList.indexOf(heathCliff);
        System.out.println("Heathcliff Exists? " + HeathCliffExists + " At Index: " + HeathCliffIndex);



    }
}