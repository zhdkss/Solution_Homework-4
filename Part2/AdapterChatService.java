package Part2;

public class AdapterChatService extends LegacyChatSerivece implements ChatService {


    @Override
    public void sendMessage(String message) {
        legacySendMessage(message);
    }
}
