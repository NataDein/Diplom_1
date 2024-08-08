package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IngredientTest {
    private final IngredientType type;
    private final String name;
    private final float price;

    public IngredientTest (IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getBuns() {
        return new Object[][] {
                {IngredientType.SAUCE, "hot sauce", 100 },
                {IngredientType.SAUCE, "sour cream", 200 },
                {IngredientType.SAUCE, "chili sauce", 300},

                {IngredientType.FILLING, "cutlet", 100},
                {IngredientType.FILLING, "dinosaur", 200},
                {IngredientType.FILLING, "sausage", 300},
        };
    }

    @Test
    public void checkGetPrice() {
        //Создаем ингредиент
        Ingredient ingredient = new Ingredient(type, name, price);
        //Проверяем, что полученная цена совпадает с ожидаемой
        assertEquals("Полученная цена ингредиента не совпадает с ожидаемой", price, ingredient.getPrice(),0);
    }

    @Test
    public void checkGetName() {
        //Создаем ингредиент
        Ingredient ingredient = new Ingredient(type, name, price);
        //Проверяем, что полученное название совпадает с ожидаемым
        assertEquals("Полученное название ингредиента не совпадает с ожидаемым", name, ingredient.getName());

    }


    @Test
    public void checkGetType() {
        //Создаем ингредиент
        Ingredient ingredient = new Ingredient(type, name, price);
        //Проверяем, что полученный тип ингредиента совпадает с ожидаемым
        assertEquals("Полученный тип ингредиента не совпадает с ожидаемым", type, ingredient.getType());

    }

}