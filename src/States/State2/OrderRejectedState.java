package States.State2;

import States.State2.Interfaces.ShoppingOrderState;

public class OrderRejectedState implements ShoppingOrderState {

    private final String nome;
    private ShoppingOrder order;

    public OrderRejectedState(ShoppingOrder shoppingOrder) {
        this.nome = "Approved payment";
        this.order= shoppingOrder;
    }

    @Override
    public String getName() {
        return this.nome;
    }

    @Override
    public void approvePayment() {
        this.order.setState(new OrderAprovedState(this.order));
    }

    @Override
    public void rejectPayment() {
       System.out.println("The Order is already rejected.");
    }

    @Override
    public void waitPayment() {
        this.order.setState(new OrderPendingState(this.order));
    }

    @Override
    public void shipOrder() {
        System.out.println("Your payment was rejected");
    }
     
}
