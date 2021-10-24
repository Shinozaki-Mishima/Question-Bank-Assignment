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
public class Question {
    // fields
   private String q;
   private char ans;
   private String answers;
   private String type;
   // getter functions 
    public String getQ() {
        return q;
    }

    public char getAns() {
        return ans;
    }


    public String getType() {
        return type;
    }

    public String getAnswers() {
        return answers;
    }
    
    // setter functions
    public void setQ(String q) {
        this.q = q;
    }

    public void setAns(char ans) {
        this.ans = ans;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public void setType(String type) {
        this.type = type;
    }

}
