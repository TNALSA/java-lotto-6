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

public class LottoController {

   private final InputView inputView = new InputView();
   private final OutputView outputView = new OutputView();
   private final ServiceImpl serviceimpl = new ServiceImpl();
    int money = 0;
//    int conNumber = 0;
//    int three = 0, four = 0, five = 0, five_bonus = 0, six = 0;
    List<Lotto> lottoList;
    List<String> winArr;
    Map<String,Integer> resMap = new HashMap<>();
    int bonusNum;
    boolean isBonus;
    int conNumber = 0;

    /**
     * 게임의 프로세스를 결정하는 playLotto()
     * purchaseLotto: 로또 구매
     * inputWinNum: 당첨 번호 입력
     * inputBonusNum: 보너스 번호 입력
     * compareNum: 구매한 로또와 입력한 당첨 번호와 비교
     * compareBonus: 구매한 로또와 입력한 보너스 번호와 비교
     */
    public void playLotto(){
        purchaseLotto();
        inputWinNum();
        inputBonusNum();
        compareNum();
        compareBonus();
        //countNum();
        //showResult();
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

    /**
     * compareNum()과 compareBonus 병합예정
     */

    public void compareNum(){
        //값 비교
        for(int i=0;i<lottoList.size();i++){
           conNumber = serviceimpl.compareNum(winArr,lottoList.get(i));
        }
    }

    public void compareBonus(){
        for(int i=0;i<lottoList.size();i++){
            isBonus = serviceimpl.compareBonus(bonusNum, lottoList.get(i));
        }
    }

//    public void showResult(){
//        outputView.totalPrint();
//        outputView.resultPrint(resMap.getOrDefault("three",0),
//                                resMap.getOrDefault("four",0),
//                                resMap.getOrDefault("five",0),
//                                resMap.getOrDefault("fiveBonus",0),
//                                resMap.getOrDefault("six",0));
//    }
    public void showRor(){
        outputView.ratePrint(serviceimpl.calRor());
    }
}
