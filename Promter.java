package jarGame;

import java.util.Scanner;

class Promter {

	Jar jarObject = new Jar();
	Scanner keyBoardInput = new Scanner(System.in);
	
	
	
	
	public void play() {
		adminSetup();
		playerSetup();
		playGame();
	}
	
	
	
	
	public void printTitle(String title) {
		System.out.printf("%n%s%n====================%n%n", title.toUpperCase());
	}
	
	
	
	
	private void adminSetup() {
					printTitle("Adminstrator Setup");
					gameSetup();
	}
  
  
	
	
	private void gameSetup() {
		String ithemName = askQuestion("Name of ithems in the jar: ");
			jarObject.setIthemName(ithemName);
		String maxIthemsInJar = askQuestion("Maximum of lentils in the jar: ");	
			jarObject.setMaxIthemsInJar(Integer.parseInt(maxIthemsInJar));
			
					
	}
	
	
	
	
	private String askQuestion(String question) {
					
					Scanner keyBoardInput = new Scanner(System.in);
					System.out.print(question);
					String result = keyBoardInput.nextLine();
					return result;
					
					
	}
	  
	
	
	
	private void playerSetup() {
			 		printTitle("Player");
			 		gameExplanation();
	}
	
	
	
	
	private void gameExplanation() {
		
		  System.out.print("Your goal is to guess how many " + 
		  jarObject.getIthemName() +                  
		  " there is in the jar. Your guess should be between 1 and " +
		  jarObject.getMaxIthemsInJar() + " ");
		  
		  System.out.print("Ready? (press ENTER to start guessing)");
	      keyBoardInput.nextLine();
	}
	
	
	
	
	private void playGame() {
		
		int randomNumber = jarObject.getRandomNumber();
		
		
		do {
			System.out.println("Guess: ");
			
			jarObject.setGuessedNumber(keyBoardInput.nextInt());
			
			System.out.println(randomNumber);
			
			jarObject.setNumbersOfGuesses(jarObject.getNumbersOfGuesses()+1);
			
			
		}while(jarObject.getGuessedNumber() != randomNumber);
		
		
		if(jarObject.getGuessedNumber() == randomNumber) {
			System.out.println("Congratulations - you guessed that there are " + randomNumber + " " + jarObject.getIthemName() + " in the jar! It took you " + jarObject.getNumbersOfGuesses() + " guess(es) to get it right.");
		}
		
		
		
	}
	
}

	  

	      
	      
