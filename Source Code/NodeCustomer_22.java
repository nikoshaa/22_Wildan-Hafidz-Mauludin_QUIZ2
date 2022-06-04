public class NodeCustomer_22 {
    Pembeli_22 data;
    NodeCustomer_22 prev, next;

    public NodeCustomer_22(NodeCustomer_22 prev, Pembeli_22 data, NodeCustomer_22 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}