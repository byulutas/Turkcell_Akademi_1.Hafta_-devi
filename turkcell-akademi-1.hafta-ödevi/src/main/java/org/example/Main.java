package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfNotes,totalGrade = 0;
        double average;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç Adet sınav Notu Gireceksiniz: ");
        numberOfNotes = scanner.nextInt();

        int[] examNotes = new int[numberOfNotes];

        for (int i = 0; i < numberOfNotes; i++) {
            System.out.print(i+1 + ". Sınav Notunu Girin: ");
            examNotes[i] = scanner.nextInt();
            totalGrade += examNotes[i];
        }

        average = totalGrade / numberOfNotes;

        System.out.println("Not Ortalamanız: "+average);

        if (average > 80) {
            System.out.println("Yüksek Puan");
        }
    }
}
