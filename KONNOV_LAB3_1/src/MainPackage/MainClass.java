package MainPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        
        /*SLList list = new SLList();
        list.addToEnd(0);
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToFront(-1);
        list.addToEnd(5);
        list.getLastNode();
        list.print();
        System.out.println("==");
        list.getLastNode();
        list.removeLast();
        list.print();
        list.isEmpty();
*/
        System.out.println("=====");
        DLList dlist = new DLList();
        String[] arr1 = {"a", "b", "c"};
        dlist.addToFront(arr1);
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("AAA");
        list1.add("BBB");
        dlist.addToFront(list1);
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("aaa");
        list2.add("bbb");
        dlist.addToFront(list2);
        dlist.addToFront(9);
        dlist.addToEnd("ABC");
        dlist.getFirstNode();
        dlist.getLastNode();
        dlist.removeLast();
        dlist.getLastNode();
        Object[] arr2 = new Object[]{1,2,3,4,5,6,7,8};
        //dlist.addFrontFromArr(arr);
        dlist.addEndFromArrInv(arr2);
        dlist.print();

    }
}
