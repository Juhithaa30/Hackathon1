import java.util.Scanner;
public class WaterUsage {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int Members;
double Liters;
int HouseNo;
char WaterUsage;
System.out.println("Enter Members: ");
Members = sc.nextInt();
System.out.println("Enter Liters: ");
Liters = sc.nextDouble();
System.out.println("Enter HouseNo: ");
HouseNo = sc.nextInt();
System.out.println("WaterUsage: ");
WaterUsage = sc.next().charAt(0);
System.out.println("Members:" +Members);
System.out.println("Liters:" +Liters);
System.out.println("HouseNo:" +HouseNo);
System.out.println("WaterUsage:" +WaterUsage);
   }
}
  