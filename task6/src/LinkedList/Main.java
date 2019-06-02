package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list = list.insert(list, 1);
        list = list.insert(list, 3);
        list = list.insert(list, 2);
        list = list.insert(list, 9);
        list = list.insert(list, 5);
        list = list.insert(list, 8);
        list = list.insert(list, 7);
        list = list.insert(list, 4);


        list.getAtPosition(list, 11);

        list.getAtPosition(list, 0);

        list.printList(list);

        list.getAtPosition(list, 11);


        list.deleteAtPosition(list, 0);


        list.printList(list);


    }

}
