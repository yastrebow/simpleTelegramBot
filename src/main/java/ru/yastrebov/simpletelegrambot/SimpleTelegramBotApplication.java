package ru.yastrebov.simpletelegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class SimpleTelegramBotApplication {

    public static void main(String[] args) {

        // Register our bot
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new NotHudsonHawkBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


    }

}
