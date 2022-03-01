

import java.util.*;

public class Main {
    public static void main(String args[]) {
        LinkedListTest llt = new LinkedListTest();
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Question 1
        System.out.print("Enter a value to insert into the linked list: ");
        int llVal = sc.nextInt();
        LinkedList ll = new LinkedList();

        ll.add(1);
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.add(9);
        ll.add(11);

        System.out.println("Linked List before inserting new value: " + ll);
        llt.addAndSort(ll, llVal);
        System.out.println("Linked List after inserting new value: " + ll);

        //Question 2
        System.out.print("Enter the value of first index: ");
        int firstIndex = sc.nextInt(); //Assign the input into firstIndex
        System.out.print("Enter the value of second index: ");
        int secondIndex = sc.nextInt(); //Assign the input into secondIndex

        llt.swapValues(ll, firstIndex, secondIndex); //Call the swapValues() function
        System.out.println("Linked List after swapping values: " + ll);

        //Question 3
        LinkedList ll1 = new LinkedList();
        for (int i = 0; i < 500; i++){
            int randval = rand.nextInt(1000, 9999);
            ll1.add(randval);
        }

        int searchValue = rand.nextInt(1000, 9999); //Generated another integer
        System.out.println("A random number " + searchValue + " was generated");

        llt.findValue(ll1, searchValue); //Check if the newly generated integer exists in the LinkedList

        //Question 4
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(1, 1);
        hm.put(3, 3);
        hm.put(5, 5);
        hm.put(7, 7);
        hm.put(9, 9);
        hm.put(11, 11);

        System.out.print("Enter a value to insert into the HashMap: ");
        int hmValue = sc.nextInt();
        llt.addAndSortHash(hm, hmValue);

        //Question 5
        LinkedHashMap<Integer, Integer> lhmSwap = new LinkedHashMap<>();
        lhmSwap.put(0, 1);
        lhmSwap.put(1, 3);
        lhmSwap.put(2, 5);
        lhmSwap.put(3, 7);
        lhmSwap.put(4, 9);
        System.out.println("Linked HashMap before swapping: " + lhmSwap);
        llt.swapValuesHash(lhmSwap, 0, 2); //Swap value '1' at index 0 with value '5' at index 2
        System.out.println("Linked HashMap after swapping: " + lhmSwap);

        //Question 6
        LinkedHashMap<Integer, Integer> lhmSearch = new LinkedHashMap<>();
        for (int i = 0; i < 500; i++){
            int randval = rand.nextInt(1000, 9999);
            lhmSearch.put(i, randval); //The variable i will be the 'key', while the random variable will the 'value'
        }
        int searchValue1 = rand.nextInt(1000, 9999); //Generated another integer
        llt.findValueHash(lhmSearch, searchValue1);

        sc.close();
    }

    
}