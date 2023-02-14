// First attempt: Have chatbot print same responses every time.
// Second attempt: Once it's running for the correct # of rounds
  // Hint: Try storing your responses in a string array (String[]) and 
  // using the .nextInt() method from the Random class to choose your bot's 
  // response by selecting a random index!
// Third attempt: Make it respond to the actual responses of the user's input

import java.util.Scanner;
import java.util.*;

class Conversation {
  
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
      // if user uses a mirror word, return a response with the new word
// call mirror here
      // return mirror();
    }
    go = false;
    System.out.println("Thanks for chatting with me, have a nice day!");
    } 
    // inputQ1.close();

    public static void mirror(String oldWord) {
      String newWord = oldWord.replace("I", "you");
      System.out.println(newWord);
      // System.out.println(oldWord.replace("I", "you"));
      // System.out.println(oldWord.replace("me", "you"));
      // System.out.println(oldWord.replace("am", "are"));
      // System.out.println(oldWord.replace("you", "I"));
      // System.out.println(oldWord.replace("my", "your"));
      // System.out.(oldWord.replace("your", "my"));

  }
}
