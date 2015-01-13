/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasure.quest;



/**
 *
 * @author UTILISATEUR
 */
public class Enigma {
    
    private String question;
    private String a;
    private String b;
    private String c;
    private String answer;
    private boolean succeed;


    
    public Enigma(String q, String x, String y, String z, String ans){
         question=q;
         a=x;
         b=y;
         c=z;
         answer=ans;
         succeed=false;
    }
    
    /**
     * Getter and setter on the attibutes
     */
    
    public String getAnswer () {
        return(answer);
    }
    
    public String getQuestion () {
        return (this.question);
    }
    
     public String getA () {
        return (this.a);
    }
    ;
    public String getB () {
        return (this.b);
    }
    public String getC () {
        return (this.c);
    }

    public boolean getSucceed() {
    	return succeed;
    }
       
    public void setSucceed () {
    	succeed = true;
    }
}
