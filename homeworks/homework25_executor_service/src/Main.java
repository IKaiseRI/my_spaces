
import java.util.List;
import java.util.concurrent.*;


public class Main {
    public static long sumResult = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        int[][] arrays = {{1,100000},
                {100001,200000},
                {200001,300000},
                {300001,400000},
                {400001,500000},
                {500001,600000},
                {600001,700000},
                {700001,800000},
                {800001,900000},
                {900001,1000000}
        };



        List<Callable<Long>> tasks = List.of(
                () -> summarize(arrays[0]),
                () -> summarize(arrays[1]),
                () -> summarize(arrays[2]),
                () -> summarize(arrays[3]),
                () -> summarize(arrays[4]),
                () -> summarize(arrays[5]),
                () -> summarize(arrays[6]),
                () -> summarize(arrays[7]),
                () -> summarize(arrays[8]),
                () -> summarize(arrays[9])

        );
        List<Future<Long>> results = executorService.invokeAll(tasks);

        for (Future<Long> result : results){
            sumResult += result.get();
        }

        System.out.println(sumResult);

    }

    private static Long summarize(int[] range) {
        int from = range[0];
        int to = range[1];
        long result = 0;
        for(int i = from; i <= to; i++){
            result += i;
        }
        return result;
    }
}



