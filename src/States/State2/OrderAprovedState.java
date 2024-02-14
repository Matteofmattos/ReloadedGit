package States.State2;

import States.State2.Interfaces.ShoppingOrderState;

public class OrderAprovedState implements ShoppingOrderState{

    private final String nome;
    private ShoppingOrder order;

    public String getNome() {
        return this.nome;
    }

    public ShoppingOrder getOrder() {
        return this.order;
    }

    public OrderAprovedState(ShoppingOrder shoppingOrder) {
        this.nome = "Approved payment";
        this.order = shoppingOrder;
    }

    @Override
    public String getName() {
        return this.nome;
    }

    @Override
    public void approvePayment() {
        System.out.println("The payment is already done...");
    }

    @Override
    public void rejectPayment() {
        this.order.setState(new OrderRejectedState(this.order));
    }

    @Override
    public void waitPayment() {
        this.order.setState(new OrderPendingState(this.order));
    }

    @Override
    public void shipOrder() {
        System.out.println("Sending the ship...");
    }
}
