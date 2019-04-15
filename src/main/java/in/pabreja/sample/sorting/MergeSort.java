package in.pabreja.sample.sorting;

import java.util.ArrayList;
import java.util.List;

public interface MergeSort {

    // divide and conquer algorithm
    default List<Integer> mergeSort(final List<Integer> numbers){

        if(numbers.size() < 2){
            return numbers;
        }
        List<Integer> left = numbers.subList(0,numbers.size()/2);
        List<Integer> right = numbers.subList(numbers.size()/2,numbers.size());

        return merge(mergeSort(left),mergeSort(right));
    }

    private List<Integer> merge(final List<Integer> left,final List<Integer> right){
        int leftPointer = 0;
        int rightPointer = 0;

        final List<Integer> merged = new ArrayList<>(left.size()+right.size());
        while(leftPointer < left.size() && rightPointer < right.size()){
            if(left.get(leftPointer) < right.get(rightPointer)){
                merged.add(left.get(leftPointer));
                leftPointer++;
            } else {
                merged.add(right.get(rightPointer));
                rightPointer++;
            }
        }

        while(leftPointer < left.size()){
            merged.add(left.get(leftPointer));
            leftPointer++;
        }

        while(rightPointer < right.size()){
            merged.add(rightPointer);
            rightPointer++;
        }

        return merged;
    }
}
