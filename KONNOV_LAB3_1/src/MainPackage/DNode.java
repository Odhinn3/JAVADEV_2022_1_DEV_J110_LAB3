package MainPackage;
public class DNode<T> {
    T data;
    DNode next;
    DNode prev;

    public DNode(T data) {
        this.data = data;
    }
}
