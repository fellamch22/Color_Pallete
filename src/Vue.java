import javax.swing.*;


import java.awt.* ;
import java.util.Dictionary;


public class Vue extends JFrame {

	public Vue () {
		this.setTitle(" TP 9 ");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		JPanel p = new JPanel() ;
		JPanel v = new JPanel() ;
		JLabel a = new JLabel() ;
		p.setBackground(Color.GREEN);
		v.setBackground(Color.CYAN);
		//v.setAlignmentX(p.getWidth());
		p.setLayout(new BorderLayout());
		a.setText("Vert");
		a.setHorizontalAlignment(JLabel.CENTER);
		a.setVerticalAlignment(JLabel.CENTER);
		p.add(a);
		this.setLayout(new GridLayout(0,2) );
		this.getContentPane().add(p);
	    this.getContentPane().add(v);
	    // Add a slider to JPanel p
	    JPanel o = new JPanel();
	//  o.setBorder((Border) new TitledBorder(new EtchedBorder(), "Selected Date"));
	    o.setBorder(BorderFactory.createTitledBorder("hi"));
	    //o.setVerticalAlignment(JLabel.CENTER);
		JSlider s = new JSlider(JSlider.HORIZONTAL,0,100,0);
		s.setMajorTickSpacing(25);
		s.setMinorTickSpacing(5);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		o.add(s);
		JSlider s1 = new JSlider(JSlider.HORIZONTAL,0,100,0);
		s1.setMajorTickSpacing(25);
		s1.setMinorTickSpacing(5);
		s1.setPaintTicks(true);
		s1.setPaintLabels(true);
		JSlider s2 = new JSlider(JSlider.HORIZONTAL,0,100,0);
		s2.setMajorTickSpacing(25);
		s2.setMinorTickSpacing(5);
		s2.setPaintTicks(true);
		s2.setPaintLabels(true);
		JButton b = new JButton("Memoriser");
		JButton b1 = new JButton("S'en rappeler");
		JButton b2 = new JButton("Complementaire");
		JPanel l = new JPanel(new FlowLayout());
		p.setLayout(new GridLayout(5,1));
		p.add(o);
		p.add(s1);
		p.add(s2);
		//p.setLayout(new FlowLayout());
		l.add(b);
		l.add(b1);
		l.add(b2);
		l.setLocation(s2.getX(), s2.getY()+s2.getHeight());
		p.add(l);

	}
	
}
