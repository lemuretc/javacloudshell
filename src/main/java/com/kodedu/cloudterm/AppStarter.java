package com.kodedu.cloudterm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AppStarter extends SpringBootServletInitializer
{
    public static void main(String[] args) {

		System.out.println("KORE Starting application...");
        SpringApplication.run(AppStarter.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {


		try {
			System.out.println("KORE Starting Configure app ...");
			// This could be the main logic of your method
			return application.sources(AppStarter.class);

		} catch (Exception e) {
			System.out.println("KORE Starting Configure error ...");
			System.out.println(e);
			return null;

		} finally {
			System.out.println("KORE Manual main call application...");
			//AppStarter.main(new String[]{});
		}
		
    }
}