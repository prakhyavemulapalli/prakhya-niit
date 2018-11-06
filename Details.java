import java.util.*;



class StudDetails
{
int stuid,std,sub1,sub2,sub3,total;
String name;
char sec;
float percent;


public  void accept()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the Student Details: ");
System.out.println("---------------------------------------------------------------:");
System.out.println("Enter the Student ID: ");
stuid=scan.nextInt();
System.out.println("Enter the Student Name: ");
name=scan.next();
System.out.println("Enter the Student Standard: ");
std=scan.nextInt();
System.out.println("Enter the Student Section: ");
sec=scan.next().charAt(0);
System.out.println("Enter the Student Marks of Subject 1: ");
sub1=scan.nextInt();
System.out.println("Enter the Student Marks of Subject 2: ");
sub2=scan.nextInt();
System.out.println("Enter the Student Marks of Subject 3: ");
sub3=scan.nextInt();
}


public void display()
{
System.out.println(" Displaying the student details:");
System.out.println("---------------------------------------------------------------:");
System.out.println(" Student ID                   : " +stuid);
System.out.println(" Student Name                 : " +name);
System.out.println(" Student Standard             : " +std);
System.out.println(" Student Section              : " +sec);
System.out.println(" Student Marks of Subject 1   : " +sub1);
System.out.println(" Student Marks of Subject 2   : " +sub2);
System.out.println(" Student Marks of Subject 3   : " +sub3);
total=sub1+sub2+sub3;
System.out.println("Student Total marks Obtained  : " +total);
percent=(total*100)/300;
System.out.println("Student ovrall Percentage     : " +percent);
}
}



public class Details
{
public static void main(String args []) 
{
StudDetails s1=new StudDetails();
s1.accept();
s1.display();
}
}