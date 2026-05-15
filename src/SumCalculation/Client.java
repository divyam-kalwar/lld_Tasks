package SumCalculation;

import java.util.*;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28));
        int threads = Runtime.getRuntime().availableProcessors();
        int chunks = arr.size()/threads;
        ExecutorService es = Executors.newFixedThreadPool(threads);
        List<Future<Long>> future = new ArrayList<>();

        for (int i = 0; i < threads; i++) {
            future.add(es.submit(new SumOfArray(arr,i*chunks, (i+1)*chunks)));
        }

        Long sum = 0L;
        for (Future<Long> f : future) {
            sum+=f.get();
        }
        System.out.println(sum);

    }
}
