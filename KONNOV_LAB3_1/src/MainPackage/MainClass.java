package MainPackage;

public class MainClass {

    public static void main(String[] args) {
        
        SLList list = new SLList();
        list.addToEnd(0);
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToFront(-1);
        list.addToEnd(5);
        list.getLastNode();
        list.print();
        System.out.println("===");
        list.getLastNode();
        list.removeLast();
        list.print();
        list.isEmpty();
    }
}
