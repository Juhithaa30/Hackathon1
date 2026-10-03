import java.util.Scanner;
public class WaterConsumption {
public static void min(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Water Consumption in Liters: ");
int Consumption = sc.nextInt();

int Bill;
if(Consumption<=500) {
Bill = 100;
  } if else{
Bill = 200;
    }
System.out.println("Enter Bill: " +Bill);
  }
}