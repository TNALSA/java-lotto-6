package lotto.view;

import lotto.message.InputMsg;

import java.util.List;
import java.util.Scanner;

public class InputView {

    //로또 구매 금액 입력받기
    public void inputMoney(){
        System.out.println(InputMsg.MONEY.getMessage());
    }

    //로또 당첨번호 입력하기
    public void inputWinNum(){
        System.out.println(InputMsg.WIN.getMessage());
    }

    //보너스 번호 입력받기
    public void inputBonusNum(){
        System.out.println(InputMsg.BONUS.getMessage());
    }

}
