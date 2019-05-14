package thread_util;

public class OddNumbers extends Thread {
	private int first;
	private int last;
	
	public OddNumbers(int first, int last, String threadName) {
		super(threadName);
		this.first = first;
		this.last = last;
		start();
	}

	@Override
	public void run() {
		for(int i=first;i<=last;i++) {
			if(i%2 != 0) {
				System.out.print(Thread.currentThread().getName()+" "+i+"\t");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
