public class PokemonAlreadyExistsException extends Exception {
  Pokemon duplicate; 
  
  public PokemonAlreadyExistsException() {
    super("ERROR! Pokemon already exists in PokemonBox."); 
  }
  
  public PokemonAlreadyExistsException(String message, Pokemon duplicate){
    super(message + "Duplicate Pokemon = " + duplicate);
    this.duplicate = duplicate;
  }
  
  public Pokemon getDuplicate(){
    return this.duplicate;
  }
}