package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.model.Lotto;
import lotto.service.Service;
import java.util.*;

import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

public class ServiceImpl implements Service {
    Scanner sc = new Scanner(System.in);
    int money = 0;
    //int money = 0;
    int winMoney = 0;
    int conNumber = 0;


    List<Lotto> lottoList = new ArrayList<>();

    @Override
    public int purchase() {
        while(true){
            try{
                money = sc.nextInt();
                if(money%1000 !=  0){
                    throw new IllegalArgumentException();
                }
                return money;
            }catch (IllegalArgumentException e){
                System.out.println("[ERROR] 1000원 단위로 다시 입력 해주세요.");
            }catch (InputMismatchException e2){
                System.out.println("[ERROR] 숫자만 입력 가능합니다. 다시 입력 해주세요.");
                sc.nextLine();
            }
        }
    }

    //로또 개수 계산
    @Override
    public void countNumber(int money){
        int count = money/1000;
    }

    //로또 생성
    @Override
    public List<Lotto> createLotto(int number){
        for(int i=0;i<number;i++){
            Lotto lotto = new Lotto(Randoms.pickUniqueNumbersInRange(1,45,6));
            lottoList.add(lotto);
        }
        return lottoList;
    }

    //당첨 번호 입력받기
    @Override
    public List<String> inputWinNum(){
        String winNum = sc.next();
        List<String> winArr = Arrays.asList(winNum.split(","));

        return winArr;
    }

    @Override
    public int inputBonusNum(){
        int BonusNum = sc.nextInt();

        return BonusNum;
    }

    /**
     * @param winArr: 당첨 번호
     * @param lotto: 사용자가 구매한 로또
     */
    @Override
    public int compareNum(List<String> winArr, Lotto lotto){
        List<Integer> convWinArr = winArr.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        conNumber =  lotto.isCoincide(convWinArr);//int형이 들어가야함.
        System.out.println("conNumber >>>>>" + conNumber);

        return conNumber;
    }

    /**
     * 보너스 번호와 로또 번호 비교
     * @param bonus: 보너스 번호
     * @param lotto: lotto 객체
     */
    @Override
    public boolean compareBonus(int bonus, Lotto lotto){
        return lotto.isBonus(bonus);
    }

//    @Override
//    public Map<String,Integer> countNum(){
//        for(int i=0;i<lottoList.size();i++){
//            if(lottoList.get(i).getCount()==3){
//                resMap.put("three",three += 1);
//                winMoney += 5000;
//            }
//
//            if(lottoList.get(i).getCount()==4){
//                resMap.put("four",four += 1);
//                winMoney += 50000;
//            }
//
//            if(lottoList.get(i).getCount()==5){
//                resMap.put("five",five += 1);
//                winMoney += 1500000;
//            }
//
//            if((lottoList.get(i).getCount()==5) && (lottoList.get(i).getBonus())){
//                resMap.put("fiveBonus",five_bonus += 1);
//                winMoney += 30000000;
//            }
//
//            if(lottoList.get(i).getCount()==6){
//                resMap.put("six",six += 1);
//                winMoney += 2000000000;
//            }
//
//        }
//        return resMap;
//    }

    @Override
    public float calRor(){
        System.out.println("winMoney: "+winMoney);
        //System.out.println("money: "+money);
//        return ((float) winMoney / (float)money) * 100;
        return ((float) winMoney);
    }
}
