package direct.runnable.two;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		Runnable runnable = new Runnable() {
			public void run()
			{
			for(int i =0;i<=10;i++)
			{
				System.out.println(i);
			}
		}
			};
			
			Thread t1 = new Thread(runnable);
			t1.start();
			
	}

}
