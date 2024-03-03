package lotto.message;

public enum OutputMsg {
    LOTTO("개를 구매했습니다."),
    TOTAL("당첨 통계"),
    LINE("---"),
    THREE_CORRECT("3개 일치 (5,000원) - "),
    FOUR_CORRECT("4개 일치 (50,000원) - "),
    FIVE_CORRECT("5개 일치 (1,500,000원) - "),
    FIVE_BONUS_CORRECT("5개 일치, 보너스 볼 일치 (30,000,000원) - "),
    SIX_CORRECT("6개 일치 (2,000,000,000원) - "),
    PER("개"),
    IS("%입니다."),
    RATE_OF_RETURN("총 수익률은 ");


    private final String message;

    OutputMsg(String msg){
        this.message = msg;
    }

    public String getMessage(){
        return message;
    }

}
