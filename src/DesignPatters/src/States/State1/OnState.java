package States.State1;

public class OnState implements HeadPhoneState {

    private static final HeadPhoneState instance = new OnState();

    private OnState(){  }

    public static HeadPhoneState getInstance() {
        return instance;
    }

    @Override
    public void Click(HeadPhone phone) {
        System.out.println("Resume player...");
        phone.setIsPlaying(true);
        phone.setState(PlayingState.getInstance());
    }

    @Override
    public void LongClick(HeadPhone phone) {
        System.out.println("Turning off...");
        phone.setIsOn(false);
        phone.setIsPlaying(false);
        phone.setState(OffState.getInstance());
    }




}
