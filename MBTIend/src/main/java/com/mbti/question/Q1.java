package com.mbti.question;

import com.mbti.Sum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

    //    Yes 2개 이상 -> E 출력

    public void q1() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                // Yes: 0 No: 1
                // ----------------------------------------------------
                System.out.println("Q1. 나는 사실  ");
            System.out.println("1번 : 백엔드보다 프론트엔드가 좋다. ");
            System.out.println("2번 : 백엔드가 잘 맞는다. ");
                int num1 = sc.nextInt();
                Sum.sumA(num1);
                break;
            }catch (InputMismatchException e){
                System.out.println("------------------");
                System.out.println("숫자를 적어주세요!");
                System.out.println("------------------");
                sc.nextLine();
            }
        }
    }

    public void q2() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                // Yes: 0 No: 1
                // ----------------------------------------------------
                System.out.println("Q2. 나는 사실 ");
                System.out.println("1번 : 조원보다 조장이 되고 싶었다. ");
                System.out.println("2번 : 조원으로 만족한다.");
                int num1 = sc.nextInt();
                Sum.sumA(num1);
                break;
            }catch (InputMismatchException e){
                System.out.println("------------------");
                System.out.println("숫자를 적어주세요!");
                System.out.println("------------------");
                sc.nextLine();
            }
        }
    }



    public void q3() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                // Yes: 0 No: 1
                // ----------------------------------------------------

                System.out.println("Q3.나는 관종이다.");
                System.out.println("1번 : 그렇다.");
                System.out.println("2번 : 아니다. ");
                int num1 = sc.nextInt();
                Sum.sumA(num1);
                break;
            }catch (InputMismatchException e){
                System.out.println("------------------");
                System.out.println("숫자를 적어주세요!");
                System.out.println("------------------");
                sc.nextLine();
            }
        }
    }
}
