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