package chatbotProject;

public class ChatbotRemington implements Topic{
	
	private String[] keywords;
	private String[] goodbyeWords;
	private String secretWord;
	
	public ChatbotRemington() {
		String[] temp = {"food", "entertainment", "Internet", "video games"};
		keywords = temp;
		String[] temp2 {"bye", "goodbye", "stop"};
		goodbyeWords = temp2;
		secretWord = "pug";
		
	}
	
	public boolean isTriggered(String response) {
		for(int i = 0; i < keywords.length; i++) {
			if (ChatbotMain.findKeyword(response,  keywords[i], 0) >= 0 ) {
				return true;
			}
		}	return false;
	}
	public void startChatting(String response) {
		ChatbotMain.print("Hey! It sounds like you and I have a common interest! Let's talk some more!");
		chatting = true;
		while(chatting) {
			response = ChatbotMain.getInput();
			if(ChatbotMain.findKeyword(response, goodbyeWords, 0) >= 0) {
				chatting = false;
				ChatbotMain.chatbot.startTalking();
			} else if(ChatbotMain.findKeyword(response, secretWord, 0) >= 0) {
				ChatbotMain.print("Oh my goodness! You guessed my favorite thing ever. We are friends now.");	
			}else {
				ChatbotMain.print("Huh. I don't really get you. Tell me something else?");
			}
		}
	}
}