package com.example.demo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;
@Component
public class ChannelValidationService {
	
	public boolean validateChannel(String channelname) {
		String channelnameLowerCase = channelname.toLowerCase();
		Set<String> channelNames = new HashSet<String>();
		channelNames.add("franchise");
		channelNames.add("offline");
		
		channelNames.add("online");
		
		if (channelNames.contains(channelnameLowerCase))
			return true;
		else
			return false;
	}


}
