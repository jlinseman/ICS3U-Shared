class RandomWords {
  
  public static void main(String[] args){
    String phrase;
    int randIndex;
    //Get a sentence from the user
    
    System.out.println("Enter a sentence");
    phrase = In.getString();
    phrase = phrase.trim();
    
    //Find out how many words are in the phrase
    int numWords = getNumWords(phrase); //It will return the number of words
    
    //Create an array that stores each of the words in the sentence
    String[] words = new String[numWords];
    
    //Put words in array
    putWords(phrase, words); 
    
    //Randomly choose one of the words to output    
    for(int i = 0; i < 100 ; i++){
    randIndex = (int)(numWords*Math.random());
    System.out.println(words[randIndex]);
    }
    
  }
  
  
  public static int getNumWords(String s){
    int spaces = 0;
    // s.indexOf(' ')  will return -1 if there are no spaces
    if (s.indexOf(' ')==-1)
      return 1; //one word if no spaces found
    else //one space at least
      for(int i = 0 ; i < s.length(); i++){
      if(s.charAt(i)==' ') //Check if a space is found here
        spaces++;
    }
    return spaces+1; //one more word then there are spaces
  }  
  
  public static void putWords(String s, String[] words){
    
    for(int i = 0; i < words.length ; i++){
      
      if (!(s.indexOf(' ') == -1)){ //If there are still spaces left then we have more words
      words[i] = s.substring(0,s.indexOf(' '));
      s = s.substring(s.indexOf(' ')+1);
      }else{ //Last word has no spaces left
        words[i] = s;
      }
    }
  }
  
  
}