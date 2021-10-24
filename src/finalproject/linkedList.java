/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Shinozaki Kirishima
 */
public class linkedList {
    
    private Node firstLink;  // initialize a first link 
    
    // constructor 
    public linkedList() {
        firstLink=null;
    }
    // getter and setter for first link
    public Node getFirstLink()
    {
        return this.firstLink;
    }
    public void setFirstlink(Node firstLink)
    {
        this.firstLink=firstLink;
     
    }
    //isempty
    public boolean isEmpty()
    {
        return this.firstLink==null;
    }

    // add node to the list 
    public void addNode(Question data)
    {
        Node n = new Node(data);  // initialize new node and store data 
        n.next=this.firstLink;  // point the next of n to the firstlink 
        this.firstLink=n;  // set the firstlink equal to new node 'n'
    }
    // add last node 
    public void addLast(Question data) 
    {
        Node n = new Node(data);   // initialize new node and store data 
        if (this.isEmpty())  // check if empty 
        {
            this.firstLink = n;
        } else {
            Node curr = this.firstLink;  // initlialize a now to iterate 
            while (curr.next != null)  // while current node is not null 
            {
                curr = curr.next;  // get the next element in the list 
            }
            curr.next = n;  // set next to n 
        }
    }

    // get last
    public Node getLast()
    {
        Node curr = this.firstLink;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        return curr;
    }
    // to string 
     public String toString()
    {
        String content = "{";
        Node curr=this.firstLink;
        while(curr!=null)
        {
            content+=curr.question.getQ()+" "+curr.question.getAns();
            curr=curr.next;
        }
        content+="}";
        return content;
    }

   // to string for questions only 
    public String questionsToString() 
    {
        String content = "";
        Node curr = this.firstLink;
        while (curr != null) 
        {
            content = curr.question.getQ();
            curr = curr.next;
        }
        return content;
    }
}
