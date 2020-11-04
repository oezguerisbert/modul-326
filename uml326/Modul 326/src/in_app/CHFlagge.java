package in_app;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.JApplet;

public class CHFlagge extends JApplet 
{
    public void paint(Graphics schirm)
    {
    	setBackground(Color.blue);
    	schirm.setColor(Color.red);  // Vordergrundfarbe
    	                             // des Graphics Element
    	schirm.drawRect(20,20,20,20); // Rahmen
    	
    	// dynamik wachsender Hintergrund
    	for(int i = 0; i<101; i++)
     	{
        	schirm.setColor(Color.red);  // Vordergrundfarbe
    		// Verlangsamung, nur 1x pro Sekunde ausgeben
    	    try
    	    {
    	    	Thread.sleep(100);
    	    } catch (InterruptedException e) {}
        	
    		schirm.fillRect(i,i,i,i); // wachsendes rotes Quadrat
        	schirm.setColor(Color.white);
        	schirm.fillRect(56,69,40,12); // CH-Kreuz Horizontaler Balken
    	    schirm.fillRect(69,56,12,40); // Vertikaler Balken
        	schirm.drawRect(50,50,50,50); // Weisser Rand im Roten Feld
     	} 
    }
}