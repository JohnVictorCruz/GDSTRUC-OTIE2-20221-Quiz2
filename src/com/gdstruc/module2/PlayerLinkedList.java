package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    private int size = 0;

    // function to add a new player to the front of the linked list
    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;

    }

    //Removes the first player
    public void removeFront() {
        head = head.getNextPlayer();
        head.setPreviousPlayer(null);
        size--;
    }

    // function to check if the linked list contains the given object
    public boolean contains(Player player) {
        PlayerNode current = head;

        while (current != null) {
            if (current.getPlayer().equals(player))
                return true;
            current = current.getNextPlayer();
        }

        return false;
    }

    public int indexOf(Player player) {
        int ctr = 0; // Counter for index
        PlayerNode current = head;

        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return ctr;
            }

            ctr++;
            current = current.getNextPlayer();

            if (current == null)
                ctr = -1;
        }

        return ctr;
    }



    // function to print the elements of the linked list
    public void printList() {

        System.out.print("HEAD -> ");
        PlayerNode current = head;

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayer();

        }
        System.out.print(" NULL\n");

        System.out.println("Elements presents in Linked List: " + size);


    }


}