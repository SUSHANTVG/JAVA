package thread_utils;

public class OddNumbers implements Runnable {
	private int first;
	private int last;
	
	public OddNumbers(int first, int last) {
		this.first = first;
		this.last = last;
	}
	
	@Override
	public void run() {
		for(int i=first;i<=last;i++) {
			if(i%2 != 0) {
				System.out.print(Thread.currentThread().getName()+" "+i+"\t");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println("Error in "+Thread.currentThread().getName()+"\n"+e);
				}
			}
		}
	}

}
