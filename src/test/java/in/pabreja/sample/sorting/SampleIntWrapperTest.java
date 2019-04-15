package in.pabreja.sample.sorting;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SampleIntWrapperTest {

    private List<SampleIntWrapper> getList(){
        List<SampleIntWrapper> list = new ArrayList<SampleIntWrapper>();
        for(int i=0;i < 50;i++){
            list.add(new SampleIntWrapper(i));
        }
        return list;
    }

    @Test
    public void compareWithoutComparator(){

        List<SampleIntWrapper> list = getList();
        try{
            Arrays.sort(
                    list.toArray()
            );
        } catch (Exception e){
            e.printStackTrace();
            fail();
        }

        fail();
    }


}