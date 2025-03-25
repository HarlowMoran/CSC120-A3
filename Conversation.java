import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Conversation implements Chatbot {


  // Attributes 
  int rounds;
  ArrayList<String> transcript;
  String reply;
  ArrayList<String> wordList;

  /**
   * Constructor 
   */
  Conversation(int rounds, ArrayList <String> transcript, String reply) {
    this.rounds = rounds;
    this.transcript = transcript;
    this.reply = reply;
    this.wordList = new ArrayList<>();

  }
    

  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {
    /**Ask user to imput the number of rounds */
    Scanner imput = new Scanner(System.in);
    System.out.println("How many rounds?");
    int rounds = imput.nextInt();

    /**Engage in back-and-forth with the user */
    Scanner scanner = new Scanner(System.in);
    transcript.add("Welcome!What's up? \n");
    
    System.out.println("Welcome! What's up?");

    /**Create a while loop where the user is given a response and prompted to say more for however many rounds they entered*/
    int i = 1;
    while (i <= (rounds)){
      i++;
      String response = scanner.nextLine();
      transcript.add(response  + "\n");
     
        if(i <= rounds){
        System.out.println(mirrorWord(response));
         transcript.add(mirrorWord(response));
        }
    }

    /**Ends the conversation */
    System.out.println("Okay! I have enjoyed our converstion. Thanks for chatting!");
    transcript.add("Okay! I have enjoyed our converstion. Thanks for chatting! \n");
  
  }
    /**
     * Adds more complexity by changing certain words/characters to look like the chatbot
     * is reacting to what the user is inputing.
     * @param s
     * @return String with new mirrorword or a canned response
     */
  public String mirrorWord(String s) {
    /**If there are no mirror words, a canned response if randomly generated. */
    if((!s.contains("I")) && (!s.contains("i")) && (!s.contains("Me")) && (!s.contains("me")) && (!s.contains("Am")) && (!s.contains("am")) && (!s.contains("You")) && (!s.contains("you")) && (!s.contains("My")) && (!s.contains("my")) && (!s.contains("Your")) && (!s.contains("your"))){
      wordList.add("Please go on.");
      wordList.add("Facinating! Tell me more!");
      wordList.add("Interesting! Go on.");
      wordList.add("Please explain.");
      wordList.add("Please tell me more.");
      wordList.add("I am intrigued! Go on.");
      wordList.add("Please continue.");
      wordList.add("I would love to hear more.");
      wordList.add("Do tell!");
      wordList.add("Could you elaborate?");

      Random random = new Random();
      int randomNum = random.nextInt(10);
      String cannedResponse = wordList.get(randomNum);
      return cannedResponse;
    }

    /**If there are mirror words, then the response is split into components, and each component is checked to see if it is a mirror word. Mirror words are then assigned a label of "Mirror(Int)", and then changed into their mirrored state. */
    else{
    
    s.split(" ");
    ArrayList<String> sentence = new ArrayList<>(Arrays.asList(s.split(" ")));
    for (int i = 0; i< sentence.size(); i++){
      if(sentence.get(i).equals("I")){
        sentence.set(i, "Mirror1");
      }
      if(sentence.get(i).equals("i")){
        sentence.set(i, "Mirror2");
      }
      if(sentence.get(i).equals("Me")){
        sentence.set(i, "Mirror3");
      }
      if(sentence.get(i).equals("me")){
        sentence.set(i, "Mirror4");
      }
      if(sentence.get(i).equals("am")){
        sentence.set(i, "Mirror5");
      } 
      if(sentence.get(i).equals("Am")){
        sentence.set(i, "Mirror6");
      } 
      if(sentence.get(i).equals("you")){
        sentence.set(i, "Mirror7");
      }
      if(sentence.get(i).equals("You")){
        sentence.set(i, "Mirror8");
      }
      if(sentence.get(i).equals("my")){
        sentence.set(i, "Mirror9");
      }
      if(sentence.get(i).equals("My")){
        sentence.set(i, "Mirror10");
      }
      if(sentence.get(i).equals("your")){
        sentence.set(i, "Mirror11");
      }
      if(sentence.get(i).equals("Your")){
        sentence.set(i, "Mirror12");
      }




      if(sentence.get(i).equals("Mirror1")){
        sentence.set(i, "You");
      }
      if(sentence.get(i).equals("Mirror2")){
        sentence.set(i, "you");
       }
       if(sentence.get(i).equals("Mirror3")){
        sentence.set(i, "You");
       }
       if(sentence.get(i).equals("Mirror4")){
        sentence.set(i, "you");
       }
       if(sentence.get(i).equals("Mirror5")){
        sentence.set(i, "are");
       }
       if(sentence.get(i).equals("Mirror6")){
        sentence.set(i, "Are");
       }
       if(sentence.get(i).equals("Mirror7")){
        sentence.set(i, "I");
       }
       if(sentence.get(i).equals("Mirror8")){
        sentence.set(i, "I");
       }
       if(sentence.get(i).equals("Mirror9")){
        sentence.set(i, "your");
       }
       if(sentence.get(i).equals("Mirror10")){
        sentence.set(i, "Your");
       }
       if(sentence.get(i).equals("Mirror11")){
        sentence.set(i, "my");
       }
       if(sentence.get(i).equals("Mirror12")){
        sentence.set(i, "My");
       }

    }
    return (sentence +"?");
  
  }
  } 


  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {
      System.out.println("Transcript:");
      System.out.println(transcript.toString());
  }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) {
    String returnString = ""; 
    return returnString; 
  }

  public static void main(String[] arguments) {

    int initialRounds = 0;
    ArrayList<String> initialTranscript = new ArrayList<>();
    String initialReply = "";

    Conversation myConversation = new Conversation(initialRounds, initialTranscript, initialReply);
    myConversation.chat();
    myConversation.printTranscript();

  }
}
