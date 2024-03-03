package lotto.view;

import lotto.message.OutputMsg;
import lotto.model.Lotto;

import java.util.*;

public class OutputView {
    public void purchaseLotto(int count){
        System.out.println(count + OutputMsg.LOTTO.getMessage());
    }

    public void totalPrint(){
        System.out.println(OutputMsg.TOTAL.getMessage());
        System.out.println(OutputMsg.LINE.getMessage());
    }

    public void resultPrint(int three, int four, int five,int five_bonus, int six){
        System.out.println(OutputMsg.THREE_CORRECT.getMessage() + three + OutputMsg.PER.getMessage());
        System.out.println(OutputMsg.FOUR_CORRECT.getMessage() + four + OutputMsg.PER.getMessage());
        System.out.println(OutputMsg.FIVE_CORRECT.getMessage() + five + OutputMsg.PER.getMessage());
        System.out.println(OutputMsg.FIVE_BONUS_CORRECT.getMessage() + five_bonus + OutputMsg.PER.getMessage());
        System.out.println(OutputMsg.SIX_CORRECT.getMessage() + six + OutputMsg.PER.getMessage());
    }

    public void ratePrint(float ror){
        System.out.println(OutputMsg.RATE_OF_RETURN.getMessage() + ror + OutputMsg.IS.getMessage());
    }
}
