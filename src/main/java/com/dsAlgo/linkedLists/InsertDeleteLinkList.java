package com.dsAlgo.linkedLists;

class LinkList{
    public Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }
    public void insertFirst(int id){
        Link newlink = new Link(id);
        if (first == null) {
            first = newlink;
        }else{
            newlink.next = first;
            first = newlink;
        }
        }
    public Link deleteFirst(){
        Link temp = first;
        if (first.next == null) {   // single node
            first = null;
        }else{
            first = first.next;
        }
        return temp;
    }
    public void displayList(){
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}
public class InsertDeleteLinkList{
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.displayList();

        System.out.println("\n***************************************");

        Link alink = list.deleteFirst();
       alink.displayLink();
    }
}

