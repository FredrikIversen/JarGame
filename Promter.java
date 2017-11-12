
import java.util.Scanner;
import java.util.Random;


class Promter {

  Scanner keyBoardStringInput = new Scanner(System.in);
  Scanner keyBoardIntInput = new Scanner(System.in);
  Jar JarObject = new Jar();
  Random RandomObject = new Random();
  

  public void play(){
    adminSetup();
    playerSetup();
    playGame();
    }
  
  
  
  public void printTitle(String title) {
	      System.out.printf("%n%s%n==================%n%n", title.toUpperCase());
	  }
  
  
  
  private void adminSetup() {
	              printTitle("Adminstrator Setup");
	              gameSetup();
	  }
  
  
  
  private void gameSetup() {
	        String itemName   = askQuestion("Name of items in the jar: ");
	          JarObject.setIthemName(itemName);
	        String maxIthemsInJar    = askQuestion("Maximum of lentils in the jar: ");
	          JarObject.setMaxIthemsInJar(Integer.parseInt(maxIthemsInJar));
	  }
  
  
  
  private String askQuestion(String question) {
	              System.out.print(question);
	              String result = keyBoardStringInput.nextLine();
	              return result;
	  }
  
  
  
   
  private void playerSetup() {
	                printTitle("Player");
	                gameExplanation();
	  }
	   
  
  
   private void gameExplanation() {
	          System.out.print("Your goal is to guess how many " + JarObject.getIthemName() + "there is in the jar. Your guess should be between 1 and " + JarObject.getMaxIthemsInJar() + " ");
	          System.out.print("Ready? (press ENTER to start guessing)");
	          keyBoardStringInput.nextLine();
	  }
  
  
  
   private void playGame() {
	    	  
	    	  int randomNum = RandomObject.nextInt(JarObject.getMaxIthemsInJar());
	    	  int guessedNumber;
	    	  int numberOffGueses = 0;
	    	  
	    	  
	    	  do { 
	    	  System.out.println("Guess: ");
	    	  
	    	  guessedNumber = keyBoardIntInput.nextInt();
	    	  numberOffGueses++;
	    	  
	    	  	} while(guessedNumber != randomNum);
	    	  
	    	  if(guessedNumber == randomNum) {
	    		   System.out.print("Congratulations - you guessed that there are " + randomNum + " " +  
             JarObject.getIthemName() + " in the jar! It took you " + numberOffGueses + " guess(es) to get it right." );
	    		  
	   }
   }  
  
  
	  
}
