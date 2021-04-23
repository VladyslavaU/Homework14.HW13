import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//1 - Имеется коллекция из Integers, использую стримы посчитать среденее значения всех чисел
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(averageFromIntegerList(integerList));


        // 2 - Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>
        List<String> stringListToMap = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        System.out.println(stringMapWithUpperCaseValues(stringListToMap));


        //3 - Имеется коллекция из String, отфильтровать и вывести на экран все значения, которые написаны в loverCase and length = 4
        List<String> stringListToFilter = Arrays.asList("one", "TWO", "cop", "SIR", "ear", "PEA", "book", "root", "jade", "fate", "jack", "pack", "rock",
                "mock", "folk", "Take", "MAke", "Java", "SAGA", "HAND", "banD", "wheel", "steel", "wheat", "AFTER", "BEFORE");
        System.out.println(filterFourCharLowerCaseStrings(stringListToFilter));

    }

    public static double averageFromIntegerList(List<Integer> integerList) {
        return (integerList.stream().mapToInt(Integer::intValue).sum()) / integerList.size();
    }

    public static Map<String, String> stringMapWithUpperCaseValues(List<String> stringListToMap) {
        return stringListToMap.stream()
                .collect(Collectors.toMap(String -> String, String::toUpperCase));
    }

    public static List<String> filterFourCharLowerCaseStrings(List<String> stringListToFilter) {
       return stringListToFilter.stream()
                .filter(s -> s.equals(s.toLowerCase()))
                .filter(s -> s.length() == 4)
                .collect(Collectors.toList());
    }


}
