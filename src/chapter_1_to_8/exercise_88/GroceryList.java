package chapter_1_to_8.exercise_88;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>(); //lista zakupow

    public void addGroceryItem(String item)
    {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);//jesli znajdzie dany element to zwraca nr indeksu
        if(position >=0) {//jesli zwruci -1 to nie znalazl danego elementu
            return groceryList.get(position);
        }

        return null;
    }
}
