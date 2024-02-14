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
    List<List<Integer>> lottoList = new ArrayList<>();
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
    public List<List<Integer>> createLotto(int number){
        for(int i=0;i<number;i++){
            Lotto lotto = new Lotto(Randoms.pickUniqueNumbersInRange(1,45,6));
            System.out.println("lotto"+lotto);
            lottoList.add(lotto.getNumbers());
        }
        return lottoList;
    }
}
