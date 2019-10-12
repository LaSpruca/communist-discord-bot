package me.nathan;

import me.nathan.commands.GreatLeader;
import me.nathan.commands.NoOwners;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class OURMain {
    private static final String token = "NTk2MTAwMDQ0ODIyOTM3NjMw.XaFq7Q.6ezQ_Yr6wVpdsXttbRadSxJbOo8";
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        builder.setToken(token);
        builder.addEventListeners(new NoOwners());
        builder.addEventListeners(new GreatLeader());
        builder.build();
    }
}
