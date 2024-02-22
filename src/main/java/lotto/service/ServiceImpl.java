package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.model.Lotto;
import lotto.service.Service;
import java.util.*;

import java.util.Scanner;
import java.util.*;

public class ServiceImpl implements Service {
    Scanner sc = new Scanner(System.in);
    int money;
    List<Lotto> lottoList = new ArrayList<>();
    //로또 구매
    @Override
    public int purchase() {
       money = sc.nextInt();
       return money;
    }

    //로또 개수 계산
    @Override
    public void countNumber(int money){
        int count = money/1000;
        System.out.println("count: "+count);
    }

    //로또 생성
    @Override
    public List<Lotto> createLotto(int number){
        for(int i=0;i<number;i++){
            Lotto lotto = new Lotto(Randoms.pickUniqueNumbersInRange(1,45,6));
            System.out.println("lotto >> "+lotto.getNumbers());
            lottoList.add(lotto);
        }
        return lottoList;
    }

    //당첨 번호 입력받기
    @Override
    public List<String> inputWinNum(){
        String winNum = sc.next();
        List<String> winArr = Arrays.asList(winNum);
        System.out.println(winArr.toString());
        return winArr;
    }

    @Override
    public String inputBonusNum(){
        String BonusNum = sc.next();
        return BonusNum;
    }

    /**
     * indexOf()로 변경예정
     * winArr: 사용자가 입력한 당첨 번호
     * lottoList: 사용자가 구매한 로또들
     * count: 당첨 번호와 일치하는 번호의 갯수
     * @param winArr
     */

    @Override
    public void compareNum(List<String> winArr, Lotto lotto){
        int count = 0;
        List<Integer> curLotto;
        for(int i=0; i<winArr.size(); i++){
            for(int j=0;j<lotto.getNumbers().size();j++){
                if(winArr.get(i).equals(String.valueOf(lotto.getNumbers().get(j)))) {
                    lotto.setCount(++count);
                }
            }
        }

    }
}
