package lotto.view;

import lotto.message.InputMsg;
import org.assertj.core.util.Arrays;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class Input {
    //로또 구매 금액
    int money;

    //보너스 번호
    int bonus;

    //당첨 번호를 입력 받을 변수
    String winNumber;
    //winNumber를 ,(구분자)로 나누어 담을 List
    List<String> winArray;

    Scanner sc = new Scanner(System.in);

    //로또 구매 금액 입력받기
    public void inputMoney(){
        System.out.println(InputMsg.MONEY);
        money = sc.nextInt();
    }

    //로또 당첨번호 입력하기
    public void inputNumber(){
        System.out.println(InputMsg.WIN);
        winNumber = sc.next();
    }

    //보너스 번호 입력받기
    public void inputBonus(){
        System.out.println(InputMsg.BONUS);
        bonus = sc.nextInt();
    }

    //구매 금액에 따른 로또 갯수 환산하기
    public int countNumber(int money){
        int number = money/1000;
        return number;
    }


}
