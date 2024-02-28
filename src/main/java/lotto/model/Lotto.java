package lotto.model;

import java.util.List;

public class Lotto {
    //lotto numbers
    private final List<Integer> numbers;
    //일치하는 번호의 갯수
    private int count;
    private boolean isBonus = false;


    public Lotto(List<Integer> numbers) {
        System.out.println("numbers:"+numbers);

        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean getBonus(){
        return isBonus;
    }
    public void setBonus(){
        this.isBonus = true;
    }
}
