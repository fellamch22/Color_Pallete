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
	   e.moveSliders(new Color(~ m.getC().getRed() ,~ m.getC().getGreen() , ~ m.getC().getBlue()) );
	   sliderMoved (new Color(~ m.getC().getRed() ,~ m.getC().getGreen() , ~ m.getC().getBlue()) );
	 
   }
}
