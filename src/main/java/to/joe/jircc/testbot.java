package to.joe.jircc;

import org.pircbotx.PircBotX;

public class testbot {
    public static void main(String[] args) throws Exception {
        PircBotX bot = new PircBotX();
        bot.setName("evilbot");
        bot.connect("irc.gamesurge.net");
        bot.joinChannel("#eviltechie");
    }
}
