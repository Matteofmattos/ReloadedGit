package States.State1;

public class PauseState implements HeadPhoneState {

    private static final HeadPhoneState instance = new PauseState();

    private PauseState(){}

    public static HeadPhoneState getInstance() {
        return instance;
    }

    @Override
    public void Click(HeadPhone phone) {
        System.out.println("Executing....");
        phone.setIsPlaying(true);
        phone.setState(PlayingState.getInstance());
    }

    @Override
    public void LongClick(HeadPhone phone) {
        System.out.println("Turning Off...");
        phone.setIsPlaying(false);
        phone.setIsOn(false);
        phone.setState(OffState.getInstance());
    }


    
}
