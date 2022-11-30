package normal.runnable.modle.one;

public class Demo1 implements Runnable
{
	public void run()
	{
		for(int i =0;i<=10;i++)
		{
			try {
				System.out.println(i);
				Thread.sleep(1000);
			}
			catch(InterruptedException arg)
			{
				arg.printStackTrace();
			}
			
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo1();
		Thread t1 = new Thread(d1);
		t1.start();
		
		
	
		
	}

}
