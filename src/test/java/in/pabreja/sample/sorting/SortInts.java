package in.pabreja.sample.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortInts {

    @Test
    public void sortInts(){
        final int[] number = {-3,-5,1,7,4,-2};
        final int[] expected = {-5,-3,-2,1,4,7};

        Arrays.sort(number);
        assertArrayEquals(expected,number);

    }

    @Test
    public void reverseNumericalOrderComparator(){

        List<Integer> numbers = Arrays.asList(4,7,1,6,3,5,4);
        List<Integer> expected = Arrays.asList(7,6,5,4,4,3,1);
        Collections.sort(numbers,(o1,o2) -> {return o2-o1;});
        assertEquals(expected,numbers);


    }

    @Test
    public void aescNumericalOrderComparator(){
        List<Integer> numbers = Arrays.asList(4,7,1,6,3,5,4);
        List<Integer> expected = Arrays.asList(1,3,4,4,5,6,7);
        Collections.sort(numbers,Comparator.comparing(Integer::intValue));
        assertEquals(expected,numbers);
    }

    @Test
    public void aescNumericalOrderComparator1(){
        List<Integer> numbers = Arrays.asList(4,7,1,6,3,5,4);
        List<Integer> expected = Arrays.asList(1,3,4,4,5,6,7);
        Collections.sort(numbers, (o1, o2) -> {return o1-o2;});
        assertEquals(expected,numbers);
    }


}
