package Day24;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-linked-list-deletion
 */
class Solution {

    private static Node removeDuplicates(Node head) {

        Node currentNode = head;
        Node nextNode = currentNode.next;

        while (nextNode != null) {
            if (currentNode.data == nextNode.data) {
                nextNode = nextNode.next;
                currentNode.next = nextNode;
            } else {
                currentNode = nextNode;
                nextNode = nextNode.next;
            }
        }

        return head;
    }

    private static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    private static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
        Node head = null;
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            int ele = sc.nextInt();
//            head = insert(head, ele);
//        }
        int[] arr = {1, 2, 2, 3, 3, 4};
//        int[] arr = { 1, 1, 1, 1, 1, 1, 1 };
        for (int i : arr) {
            head = insert(head, i);
        }
        display(head);
        head = removeDuplicates(head);
        System.out.println("\nAfter remove duplicates: ");
        display(head);
    }
}
