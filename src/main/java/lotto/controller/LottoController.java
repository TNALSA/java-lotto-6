package lotto.controller;

import lotto.message.InputMsg;
import lotto.message.OutputMsg;
import lotto.model.Lotto;
import lotto.service.Service;
import lotto.service.ServiceImpl;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Controller
 * 사용자의 입력처리와 응답에만 집중
 * 즉, 사용자에게 값을 입력받고 알맞은 서비스로 Mapping을 시켜주는 역할
 */
public class LottoController {
   private final InputView inputView = new InputView();
   private final OutputView outputView = new OutputView();
   private final ServiceImpl serviceimpl = new ServiceImpl();
    int money = 0, bonusNum, conNumber = 0;
    boolean isBonus;
    List<Lotto> lottoList;
    List<String> winArr;
    Map<String,Integer> resMap;

    public void playLotto(){
        purchaseLotto();
        inputWinNum();
        inputBonusNum();
        compareNum();
        //countNum();
        showResult();
        showRor();
    }

    /**
     * 사용자에게 금액을 입력받고, 입력 받은 금액만큼 lotto 객체를 생성하는 메서드
     * money: 금액
     * count: 금액에 따른 로또의 갯수
     */
    public void purchaseLotto(){
        inputView.inputMoney();
        money = serviceimpl.purchase();
        //로또 갯수
        int count = money/1000;
        //갯수만큼 로또 생성

        outputView.purchaseLotto(count);
        lottoList = serviceimpl.createLotto(count);
    }

    /**
     * inputWinNum()과 inputBonusNUm()을 병합예정
     */

    public void inputWinNum(){
        inputView.inputWinNum();
        winArr = serviceimpl.inputWinNum();
    }

    public void inputBonusNum(){
        inputView.inputBonusNum();
        bonusNum = serviceimpl.inputBonusNum();
    }

    public void compareNum(){
        for (Lotto lotto : lottoList) {
            conNumber = serviceimpl.compareNum(winArr, lotto);
            isBonus = serviceimpl.compareBonus(bonusNum, lotto);

            resMap = serviceimpl.countNum(conNumber, isBonus);
        }
    }

    public void showResult(){
        outputView.totalPrint();
        outputView.resultPrint(resMap.getOrDefault("three",0),
                                resMap.getOrDefault("four",0),
                                resMap.getOrDefault("five",0),
                                resMap.getOrDefault("fiveBonus",0),
                                resMap.getOrDefault("six",0));
    }
    public void showRor(){
        outputView.ratePrint(serviceimpl.calRor());
    }
}
