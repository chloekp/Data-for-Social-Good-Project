
/*
 * Represents the dogs in the data set
 */
public class Dogs {
  private String breed;    //breed of the dog      
  private int life;     //life expectancy of the dog
  private String health;   //health problems of the dog

    /*
   * Sets breed, life expectancy, and health problems to the specified values
   */
  public Dogs (String breed, int life, String health) {
    this.breed = breed;
    this.life = life;
    this.health = health;
    
  }

  /*
   * Returns dog breed
   */
  public String getBreed() {
    return breed;
  }


  /*
   * Returns the life expectancy of the dog breed's
   */
  public int getlife() {
    return life;
  }
  
  /*
   * Returns the health problem of dog breed
   */
   public String getHealth() {
    return health;
  }
  
  /*
   * Returns a String containing the breeed, life expectancy, and health problems
   */
  public String toString() {
    return breed + " life expectancy: " + life + " years; common health issues - " + health;
  }
  
}
