import java. swing.";
import java awt.*
import java awt.event.Action Event;
import java awt.event.ActionListener;
public class Division App extends JFrame {
private Jtextfield num1Field, num2Field, resultField;
private JButton divideButton;
public DivisionApp(){
setTitle ("Integer Division App");
 setLayout (new FlowLayout ()); 
setSize (300, 200);
setDefaultCloseOperation (JFrame. EXIT_ON_CLOSE); JLabel num1Label1
= new JLabel ("Num 1:");
num1Field= new JTextfield (10);

JLabel num2Label = new JLabel ("Num 2: "); 
num2Field = new JTextfield (10); 
JLabel resultLabel = new JLabel ("Result: "); resultField = new JTextField (10);
 resultField.setEditable(false);
divideButton = new JButton ("Divide");
add (num1Label);
 add (num1Field);
 add (num2Label); 
add (num2Field);
add (divideButton); 
add (resultLabel);
 add (resultfield);
divide Button.addActionListener (new ActionListener (){
@Override
public void action Performed (ActionEvent e) {
try {

int num! = Integer. parseInt (num1Field.get Text ()); 
int num2 = Integer, parseInt(num2Field, getText()); 
int result = num1/num2;
resultField.setText(String. value of (result));
catch (NumberFormatException ex) {
JOptionPane.showMessageDialog (DivisionApp. this, "Please enter valid integers.", "Input Error", JOptionPane. ERROR_MESSAGE);
}
catch (ArithmeticException ex) {
JOption.showMessageDialog (DivisionApp. this "Division by zero is not allowed.", "Arithmetic Error", "JOptionPane. ERROR_ MESSAGE);
}
}
});
}
public static void main(String[] args) { 
Swing Utilities. invokeLater (new Runnable () {
@Override
public void run(){
new Division App ().setVisible(true);
}
});
}
}
