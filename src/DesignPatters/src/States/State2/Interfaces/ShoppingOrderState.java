package States.State2.Interfaces;

public interface ShoppingOrderState {
    
    public String getName();
    public void  approvePayment();
    public void  rejectPayment( );
    public void  waitPayment( );
    public void shipOrder();
}
