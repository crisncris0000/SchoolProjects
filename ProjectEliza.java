import java.util.Scanner;

public class ProjectEliza {

	
	public static void main(String[] args) {
		boolean  UseAgain = true;
		Scanner kb = new Scanner(System.in);
		String userName;
		String userInput;
		PromptBank prompts = new PromptBank();
		
		System.out.println("Hello, my name is Eliza. What is your name?");
		userName = kb.nextLine();
		
		
		System.out.println("Hello, "+ userName + " Tell me what is on your mind today in 1 sentence.");
		userInput = kb.nextLine();
		


			
		// https://youtu.be/o0HQPSBiRQs //
		// YouTube video link above ^^ !

		while(UseAgain = true) { //While loop
			String arr[] = userInput.split(" ", 2);
			
			String FirstWord = arr[0];
			String LastWord = userInput.substring(userInput.lastIndexOf(" ")+1);
			
			if(userInput.equalsIgnoreCase("Exit")) {
				System.out.println("Would you like to run me again? :)");
				userInput = kb.nextLine();
				
			if(userInput.equalsIgnoreCase("No")) {
					System.out.println("Session has ended.");
					UseAgain = false;
					System.exit(0);
				}
				
				else if(userInput.equalsIgnoreCase("Yes")) {
					UseAgain = true;
					System.out.println("Hello, "+ userName + " Tell me what is on your mind today in 1 sentence.");
					userInput = kb.nextLine();
					
					
					
					
				}
			}
			
	if(userInput.endsWith("?")) {
	prompts.populateQuestionsArray(FirstWord, LastWord);
		System.out.println(prompts.getRandomQuestionTrunk());
		
	}
	else if(userInput.endsWith("!")){
		
		 prompts.populateStatementsArray(FirstWord, LastWord);
		System.out.println(prompts.getExcited());
		
	}
	 else {
		 prompts.populateStatementsArray(FirstWord, LastWord);
		System.out.println(prompts.getRandomStatementTrunk());
	 }
	 
	 
		userInput = kb.nextLine();


	
		
	}
		
	}
	
}


import java.util.Random;
public class PromptBank {
	String [] questions;
	String [] statements;
	
	public PromptBank(){
		questions = new String[4]; 
		statements = new String[4];
		
	}

	public void populateStatementsArray(String firstWord, String secondWord){
		statements[0] = "Tell me more about " + firstWord + " and " + secondWord;
		statements[1] = firstWord + " seems important to you, so does " + secondWord +". Please tell me more.";
		statements[2] = firstWord + " and " + secondWord +" seem to be on your mind. Let's talk about it.";
		statements[3] =	"WOW! That is so interesting that you said " + firstWord + " Can you please tell me more about " + secondWord;
	}
	public void populateQuestionsArray(String firstWord, String secondWord){
		questions[0] = "Is there anything else about "+ firstWord + " and "+ secondWord + "?";
		questions[1] = "Does " + firstWord + " bother you? How about " + secondWord +"?";
		questions[2] = "Are " + firstWord + " and " + secondWord + " things you think about often?";
		questions[3] = "How does it make you feel when I mention " + firstWord + " or How about " + secondWord;
		
		
		
	}
	
	public String getRandomStatementTrunk(){
		Random rndm = new Random();
		
		
		
		return statements[rndm.nextInt(3)];
		
		
	}
	
	
public String getRandomQuestionTrunk(){
		
		Random rndm = new Random();
	
		return questions[rndm.nextInt(3)];
		
}

public String getExcited() {
	
	return statements[3];
}
	
	
}
