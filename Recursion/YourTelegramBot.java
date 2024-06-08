package Recursion;


import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class YourTelegramBot extends TelegramLongPollingBot {

    public static void main(String[] args) {
        YourTelegramBot bot = new YourTelegramBot();
        bot.run();
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            if (messageText.equals("/start")) {
                sendTextMessage(chatId, "Hi! I'm your song downloader bot. Send me the name or URL of the song you want to download.");
            } else if (messageText.startsWith("/download")) {
                // Process the download command and send the song
                // Implement the download logic here
            } else {
                sendTextMessage(chatId, "Sorry, I didn't understand that command.");
            }
        }
    }

    private void sendTextMessage(long chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "YourBotUsername";
    }

    @Override
    public String getBotToken() {
        return "YourBotToken";
    }
}

