package com.mbti.question;

import com.mbti.Sum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {


    public void q1() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                // Yes: 0 No: 1
                // ----------------------------------------------------
                System.out.println("Q7.약속 시간에 1시간이나 늦은 친구,");
                System.out.println("1번 : 사과 이전에 늦은 이유가 궁금하다.");
                System.out.println("2번 : 친구의 진심을 담은 사과에 마음이 풀린다. ");
                int num3 = sc.nextInt();
                Sum.sumC(num3);
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
                System.out.println("Q8.나는 대화를 할 때");
                System.out.println("1번 : 사람보다 챗지피티와 대화하는 게 편하다.");
                System.out.println("2번 : 당연히 사람이 더 편하다.");
                int num3 = sc.nextInt();
                Sum.sumC(num3);
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

                System.out.println("Q9.더 기분 좋은 칭찬은?");
                System.out.println("1번 : 너 천재임?");
                System.out.println("2번 : 너 천사임?");
                int num3 = sc.nextInt();
                Sum.sumC(num3);
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
