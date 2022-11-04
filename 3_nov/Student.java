package Lab_nov3;

import java.util.Scanner;
public class Student {
    //this method will calculate fees exempted
    public void calculateFeesStructure(Long studentId,Character studentGrade,Double monthlyFees,Boolean isScholarshipEligible) {
            if (studentId!=0 && studentGrade=='A' && isScholarshipEligible==true) {
                Double fees = (monthlyFees -monthlyFees *10/100);//logic
                System.out.println("STUDENT GRADE:"+studentGrade);
                System.out.println("MONTHLY FEES:"+monthlyFees);
                System.out.println("10% of fees is exempted, the calculated fees is : "+fees);
            }
            else if (studentId!=0 && studentGrade=='B' && isScholarshipEligible==true) {
                Double fees = (monthlyFees -monthlyFees *8/100);//logic
                System.out.println("STUDENT GRADE:"+studentGrade);
                System.out.println("MONTHLY FEES:"+monthlyFees);
                System.out.println("8% of fees is exempted, the calculated fees is : "+fees);
            }
            else if (studentId!=0 && studentGrade=='C' && isScholarshipEligible==true) {
                Double fees = (monthlyFees -monthlyFees *6/100);//logic
                System.out.println("STUDENT GRADE:"+studentGrade);
                System.out.println("MONTHLY FEES:"+monthlyFees);
                System.out.println("6% of fees is exempted, the calculated fees is : "+fees);
            }
            else if (studentId!=0 && studentGrade=='D' && isScholarshipEligible==true) {
                Double fees = (monthlyFees -monthlyFees *4/100);//logic
                System.out.println("STUDENT GRADE:"+studentGrade);
                System.out.println("MONTHLY FEES:"+monthlyFees);
                System.out.println("4% of fees is exempted, the calculated fees is : "+fees);
            }
            else {
                System.out.println("STUDENT GRADE:"+studentGrade);
                System.out.println("Not Eligible for Exemption");
            }}
        //this method will compare marks
        public void	compareMarks(Long Maths,Double English) {

            if (Maths > English) {
                System.out.println("Maths mark is higher than English");
            } else if (Maths < English) {
                System.out.println("English mark is higher than Maths");
            } else {
                System.out.println("Both Are Equal");
            }
        }
        //to validate fees method
       public void validateFees(Double Fees) {
            if(Fees.isInfinite()) {//logic
               System.out.println("Fees is infinite");
            }
           else {
               System.out.println("Fees is not infinite");
           }
            System.out.println(Fees.byteValue());
        }

        //main method
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            Student a=new Student();
            a.calculateFeesStructure((long)254, 'C', (double)600.0, true );
            a.calculateFeesStructure((long)115, 'B', (double)909.50, true );
            a.calculateFeesStructure((long)980, 'G', (double)1810, false );

            System.out.println("COMPARING MARKS");
            System.out.println("ENTER MARKS OF ENGLISH:");
            double english =sc.nextDouble();
            System.out.println("ENTER MARKS OF MATHS:");
            long maths =sc.nextLong();
            a.compareMarks(maths, english);
            System.out.println("VALIDATING FEES");
           System.out.println("ENTER FEES:");
            double fees=sc.nextDouble();
            a.validateFees(fees);


        }

    }