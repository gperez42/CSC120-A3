// First attempt: Have chatbot print same responses every time.
// Second attempt: Once it's running for the correct # of rounds
  // Hint: Try storing your responses in a string array (String[]) and 
  // using the .nextInt() method from the Random class to choose your bot's 
  // response by selecting a random index!
// Third attempt: Make it respond to the actual responses of the user's input

import java.util.Scanner;

import java.util.*;

/*
 * Sets up Conversation class
 */

class Conversation {
  
  /* Constructor */
  public static void main(String[] arguments) {
    String[] array = {"Great!", "Fascinating!", "Wow!", "That's so interesting.", "I'd love to talk more about that!"};
    boolean go = true; 
    Scanner inputQ1 = new Scanner(System.in);
    int roundsNum = 0;
    System.out.println("How many rounds of conversation would you like to have?"); // inputQ1 
    roundsNum = inputQ1.nextInt();
    inputQ1.nextLine();

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
  
    Scanner inputQ2 = new Scanner(System.in);
    System.out.println("Hi User! What would you like to talk about?"); // inputQ2
    String talkTopic = inputQ2.next();
    System.out.println("Nice! Anything else?");
    for (int i = 2; i <= roundsNum; i = i + 1){
      String talkTopicRand = inputQ2.next();
      int randNum = (int)(Math.random()*5);
      System.out.println(array[randNum]);

      String[] mirror = new String[] {};
      String[] divided = talkTopic.split("||s+"); // splits words by spaces
      ArrayList<String> output = new ArrayList<> ();
      for (int x = 0; x < mirror.length; x++); { // i++ is i=i+1 
        if (divided[x] == "I") {
         output.add("you");
        }
        if (divided[x] == "me") {
          output.add("you");
        }
        if (divided[x] == "am") {
          output.add("are");
        }
        if (divided[x] == "you") {
          output.add("I");
        }
        if (divided[x] == "my") {
          output.add("your");
        }
        if (divided[x] == "your") {
          output.add("my");
        }
        else {
          // add new word inside original list
          mirror[x] = talkTopic;
          output.add(mirror);
        }
      }
    go = false;
    System.out.println("Thanks for chatting with me, have a nice day!");
    System.out.print("TRANSCRIPT: " + "How many rounds of conversation would you like to have?" + "Hi User! What would you like to talk about?" + output + "Thanks for chatting with me, have a nice day!");    
  } 

    // instead of void, return replacement word 
    // public static String mirror(String oldWord) {
    //   // String newWord = oldWord.replace("I", "you");
    //   String newWord = oldWord.replace("I", "you");
    //   System.out.println(newWord);
    //   return newWord;

      // System.out.println(oldWord.replace("I", "you"));
      // System.out.println(oldWord.replace("me", "you"));
      // System.out.println(oldWord.replace("am", "are"));
      // System.out.println(oldWord.replace("you", "I"));
      // System.out.println(oldWord.replace("my", "your"));
      // System.out.(oldWord.replace("your", "my"));

  }

}

