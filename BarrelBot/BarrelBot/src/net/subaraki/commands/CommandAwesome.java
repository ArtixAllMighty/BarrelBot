package net.subaraki.commands;

import org.pircbotx.hooks.events.MessageEvent;

@SuppressWarnings("rawtypes")
public class CommandAwesome implements Commands<MessageEvent> {

	@Override
	public void exe(MessageEvent event) throws Exception {
		String s = "You are ! :D";
		
		if(event.getUser().getRealName().equalsIgnoreCase("jake")){
			s = "You are Jake ! :D Such awesome. Much wow. very barrel !";
		}
		event.getChannel().send().message(s);
	}

	@Override
	public void secondairyExe(MessageEvent event) throws Exception {
	}
	
	@Override
	public String getAlias() {
		
		return " who's awesome?";
	}

}
