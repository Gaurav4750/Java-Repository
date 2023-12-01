import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{

	private String name;

	public CallableTask(String name){
		this.name = name;
	}

	public String call() throws Exception{
		//Thread.sleep(1000);
		return "Hello " + name;
	}
}


class MultipleCallableRunner{
	public static void main(String args[]) throws ExecutionException, InterruptedException {
		
		ExecutorService executorServiceMulti = Executors.newFixedThreadPool(2);
		
		List<CallableTask> tasks = List.of(new CallableTask("Gaurav"), new CallableTask("Rohit"), new CallableTask("Raja"));
		
		//Multiple invoke in Callable interface.
		List<Future<String>> results = executorServiceMulti.invokeAll(tasks);
		
		for(Future<String> result : results){
			System.out.println(result.get());
		}

		//Any invoke in Callable interface.
		String resultAny = executorServiceMulti.invokeAny(tasks);

		System.out.println(resultAny);

		
		executorServiceMulti.shutdown();
	}
}