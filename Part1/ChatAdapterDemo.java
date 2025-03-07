package Part2;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatSerivece legacyChatSerivece = new LegacyChatSerivece();
        legacyChatSerivece.legacySendMessage("Hello World");

        AdapterChatService adapterChatService = new AdapterChatService();
        adapterChatService.legacySendMessage("Hello World");

    }
}
