package me.nathan;

import me.nathan.commands.GreatLeader;
import me.nathan.commands.NoOwners;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class OURMain {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        builder.setToken(Auth.distToken);
        builder.addEventListeners(new NoOwners());
        builder.addEventListeners(new GreatLeader());
        builder.build();
    }
}
