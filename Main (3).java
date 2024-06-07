import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {

/**    
  *
  * Method 1 for testing works best for more complex code 
  * Tested possible errors in PokemonBox Java class
  *
    Pokemon pika = new Pokemon("Pikachu", "Electric");

    Pokemon pikaClone = new Pokemon(pika);

    try{
       Pokemon badClone = new Pokemon(null);
    } catch (IllegalArgumentException iae){
      System.out.println("ERROR with clone");
    }
 
    System.out.println("END");
*/   

/**
  * 
  * Method 1 for testing works best for more complex code 
  * Tested possible errors in Pokemon Java class
  * 
  try{
      Pokemon goodPokemon = new Pokemon("Pikachu", "Electric", null);
      System.out.println("good test, complete");
      //Pokemon badPokemon1 = new Pokemon("Charmander", null, null); //type 1 null
      System.out.println("bad test 1, complete");
      //Pokemon badPokemon2 = new Pokemon("Charmander", "garbage", null); //type not valid
      System.out.println("bad test 2, complete");
      //Pokemon badPokemon3 = new Pokemon("Charmander", "Electric","garbage"); //type 2 not valid 
      System.out.println("bad test 3, complete");
      //Pokemon badPokemon4 = new Pokemon("", "Electric", "garbage"); //name not valid
      System.out.println("bad test 4, complete");
} catch (IllegalArgumentException iae){
    iae.printStackTrace();
    System.exit(0);
} finally {
    System.out.println("END TESTS");
  }
*/
   
		// DECLARATION + INITIALIZATION
		int choice = -1;
		boolean tryAgain = true;
		Scanner keyboard = new Scanner(System.in);
		Pokemon[] caught = {
			new Pokemon("Pikachu", "Electric"),
			new Pokemon("Bulbasaur", "Grass", "Poison"),
			new Pokemon("Charmeleon", "Fire"),
			new Pokemon("Squirtle", "Water"),
			new Pokemon("Butterfree", "Bug", "Flying"),
			new Pokemon("Pidgeotto", "Normal", "Flying")
		};

		// WELCOME
		System.out.println("Preloading Pokemon Box...");
		PokemonBox myBox = new PokemonBox(caught);
		System.out.println("...Done!\n");
    
		System.out.println("---------------------------");
		System.out.println("| Welcome to Pokemon Box! |");
		System.out.println("---------------------------\n");
		System.out.println(myBox);

		//INPUT + PROCESSING + OUTPUT

		do {
  
      try {
          System.out.println("\nMAIN MENU\nWhat would you like to do?");
          System.out.println("\t1) Add a New Pokemon \n\t2) List All Pokemon \n\t3) Exit Program \n");
          System.out.print("Enter choice number> ");
          choice = keyboard.nextInt(); //could throw exception here and skip rest of code
          keyboard.nextLine();
          System.out.println();
  
          if (choice == 1) {
            System.out.println("Enter Pokemon Info to be added:");
            System.out.print("Enter Pokemon Name> ");
            String name = keyboard.nextLine();
            System.out.print("Enter Pokemon Type #1> ");
            String type1 = keyboard.nextLine();
            System.out.print("Enter Pokemon Type #2 (none if no second type)> ");
            String type2 = keyboard.nextLine();
            type2 = (type2.equalsIgnoreCase("none")) ? null : type2;
  
             Pokemon p = new Pokemon(name, type1, type2);
             myBox.add(p); //could throw exception here and skip rest of code 
             System.out.println("\n" + name + " added!");

          } else if (choice == 2) {
            System.out.println(myBox);
          } else if (choice == 3) {
            keyboard.close();
            tryAgain = false;
          } else {
            System.out.println("Invalid choice, please pick a valid option from the menu.\n");
          }
      } catch (InputMismatchException iae) {
        System.out.println("Invalid choice, please pick a valid option as an integer.");
        keyboard.nextLine(); //clear buffer since above code was skipped
      } catch (IllegalArgumentException iaee){
        System.out.println("\nInvalid name, type #1 and/or type #2 entered, please try again");
        System.out.println(Arrays.toString(Pokemon.TYPES));
      } catch (PokemonAlreadyExistsException paee) {
          System.out.println("\n" + paee.getMessage());
      }
		} while (tryAgain);

		System.out.println("Thank you for using the Pokemon Box program :D see you later!");
  
	}
}