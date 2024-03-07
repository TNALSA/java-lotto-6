package lotto.model;

import java.util.List;

public class Lotto {
    //lotto numbers
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        System.out.println(numbers);
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또는 최소 6자리입니다.");
        }
//        for(int i=0 ; i<numbers.size() ; i++){
//            if (numbers.equals(numbers.get(i))){
//                throw new IllegalArgumentException("[ERROR] 중복된 숫자가 있습니다.");
//            }
//        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    /**
     * 당첨 번호와 뽑은 번호를 비교하여 일치하는 숫자의 갯수를 추출하는 메서드
     * @param winArr
     * @return 일치하는 번호의 갯수
     */
    public int isCoincide(List<Integer> winArr){
        return (int) numbers.stream()
                .filter(winArr::contains)
                .count();
    }

    public boolean isBonus(int Bonus){
        return numbers.contains(Bonus);
    }


}
