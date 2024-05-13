import java.util.LinkedList;

public class ShoppingList {
    //We are going to represent a shopping list by a list containing strings.
    //
    //Create a linked list with the following items:
    // eggs, milk, fish, apples, bread and chicken
    //Create an application which prints out the answers to the following questions:
    // - Do we have milk in the shopping list? (yes/no)
    // - Do we have bananas in the shopping list? (yes/no)
    //The full output of your main method should be the following:
    //
    //yes
    //no
    //
    // The question have to be a method.

    public static void main(String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>();
        String[] items = "eggs, milk, fish, apples, bread, chicken".split(", ");
        for (String string : items) {
            shoppingList.addFirst(string);
        }
        System.out.println(doWeHaveThat(shoppingList, "milk"));
        System.out.println(doWeHaveThat(shoppingList, "banana"));
        


    }

    public static String doWeHaveThat(LinkedList<String> lista, String item){
        
        return lista.contains(item)?"yes":"no";
    }

}
