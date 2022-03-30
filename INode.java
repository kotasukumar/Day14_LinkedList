package linkedlist;

public interface INode<K> {
    Object getkey();

    INode getNext();
    void setNext(INode next);
}
