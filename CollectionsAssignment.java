import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionsAssignment {
    public static void main(String[] args) {
        //Assignment 1: record employee names
      List<String> employeeNames = new ArrayList<>();  
      employeeNames.add("Ana");
      employeeNames.add("Chris");
      employeeNames.add("Carol");
      employeeNames.add("Daniel");
      employeeNames.add("Esther");
         // Employee named addeed
         //Assignment 2: Unique first names for products
      Set<String> uniqueFirstNames = new HashSet<>();
      uniqueFirstNames.add("Peter");
      uniqueFirstNames.add("Jakob");
         //Assignment 3: Counting names
     Map<String, Integer> nameCount = new HashMap<>();
     for (String name : employeeNames){
        nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        //Assignment 4: Waiting list for tickets
    Queue<String> ticketWaitingList = new LinkedList<>();
    ticketWaitingList.add("Sheila");
    ticketWaitingList.add("Rob");
     }   
    }
}
