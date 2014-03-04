modular-webapp
==============

A Modular Servlet 3 web app, with two JARs connected by Spring Messaging

This project was just a test to see if I could create an XML-free modular webapp using Spring 4's JavaConfig.  I wanted
to write two different submodules for the app that each contained a Spring context that would independently bootstrap
and compose to make a webapp of two independent modules.

The two JARs, though indedendent projects, can talk to each other through the new messaging packages included in Spring 4.

I learned that both JARs can't create a root web application context, Spring got mad at me. So now each JAR only creates
a dispatcher servlet context, and the containing WAR app creates the root context.  The root context creates a Channel
that the two JARs can talk to each other through by sending Messages.

Another thing to be careful of is to be sure the two JARs have different paths under META-INF/resources so that their
JSPs don't clobber each other.
