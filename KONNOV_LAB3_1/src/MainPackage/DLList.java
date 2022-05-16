package MainPackage;
import java.util.Arrays;
import java.util.Collection;

public class DLList<T> {
    private DNode head;
    private DNode tail;

    public DLList() {//конструктор по умолчанию
        head = null;
        tail = null;
    }

    public DLList(DNode head, DNode tail) {//параметризованный конструктор
        this.head = head;
        this.tail = tail;
    }
        
    public boolean isEmpty(){//проверка списка на пустоту
        return head == null;
    }
    
    public void addToFront (T data){//добавление элемента в начало списка
        DNode temp = new DNode (data);
        if (isEmpty()) {
            tail = temp;
            head = tail;
        } else {
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
    }
  
    public void addToEnd (T data){//добавление элемента в конец списка
        DNode temp = new DNode (data);
        if (isEmpty()) {
            tail = temp;
            head = tail;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public DNode getFirstNode (){//извлечение первого элемента без удаления
        System.out.println("First node = " + head.data);
        return head;
    }
    
    public void removeFirst(){//удаление первого элемента
        head = head.next;
    }
    
    public DNode getLastNode (){//извлечение последнего элемента без удаления
        System.out.println("Last node = " + tail.data);
        return tail;
    }
    
    public void removeLast(){//удаление последнего элемента
        DNode temp = tail;
        if (tail.prev == null)
            tail = null;
        else {
            temp = tail.prev;
            temp.next = null;
            tail = temp;
        }
    }
    
    public void print(){//вывод на печать содержимого списка сначала
        DNode temp = head;
        int c = 1;
        while (temp != null) {
            if (temp.data.getClass().isArray()){
                System.out.println("Node " + c + " = " + Arrays.toString((Object[]) temp.data));
                c++;
                temp = temp.next;
            } else if (temp.data instanceof Collection<?>) {
                System.out.println("Node " + c + " = " + temp.data.toString());
                c++;
                temp = temp.next;
            } else {
                System.out.println("Node " + c + " = " + temp.data);
                c++;
                temp = temp.next;
            }

        }
    }
    
    //добавление элементов из массива в начало с сохранением порядка
    public void addFrontFromArr (Object[] arr){
        for (int c = arr.length-1; c > -1; c--) {
            DNode temp = new DNode (arr[c]);
            if (isEmpty()) {
                tail = temp;
                head = tail;
            } else {
                head.prev = temp;
                temp.next = head;
                head = temp;
            }     
        } 
    }
    
    //добавление элементов из массива в начало в обратном порядке
    public void addFrontFromArrInv (Object[] arr){
        for (int c = 0; c < arr.length; c++) {
            DNode temp = new DNode (arr[c]);
            if (isEmpty()) {
                tail = temp;
                head = tail;
            } else {
                head.prev = temp;
                temp.next = head;
                head = temp;
            }     
        } 
    }
    
    //добавление элементов из массива в конец с сохранением порядка
    public void addEndFromArr (Object[] arr){
        for (int c = 0; c < arr.length; c++) {
            DNode temp = new DNode (arr[c]);
            if (isEmpty()) {
                tail = temp;
                head = tail;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }     
        } 
    }
    
    //добавление элементов из массива в конец в обратном порядке
    public void addEndFromArrInv (Object[] arr){
        for (int c = arr.length-1; c > -1; c--) {
            DNode temp = new DNode (arr[c]);
            if (isEmpty()) {
                tail = temp;
                head = tail;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }     
        } 
    }
    
    
     
     
}
