public class DoubleLinkedLists_22 {
    Pembeli_22 head;
    Node_22 head2;
    int size;
    int size2;

    public DoubleLinkedLists_22() {
        head = null;
        head2 = null;
        size = 0;
        size2 = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isEmpty2() {
        return head2 == null;
    }

    public void addFirst(int antrean, String nm, String hp) {
        if (isEmpty()) {
            head = new Pembeli_22(null, antrean, nm, hp, null);
        } else {
            Pembeli_22 newNode = new Pembeli_22(null, antrean, nm, hp, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int antrean, String nm, String hp) {
        if (isEmpty()) {
            addFirst(antrean, nm, hp);
        } else {
            Pembeli_22 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Pembeli_22 newNode = new Pembeli_22(current, antrean, nm, hp, null);
            current.next = newNode;
            size++;
        }
    }

    public void addFirst2(Pesanan_22 item) {
        if (isEmpty()) {
            head2 = new Node_22(null, item, null);
        } else {
            Node_22 newNode = new Node_22(null, item, head2);
            head2.prev = newNode;
            head2 = newNode;
        }
        size2++;
    }

    public void addLast2(Pesanan_22 item) {
        if (isEmpty2()) {
            addFirst2(item);
        } else {
            Node_22 current = head2;
            while (current.next != null) {
                current = current.next;
            }
            Node_22 newNode = new Node_22(current, item, null);
            current.next = newNode;
            size2++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian Masih Kosong!!");
        } else if (size == 1) {
            removeLast();
        } else {
            System.out.println(head.namaPembeli + " telah memesan Menu");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            System.out.println(head.namaPembeli + " telah memesan Menu");
            head = null;
            size--;
            return;
        }
        Pembeli_22 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println(current.namaPembeli + " telah memesan Menu");
        current.next = null;
        size--;
    }

    public int size() {
        return size;
    }

    public int size2() {
        return size2;
    }

    public void print() {
        if (!isEmpty()) {
            Pembeli_22 tmp = head;
            System.out.println("|No.\t\t|Nama Customer\t\t\t|No Handphone\t\t|");
            while (tmp != null) {
                System.out.println("|" + tmp.antri + "\t\t|" + tmp.namaPembeli + "\t\t|" + tmp.noHp + "\t\t|");
                tmp = tmp.next;
            }
            System.out.println("");
            System.out.println("Total Antrian: " + size);
        } else {
            System.out.println("Antrian Masih Kosong!");
        }
    }

    public void print2() {
        if (!isEmpty2()) {
            Node_22 temp = head2;
            System.out.println("|No.\t\t|Nama Pesanan\t\t|Harga\t\t|");
            while (temp != null) {
                System.out.println("|" + temp.data.kodePesanan + "\t\t|" + temp.data.namaPesanan + "\t\t|"
                        + temp.data.harga + "\t\t|");
                temp = temp.next;
            }
        }
    }

    public void bubbleSort() {
        Node_22 current = null, index = null;
        Pesanan_22 tmp;
        if (head2 == null) {
            System.out.println("Antrian Masih Kosong!");
        } else {
            for (current = head2; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.data.namaPesanan.charAt(0) > index.data.namaPesanan.charAt(0)) {
                        tmp = current.data;
                        current.data = index.data;
                        index.data = tmp;
                    }
                }
            }
        }
    }
}