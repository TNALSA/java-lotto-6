package lotto.service;

import lotto.model.Lotto;
import java.util.*;
public interface Service {
    int purchase();
    void countNumber(int money);
    List<List<Integer>> createLotto(int number);
    String inputWinNum();
    String inputBonusNum();


}
