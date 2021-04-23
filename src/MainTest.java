import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class MainTest {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    List<String> stringListToMap = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
    List<String> stringListToFilter = Arrays.asList("one", "TWO", "cop", "SIR", "ear", "PEA", "book", "root", "jade", "fate", "jack", "pack", "rock",
            "mock", "folk", "Take", "MAke", "Java", "SAGA", "HAND", "banD", "wheel", "steel", "wheat", "AFTER", "BEFORE");


    @Test
    public void averageFromIntegerListTest() {
        double expected = 5.0;
        double actual = Main.averageFromIntegerList(integerList);
        assertEquals("Average value is not correct", expected, actual, 0);
    }

    @Test
    public void stringMapWithUpperCaseValuesTest() {
        Map<String, String> mapToTest = Main.stringMapWithUpperCaseValues(stringListToMap);
        Map<String, String> expectedMap = new HashMap<String, String>();
        expectedMap.put("one", "ONE");
        expectedMap.put("two", "TWO");
        expectedMap.put("three", "THREE");
        expectedMap.put("four", "FOUR");
        expectedMap.put("five", "FIVE");
        expectedMap.put("six", "SIX");
        expectedMap.put("seven", "SEVEN");
        expectedMap.put("eight", "EIGHT");
        expectedMap.put("nine", "NINE");
        expectedMap.put("ten", "TEN");

        Assert.assertNotNull("Provided map is null", mapToTest);
        Assert.assertEquals("Size is not correct", mapToTest.size(), 10);
        Assert.assertTrue("Mismatched keys in mapToTest", mapToTest.keySet().containsAll(expectedMap.keySet()));
        Assert.assertTrue("Mismatched values in mapToTest", mapToTest.values().containsAll(expectedMap.values()));
    }

    @Test
    public void filterFourCharLowerCaseStringsTest() {
        List<String> filtered = Main.filterFourCharLowerCaseStrings(stringListToFilter);
        List<String> expected = Arrays.asList("book", "root", "jade", "fate", "jack", "pack", "rock", "mock", "folk");

        Assert.assertNotNull(filtered);
        Assert.assertEquals("Size is not correct", filtered.size(), 9);
        Assert.assertTrue("Values are different", filtered.containsAll(expected));
    }


}


