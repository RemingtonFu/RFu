package chatbotProject;

public class Chatbot {
	
	private String userName;
	private Topic remington;
	private boolean chatting;
	
	public Chatbot() {
		remington = new ChatbotRemington();
		userName = "unknown user";
		chatting = true;
	}
	
	public void startTalking() {
		ChatbotMain.print("Welcome to our chatbot! What is your name?");
		userName = ChatbotMain.getInput();
		while(chatting) {
			ChatbotMain.print("What do you want to talk about?");
			String response = ChatbotMain.getInput();
			if(remington.isTriggered(response)) {
				chatting = false;
				remington.startChatting();
			}else {
				ChatbotMain.print("I'm sorry. I don't understand.");
			}
		}
	}
}
