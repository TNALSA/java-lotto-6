package lotto.message;

public enum InputMsg {
    MONEY("구입금액을 입력해 주세요."),
    WIN("당첨 번호를 입력해 주세요."),
    BONUS("보너스 번호를 입력해 주세요.");


    private final String message;

    InputMsg(String msg){
        this.message = msg;
    }

    public String getMessage(){
        return message;
    }
}
