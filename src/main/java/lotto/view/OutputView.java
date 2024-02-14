package lotto.view;

import lotto.message.OutputMsg;

public class OutputView {
    public void purchaseLotto(int count){
        System.out.println(String.valueOf(count)+OutputMsg.LOTTO);
    }

    public void totalPrint(){
        System.out.println(OutputMsg.TOTAL);
        System.out.println(OutputMsg.LINE);
    }

    public void resultPrint(int three, int four, int five,int five_bonus, int six){
        System.out.println(OutputMsg.THREE_CORRECT+String.valueOf(three));
        System.out.println(OutputMsg.FOUR_CORRECT+String.valueOf(four));
        System.out.println(OutputMsg.FIVE_CORRECT+String.valueOf(five));
        System.out.println(OutputMsg.FIVE_BONUS_CORRECT+String.valueOf(five_bonus));
        System.out.println(OutputMsg.SIX_CORRECT+String.valueOf(six));
    }
}
