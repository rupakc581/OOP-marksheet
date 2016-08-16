/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rupa.OOPMarkshhet;

import java.util.Scanner;

public class MarkSheet {

    int subjectNum = 0;
    String[] subjects;
    int[] marks;
    int total = 0;
    double percentage;
    Scanner input = new Scanner(System.in);
    private boolean isFail;

    public MarkSheet(int subjectNum, String[] subjects) {
        subjects = new String[subjectNum];
        marks = new int[subjects.length];
        this.subjectNum = subjectNum;
        this.subjects = subjects;
    }

    public void getSubjects() {
        for (int i = 0; i < subjectNum; i++) {
            System.out.println("Enter Subject");
            subjects[i] = input.next();
        }
    }

    public void getMArks() {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Enter marks of " + subjects[i]);
            marks[i] = input.nextInt();
            total = total + marks[i];
        }
    }

    public void getTotal() {
        System.out.println("Total marks is " + total);

    }

   
    public boolean isFail() {
        for (int i = 0; i < subjectNum; i++) {
            if (marks[i] < 32) {
                return true;
            }
        }
        return false;
    }
     public void getPercentage() {
        percentage = total / subjectNum;
        System.out.println("Percentage is " + percentage + "%");
    }


    public void getDivision() {
        if (isFail() == true) {
            System.out.println("You failed");
        }else {
                    getPercentage();
                    if(percentage>=80 && percentage==100){
                    System.out.println("Distinction");
                    }
                    else if(percentage>=60 && percentage<80){
                    System.out.println("First division");
                    }
                     else if(percentage>=50 && percentage<60){
                    System.out.println("Second division");
                    }
                     else if(percentage>=32 && percentage<50){
                    System.out.println("Third division");
                    }
                    }

        }

    }


