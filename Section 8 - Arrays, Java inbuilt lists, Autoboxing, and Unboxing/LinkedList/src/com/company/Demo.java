package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Pittsburgh");
        placesToVisit.add("Vandergrift");
        placesToVisit.add("Leechburg");
        placesToVisit.add("Millvale");
        placesToVisit.add("Apollo");
        placesToVisit.add("Kiski");

        printList(placesToVisit);

        placesToVisit.add(1, "Etna");

        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);


    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }

        System.out.println("================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            // gives a number
            int comparison = stringListIterator.next().compareTo(newCity);

            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on to the next city
            }
        }
        stringListIterator.add(newCity);
    }
}
