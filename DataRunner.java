import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

   UserStory dog = new UserStory("breeds.txt", "lifeSpan.txt", "healthProblems.txt");
    System.out.println(dog);


    String userDog = dog.promptUser();
    int healthCount = dog.countHealth(userDog);

    /*
     * Prints the number of dog breeds with the health issue the user inputs 
     */
    
    System.out.println("There are " + healthCount + " dog breeds with " + userDog + " as the most common health problem.");





    


    
    
    
  }
}
