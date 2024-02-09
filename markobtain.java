import java.util.*;
public class javabasic1{
  public static void main(String args []){
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the mark of math:");
    int Math=sc.nextInt();
    System.out.println("enter the mark of science:");
    int science=sc.nextInt();
    System.out.println("enter the mark of evs:");
    int evs=sc.nextInt();
    System.out.println("enter the mark of sosci:");
    int sosci=sc.nextInt();
    System.out.println("enter the mark of english:");
    int english=sc.nextInt();
    int sum=Math+science+evs+sosci+english;
    System.out.println("this is the sum of all mark:"+sum);
    int mark = sum/5;
    System.out.println("this is your mark percentage:"+mark);
    if(mark>=90){
      System.out.print(mark+"%=A grade");
    }if(mark<90&&mark>=80){
      System.out.println(mark+"%=B grade");
    }if(mark<80&&mark>=70){
      System.out.println(mark+"%=C grade");
    }
     if(mark<70&&mark>=50){
      System.out.print(mark+"%=D grade");
    }

  }
  
}