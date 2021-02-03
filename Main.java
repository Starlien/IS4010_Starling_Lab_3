import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;
    System.out.println("Enter a number to count down or up from: ");
    num = s.nextInt();
    if(num>0){
    while(num!=0){
      num = num - 1;
      System.out.println(num);
    }
    }if(num<0){
      while(num!=0){
      num = num + 1;
      System.out.println(num);
      }
    }
    System.out.println("Blast Off!");
  }
}