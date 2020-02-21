package com.example.minervascoutingsubsystemandroid.structure.models;

public class MatchTimerManager {

    private boolean isTimerActive = false;

    private static MatchTimer matchTimer = new MatchTimer();
    private static Thread thread;

    public static void startMatchTimer(){
        thread = new Thread(matchTimer);
        thread.start();
    }

    public static void stopMatchTimer(){
        if (matchTimer.isActive){
            matchTimer.setActive(false);
        }
    }

    public static int getCounter(){
        return matchTimer.getCounter();
    }


    private static class MatchTimer implements Runnable {

        int counter;
        boolean isActive;

        @Override
        public void run() {
            isActive = true;
            while (isActive) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter++;
            }
        }

        public boolean isActive() {
            return isActive;
        }

        public void setActive(boolean active) {
            isActive = active;
        }

        public int getCounter() {
            return counter;
        }

        public void setCounter(int counter) {
            this.counter = counter;
        }
    }


}
