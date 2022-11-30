package com.digdes.crp.javacoretasks.chapter5;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise13 {

    private static final Logger LOGGER = initFilteredLogger();

    public static void main(String[] args) {
        try {
            String text = Files.lines(Paths.get("src/main/resources/textFiles/5.13.txt"), StandardCharsets.UTF_8)
                    .peek(LOGGER::info)
                    .collect(Collectors.joining("\n"));
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Logger initFilteredLogger() {
        Logger logger = Logger.getLogger(Exercise13.class.getName());
        logger.setUseParentHandlers(false);
        logger.addHandler(new ConsoleHandler());
        logger.setFilter(record -> Stream.of("sex", "drugs", "C++")
                .anyMatch(w -> record.getMessage().toLowerCase().contains(w.toLowerCase())));
        return logger;
    }
}