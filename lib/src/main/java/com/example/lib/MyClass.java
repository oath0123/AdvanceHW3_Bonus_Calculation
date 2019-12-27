package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        float netIncome;
        while (true) {
            try {
                 netIncome = scanner.nextFloat();
            } catch (Exception e) {
                System.out.print("只能輸入數字\n");
                return;
            }
            if(netIncome<=100000){
                netIncome=netIncome*0.1f;
            }
            if(netIncome<=200000 && netIncome>100000){
                netIncome=(netIncome-100000)*0.075f+100000*0.1f;
            }
            if(netIncome>200000 && netIncome<=400000){
                netIncome=(netIncome-200000)*0.05f+100000*0.075f+100000*0.1f;
            }
            if(netIncome>400000 && netIncome<=600000){
                netIncome=(netIncome-400000)*0.03f+200000*0.05f+100000*0.075f+100000*0.1f;
            }
            if(netIncome>600000 && netIncome<=1000000){
                netIncome=(netIncome-600000)*0.015f+200000*0.03f+200000*0.05f+100000*0.075f+100000*0.1f;
            }
            if(netIncome>1000000){
                netIncome=(netIncome-1000000)*0.01f+400000*0.015f+200000*0.03f+200000*0.05f+100000*0.075f+100000*0.1f;
            }
            System.out.println("當月獎金為 "+netIncome+" 元");
        }
    }
}
