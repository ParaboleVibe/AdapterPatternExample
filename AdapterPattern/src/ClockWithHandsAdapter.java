public class ClockWithHandsAdapter implements  DigitalClock{
    ClockWithHands clockWithHands;

    public ClockWithHandsAdapter(ClockWithHands clockWithHands) {
        this.clockWithHands = clockWithHands;
    }

    @Override
    public void showCurrentTimeInNumbers() {
        clockWithHands.showCurrentTimeInDegrees();
    }
}
