package jarGame;


import java.util.Random;


class Jar {
  
 
	
	
	//get and set IthemName
	public String ithemName;
	public void setIthemName(String ithemName) {
		this.ithemName = ithemName;
	}
	
	public String getIthemName() {
		return ithemName;
	}
  
  
	
	
	//get and set maxIthemsInJar
	public int maxIthemsInJar;
	public void setMaxIthemsInJar(int maxIthemsInjar) {
		this.maxIthemsInJar = maxIthemsInjar;
	}
	
	public int getMaxIthemsInJar() {
		return maxIthemsInJar;
	}
  
	
	
	
	//get and set guessedNumber
	public int guessedNumber;
	public void setGuessedNumber(int guessedNumber) {
		this.guessedNumber = guessedNumber;
	}
	
	public int getGuessedNumber() {
		return guessedNumber;
	}
	
	
	
	
	//get and set numbersOfGuesses
	private int numbersOfGuesses = 0;
	public void setNumbersOfGuesses(int numbersOfGuesses) {
		this.numbersOfGuesses = numbersOfGuesses;
	}
	
	public int getNumbersOfGuesses() {
		return numbersOfGuesses;
	}
	
	
	
	
	//get randomNumber
	public int getRandomNumber(){
		
		Random RandomObject = new Random();
		
		int randomNumber = RandomObject.nextInt(getMaxIthemsInJar());
			
		return randomNumber;
	}

	
	
	
	
}

	
	
	

