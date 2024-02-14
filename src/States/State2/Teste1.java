package States.State2;

public class Teste1 {
    public static void main(String[] args) {
        ShoppingOrder shoppingOrder = new ShoppingOrder();
        System.out.println(shoppingOrder.getStateName());
        shoppingOrder.approvePayment();
        System.out.println(shoppingOrder.getStateName());
        shoppingOrder.approvePayment();
        shoppingOrder.rejectPayment();
        shoppingOrder.rejectPayment();
        shoppingOrder.waitPayment();
        shoppingOrder.waitPayment();
        shoppingOrder.shipOrder();
        shoppingOrder.rejectPayment();
        shoppingOrder.shipOrder();
        shoppingOrder.approvePayment();
        shoppingOrder.shipOrder();
    }
}
