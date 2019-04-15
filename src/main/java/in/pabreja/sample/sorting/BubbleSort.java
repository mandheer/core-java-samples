package in.pabreja.sample.sorting;

public interface BubbleSort {

    // worst case O(n^2)
    // best case O(n)
    default void bubbleSort(int[] numbers){
        boolean numbersSwitched;

        do{
            numbersSwitched = false;
            for(int i = 0; i < numbers.length -2;i++){
                if(numbers[i+1] < numbers[i]){
                    int temp = numbers[i];
                    numbers[i]=numbers[i+1];
                    numbers[i+1]=temp;
                    numbersSwitched = true;
                }
            }

        } while(numbersSwitched);
    }
}
