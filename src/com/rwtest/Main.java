package com.rwtest;

import myarraypkg.ArrayPivots;
import nodepkg.*;


public class Main {

    public static void main(String[] args) {
        RWNodeMethods methods = new RWNodeMethods();
        ArrayPivots pivots = new ArrayPivots();

        RWNode nodeOne = new RWNode();
        RWNode nodeTwo = new RWNode();
        RWNode nodeThree = new RWNode();

        nodeOne.setName("One");
        nodeOne.setNext(nodeTwo);
        nodeTwo.setName("Two");
        nodeTwo.setNext(nodeThree);
        nodeThree.setName("Three");

        System.out.println("Printing the node names in order with a linked list structure.");
        methods.printList(nodeOne);

        System.out.println("\nPrinting the node names in reverse using recursion");
        methods.printListReverse(nodeOne);

        int[] testIntArray = new int[]{5,9,7,17,6,5,4,6};

        System.out.print("\nEvaluating: ");

        for(int i = 0; i < testIntArray.length; i++){

            if(i == testIntArray.length -1){
                System.out.print(testIntArray[i]);
            }else{
                System.out.print(testIntArray[i] + ", ");
            }
        }

        System.out.print(" for a possible pivot point");

        String answer = pivots.evaluateArray(testIntArray) ? "Yes" : "No";

        System.out.println("\nPossible pivot point: " + answer);

    }
}
