import java.util.ArrayList;
import java.util.Arrays;
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
    while (i < (rounds)){
      i++;
      String response = scanner.nextLine();
      transcript.add(response  + "\n");
      if(response.equals("")){
        System.out.println("What's up?");
        transcript.add("What's up? \n");
      } 
      else{
        if(i <= rounds - 1){
        System.out.println(mirrorWord(response) +"...Tell me more!");
         transcript.add(mirrorWord(response) +"...Tell me more!");
        }
        else{
          System.out.println(mirrorWord(response));
         transcript.add(mirrorWord(response));
        }
      }
      
    }
    
    /**give the final round some variation, and inform the user that the chat is coming to an end */
    //String response = scanner.nextLine();
   // transcript.add(response +"\n");
   // System.out.println("Is there anything else you would like to share with me before we finish chatting?");
   // transcript.add("Is there anything else you would like to share with me before we finish chatting? \n");
    //String finalResponse = scanner.nextLine();
    //transcript.add(finalResponse + "\n");
    
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
    
    s.split(" ");
    ArrayList<String> sentence = new ArrayList<>(Arrays.asList(s.split(" ")));
    for (int i = 0; i< sentence.size(); i++){
     if(sentence.get(i).equals("I")){
      sentence.set(i, "Mirror1");
     }
     else if(sentence.get(i).equals("i")){
      sentence.set(i, "Mirror2");
     }
    else if(sentence.get(i).equals("Me")){
      sentence.set(i, "Mirror3");
      }
     else if(sentence.get(i).equals("me")){
        sentence.set(i, "Mirror4");
        }
      
      else if(sentence.get(i).equals("am")){
        sentence.set(i, "Mirror5");
      } 
      else if(sentence.get(i).equals("Am")){
        sentence.set(i, "Mirror6");
      } 
      else if(sentence.get(i).equals("you")){
        sentence.set(i, "Mirror7");
      }
      else if(sentence.get(i).equals("You")){
        sentence.set(i, "Mirror8");
      }
      else if(sentence.get(i).equals("my")){
        sentence.set(i, "Mirror9");
      }
      else if(sentence.get(i).equals("My")){
        sentence.set(i, "Mirror10");
      }
      else if(sentence.get(i).equals("your")){
        sentence.set(i, "Mirror11");
      }
      else if(sentence.get(i).equals("Your")){
        sentence.set(i, "Mirror12");
      }
      else{
        // random canned responses go here. Create an arraylist, randomly return an index.
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
    return sentence +"?";
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
