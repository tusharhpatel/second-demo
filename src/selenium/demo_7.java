package selenium;

class ArrayDemo {

  int[] makeRange(int lower, int upper) {
    int arr[] = new int[ (upper - lower) + 1 ];

    for(int i = 0; i < arr.length; i++) {
      arr[i] = lower++;
    }
    return arr;
  }

  public static void main(String arguments[]) {
    int theArray[];
    ArrayDemo theRange = new ArrayDemo();

    theArray = theRange.makeRange(1, 10);
    System.out.print("The array: [ ");  //Remove println here
    for(int i = 0; i< theArray.length; i++) {
      System.out.print(" " + theArray[i] + " "); //Same here
    }
    System.out.println("]");
  }
}
		

