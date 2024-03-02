package lotto.view;

import lotto.message.OutputMsg;
import lotto.model.Lotto;

import java.util.*;

public class OutputView {
    public void purchaseLotto(int count, List<Lotto> lottoList){
        System.out.println(String.valueOf(count)+OutputMsg.LOTTO.getMessage());
//        for(Lotto lotto: lottoList){
//            System.out.println(lotto.toString());
//        }
    }

    public void totalPrint(){
        System.out.println(OutputMsg.TOTAL.getMessage());
        System.out.println(OutputMsg.LINE.getMessage());
    }

    public void resultPrint(int three, int four, int five,int five_bonus, int six){
        System.out.println(OutputMsg.THREE_CORRECT.getMessage()+three);
        System.out.println(OutputMsg.FOUR_CORRECT.getMessage()+four);
        System.out.println(OutputMsg.FIVE_CORRECT.getMessage()+five);
        System.out.println(OutputMsg.FIVE_BONUS_CORRECT.getMessage()+five_bonus);
        System.out.println(OutputMsg.SIX_CORRECT.getMessage()+six);
    }
}
