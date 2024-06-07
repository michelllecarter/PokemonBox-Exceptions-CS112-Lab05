# PokemonBox-Exceptions-CS112-Lab05

PokémonBox + Exceptions
Welcome to the wonderful world of Pokémon! We want to keep the world wonderful, but due to climate change and the impact human beings have had on habitat loss we've had to make changes. Our Pokémon world region has decided that to accomplish this, Pokémon trainers will only be allowed to keep one type of each Pokémon.

The Pokémon Box technology needs upgrading, the code provided does not limit the addition of Pokémon with the same name. Create a custom exception class, called PokemonAlreadyExistsException that can be thrown when the add method in PokemonBox. The constructors also need upgrading to throw an exception, rather than shutdown the program. An IllegalArgumentException should be used in the Pokemon class constructors.

List of Requirements:
Pokemon.java:
Upgrade constructors to throw IllegalArgumentException, rather than shutdown the program
PokemonBox.java:
Upgrade constructors to throw IllegalArgumentException, rather than shutdown the program
Upgrade getPokemon method to throw IndexOutOfBoundsException for illegal location value
Upgrade add method to throw PokemonAlreadyExistsException when the name of the provided Pokemon already exists in the array
Make sure to create the PokemonAlreadyExistsException class first!
Main.java:
Upgrade the driver (menu program) to handle the following exceptions:
InputMismatchException: Allow the user to reenter a valid option (as an integer)
IllegalArgumentException: Allow the user to reenter valid data for Pokemon data
PokemonAlreadyExistsException: Allow the user to try again,reminding them that our regions sustainability efforts in reducing habitat loss and environmental impacts requires a max of 1 of the same type of Pokémon in the Box.
Sample Working Screenshots:
Note that your output may differ from the examples shown below, as long as it fulfills the requirements above and the output is clean you have creative liberty on how you provide feedback to the user.

Start of menu program:screenshot shows preloading, welcome, initial box contents, and main menu

Invalid integer choice error handling:screenshot handling "woops" entered instead of integer

Invalid Pokémon information error handling (should work similarly for illegal name or type):screenshot handling illegal Pokémon type

Invalid add to PokemonBox error handling (already exists):screenshot handling Pokémon input that's already in box

Valid Pokémon added successfully:screenshot of valid (unique) pokemon added to box

Exiting program option:screenshot of exit program option entered

