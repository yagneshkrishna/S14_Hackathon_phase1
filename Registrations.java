import java.util.Scanner;


class Student {
String name, course;
int roll, credits;
double marks, fee, scholarship, finalFee;
boolean eligible;


Student(String n, int r, double m, String c, int cr) {
name = n;
roll = r;
marks = m;
course = c;
credits = cr;
}


void checkEligibility() {
eligible = marks >= 50;
}


void calculateFee() {
fee = credits * 1500;
}


void calculateScholarship() {
if (marks >= 85)
scholarship = 20;
else if (marks >= 70)
scholarship = 10;
else
scholarship = 0;
}


void calculateFinalFee() {
finalFee = fee - (fee * scholarship / 100);
}


void displayDetails() {
System.out.println("\nName: " + name);
System.out.println("Roll No: " + roll);
System.out.println("Course: " + course);
System.out.println("Credits: " + credits);
System.out.println("Fee: Rs." + fee);
System.out.println("Scholarship: " + scholarship + "%");
System.out.println("Final Fee: Rs." + finalFee);
}
}


public class Registrations {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


System.out.print("Name: ");
String n = sc.nextLine();


System.out.print("Roll No: ");
int r = sc.nextInt();


System.out.print("Marks: ");
double m = sc.nextDouble();
sc.nextLine();


System.out.print("Course: ");
String c = sc.nextLine();


System.out.print("Credits: ");
int cr = sc.nextInt();


Student s = new Student(n, r, m, c, cr);


s.checkEligibility();


if (s.eligible) {
s.calculateFee();
s.calculateScholarship();
s.calculateFinalFee();
s.displayDetails();
} else {
System.out.println("Not eligible for registration.");
}
}
}