import com.rahul.sorting.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {4,1,9,12,5,30};
        int[] sortedList = BubbleSort.iterativeSort(list);

        System.out.println(Arrays.toString(sortedList));
    }
}
