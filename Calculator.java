import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener
{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bres,bdec,bclr,bdel;
	JTextField tf1;
	JLabel l1,l2;
	String num1,op;
	Calculator()
	{
		l1=new JLabel();
		l1.setBounds(5,330,200,20);
		l1.setText("Designed & Developed By:-");
		l2=new JLabel();
		l2.setBounds(5,350,230,20);
		l2.setText("Navneet Singh(ALL RIGHT RESERVED)");
		tf1=new JTextField();
		tf1.setBounds(5,5,215,30);
		b9=new JButton("9");
		b9.setBounds(5,45,50,50);
		b6=new JButton("6");
		b6.setBounds(5,100,50,50);
		b3=new JButton("3");
		b3.setBounds(5,155,50,50);
		b8=new JButton("8");
		b8.setBounds(60,45,50,50);
		b5=new JButton("5");
		b5.setBounds(60,100,50,50);
		b2=new JButton("2");
		b2.setBounds(60,155,50,50);
		b0=new JButton("0");
		b0.setBounds(60,210,50,50);
		b7=new JButton("7");
		b7.setBounds(115,45,50,50);
		b4=new JButton("4");
		b4.setBounds(115,100,50,50);
		b1=new JButton("1");
		b1.setBounds(115,155,50,50);
		bdec=new JButton(".");
		bdec.setBounds(5,210,50,50);
		bres=new JButton("=");
		bres.setBounds(115,210,50,50);
		badd=new JButton("+");
		badd.setBounds(170,45,50,50);
		bsub=new JButton("-");
		bsub.setBounds(170,100,50,50);
		bmul=new JButton("*");
		bmul.setBounds(170,155,50,50);
		bdiv=new JButton("/");
		bdiv.setBounds(170,210,50,50);
		bdel=new JButton("DELETE");
		bdel.setBounds(5,265,105,50);
		bclr=new JButton("CLEAR ALL");
		bclr.setBounds(115,265,105,50);

		add(badd);add(bsub);add(bmul);add(bdiv);
		add(bclr);add(bdel);add(l1);add(l2);
		add(b1);add(b2);add(b3);
		add(b4);add(b5);add(b6);
		add(b7);add(b8);add(b9);
		add(tf1);add(b0);add(bdec);add(bres);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bres.addActionListener(this);
		bclr.addActionListener(this);
		bdel.addActionListener(this);	
		bdec.addActionListener(this);	

		setTitle("Calculator");
		setSize(245,410);
		setLayout(null);
		setVisible(true);
		setResizable(false);

	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b0)
		{
			String t1=tf1.getText();
			tf1.setText(t1+0);
		}
		if(e.getSource()==b1)
		{
			String t2=tf1.getText();
			tf1.setText(t2+1);
		}
		if(e.getSource()==b2)
		{
			String t3=tf1.getText();
			tf1.setText(t3+2);
		}
		if(e.getSource()==b3)
		{
			String t4=tf1.getText();
			tf1.setText(t4+3);
		}
		if(e.getSource()==b4)
		{
			String t5=tf1.getText();
			tf1.setText(t5+4);
		}
		if(e.getSource()==b5)
		{
			String t6=tf1.getText();
			tf1.setText(t6+5);
		}
		if(e.getSource()==b6)
		{
			String t7=tf1.getText();
			tf1.setText(t7+6);
		}
		if(e.getSource()==b7)
		{
			String t8=tf1.getText();
			tf1.setText(t8+7);
		}
		if(e.getSource()==b8)
		{
			String t9=tf1.getText();
			tf1.setText(t9+8);
		}
		if(e.getSource()==b9)
		{
			String t10=tf1.getText();
			tf1.setText(t10+9);
		}
		if(e.getSource()==bdec)
		{
			String t11=tf1.getText();
			tf1.setText(t11+".");
		}
		if(e.getSource()==badd)
		{
			num1=tf1.getText();
			op="+";;
			tf1.setText("");
		}
		if(e.getSource()==bsub)
		{
			num1=tf1.getText();
			op="-";
			tf1.setText("");
		}
		if(e.getSource()==bdiv)
		{
			num1=tf1.getText();
			op="/";
			tf1.setText("");
		}
		if(e.getSource()==bmul)
		{
			num1=tf1.getText();
			op="*";
			tf1.setText("");
		}
		if(e.getSource()==bdel)
		{
			tf1.setText(tf1.getText().substring(0, tf1.getText().length() - 1));
		}
		if(e.getSource()==bclr)
		{
			tf1.setText("");
		}
		if(e.getSource()==bres)
		{
			double x=Double.parseDouble(num1);
			double y=Double.parseDouble(tf1.getText());
			double z=0.0;
			if(op.equals("+")){z=x+y;}
			if(op.equals("-")){z=x-y;}
			if(op.equals("/")){z=x/y;}
			if(op.equals("*")){z=x*y;}
			tf1.setText(""+z);
		}
	}
	public static void main(String args[])
	{
		new Calculator();
	}
}