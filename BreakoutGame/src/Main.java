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
		
		//*추가한 항목 ↓↓↓↓
		
		
				MakeSound test = new MakeSound(); 

		        while(true) { 

		               try { 

		                  test.abc(); 
		                     Thread.sleep(10500); // 10.5초에 한번씩 재생하도록 설정 
		                     } catch(Exception e) {
		                    	 
		                    	 
		                     }
		               }
		        
		        }
}

		
	

