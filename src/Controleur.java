import java.awt.*;

public class Controleur {
	
	Vue e ;
	Modele m ;
	
   public Controleur(Vue e, Modele m) {
		this.e = e;
		this.m = m;
	}

   public void sliderMoved(Color c) {
	   m.setC(c);
	   e.miseAJour();
   }
   
   public void rappeler(Color c) {
	   e.moveSliders(c);
	   sliderMoved(c);
	   
   }
   
   public void complementary() {
	   sliderMoved (new Color(100 - m.getC().getRed() ,100 - m.getC().getGreen() , 100 - m.getC().getBlue()) );
	  e.moveSliders( new Color(100 -  m.getC().getRed() ,100 - m.getC().getGreen() , 100 - m.getC().getBlue()) );
	  
   }
}
