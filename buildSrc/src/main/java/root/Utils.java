package root;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Utils {
    @lombok.SneakyThrows
    public static void waitSecond() {
        System.out.println("Start waiting");
        new CountDownLatch(1).await(1, TimeUnit.SECONDS);
        System.out.println("Finish waiting");
    }
}
