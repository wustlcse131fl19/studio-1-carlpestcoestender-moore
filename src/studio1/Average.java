package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("1st number to be averaged?");
        int n2 = ap.nextInt("2nd number to be averaged?");
        double average = ((n1 + n2) / 2.0) ;

        System.out.println("The average is " + average);
    }
}
