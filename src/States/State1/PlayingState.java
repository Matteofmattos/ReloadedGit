package States.State1;

public class PlayingState implements HeadPhoneState {

    private static final HeadPhoneState instance = new PlayingState();

    private PlayingState(){}

    public static HeadPhoneState getInstance() {
        return instance;
    }

    @Override
    public void Click(HeadPhone phone) {
        System.out.println("Pause.");
        phone.setIsPlaying(false);
        phone.setState(PauseState.getInstance());
    }

    @Override
    public void LongClick(HeadPhone phone) {
        System.out.println("Turning Off...");
        phone.setIsPlaying(false);
        phone.setIsOn(false);
        phone.setState(OffState.getInstance());
    }
    
}
