class Main
{
   public static void main(String[] args)
   {             
      // declare some string references (variables)
      String thxMom, thxAgent, thxFox;
      String outputString;
      
      // for fun, create the String object directly in the declaration
      String acceptanceSpeech = new String("I'd like to thank ");
     
      // create the rest of the  string objects to use 
      // in your speech.
      thxMom = new String("my Mother, Reva, and wife Coleen.");
      thxFox = new String("everyone at Fox and FBC.");
      thxAgent = new String("my agent and everyone at Paradigm.");
 
      // stand up at the podium and get settled ...
      // for this use String Literals directly in the
      // output statements.
      System.out.println( 
         "I didn't really expect to win ...");
      System.out.println( 
         "I don't even have a speech prepared!");
      System.out.println( "Anyway ...");
 
      // now finally start to thank people.
      outputString = "First of all " + acceptanceSpeech + thxFox;
      System.out.println( outputString);
  
      outputString = "Next, " + acceptanceSpeech + thxAgent;
      System.out.println( outputString);
 
      outputString = "But mostly, " + acceptanceSpeech + thxMom;
      System.out.println( outputString); 
   }
}