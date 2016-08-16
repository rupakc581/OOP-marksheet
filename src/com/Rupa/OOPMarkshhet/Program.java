/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Rupa.OOPMarkshhet;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Program {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter subject no");
        int subjectNum=input.nextInt();
        String[]subjects= new String [subjectNum];
        int[]marks=new int[subjects.length];
        
        
        MarkSheet ms= new MarkSheet(subjectNum,subjects);
        ms.getSubjects();
        ms.getMArks();
        ms.getTotal();
        ms.getDivision();
        //ms.getPercentage();
        
    }
    
}
