package vendingapp;
/**
  Jonte Grasty
  CIS 1500
*/
import java.util.ArrayList;
import java.util.Scanner;
public class VendingApp
{
   public static void main(String[] args)
   {
      // Declare variables.
      String input;
      char drinks;
      char snacks;

      // Create the scanner keyboard object.
      Scanner keyboard = new Scanner(System.in);

      // Display message.
      System.out.println("\n\t\t\tSWEET TOOTH VENDING\n" +
                         "\n\t\t\t\tMAIN MENU\n");

     // Method to hold and update the amount of credits to purchase items.
      credits();

     // Prompt user for drink or snack input.
      input = keyboard.nextLine();
      drinks = input.charAt(0);
      snacks = input.charAt(0);


      if(drinks == 'd' || drinks == 'D')
      {
         drinkSelectorSwitch();
      }
      else if(snacks == 's' || snacks == 'S')
      {
         snackSelectorSwitch();
      }
      else
      {
         System.out.print("\n------------------------------------------\n");
         System.out.print("------------------------------------------\n");
         System.out.println("\t\tTimed Out -- Good bye!");
         System.out.print("------------------------------------------\n");
         System.out.print("------------------------------------------\n");
         System.exit(0);
      }
   }

   /**
     This method allows the user to deposit initial credits
     to make purchases.
   */

   public static void credits()
   {
      // Declare and initialize variables
      double deposit = 0;
      double credits = 0;
      double vendAmount = 0;

      // Get user input
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nInstructions:\n");
      System.out.println("Deposit a dollar value to receive credits\n" +
                          "to purchase items from vending services.\n");
      System.out.print("------------------------------------------\n");

      System.out.println("\nLet's Play!\n");
      System.out.print("Enter the dollar amount you wish to deposit: \n$");
      deposit = keyboard.nextDouble(); //hold deposit

      // Check if deposit is greater than $1.
      if(deposit >= 1.00)
      {
         // Prompt for drink or snack selection.
         System.out.printf("\nYou have $%,.2f to purchase items.\n\n", deposit);
         System.out.print("------------------------------------------\n");
         System.out.println("\n\tType your selection and press 'enter':\n");
         System.out.println("\tD = Drinks\n\tS = Snacks\n");
         System.out.print("\tYour selection is: ");
      }
      else
      {
         // Prompt user to deposit an amount greater than or equal to 1.00.
         System.out.println("\nDeposit an amount equal or greater than $1.00.");
         System.out.print("------------------------------------------\n");

         credits();
      }
   }

   /***************************************************************/
   /**
     This switch statement selects snacks.
    */

   public static void snackSelectorSwitch()
   {
      // Declare variables
      String snack;

      //Create the scanner keyboard object
      Scanner keyboard = new Scanner(System.in);

      //Prompt user for snack selection.

      System.out.println("\n\tPurchase a snack:\n");
      snackArray();
      System.out.print("\tYour selection is: ");
      snack = keyboard.nextLine();

      switch(snack)
      {
         case "A1":
         case "a1":
            // System.out.println(credits - vendAmount);

            System.out.println("\n\tDispensing.... Starbursts \"Smile\"\n");
            System.out.println("\n\tWould you like to make another selection?\n");
            System.out.println("\tY = Yes\n\tN = No");
            System.out.print("\n\tYour selection is: ");
            decisionMethod();

            break;

         case "A2":
         case "a2":
            System.out.println("\n\tDispensing.... Skittles. \"Taste the rainbow.\"\n");
            System.out.println("\n\tWould you like to make another selection?\n");
            System.out.println("\tY = Yes\n\tN = No");
            System.out.print("\n\tYour selection is: ");
            decisionMethod();

            break;

         case "B1":
         case "b1":
            System.out.println("\n\tDispensing.... Mars. \"Enjoy!\"\n");
            System.out.println("\n\tWould you like to make another selection?\n");
            System.out.println("\tY = Yes\n\tN = No");
            System.out.print("\n\tYour selection is: ");
            decisionMethod();

            break;

         case "B2":
         case "b2":
            System.out.println("\n\tDispensing.... BBQ Chips. \"Yummy!\"\n");
            System.out.println("\n\tWould you like to make another selection?\n");
            System.out.println("\tY = Yes\n\tN = No");
            System.out.print("\n\tYour selection is: ");
            decisionMethod();

            break;

         default:
            System.out.print("\n------------------------------------------\n");
            System.out.print("------------------------------------------\n");
            System.out.println("\tInvalid Entry -- " +
                         "Please make another selection: \n");
            System.out.print("------------------------------------------\n");
            System.out.print("------------------------------------------\n");
            snackSelectorSwitch();
      }
   }

   /**
     This switch statement selects drinks.
   */

   public static void drinkSelectorSwitch()
   {
      // Declare variables
      String drink;

      //Create the scanner keyboard object
      Scanner keyboard = new Scanner(System.in);

      //Prompt user for drink selection.
      System.out.println("\n\n\tChoose a drink:\n");
      drinkArray();
      System.out.print("\tYour selection is: ");
      drink = keyboard.nextLine();

      switch(drink)
      {
         case "C1":
         case "c1":
            System.out.println("\n\tYou purchsased a Pepsi for $1.00");
            System.out.println("\tDispensing.... Pepsi \"Smile\"\n");
            System.out.println("\n\tWould you like to make another selection?\n");
            System.out.println("\tY = Yes\n\tN = No");
            System.out.print("\n\tYour selection is: ");
            decisionMethod();

            break;

         case "C2":
         case "c2":
            System.out.println("\n\tDispensing.... Water. \"Refreshing.\"\n");
            System.out.println("\n\tWould you like to make another selection?\n");
            System.out.println("\tY = Yes\n\tN = No");
            System.out.print("\n\tYour selection is: ");
            decisionMethod();

            break;

         case "D1":
         case "d1":
            System.out.println("\n\tDispensing.... Coca Cola. \"Enjoy!\"\n");
            System.out.println("\n\tWould you like to make another selection?\n");
            System.out.println("\tY = Yes\n\tN = No");
            System.out.print("\n\tYour selection is: ");
            decisionMethod();

            break;

         case "D2":
         case "d2":
            System.out.println("\n\tDispensing.... Sprite. \"Psss\"\n");
            System.out.println("\nWould you like to make another selection?\n");
            System.out.println("\tY = Yes\n\tN = No\n");
            System.out.print("\n\tYour selection is: ");
            decisionMethod();

            break;

         default:
            System.out.print("\n------------------------------------------\n");
            System.out.print("------------------------------------------\n");
            System.out.print("\tInvalid Entry -- " +
                         "Please make another drink selection: \n");
            System.out.print("------------------------------------------\n");
            System.out.print("------------------------------------------\n");
            drinkSelectorSwitch();
      }
   }

   /**
     This method allows the user to select yes, no, or exit the program.
   */

   public static void decisionMethod()
   {
      //Declare variables
      String input;
      char yes;
      char no;
      char exit;

      //Create the scanner keyboard object
      Scanner keyboard = new Scanner(System.in);

      //Get user input
      input = keyboard.nextLine();
      yes = input.charAt(0);
      no = input.charAt(0);
      exit = input.charAt(0);

      // User selects snacks or drinks to continue
      if(yes == 'Y' || yes == 'y')
      {
         System.out.println("\n\tType your selection and press 'enter':\n");
         System.out.println("\tD = Drinks\n\tS = Snacks\n");
         System.out.print("\n\tYour selection is: ");
         char drinks;
         char snacks;


         //Prompt user for input
         input = keyboard.nextLine();
         drinks = input.charAt(0);
         snacks = input.charAt(0);
         exit = input.charAt(0);

         if(snacks == 's')
         {
            snackSelectorSwitch();
         }
         else if(drinks == 'd')
         {
            drinkSelectorSwitch();
         }
         else
         {
            System.out.print("\n------------------------------------------\n");
            System.out.print("------------------------------------------\n");
            System.out.println("\tInvalid Entry -- " +
                         "Would you like to continue?\n" +
                         "\n\tY = Yes\n\tN = No");
            System.out.print("------------------------------------------\n");
            System.out.print("------------------------------------------\n");
            System.out.print("\n\tYour selection is: ");
            decisionMethod();
         }
      }
      else if(no == 'N' || no == 'n')
      {
         System.out.print("\n------------------------------------------\n");
         System.out.print("------------------------------------------\n");
         System.out.println("\t\tThank you for choosing\n" +
                             "\t\tSWEET TOOTH VENDING");
         System.out.print("------------------------------------------\n");
         System.out.print("------------------------------------------\n");
      }
      else if(exit == 'E' || exit == 'e')
      {
         System.out.print("\n------------------------------------------\n");
         System.out.print("------------------------------------------\n");
         System.out.println("\t\tHave a great day!");
         System.out.print("------------------------------------------\n");
         System.out.print("------------------------------------------\n");

         System.exit(0);
      }
      else
      {
         System.out.print("\n------------------------------------------\n");
         System.out.print("------------------------------------------\n");
         System.out.println("\n\tInvalid Entry -- " +
                         "Try Again:\n" +
                         "\n\tY = Yes\n\tN = No");
         System.out.print("------------------------------------------\n");
         System.out.print("------------------------------------------\n");
         decisionMethod();
      }
   }


   /**
     This array object holds the items for snacks.
   */

   public static void snackArray()
   {
     // Create an array object to store snacks.
      ArrayList<String> snackList = new ArrayList<String>();
      snackList.add("\tA1 = Starbursts");
      snackList.add("\tA2 = Skittles");
      snackList.add("\tB1 = Mars");
      snackList.add("\tB2 = BBQ Chips\n");

      // Display the array list.
      System.out.println("\t(This ArrayList has " + snackList.size() +
                                     " objects stored in it.)\n");

      // Display the items in the snacks.
      for (String name : snackList)
         System.out.println(name);

   }

    /**
     This array object holds the items for drinks.
   */

   public static void drinkArray()
   {
     // Create an array object to store drinks.
      ArrayList<String> drinkList = new ArrayList<String>();
      drinkList.add("\tC1 = Pepsi");
      drinkList.add("\tC2 = Water");
      drinkList.add("\tD1 = Coca Cola");
      drinkList.add("\tD2 = Sprite\n");

      // Display the array list.
      System.out.println("\t(This ArrayList has " + drinkList.size() +
                                     " objects stored in it.)\n");

      // Display the items in the drinks.
      for (String name : drinkList)
         System.out.println(name);

   }

}
