import java.util.Scanner;

/**
 * 
 * @Chad
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    // ASKS USER FOR NUMBER to start at
    System.out.println("What number do you want to begin counting from?");
    int startNum = input.nextInt();
    // asks user for number to end at
    System.out.println("What number do you want to end counting at?");
    int endNum = input.nextInt();
    int number;
    if (startNum % 2 == 1) {
     number = startNum + 1;
    }else{
     number = startNum;
    } 
    for(int count = number - 2; count < endNum; count+=2){
      System.out.println(number);
      number = number + 2;
    }
  }
}
