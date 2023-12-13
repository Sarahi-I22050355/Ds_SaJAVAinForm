package Clases;

public class Stopwatch {
    private long startTime;
public void reset() {
            startTime = 0;
        }
        public void start() {
            startTime = System.currentTimeMillis();
        }

        public long stop() {
            return System.currentTimeMillis() - startTime;   
        }
}