package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        System.out.println("Main started!");           // must show
        LOGGER.debug("START");
        displayCountry();
        LOGGER.debug("END");
        System.out.println("Main finished!");          // must show
    }

    public static void displayCountry() {
        System.out.println("displayCountry() called!");  // must show
        // code to load Spring context, get bean, and print
    }
}
