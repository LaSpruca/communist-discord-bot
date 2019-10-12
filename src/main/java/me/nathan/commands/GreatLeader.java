package me.nathan.commands;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GreatLeader extends ListenerAdapter {
    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        if(event.getMessage().getContentDisplay().toLowerCase().contains("who is the great leader") || event.getMessage().getContentDisplay().toLowerCase().contains("who is the leader")){
            MessageChannel channel = event.getChannel();
            channel.sendMessage("<@" + event.getGuild().getOwnerId() + "> is our great leader!").queue();
        }
    }
}
