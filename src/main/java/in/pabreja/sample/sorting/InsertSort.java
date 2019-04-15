package in.pabreja.sample.sorting;

import java.util.LinkedList;
import java.util.List;

public interface InsertSort {

    // worst case is O(n^2)
    //best case O(n)
    // space requirement is twice as new list is created
    default List<Integer> insertSort(final List<Integer> numbers){
        final List<Integer> sortedList = new LinkedList<Integer>();

        originalList:
        for(Integer num:numbers){
            for(int i =0;i< sortedList.size();i++){
                if(num < sortedList.get(i)){
                    sortedList.add(i,num);
                    continue originalList;
                }
            }
            sortedList.add(sortedList.size(),num);
        }

        return sortedList;
    }
}
