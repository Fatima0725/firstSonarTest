package com.groupeisi.metier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepotServicesTest {

    private DepotServices depotServices;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        depotServices = new DepotServices();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void message() {
        assertEquals("Depot Service",depotServices.message());
    }
}