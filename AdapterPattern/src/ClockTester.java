public class ClockTester {
    public static void main(String[] args) {
        RectangleClock rectangleClock = new RectangleClock();
        RoundClock roundClock = new RoundClock();
        ClockWithHandsAdapter clockWithHandsAdapter = new ClockWithHandsAdapter(roundClock);

        System.out.println("Digital clock shows:");
        rectangleClock.showCurrentTimeInNumbers();
        System.out.println("\nClock with hands shows:");
        roundClock.showCurrentTimeInDegrees();

        System.out.println("\nAdapter shows:");
        clockWithHandsAdapter.showCurrentTimeInNumbers();;
    }
}
