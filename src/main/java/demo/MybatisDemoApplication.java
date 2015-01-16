package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.domain.User;
import demo.persistence.UserMapper;
import demo.service.MessageService;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class MybatisDemoApplication implements CommandLineRunner {
	@Autowired
	private MessageService helloWorldService;

    @Autowired
    private UserMapper userMapper;
    
    public static void main(String[] args) {
        SpringApplication.run(MybatisDemoApplication.class, args);
    }

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.helloWorldService.getMessage());
        System.out.println("Adding User");
        int userId = userMapper.addUser(new User("dude@dude.com", "thedude"));
        System.out.println("Getting User");
        User user = userMapper.getUser(userId);
        System.out.println("Got User: " + user.getUserName());
	}
}
