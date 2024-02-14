package States.State1;

public class OffState implements HeadPhoneState {

    private static final HeadPhoneState instance = new OffState();

    private OffState(){}

    public static HeadPhoneState getInstance() {
        return instance;
    }

    @Override
    public void Click(HeadPhone phone) {
        System.out.println("Ligue o aparelho primeiro...");
    }

    @Override
    public void LongClick(HeadPhone phone) {
        System.out.println("Ligando o aparelho...");
        phone.setState(OnState.getInstance());
    }

}
