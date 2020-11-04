
// Uhr.java

package in_app;

import javax.swing.JApplet;
import java.awt.*;            // Grafische Oberfläche
import java.util.*;           // Kalenderfunktionen

public class Uhr extends JApplet 
{
	// Eigenschaften                  red green blue
	private Color avocado = new Color(102,153,  102);
	private Color butterscotch = new Color(255,204,102);
	private String lastTime = "";
	
	                         //"Projektionsfläche"
	public void paint(Graphics wand)
	{
		Graphics2D wand2D = (Graphics2D)wand; //Upgraden
		Font buchstabenArt = // Name
			    new Font("Monospaced", Font.BOLD, 20);
		wand2D.setFont(buchstabenArt);
		
		GregorianCalendar day = new GregorianCalendar();
		String time = day.getTime().toString();
		
		// hintergrundfarbe wird Vordergrundfarbe
		wand2D.setColor(avocado);
		// ganzen Hintergrund neuschreiben, 
		// weil setBackground nicht funktioniert.
		wand2D.fillRect(0, 0, 400, 100);
		
		// den bisherigen String überschreiben
		wand2D.drawString(lastTime, 5, 25); 
		
		// wieder Vordergrundfarbe aktivieren
		wand2D.setColor(butterscotch);
		wand2D.drawString(time, 5, 25);
		
		// Verlangsamung, nur 1x pro Sekunde ausgeben
	    try
	    {
	    	Thread.sleep(1000);
	    } catch (InterruptedException e) {}
	    lastTime = time;
	    repaint(); 
	}
}