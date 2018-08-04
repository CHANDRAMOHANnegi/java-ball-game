 
//import org.apache.log4j.Logger; 

//import org.apache.log4j.PropertyConfigurator;

import java.util.logging.Logger;

import javax.swing.JFrame;  
public class Frame1 extends JFrame implements Game1Constants{
	 
	public Frame1(){ 
		
		Logger log=Logger.getLogger(Frame1.class.getName());
		 log.warning("warning");
		log.info("gfg");
        setLayout(null);
		 setLocationRelativeTo(null);
//	    setLocationRelativeTo(null);
	    setResizable(false);
		setTitle(TITLE);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		Board1 board1 =new Board1();  
		add(board1);  
	    setSize(WIDTH1,HEIGHT1); 
	     	  setVisible(true);
	 	  
	} git
	   	public static void main(String[] args) {
		 
     Frame1 frame1 =   new Frame1();
          
     
	   	}

}
