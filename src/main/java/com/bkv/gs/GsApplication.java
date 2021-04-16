package com.bkv.gs;

import com.bkv.gs.ctlr.GreetingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@Import({ GreetingController.class })
public class GsApplication extends SpringBootServletInitializer implements ApplicationRunner{
	private static final Logger LOG = LoggerFactory.getLogger(GsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(GsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOG.info("Hello from GsApplication");
		//String contxtPath = System.getProperty("server.servlet.context-path");
		System.setProperty("server.servlet.context-path", "/");
		String contxtPath = System.getProperty("server.servlet.context-path");
		LOG.info("contxtPath: "+contxtPath);
	}
}
