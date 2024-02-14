package lotto.controller;

import lotto.message.InputMsg;
import lotto.message.OutputMsg;
import lotto.model.Lotto;
import lotto.service.Service;
import lotto.service.ServiceImpl;
import lotto.view.InputView;
import lotto.view.OutputView;


import java.util.*;

public class LottoController {

   private final InputView inputView = new InputView();
   private final OutputView outputView = new OutputView();
   private final ServiceImpl serviceimpl = new ServiceImpl();

    List<List<Integer>> lottoList;

    public void playLotto(){
        purchaseLotto();
        inputWinNum();
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
        serviceimpl.inputWinNum();
    }

    public void inputBonusNum(){
        inputView.inputBonusNum();
        serviceimpl.inputBonusNum();
    }



}
