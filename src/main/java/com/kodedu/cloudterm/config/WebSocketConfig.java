package com.kodedu.cloudterm.config;

import com.kodedu.cloudterm.websocket.TerminalSocket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.PerConnectionWebSocketHandler;

import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;


@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry
                .addHandler(terminalSocket(), "/terminal").setAllowedOrigins("*");;
    }

    @Bean
    public WebSocketHandler terminalSocket() {
        WebSocketHandler webSocketHandler = new PerConnectionWebSocketHandler(TerminalSocket.class);
        return webSocketHandler;
    }
	
    //@Bean
    //public ServletServerContainerFactoryBean createWebSocketContainer() {
    //    ServletServerContainerFactoryBean container = new ServletServerContainerFactoryBean();
    //    container.setMaxSessionIdleTimeout(300000L); // Set timeout in milliseconds (300 seconds)
    //    return container;
    //}	
}
