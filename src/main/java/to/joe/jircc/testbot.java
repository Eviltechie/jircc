package to.joe.jircc;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;

public class testbot extends ListenerAdapter<PircBotX> {
    
    public void onMessage(MessageEvent<PircBotX> event) throws Exception {
        event.respond("hi");
    }
    
    public static void main(String[] args) throws Exception {
        PircBotX bot = new PircBotX();
        bot.setName("evilbot");
        bot.connect("irc.gamesurge.net");
        bot.joinChannel("#eviltechie");
    }
}
