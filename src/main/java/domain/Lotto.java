package domain;

import java.util.List;

/**
 * 로또 한장을 의미하는 객체
 */
public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void numbersPrint() {
        System.out.print("[");
        for (int i = 0; i < numbers.size() - 1; ++i) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.print(numbers.get(numbers.size() - 1) + "]");
    }
}
