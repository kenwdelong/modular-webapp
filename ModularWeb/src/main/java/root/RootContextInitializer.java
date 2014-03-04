package root;

import org.springframework.web.context.AbstractContextLoaderInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class RootContextInitializer extends AbstractContextLoaderInitializer
{

	@Override
	protected WebApplicationContext createRootApplicationContext()
	{
		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
		annotationConfigWebApplicationContext.register(RootApp.class);
		return annotationConfigWebApplicationContext;
	}

}
