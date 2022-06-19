package com.example.personservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationEventListener {
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationEventListener.class);

    @EventListener
    public void onEvent(ApplicationEvent event) {
        LOG.info(event.toString());
    }
}
