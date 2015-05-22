package callback;

public class MailReceiver {

	public void execute(Callback callBack) {

		System.out.println("I am going to post office");
		System.out.println("Opneed the mail box");
		System.out.println("Found the mail");
		System.out.println("Took out the mail");
		
		callBack.callMe();
		
		System.out.println("I am done calling the callback");
		System.out.println("close the mailbox");
		System.out.println("heading back home");
	}

}
