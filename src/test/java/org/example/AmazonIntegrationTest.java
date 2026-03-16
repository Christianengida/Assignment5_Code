package org.example;

import java.util.List;

import org.example.Amazon.Amazon;
import org.example.Amazon.Cost.DeliveryPrice;
import org.example.Amazon.Cost.ExtraCostForElectronics;
import org.example.Amazon.Cost.ItemType;
import org.example.Amazon.Cost.PriceRule;
import org.example.Amazon.Cost.RegularCost;
import org.example.Amazon.Database;
import org.example.Amazon.Item;
import org.example.Amazon.ShoppingCartAdaptor;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AmazonIntegrationTest {

    private Database db;
    private ShoppingCartAdaptor cart;
    private Amazon amazon;

    @BeforeEach
    void setUp() {
        db = new Database();
        db.resetDatabase();
        cart = new ShoppingCartAdaptor(db);

        List<PriceRule> rules = List.of(
                new RegularCost(),
                new DeliveryPrice(),
                new ExtraCostForElectronics()
        );

        amazon = new Amazon(cart, rules);
    }

    @Test
    @DisplayName("specification-based")
    void fullSystemCalculationWorks() {
        amazon.addToCart(new Item(ItemType.OTHER, "Book", 2, 10.0));

        double result = amazon.calculate();

        assertEquals(25.0, result);
    }

    @Test
    @DisplayName("structural-based")
    void electronicsFeeIsApplied() {
        amazon.addToCart(new Item(ItemType.ELECTRONIC, "Laptop", 1, 1000.0));

        double result = amazon.calculate();

        assertEquals(1012.5, result);
    }
}
