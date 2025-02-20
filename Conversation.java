import java.util.ArrayList;
import java.util.Scanner;
class Conversation implements Chatbot {


  // Attributes 
  int rounds;
  ArrayList<String> transcript;
  String reply;

  /**
   * Constructor 
   */
  Conversation(int rounds, ArrayList <String> transcript, String reply) {
    this.rounds = rounds;
    this.transcript = transcript;
    this.reply = reply;


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

    /**Create a while loop where the user is given a response and prompted to say more for 1 less rounds than however many rounds they entered*/
    int i = 1;
    while (i < (rounds-1)){
      i++;
      String response = scanner.nextLine();
      transcript.add(response  + "\n");
      if(response.equals("")){
        System.out.println("What's up?");
        transcript.add("What's up? \n");
      } 
      else{
        System.out.println(mirrorWord(response));
         //System.out.println("Intersting. Tell me more!");
         transcript.add(mirrorWord(response));
      }
      
    }
    
    /**give the final round some variation, and inform the user that the chat is coming to an end */
    String response = scanner.nextLine();
    transcript.add(response +"\n");
    System.out.println("Is there anything else you would like to share with me before we finish chatting?");
    transcript.add("Is there anything else you would like to share with me before we finish chatting? \n");
    String finalResponse = scanner.nextLine();
    transcript.add(finalResponse + "\n");
    
    /**Ends the conversation */
    System.out.println("Okay! I have enjoyed our converstion. Thanks for chatting!");
    transcript.add("Okay! I have enjoyed our converstion. Thanks for chatting! \n");


  
  }
    /** adds more complexity by changing certain words/characters to look like the chatbot is creacting to what the user is inputing */
  public String mirrorWord(String s) {
    if(s.contains("I'm")){
      s = s.replace( "I'm", "You're") ;
    }
    else if(s.contains(".")){
      s = s.replace(".", "?");
    }
    else{
      return "Interesting! Tell me more!";
    }
    return s + "...Tell me more";
    
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
