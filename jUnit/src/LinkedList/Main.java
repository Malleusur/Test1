package LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList(1);
        System.out.println("Creat list with 1 Integer element. The list: ");
        System.out.println(list);
        System.out.println();

        list.add("Urara");
        System.out.println("Add String element \"Azaza\" to the list. The list: ");
        System.out.println(list);
        System.out.println();

        System.out.println("Get element with index = 0. The element is ");
        System.out.println(list.get(0));
        System.out.println();

        list.remove(0);
        System.out.println("Remove element with index = 0. The list: ");
        System.out.println(list);
        System.out.println();

        list.remove(0);
        System.out.println("Remove element with index = 0. The list: ");
        System.out.println(list);
        System.out.println();

        System.out.println("Get element with index = 0. The element is ");
        System.out.println(list.get(0));
        System.out.println();

        list.add(10.5);
        System.out.println("Add Double element to the empty list. The list: ");
        System.out.println(list);
        System.out.println();

        list.remove(10);
        System.out.println("Remove element with nonexistent index = 10. The list: ");
        System.out.println(list);
        System.out.println();
    }

}
