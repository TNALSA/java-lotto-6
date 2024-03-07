package lotto.service;

import lotto.model.Lotto;
import java.util.*;
public interface Service {
    int purchase();
    void countNumber(int money);
    List<Lotto> createLotto(int number);
    List<String> inputWinNum();
    int inputBonusNum();
    int compareNum(List<String> winArr, Lotto lotto);
    Map<String,Integer> countNum(int conNumber, boolean isBonus);
    boolean compareBonus(int bonus, Lotto lotto);
//    Map<String,Integer> countNum();
    float calRor();

}
