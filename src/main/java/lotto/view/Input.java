package lotto.view;

import lotto.message.InputMsg;

import java.util.Scanner;

public class Input {
    int money;
    Scanner sc = new Scanner(System.in);

    //로또 구매 금액 입력받기
    public void inputMoney(){
        System.out.println(InputMsg.MONEY);
        money = sc.nextInt();
    }

    //구매 금액에 따른 로또 갯수 환산하기
    public int countNumber(int money){
        int number = money/1000;
        return number;
    }


}
