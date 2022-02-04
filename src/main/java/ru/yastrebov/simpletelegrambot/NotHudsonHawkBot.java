package ru.yastrebov.simpletelegrambot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class NotHudsonHawkBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set answer-message variables
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            SendMessage message = new SendMessage(); // Create an answer-message
            message.setChatId(String.valueOf(chatId));
            message.setText(messageText);
            try {
                execute(message); // Sending our answer-message to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "nothudsonhawk_bot";
    }

    @Override
    public String getBotToken() {
        return "5214960826:AAFIv8mgFB84zq200V8GEqyccR2oahGUGmM";
    }
}
