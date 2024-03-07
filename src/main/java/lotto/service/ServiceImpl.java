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
    List<Lotto> lottoList = new ArrayList<>();
    int money = 0, winMoney = 0, conNumber = 0;
    int three = 0, four = 0, five = 0, five_bonus = 0, six = 0;
    Map<String,Integer> resMap = new HashMap<>();


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
            }catch (InputMismatchException e){
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

        conNumber =  lotto.isCoincide(convWinArr);

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

    @Override
    public Map<String,Integer> countNum(int conNumber, boolean isBonus){
        switch (conNumber){
            case 3:
                resMap.put("three",++three);
                break;
            case 4:
                resMap.put("four",++four);
                break;
            case 5:
                if(isBonus)
                    resMap.put("five_bonus",++five_bonus);
                else
                    resMap.put("five",++five);
                break;
            case 6:
                resMap.put("six",++six);
                break;
        }
        return resMap;
    }

    @Override
    public float calRor(){
        return ((float) winMoney / (float)money) * 100;
    }
}
