import javax.swing.*;


import java.awt.* ;
import java.util.Dictionary;


public class Vue extends JFrame {
	
	private JPanel p ;
	private JSlider s ;
	private JSlider s1 ;
	private JSlider s2 ;
	private JPanel v ;
    private JButton b ;
    private JButton b1 ;
    private JButton b2 ;
    private JLabel a1 ;
	private Modele m = new Modele() ;
	private Controleur ctrl = new Controleur(this , m);
	private Color memoire ; 
	
	
	public Vue () {
		this.setTitle(" TP 9 ");
		this.setSize(1200, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.p = new JPanel() ;
		this.v = new JPanel() ;
		JLabel a = new JLabel() ;
	    a1 = new JLabel() ;
		p.setBackground(Color.GREEN);
		v.setBackground(Color.CYAN);
		//v.setAlignmentX(p.getWidth());
		p.setLayout(new BorderLayout());
		//a.setText("Vert");
		//a.setHorizontalAlignment(JLabel.CENTER);
		//a.setVerticalAlignment(JLabel.CENTER);
		//p.add(a);
		v.setLayout(new BorderLayout());
		a1.setHorizontalAlignment(JLabel.CENTER);
		a1.setVerticalAlignment(JLabel.CENTER);
		a1.setFont(new Font("Serif", Font.BOLD, 50));
		a1.setForeground(Color.WHITE);
		v.add(a1);
		this.setLayout(new GridLayout(0,2) );
		this.getContentPane().add(p);
	    this.getContentPane().add(v);
	    // Add a slider to JPanel p
	  //  JPanel o = new JPanel();
	//  o.setBorder((Border) new TitledBorder(new EtchedBorder(), "Selected Date"));
	  //  o.setBorder(BorderFactory.createTitledBorder("hi"));
	    //o.setVerticalAlignment(JLabel.CENTER);
		this.s = new JSlider(JSlider.HORIZONTAL,0,100,0);
		s.setMajorTickSpacing(25);
		s.setMinorTickSpacing(5);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		s.setBorder(BorderFactory.createTitledBorder("Rouge"));
		s.addChangeListener((event) -> {
			ctrl.sliderMoved(new Color (s.getValue(),m.getC().getGreen(),m.getC().getBlue()));
		});
		
		s1 = new JSlider(JSlider.HORIZONTAL,0,100,0);
		s1.setMajorTickSpacing(25);
		s1.setMinorTickSpacing(5);
		s1.setPaintTicks(true);
		s1.setPaintLabels(true);
		s1.setBorder(BorderFactory.createTitledBorder("Vert"));
		s1.addChangeListener((event) -> {
			ctrl.sliderMoved(new Color (m.getC().getRed(),s1.getValue(),m.getC().getBlue()));
			
		});

		s2 = new JSlider(JSlider.HORIZONTAL,0,100,0);
		s2.setMajorTickSpacing(25);
		s2.setMinorTickSpacing(5);
		s2.setPaintTicks(true);
		s2.setPaintLabels(true);
		s2.setBorder(BorderFactory.createTitledBorder("Bleu"));
		s2.addChangeListener((event) -> {
			ctrl.sliderMoved(new Color (m.getC().getRed(),m.getC().getGreen(),s2.getValue()));
		});
		this.b = new JButton("Memoriser");
		b.addActionListener(click -> {
			memoriser();
		});
		this.b1 = new JButton("S'en rappeler");
		b1.addActionListener( click -> {
		   if( m != null)
			ctrl.rappeler( memoire);
		});
		this.b2 = new JButton("Complementaire");
		b2.addActionListener( click -> {
			ctrl.complementary();
		});
		JPanel l = new JPanel(new FlowLayout());
		l.setAlignmentX(Component.CENTER_ALIGNMENT);
		l.setAlignmentY(Component.CENTER_ALIGNMENT);

		//p.setLayout(new GridLayout(5,1));
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		p.add(s);
		p.add(s1);
		p.add(s2);
		//p.setLayout(new FlowLayout());
		b.setOpaque(true);
		b.setHorizontalAlignment(JButton.CENTER);
		b.setVerticalAlignment(JButton.CENTER);
		l.add(b);
		l.add(b1);
		l.add(b2);
		//l.setLocation(s2.getX(), s2.getY()+s2.getHeight());
		p.add(l);

	}
	
	public void miseAJour() {
		
		this.v.setBackground(m.getC());
		a1.setText("#"+Integer.toHexString(m.getC().getRGB() & 0xffffff));

	}
	
	public void memoriser () {
		memoire = m.getC() ;
	}
	
	public void moveSliders(Color c ) {
		
			s.setValue(c.getRed());
			s1.setValue(c.getGreen());
			s2.setValue(c.getBlue());
			
		}
}

