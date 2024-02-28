package interview.question.programs;

class MyRunnableThread implements Runnable{
	@Override
	public void run(){
		System.out.println("MyThread is started");
	}
}

class MyRunnableThread2 implements Runnable{
	@Override
	public void run(){
		System.out.println("MyThread-2 is started");
	}
}

public class RunnableThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(new MyRunnableThread());
		t1.start();
		System.out.println("t1 is start");
		t1.join();
		System.out.println("t1 is end");
		
		Thread t2=new Thread(new MyRunnableThread2());
		t2.start();
		System.out.println("t2 is start");
		t2.join();
		System.out.println("t2 is end");
	}
}
