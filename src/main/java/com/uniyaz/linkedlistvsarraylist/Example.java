package com.uniyaz.linkedlistvsarraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        /*Block 1: Insert at last in LinkedList*/
        linkedList.add(1);
        linkedList.add(111);
        System.out.println(linkedList); /* Output: [1, 111]*/

        /*Block 2: Insert at last in Arraylist*/   // Adding and removing with index is faster at LinkedList ,Eleman seçerken arraylist hızlı.
        arrayList.add(1);
        arrayList.add(111);
        System.out.println(arrayList); /* Output: [1, 111]*/

        /*Block 3: Insert at given index in LinkedList*/
        linkedList.add(1, 11);
        linkedList.add(3, 1111);
        System.out.println(linkedList); /* Output: [1, 11, 111, 1111]*/

        /*Block 4: Insert at given index in Arraylist*/
        arrayList.add(1, 11);
        arrayList.add(3, 1111);
        System.out.println(arrayList); /* Output: [1, 11, 111, 1111]*/

        /*Block 5: Search by value in LinkedList(searching 111 value)*/
        for(int i=0; i < linkedList.size(); i++) {
            if(linkedList.get(i).equals(111)){
                System.out.println("Value found at index: "+i); /* Output: Value found at index: 2*/
            }
        }
        /*Block 6: Search by value in ArrayList(searching 111 value)*/
        for(int i=0; i < arrayList.size(); i++) {
            if(arrayList.get(i).equals(111)){
                System.out.println("Value found at index: "+i); /* Output: Value found at index: 2*/
            }
        }
        /*Block 7: Get value by index in LinkedList*/
        Integer value = linkedList.get(2);
        System.out.println(value); /* Output: 111*/

        /*Block 8: Get value by index in ArrayList*/
        value = arrayList.get(2);
        System.out.println(value); /* Output: 111*/

        /*Block 9: Remove by value in LinkedList(remove 111)*/
        boolean isDeleted = linkedList.remove(new Integer(111));
        System.out.println(isDeleted); /* Output: true*/

        /*Block 10: Remove by value in ArrayList(remove 111)*/
        isDeleted = arrayList.remove(new Integer(111));
        System.out.println(isDeleted); /* Output: true*/

        /*Block 11: Remove by index in LinkedList*/
        value = linkedList.remove(2);
        System.out.println("Removed value: "+value); /* Output: Removed value: 1111*/

        /*Block 12: Remove by index in ArrayList*/
        value = arrayList.get(2);
        System.out.println("Removed value: "+value); /* Output: Removed value: 1111*/
    }
}
