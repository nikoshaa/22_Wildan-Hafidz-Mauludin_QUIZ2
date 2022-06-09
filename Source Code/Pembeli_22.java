public class Pembeli_22 {
    String namaPembeli, noHp;
    int antri;
    Pembeli_22 prev, next;

    Pembeli_22(Pembeli_22 prev, int a, String b, String c, Pembeli_22 next) {
        this.prev = prev;
        antri = a;
        namaPembeli = b;
        noHp = c;
        this.next = next;
    }
}