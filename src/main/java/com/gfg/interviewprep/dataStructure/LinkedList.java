package com.gfg.interviewprep.dataStructure;

public class LinkedList
{
    public Node head;
    public int length = 0;

    public LinkedList()
    {
        this.head = null;
    }

    public LinkedList(Node head)
    {
        this.head = head;
        length++;
    }

    public void insert(Node item)
    {
        if(this.length == 0)
        {
            this.head = item;
        }
        else if(this.length == 1)
        {
            this.head.next = item;
            this.length++;
        }
        else
        {
            Node curr = this.head;
            while (curr.next != null)
            {
                curr= curr.next;
            }
            curr.next = item;
            this.length++;
        }
    }

    public Node findMiddle()
    {
        Node fast = this.head;
        Node slow = this.head;
        while(fast.next != null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public void reverse()
    {
        Node current = this.head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head = prev;
    }

    public void deleteNode(Node node)
    {
        if(this.head != node)
        {

        }
    }



}
