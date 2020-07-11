package ProblemSolving;

import java.util.Scanner;

public class SmallestLargestSubString {

    public static String getSmallestAndLargest(String stringData, int k) {
        String smallest = "";
        String largest = "";
        int length = stringData.length();
      //  smallest = stringData.substring(0,k);
      //  largest = stringData.substring(0,k);
        int bigIndex=0,smallIndex=0;
        int small=1000,big=0;

        for(int i=0;i<length-k;i++){

            if(stringData.charAt(i)<small){
                small = stringData.charAt(i);
                smallIndex =i;

            }
            if(stringData.charAt(i)>big){
                big = stringData.charAt(i);
                bigIndex = i;
            }
        }

        smallest = stringData.substring(smallIndex,smallIndex+k);
        largest = stringData.substring(bigIndex,bigIndex+k);

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
