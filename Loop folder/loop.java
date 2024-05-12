public class loop{
	public static void main(String[] args){
		
		int sum = 170;
		for (int i = 1; i<60; i++){
			sum = sum+130;
			System.out.println("buy"+i+" = new JButton();");
			System.out.println("buy"+i+".setBounds(20,"+sum+",960,110);");
			System.out.println("buy"+i+".setBackground(null);");
			System.out.println("buy"+i+".setBorderPainted(false);");
			System.out.println("buy"+i+".addActionListener(this);");
			System.out.println("mainPanel.add(buy"+i+");");
			System.out.println(" ");
			System.out.println("game"+i+" = new JPanel();"+"\n"+ "game"+i+".setLayout(null);"+"\n"+"game"+i+".setBackground(new Color(34,57,75));"+"\n"+"game"+i+".setBounds(50,0,990,110);"+"\n"+"buy"+i+".add(game"+i+");");
			System.out.println(" ");
			System.out.println("img"+i+" = new ImageIcon();"+"\n"+"imgLabel"+i+" = new JLabel(img"+i+");"+"\n"+"imgLabel"+i+".setBounds(-45,0, 340, 130);"+"\n"+"game"+i+".add(imgLabel"+i+");");
			System.out.println(" ");
			System.out.println("//----------------------------------------------------------------------------------------------------");
			System.out.println(" ");

		}
		for (int i = 1; i<55; i++){
			System.out.print("buy"+i+",");
		}
		
	}
}


