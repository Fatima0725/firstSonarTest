package com.groupeisi.webservices.web.controller;

import com.groupeisi.metier.DepotServices;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class WelcomeControllerTest {

    private WelcomeController welcomeController;
    //private DepotServices depotServices;
    @BeforeEach
    void setUp() {
        //depotServices = new DepotServices();
        welcomeController = new WelcomeController();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void welcome() {
        // Act: Appel de la méthode à tester
        String result = welcomeController.welcome();

        // Assert: Vérification des résultats
        assertNotNull(result);
        assertEquals("welcome", result);
    }

    @Test
    void index() {
        String result = welcomeController.index();

        // Assert: Vérification des résultats
        assertNotNull(result);
        assertEquals("index", result);
    }
}