package LinkedList;

public class LinkedList {
    Node head;

    static class Node {

        int data;
        Node next;


        Node(int d) {
            data = d;
            next = null;
        }
    }


    public static LinkedList insert(LinkedList list, int data) {

        Node new_node = new Node(data);
        new_node.next = null;


        if (list.head == null) {
            list.head = new_node;
        } else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = new_node;
        }


        return list;
    }


    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.print("\nLinkedList: ");


        while (currNode != null) {

            System.out.print(currNode.data + " ");


            currNode = currNode.next;
        }
        System.out.println("\n");
    }


    public static LinkedList deleteAtPosition(LinkedList list, int index) {

        Node currNode = list.head, prev = null;


        if (index == 0 && currNode != null) {
            list.head = currNode.next; // Changed head


            System.out.println(index + " position element deleted");


            return list;
        }


        int counter = 0;


        while (currNode != null) {

            if (counter == index) {

                prev.next = currNode.next;


                System.out.println(index + " position element deleted");
                break;
            } else {

                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }


        if (currNode == null) {

            System.out.println(index + " position element not found");
        }


        return list;
    }

    public static LinkedList getAtPosition(LinkedList list, int index) {

        Node currNode = list.head;


        if (index == 0 && currNode != null) {


            System.out.println("value of index " + index + " is " + currNode.data);


            return list;
        }


        int counter = 0;


        while (currNode != null) {

            if (counter == index) {


                System.out.println("value of index " + index + " is " + currNode.data);
                break;
            } else {


                currNode = currNode.next;
                counter++;
            }

        }


        if (currNode == null) {

            System.out.println(index + " position element not found");

        }


        return list;
    }

}

