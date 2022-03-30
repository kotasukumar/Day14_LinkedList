package linkedlist;

import javax.swing.*;

public class MyLinkedList {
    private INode head;
    private INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode){
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        }else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public INode pop(INode popNode){
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void printMyNode(){
        StringBuffer myNodes = new StringBuffer("My Nodes are: ");
        INode temNode = head;
        while (temNode.getNext() != null){
            myNodes.append(temNode.getkey());
            if (!temNode.equals(tail)) myNodes.append("->");
            temNode = temNode.getNext();
        }
        myNodes.append(temNode.getkey());
        System.out.println(myNodes);
    }
}
