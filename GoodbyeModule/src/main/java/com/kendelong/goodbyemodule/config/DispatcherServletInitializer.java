package com.kendelong.goodbyemodule.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer
{
	

	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		//return new Class<?>[] { AppConfig.class };
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings()
	{
		return new String[] { "/goodbye/*" };
	}
	
	
	@Override
	protected String getServletName()
	{
		return "goodbye";
	}

}
