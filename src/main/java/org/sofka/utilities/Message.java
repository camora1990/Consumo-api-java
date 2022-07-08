package org.sofka.utilities;

import org.jboss.logging.Logger;

public class Message {
    private static final Logger LOGGER = Logger.getLogger(Message.class);
    private static Message instance = null;

    public static Message getInstance() {
        if (instance != null) {
            return instance;
        } else {
            instance = new Message();
        }
        return instance;
    }

    public void showTitle(String message){
        LOGGER.info(message);
    }

    public void printResponse(String body){
        LOGGER.info("Gifis");
        LOGGER.info(body);
    }

}
