package MainPackage;

public class SLList {//реализация односвязного списка 
    
    private Node head;//первый элемент списка

    public SLList() {//конструктор по умолчанию
    }

    public SLList(Node head) {
        this.head = head;
    }
  
    public void isEmpty(){//проверка списка на пустоту
        if (head == null){
            System.out.println("List is empty");
        }
        System.out.println("List is not empty");
    }
  
    public void addToEnd (int data){//добавление элемента в конец списка
        Node node = new Node (data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
    
    public void addToFront (int data){//добавление элемента в начало списка
        Node temp = new Node (data);
        temp.next = head;
        head = temp;      
    }
    
    public Node getFirstNode (){//извлечение первого элемента без удаления
        System.out.println("First node = " + head.data);
        return head;
    }
    
    public void removeFirst(){//удаление первого элемента
        head = head.next;
    }
    
    public Node getLastNode (){//извлечение последнего элемента без удаления
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        return temp;
    }
    
    public void removeLast(){//удаление последнего элемента
        Node temp = head;
        Node tempNext = head;
        if (head.next != null)
            tempNext = head.next;   
        while (tempNext.next != null) {
            temp = temp.next;
            tempNext = tempNext.next;
            }
        temp.next = null;
    }
    
    public void print(){//вывод на печать содержимого списка
        Node temp = head;
        while (temp != null) {
            System.out.println("Data = " + temp.data);
            temp = temp.next;
        }
    }
}