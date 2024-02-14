package States.State2;

import States.State2.Interfaces.ShoppingOrderState;

public class OrderPendingState implements ShoppingOrderState {

    private final String nome;
    private ShoppingOrder order;

    public OrderPendingState(ShoppingOrder shoppingOrder) {
        nome = "Order pending.";
        this.order= shoppingOrder;
     }

    public ShoppingOrder getOrder() {
        return this.order;
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
        this.order.setState(new OrderRejectedState(this.order));
    }

    @Override
    public void waitPayment() {
        System.out.println("Waiting the payment...");
    }

    @Override
    public void shipOrder() {
        System.out.println("You need to complete the payment first..");
    }

    
}
