package root;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ExecutorSubscribableChannel;

@Configuration
public class RootApp
{
	@Bean
	public String rootMessage()
	{
		return "whattup?";
	}
	
	@Bean
	public MessageChannel interappChannel()
	{
		return new ExecutorSubscribableChannel(executor());
	}
	
	@Bean
	public Executor executor()
	{
		return Executors.newFixedThreadPool(5);
	}
}
