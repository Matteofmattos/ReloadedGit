package States.State2;

import States.State2.Interfaces.ShoppingOrderState;

public class ShoppingOrder {

    public ShoppingOrder() { }
    
    private ShoppingOrderState state= new OrderPendingState(this);

    public ShoppingOrderState getState() {
        return this.state;
    }

    protected void setState(ShoppingOrderState state ){
        this.state= state;
    }

    public String getStateName(){
        return this.state.getName();
    }

    public void approvePayment(){
        this.state.approvePayment();
    }

    public void rejectPayment(){
        this.state.rejectPayment();
    }

    public void waitPayment(){
        this.state.waitPayment();
    }

    public void shipOrder(){
        this.state.shipOrder();
    }

}
