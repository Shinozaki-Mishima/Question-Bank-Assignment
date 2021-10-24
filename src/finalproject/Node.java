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
public class Node {
    // fields 
    Question question;
    Node next;
    // constructor
    public Node(Question  question)
    {
        this.question = question;
        this.next = null;
    }
}
