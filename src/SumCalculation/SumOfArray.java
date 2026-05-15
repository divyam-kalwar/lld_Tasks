package SumCalculation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class SumOfArray implements Callable<Long> {

    List<Integer> arr =  new ArrayList<>();
    int start;
    int end;

    public SumOfArray(List<Integer> arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        Long sum = 0L;
        for (int i = start; i <= end; i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}
