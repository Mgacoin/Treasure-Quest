/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasure.quest;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import treasure.quest.Game;
import treasure.quest.Room;
import treasure.quest.Command;

/**
 *
 * @author UTILISATEUR
 */
public class WindowEnigma extends JFrame {
    
    private JTextArea question;
    Game g;
   
    private JButton a;
    private JButton b;
    private JButton c;
    
    private String click;
    
   // private static final ImageIcon i_over = new ImageIcon ("perdre.JPG");
    
    /**
     * Constructor for objects of class WindowEnigma
     */
    
    public WindowEnigma(final Enigma enigma, final Game world){
        
     this.setTitle("Enigma"); 
        
     Container cp = this.getContentPane();
     cp.setLayout (new BorderLayout ()); 
     
     JPanel p_plateau = new JPanel ();
     p_plateau.setLayout(new FlowLayout());
     
     /**
      * Buttons with the different answers
      */
    
    a = new JButton (enigma.getA());
    p_plateau.add(a);
    b = new JButton (enigma.getB());
    p_plateau.add(b);
    c = new JButton (enigma.getC());
    p_plateau.add(c);
     
    if (enigma.getA()==null)
    	a.setVisible(false);
    if (enigma.getC()==null)
    	c.setVisible(false);
    
     cp.add(p_plateau, BorderLayout.CENTER);
     
     /**
      * AcionListener to launch the method which determine if the answer is correct
      */
     
      a.addActionListener (new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                click = enigma.getA();
                win (click, enigma, world);
            }
        }
        );
        
        b.addActionListener (new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                click = enigma.getB();
                win (click, enigma, world);
            }
        }
        );
     
        c.addActionListener (new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                click = enigma.getC();
                win (click, enigma, world);
            }
        }
        );
        
     JPanel p_question = new JPanel();
     p_question.setLayout(new FlowLayout());
     
     question = new JTextArea(enigma.getQuestion());
     question.setEnabled(false);
     p_question.add(question);
     
     cp.add(p_question, BorderLayout.NORTH);
        
     this.pack(); 
     this.setVisible(true);
     }

    /**
     * Method to know if the player wins a key
     */
    

	public void win (String click, Enigma enigma, final Game world) {
    	 
        if (enigma.getAnswer().equals(click)) {
            question.setText("Well done!!!");
            Room nextRoom = g.currentRoom.northExit;
            
            a.setVisible(false);
            b.setVisible(false);
            c.setVisible(false);
        }
        else {
            question.setText("Bad Answer!!" + ".\n" + enigma.getQuestion()); 
            this.pack();
             Room nextRoom = g.currentRoom.westExit;
            
        }
    }
        
        
}