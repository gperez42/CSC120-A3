// First attempt: Have chatbot print same responses every time.
// Second attempt: Once it's running for the correct # of rounds
  // Hint: Try storing your responses in a string array (String[]) and 
  // using the .nextInt() method from the Random class to choose your bot's 
  // response by selecting a random index!
// Third attempt: Make it respond to the actual responses of the user's input

import java.util.Scanner;

import org.w3c.dom.css.Counter;

import java.util.ArrayList;

/**
 * Sets up Conversation class
 */

class Conversation {
  
   /**
   * Constructor: sets up a pattern of questions and user input answers
   * @param String[] arguments: String array that stores the command line arguments 
   **/

  public static void main(String[] arguments) {
    String[] array = {"Great!", "Fascinating!", "Wow!", "That's so interesting.", "I'd love to talk more about that!"};
    // boolean go = true; 
    /**
     * Sets up first round of response for the user and allows the user to
     * input responses to the conversation for that same number of rounds.
     **/
    Scanner inputQ1 = new Scanner(System.in);
    int roundsNum = 0;
    System.out.println("How many rounds of conversation would you like to have?"); // inputQ1 
    roundsNum = inputQ1.nextInt();
    inputQ1.nextLine();
  /**
   * Sets up an array to store all of the strings included in the conversation
   * between the user input and the output of the console.
   * Depending on number of rounds that user chooses, it will 
   * add a string to the array each round within the number of accounted
   * for strings set.
   **/
    String[] transcript = new String[(2*roundsNum) + 2];
    int counter = 0; 

    // do {
    //   if (!inputQ1.hasNextInt()) {
    //     System.out.println("How many rounds of conversation would you like to have?"); // inputQ1 
    //     roundsNum = inputQ1.nextInt();
    //     inputQ1.nextLine();
    //     }

    //     else {
    //       String rounds = inputQ1.nextLine(); 
    //       System.out.println("Please input a number instead.");
    //     }

    // } while (!inputQ1.hasNextInt() && go);
  
     /**
     * Begins the series of conversation input and output 
     * to be included in the transcript with a welcome statement.
     **/
    Scanner inputQ2 = new Scanner(System.in);
    System.out.println("Hi User! What would you like to talk about?"); // inputQ2
    transcript[counter] = "Hi User! What would you like to talk about?";
    counter = counter + 1;
    for (int i = 0; i < roundsNum; i = i + 1) {
      String userResponse = inputQ2.nextLine();
      transcript[counter] = userResponse;
      counter = counter + 1; 
      int randNum = (int)(Math.random()*5);
    /**
     * Splits up user input by spaces into seperate Strings that
     * influence the output.
     **/
      boolean mirrored = false;
      String[] mirror = new String[] {};
      String[] divided = userResponse.split(" "); // splits words by spaces
      ArrayList<String> output = new ArrayList<> ();
      for (int x = 0; x < divided.length; x++) { // i++ is i=i+1 
        if (divided[x].equals("I")) {
          output.add("you");
        }
        else if (divided[x].equals("me")) {
          output.add("you");
        }
        else if (divided[x].equals("am")) {
          output.add("are");
        }
        else if (divided[x].equals("you")) {
          output.add("I");
        }
        else if (divided[x].equals("my")) {
          output.add("your");
        }
        else if (divided[x].equals("your")) {
          output.add("my");
        }
        else {
          // add new word inside original list
          output.add(divided[x]);
        }
    
      }
    /**
     * Stores the conversation, beginning with the welcome statement
     * in the transcript to be printed. 
     **/
      String stored = String.join(" ", output);
      if (!userResponse.equals(stored)) {
        System.out.println(stored + "?");
        transcript[counter] = stored + "?";
        counter = counter + 1; 
      }
        
      else {
        System.out.println(array[randNum]);
        transcript[counter] = array[randNum];
        counter = counter + 1; 

      }
    // go = false;

  } 
   /**
     * Ends the conversation with a goodbye statement, and prints the 
     * transcript by treating each input and output as a separate String.
     **/
  System.out.println("Thanks for chatting with me, have a nice day!");
  transcript[counter] = "Thanks for chatting with me, have a nice day!";
  counter = counter + 1; 
  System.out.println("TRANSCRIPT: ");
  for (String string : transcript) {
    System.out.println(string);
  }   
  
  }

}

