package ex05_glu_dagsajv;

import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    this.earnings = 0;
    itemList = new ArrayList();
    storeList.add(this);
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
      if (index > -1 && index < itemList.size()) {
          earnings += itemList.get(index).getCost();
          System.out.printf("A %s was sold for Php %s in %s.\n\n", itemList.get(index).getName(), itemList.get(index).getCost(), this.getName());
      } else {
          System.out.printf("There are only %s items in %s.\n\n", itemList.size(), this.getName());
      }
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    for(int i = 0; i < itemList.size(); i++) {
        if (itemList.get(i).getName().equalsIgnoreCase(name)) {
            earnings += itemList.get(i).getCost();
            System.out.printf("A %s was sold for Php %s in %s.\n\n", itemList.get(i).getName(), itemList.get(i).getCost(), this.getName());
            break;
        }
        
        if (i+1==itemList.size() && !itemList.get(i).getName().equalsIgnoreCase(name)) {
            System.out.printf("%s doesn't sell the item: %s.\n\n", this.getName(), name);
        }
    }    
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    if (itemList.contains(i)) {
        earnings += itemList.get(itemList.indexOf(i)).getCost();
        System.out.printf("A %s was sold for Php %s in %s.\n\n", itemList.get(itemList.indexOf(i)).getName(), itemList.get(itemList.indexOf(i)).getCost(), this.getName());
    } else {
        System.out.printf("%s doesn't sell the item: %s.\n\n", this.getName(), i.getName());
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.printf("All %s items in %s:\n", type, this.getName());
    for(Item i : itemList) {
        if (i.getType().equalsIgnoreCase(type)) {
            System.out.printf("%s\n", i.getName());
        }
    }
    System.out.print("\n");
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.printf("Items costing less than or equal to Php %s in %s:\n", maxCost, this.getName());
    for(Item i : itemList) {
        if (i.getCost() <= maxCost) {
            System.out.printf("%s\n", i.getName());
        }
    }
    System.out.print("\n");
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.printf("Items costing greater than or equal to Php %s in %s:\n", minCost, this.getName());
    for(Item i : itemList) {
        if (i.getCost() >= minCost) {
            System.out.printf("%s\n", i.getName());
        }
    }
    System.out.print("\n");
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for(Store i : storeList) {
        System.out.printf("Name: %s\nEarnings: %s\n\n", i.getName(), i.getEarnings());
    }
  }
}
