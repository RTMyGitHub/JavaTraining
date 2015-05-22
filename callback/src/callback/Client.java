package callback;

public class Client {

	public static void main(String[] args) {
		new Client().call();
	}

	public void call() {
		MailReceiver receiver = new MailReceiver();
		receiver.execute(new Callback() {
			
			@Override
			public void callMe() {
				System.out.println("I have been called");

				System.out
						.println("Since the mail has been given to me, I will go ahead and read the mail");
			}
			
		});
	}
	
	
}
