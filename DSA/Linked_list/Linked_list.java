package DSA.Linked_list;
import java.util.Scanner;

public class Linked_list {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    // head is a variable that points to the starting node of linked list
    static Node head;

    //method to insert number into linked list(insert at end);
    static void insert_end(int data){
        Node newnode = new Node(data);
        //check whether the linked list empty or not
        if(head == null){
            head = newnode;
        }
        else{
            Node temp = head;
            //traverse along the linked list to find the last element
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    //method to insert the elements into linked list(insert at beg)
    static void insert_beg(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    //method to delete element in linked list(delete at beg)
    static int delete_beg(){
        if(head == null){
            System.out.println("The linked list empty");
            return -1;
        }
        Node temp = head;
        int element = temp.data;
        head = head.next;
        temp.next = null;
        return element;
    }

    //method to delete element in linked list(delete at end)
    static int delete_end(){
        if(head == null){
            System.out.println("The linked list empty");
            return -1;
        }
        if(head.next == null){
            int ele = head.data;
            head = null;
            return ele;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int ele = temp.data;
        temp.next = null;
        return ele;
    }

    //method to delete element at particular postion

    //method to print the elements in the linked list
    static void print_list(){
        if(head == null){
            System.out.println("The linked list is empty");
            return;
        }
        System.out.println("The elements in linked list are");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int choice,number,deleted_ele;
            System.out.println("1. Insert at begining");
            System.out.println("2. Insert at endining");
            System.out.println("3. Insert at particular position");
            System.out.println("4. Printing elements in linked list");
            System.out.println("5. Delete at begining");
            System.out.println("6. Delete at endining");
            System.out.println("7. Delete at particular position");
            System.out.println("8. To exit");
            System.out.println("default. invalid input");
            
            while(true){
                
                System.out.println("Enter the choice");
                choice = sc.nextInt();
                switch(choice){
                    case 1:{
                        System.out.println("Enter the element");
                        number = sc.nextInt();
                        insert_beg(number);
                        break;
                    }
                    case 2:{
                        System.out.println("Enter the element");
                        number = sc.nextInt();
                        insert_end(number);
                        break;
                    }
                    case 3:{
                        System.out.println("Enter the element");
                        number = sc.nextInt();
                        //insert_pos(number);
                        break;
                    }
                    case 4:{
                        print_list();
                        break;
                    }
                    case 5:{
                        deleted_ele = delete_beg();
                        if(deleted_ele == -1){
                            System.out.println("deletion failed");
                        }
                        else{
                            System.out.println(deleted_ele + " element deleted successfully");
                        }
                        break;
                    }
                    case 6:{
                        deleted_ele = delete_end();
                        if(deleted_ele == -1){
                            System.out.println("deletion failed");
                        }
                        else{
                            System.out.println(deleted_ele + " element deleted successfully");
                        }
                        break;
                    }
                    case 7:{
                        number = sc.nextInt();
                        //delete_pos(number);
                        break;
                    }
                    case 8:{
                        System.exit(0);
                    }
                    default:{
                        System.out.println("invalid input enter the choice again");
                        break;
                    }

                }
            }
        }

    }
}
