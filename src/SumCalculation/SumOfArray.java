package SumCalculation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class MultiThreadSumCal  {

    List<Integer> list = new ArrayList<>();
    int chunks;
    Semaphore sumSema;

    public MultiThreadSumCal(List<Integer> list, int chunks, Semaphore sumSema) {
        this.list = list;
        this.chunks = chunks;
        this.sumSema = sumSema;
    }

    public SumCalculation()
}
