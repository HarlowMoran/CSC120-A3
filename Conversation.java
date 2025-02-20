import java.util.Scanner;
class Conversation implements Chatbot {

  // Attributes 

  /**
   * Constructor 
   */
  Conversation() {
    /**Ask user to imput the number of rounds */
    Scanner imput = new Scanner(System.in);
    System.out.println("How many rounds?");
    int rounds = imput.nextInt();

    /**Engage in back-and-forth with the user */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome! What's up?");

    /**Create a while loop where the user is given a response and prompted to say more for 1 less rounds than however many rounds they entered*/
    int i = 0;
    while (i < (rounds-1)){
      i++;
      String response = scanner.nextLine();
      if(response.equals("")){
        System.out.println("What's up?");
      } 
      else{
        System.out.println("Intersting. Tell me more!");
      }
      
    }
    
    /*give the final round some variation, and inform the user that the chat is coming to an end */
    String response = scanner.nextLine();
    System.out.println("Is there anything else you would like to share with me before we finish chatting?");
    String finalResponse = scanner.nextLine();
    
    /**Ends the conversation */
    System.out.println("Okay! I have enjoyed our converstion. Thanks for chatting!");


  }

  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {
    
  }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {

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

    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
