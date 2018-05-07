class frequencyTable
{  
  public static void main(String[] args)
  {
    int roll;  
    int[] freq = new int[6];  
    
    for(int rollNum = 1; rollNum <= 1000 ; rollNum++){
      roll = (int)(6*Math.random())+1;  // random roll between 1-6
      ++freq[roll-1]; //Filling the frequency array
    }
    
    System.out.println("Die Face\t\t\t\tFrequency");
    for(int i = 0; i < freq.length; i++){
      System.out.println("\t"+(i+1)+"\t\t\t\t\t\t"+freq[i]);
    }
    
  }    
}

//end program
