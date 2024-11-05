import java.util.Scanner;

/*
 * Manages data about dog breeds
 */

public class UserStory {

   private Dogs[] dog;  // 1D array of dog objects

  /*
   * Reads the data from breedsFile, lifeSpanFile, and healthProblemsFile to initialize dogs
   */
  
  public UserStory(String breedsFile, String lifeSpanFile, String healthProblemsFile) {
    dog = createDogs(breedsFile, lifeSpanFile, healthProblemsFile);
  }

    /*
   * Returns a 1D array of dog objects using the data from breeds, lifeSpan, and healthProblems
   */
public Dogs[] createDogs(String breedsFile, String lifeSpanFile, String healthProblemsFile) {
    String[] breedsData = FileReader.toStringArray(breedsFile);
    int[] lifeSpanData = FileReader.toIntArray(lifeSpanFile);
    String[] healthProblemsData = FileReader.toStringArray(healthProblemsFile);
  
   Dogs[] tempDog = new Dogs[breedsData.length];

    for (int index = 0; index < tempDog.length; index++) {
      tempDog[index] = new Dogs(breedsData[index], lifeSpanData[index], healthProblemsData[index]);
    }

    return tempDog;
  }

    /*
   * Counts the number of times a health problem appears
   */
  public int countHealth(String healthProb) {
int count = 0;
    for (Dogs d : dog) {
      if (d.getHealth().equals(healthProb)){
        count++;
      }
    }
    return count;
  }

    /*
   * Prompts the user to enter a health issue/problem and returns the user input
   */
public String promptUser() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a health issue (all caps): ");
    String userInput = input.nextLine();
    input.close();
    return userInput;
  }

   /*
   * Returns a String containing each dog breed's information
   */
public String toString() {
    String result = "";

    for (Dogs pet : dog) {
      result += pet + "\n";
    }

    return result;
  }

}
  
