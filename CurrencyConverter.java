import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CurrencyConverter extends Applet implements ActionListener
{	
	double tot;
	int amount;
	Choice li1 = new Choice();
	Choice li2 = new Choice();
	TextField t1 = new TextField(10);
	TextField t2 = new TextField(10);
	Label l1 = new Label("Currency Converter");
	Label l2 = new Label("Enter Amount");
	Label l3 = new Label("Select 1st Country");
	Label l4 = new Label("Select 2nd Country");
	Button b = new Button("Convert");
	public void init()
	{
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		li1.addItem("INR");
		li1.addItem("USD");
		li1.addItem("EUR");
		add(li1);
		add(l4);
		li2.addItem("INR");
		li2.addItem("USD");
		li2.addItem("EUR");
		add(li2);
		add(b);
		b.addActionListener(this);
		add(t2);
		t2.setEditable(false);
	}
	public void paint(Graphics g)
	{
		l1.setBounds(100,0,120,30);
		l2.setBounds(10,30,120,30);
		t1.setBounds(150,30,100,25);
		l3.setBounds(10,70,120,30);
		li1.setBounds(150,70,100,30);
		l4.setBounds(10,110,120,30);
		li2.setBounds(150,110,100,30);
		b.setBounds(100,150,100,30);
		t2.setBounds(100,190,100,30);
		
	}
	public void actionPerformed(ActionEvent e)
	{	
		amount = Integer.parseInt(t1.getText());
		if(li1.getSelectedItem() == "INR" && li2.getSelectedItem() == "USD")
		{
			tot = (amount * 0.012);
			t2.setText("Dollar "+(tot));
		}
		
		else if(li1.getSelectedItem() == "INR" && li2.getSelectedItem() == "EUR")
		{
			tot = (amount * 0.011);
			t2.setText("Euro "+(tot));
		}
		else if(li1.getSelectedItem() == "USD" && li2.getSelectedItem() == "INR")
		{
			tot = (amount * 82.71);
			t2.setText("INR "+(tot));
		}
		else if(li1.getSelectedItem() == "USD" && li2.getSelectedItem() == "EUR")
		{
			tot = (amount * 0.94);
			t2.setText("Euro "+(tot));
		}
		else if(li1.getSelectedItem() == "EUR" && li2.getSelectedItem() == "INR")
		{
			tot = (amount * 87.73);
			t2.setText("INR "+(tot));
		}
		else if(li1.getSelectedItem() == "EUR" && li2.getSelectedItem() == "USD")
		{
			tot = (amount * 1.06);
			t2.setText("Dollar "+(tot));
		}
	}
}

/*
<html>
<applet code="CurrencyConverter.class" width="300" height="300"></applet>
</html>
*/