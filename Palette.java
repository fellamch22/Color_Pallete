import javax.swing.*;
import java.awt.* ;

public class Palette {
	private static Vue v ;
      public Palette () {
    	  v = new Vue();
    	//  v.miseAJour();
      }
      
      public static Vue getVue() {
    	  return v ;
      }
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> { new Palette() ; });
		}

}
