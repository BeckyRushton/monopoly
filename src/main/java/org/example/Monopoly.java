package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Monopoly {
    public void Monopoly() {

    }

    public void startGame() {
        System.out.println("Monopoly!");
        System.out.println("Press enter to begin...");

    }

    public void createCard() {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read JSON file and convert it to a Java object
            Card card = objectMapper.readValue(
                    new File("src/main/java/org/example/monopoly.json"),
                    Card.class
            );

            // Now you can work with the person object
            System.out.println("Name: " + card.getName());
            System.out.println("Age: " + card.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
