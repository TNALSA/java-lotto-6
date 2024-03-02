package lotto.service;

import lotto.model.Lotto;
import java.util.*;
public interface Service {
    int purchase();
    void countNumber(int money);
    List<Lotto> createLotto(int number);
    List<String> inputWinNum();
    String inputBonusNum();
    void compareNum(List<String> winArr, Lotto lotto);

    void compareBonus(String bonus, Lotto lotto);
    Map<String,Integer> countNum();

}
