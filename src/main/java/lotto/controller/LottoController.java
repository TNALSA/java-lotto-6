package lotto.controller;

import lotto.message.InputMsg;
import lotto.message.OutputMsg;
import lotto.model.Lotto;
import lotto.service.Service;
import lotto.service.ServiceImpl;
import lotto.view.InputView;
import lotto.view.OutputView;
import java.util.List;

public class LottoController {

   private final InputView inputView = new InputView();
   private final OutputView outputView = new OutputView();
   private final ServiceImpl serviceimpl = new ServiceImpl();

    List<Lotto> lottoList;
    List<String> winArr;
    String bonusNum;

    public void playLotto(){
        purchaseLotto();
        inputWinNum();
        inputBonusNum();
    }

    public void purchaseLotto(){
        inputView.inputMoney();
        //금액 입력하기
        int money = serviceimpl.purchase();
        //로또 갯수
        int count = money/1000;
        //갯수만큼 로또 생성
        lottoList = serviceimpl.createLotto(count);

        outputView.purchaseLotto(count,lottoList);
    }

    public void inputWinNum(){
        inputView.inputWinNum();
        winArr = serviceimpl.inputWinNum();
    }

    public void inputBonusNum(){
        inputView.inputBonusNum();
        bonusNum = serviceimpl.inputBonusNum();
    }

    public void compareNum(){
        for(int i=0;i<lottoList.size();i++){
            serviceimpl.compareNum(winArr,lottoList.get(i));
        }
    }

}
