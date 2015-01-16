package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import demo.MyApplicationSettings;

@Component
@Profile({"hello", "default"})
public class HelloWorldService implements MessageService {
	@Autowired
	private MyApplicationSettings settings;
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello " + settings.getName();
	}

}
