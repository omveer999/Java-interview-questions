package interview.question.programs;

class MyThread extends Thread{
	@Override
	
	public void run(){
		System.out.println("MyThread is started");
	}
}

class MyThread2 extends Thread{
	@Override
	
	public void run(){
		System.out.println("MyThread-2 is started");
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1=new MyThread();
		t1.start();
		System.out.println("t1 is start");
		t1.join();
		System.out.println("t1 is end");
		
		MyThread2 t2=new MyThread2();
		t2.start();
		System.out.println("t2 is start");
		t2.join();
		System.out.println("t2 is end");
	}
}
