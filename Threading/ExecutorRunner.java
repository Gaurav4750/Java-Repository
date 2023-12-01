import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task extends Thread{
	private int number;
	
	public Task(int number){
		this.number = number;
	}
	
	public void run(){
		System.out.print("\n task"+number+" initiated\n ");
		for( int i= number * 10; i<=number*10 + 9; i++){
			System.out.print(i+" ");
		}
		System.out.print("\n task"+number+" done\n ");
	}
}

class ExecutorRunner{
	public static void main(String args[]) throws InterruptedException{
		
		//single thread will execute one task at a time.
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		// executorService.execute(new Task1());
		// executorService.execute(new Thread(new Task2()));
		
		// executorService.shutdown();	
		
		//for multi execution of thread number of time we specify.
		ExecutorService executorServiceMulti = Executors.newFixedThreadPool(2);
		executorServiceMulti.execute(new Task(1));
		executorServiceMulti.execute(new Task(2));
		executorServiceMulti.execute(new Task(3));
		executorServiceMulti.execute(new Task(4));
		executorServiceMulti.execute(new Task(5));
		
		executorServiceMulti.shutdown();
	}
}
