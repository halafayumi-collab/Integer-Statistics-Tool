

package IntegerStatisticsTool;
import java.util.*;
public class IntegerStatisticsTool {

  public static void main(String[]args){
      Scanner input=new Scanner(System.in);
      System.out.println("enter an integer,the input ends if it`s 0 : ");
      int number =input.nextInt();
      int pos=0;
      int neg=0;
      double total=0;
      if (number==0){
          System.out.println("no nuumbers are entered except 0 ");
          System.exit(0);
      }
      while (number!=0){
      total+=number;
      if(number>0)
          pos++;
      else neg++;
      number=input.nextInt();
      }
      System.out.println("the number of positive is "+pos);
      System.out.println("the number of negative is "+neg);
      System.out.println("the the total is "+total);
      double average=total/(pos+neg);
      System.out.println("the average is "+average);
      }
     

}
