import javax.swing.JOptionPane;

public class Week8Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		
		int birthDate;
		
		int currentYear = 2015;
		
		int age;
		
		name = JOptionPane.showInputDialog("What is your name?");
		
		birthDate = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your birthdate?"));
		
		age = currentYear - birthDate;
		
		JOptionPane.showMessageDialog(null, String.format("Hello, %s, you're %s today!", name, age));
		
		if(age < 21){
		JOptionPane.showMessageDialog(null, "You are not legally allowed to drink.");}
		
		else{
			JOptionPane.showMessageDialog(null, "You are legally allowed to drink.");}

	}

}