package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class LottoRepository {
    //로또 구매 갯수에 따른 로또 객체 생성
    public Lotto createLotto(){
        //pickUniqueNumbersInRange 메소드를 살펴보면 랜덤 난수를 생성하여 List의 형태로 반환해주고 있기 때문에
        //매개변수로 pickUniqueNumbersInRange()를 넣어줘도 된다.
        Lotto lotto = new Lotto(Randoms.pickUniqueNumbersInRange(1,45,6));
        return lotto;
    }
}
