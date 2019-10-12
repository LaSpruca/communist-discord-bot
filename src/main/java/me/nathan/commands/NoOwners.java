package me.nathan.commands;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

import java.io.File;

public class NoOwners extends ListenerAdapter {
    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        MessageChannel chanel = event.getMessage().getChannel();
        if (event.getMessage().getContentDisplay().toLowerCase().contains("this is my server") || event.getMessage().getContentDisplay().toLowerCase().contains("i own this server")){
            chanel.sendMessage( "<@" + event.getMessage().getAuthor().getId() + "> This is not YOUR server it is OUR server").queue();
            File yes = new File("./Yes.jpg");
            chanel.sendFile(yes).queue();
        }
    }
}
