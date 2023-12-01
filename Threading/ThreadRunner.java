import java.lang.*;

class Task1 extends Thread{
	public void run() {
		System.out.print("\n task1 initiated\n ");
		for( int i=1; i<=10; i++){
			System.out.print(i+" ");
		}
		
		// Thread.sleep(1000);
		
		//Thread.yield();
		
		System.out.print("\n task1 done\n ");
	}
}

class Task2 implements Runnable{
	public void run(){
		System.out.print("\n task2 initiated\n ");
		for( int i=11; i<=20; i++){
			System.out.print(i+" ");
		}
		System.out.print("\n task2 done\n ");
	}
}


class ThreadRunner{
	public static void main(String args[]) throws InterruptedException
	{
		
		//task1 with normal extending Thread class
		Task1 task1 = new Task1();
		
		//priority is just requesting to put priority gor the task in thread.
		task1.setPriority(10);
		task1.start();
		
		//task2 with implementing Runnable interface
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.start();
		
		// wait for task1 to complete. For join requires exception in main class
		task1.join();
		
		System.out.print("\n task3 initiated\n ");
		for( int i=21; i<=30; i++){
			System.out.print(i+" ");
		}
		System.out.print("\n task3 done\n ");
		System.out.println("Main Method done");
		
	}
}
