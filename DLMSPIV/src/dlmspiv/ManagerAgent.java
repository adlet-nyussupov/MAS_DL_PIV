/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlmspiv;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.WakerBehaviour;
import jade.lang.acl.ACLMessage;
import javax.swing.JOptionPane;


/**
 *
 * @author Adlet
 */
public class ManagerAgent extends Agent {
    
    ACLMessage msg = new ACLMessage(ACLMessage.INFORM);

   
    
    protected void setup() {
       
        System.out.println("Adding waker behaviour");
        addBehaviour(new WakerBehaviour(this, 0) {
            protected void onWake() {
                System.out.println("Система запустилась");
                NewJFrame enter = new NewJFrame();
                enter.setVisible(true);
                
            }
            
            
        
        });
        
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage msg = receive();
            if(msg != null){
            JOptionPane.showMessageDialog(null, "WWWWWWW"+msg.getContent());
            System.out.println("Action");
            } else {block();}
            //
            }
        });
                       
    }
    
    
    
}
