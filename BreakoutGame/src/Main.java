import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		obj.setLayout(null);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Gameplay gamePlay = new Gameplay();
		obj.setContentPane(gamePlay);
		obj.setTitle("The Breakout");
		obj.setResizable(true);
		obj.pack();
		obj.setVisible(true);
		
		//*�߰��� �׸� �����
		
		
				MakeSound test = new MakeSound(); 

		        while(true) { 

		               try { 

		                  test.abc(); 
		                     Thread.sleep(10500); // 10.5�ʿ� �ѹ��� ����ϵ��� ���� 
		                     } catch(Exception e) {
		                    	 
		                    	 
		                     }
		               }
		        
		        }
}

		
	

