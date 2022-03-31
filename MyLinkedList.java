package linkedlist;

import javax.swing.*;

public class MyLinkedList {
    private INode head;
    private INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            INode tempNode = this.tail;
            this.tail = newNode;
            this.tail.setNext(tempNode);
        }
    }

    public void search(INode searchElement){
        INode temp = this.tail;
                this.tail = searchElement;
                this.tail.setNext(temp);
    }

    public void printMyNode() {
        StringBuffer myNodes = new StringBuffer("My Nodes are: ");
        INode temNode = tail;
        while (temNode.getNext() != null) {
            myNodes.append(temNode.getkey());
            if (!temNode.equals(head)) myNodes.append(" <-");
            temNode = temNode.getNext();
        }
            myNodes.append(temNode.getkey());
        System.out.println(myNodes);
    }
}
