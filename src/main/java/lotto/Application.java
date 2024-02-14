package lotto;

import lotto.controller.LottoController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        //Controller에서 시작
        //게임의 모든 프로세스에 관한 명시는 controller에서 동작한다.
        LottoController lottoController = new LottoController();
        lottoController.playLotto();
    }
}
