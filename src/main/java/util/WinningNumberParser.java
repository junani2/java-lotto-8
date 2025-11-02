package util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinningNumberParser {

    public static List<Integer> parse(String Number){
        //문자열을 숫자 리스트로 반환
        List<Integer> winningNumbers = Arrays.stream(Number.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return winningNumbers;
    }
}
