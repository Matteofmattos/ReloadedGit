package States.State1;

public class HeadPhone {

    private HeadPhoneState state = OffState.getInstance();
    private Boolean isOn = false;
    private Boolean isPlaying = false;


    public HeadPhoneState getState() {
        return state;
    }


    public void setState(HeadPhoneState state) {
        this.state = state;
    }

    public Boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(Boolean isOn) {
        this.isOn = isOn;
    }

    public Boolean isIsPlaying() {
        return isPlaying;
    }

    public void setIsPlaying(Boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public void Click(){
        this.state.Click(this);
    }

    public void LongClick(){
        this.state.LongClick(this);
    }
}
