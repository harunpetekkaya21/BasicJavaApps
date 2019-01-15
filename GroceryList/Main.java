
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        printInstruction();
        while (!quit){
            System.out.println("Enter your choice :");
            choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstruction(); 

                    break;
                case 1:
                    groceryList.printGroceryList(); 
                    break;
                case 2:
                    addItem(); //
                    break;
                case 3:
                    modifyItem(); 
                    break;
                case 4:
                    removeItem(); 
                    break;
                case 5:
                    searcForItem(); 
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit =true;
                    break;
            }

        }
    }
    public static void printInstruction(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void addItem(){
        System.out.println("Please enter the grocery item :");
        groceryList.addGroceryItem(scanner.nextLine());
    }

   // groceryList listesindeki bir ogeyi degistir/guncelle
    public static void modifyItem(){
        System.out.println("Current item name :");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter replacement item :");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter item name");
        String itemNo= scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searcForItem(){
        System.out.println("Enter searced item :");
        String searcItem=scanner.nextLine();
        if (groceryList.onFile(searcItem)){
            System.out.println("Found " + searcItem + " in our grocery lisr");
        }else{
            System.out.println(searcItem + " is not in the shopping list ");
        }
    }
    public static void processArrayList(){
        // yeni diziye kopyaladik
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        //arraylisti normak diziye donusturmek
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray=groceryList.getGroceryList().toArray(myArray);

    }

}
