package com;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        int [] array = new int[]{1,2,3};
       // String string = JOptionPane.showInputDialog("Ki Khujte Chau");
       // int initial = Integer.parseInt(string);
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("Input a integer : ");
        int initial = scanner.nextInt();
        System.out.println(array[initial]);

    } catch (ArrayIndexOutOfBoundsException a) {
        System.out.println("Error 1 " + a);
    } catch (InputMismatchException i) {
        System.out.println("Error 2");
    } catch (Exception e) {
        System.out.println("Error 3");
    }
}
    }


