class ExampleTestQuestions{
  
  public static void main(String[] args){
    
  // Write the defintion of a method called reverse 
  // that takes in an integer array and reverses the order
  // of the numbers in the array
    int[] arr = {5,4,3,2,1};
    
    System.out.println(arr[0]); //5
    reverse(arr);
    System.out.println(arr[0]); //1
  
     
  }
  
  
  public static void reverse(int[] arr){
    int[] tempArr = arr;
    
    for(int i = 0 ; i < tempArr.length; i++){
      arr[i] = tempArr[tempArr.length-i-1];
    }
    
  }
    
    
    
  
  
  
  
}