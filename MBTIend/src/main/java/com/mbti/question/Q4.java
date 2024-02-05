package com.mbti.question;

import com.mbti.Sum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {

    public void q1() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                // Yes: 0 No: 1
                // ----------------------------------------------------
                System.out.println("Q10.할 일이 쌓였을 때");
                System.out.println("1번 : 손에 집히는 대로 시작한다. ");
                System.out.println("2번 : 우선 계획을 세운다. ");
                int num4 = sc.nextInt();
                Sum.sumD(num4);
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
                System.out.println("Q11.둘 중 더 나은 상황은?");
                System.out.println("1번 : 아무 일정이 없을 때 ");
                System.out.println("2번 :  모든 일정이 정해져 있을 때");
                int num4 = sc.nextInt();
                Sum.sumD(num4);
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

                System.out.println("Q12.팀플에서 내가 맡고 싶은 일은?");
                System.out.println("1번 : 정리하고 기록하는 일");
                System.out.println("2번 : 아이디어를 내는 일");
                int num4 = sc.nextInt();
                Sum.sumD(num4);
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
