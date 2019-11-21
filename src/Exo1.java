import java.awt.* ;
import javax.swing.* ;
public class Exo1 implements Runnable {

	public static void main(String[] args) {
		Exo1 f = new Exo1();
		f.run("hello i'm fella ", 600, 600);

	}

	public void run(String titre , int width , int height ) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame(titre);
		f.setSize(width, height);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true); 
	}
	
   @Override
	public void run() {		
	}

}
