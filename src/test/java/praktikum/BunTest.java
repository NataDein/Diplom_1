package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)

public class BunTest {
    private final String bunsName;
    private final float price;

    public BunTest (String bunsName, float bunsPrice) {
       this.bunsName = bunsName;
       this.price = bunsPrice;
   }

   @Parameterized.Parameters
   public static Object[][] getBuns() {
       return new Object[][] {
               {"black bun", 100},
               {"white bun", 200},
               {"red bun", 300},
       };
   }



   //Проверка получения имени булочки
    @Test
    public void checkGetName() {
        //Создаем булку
        Bun bun = new Bun(bunsName, price);

        //Проверяем, что при вызове getName получается верное название булочки
        assertEquals("Полученное название булки не совпадает с ожидаемым", bunsName, bun.getName());

    }

    //Проверка получения цены булочки
    @Test
    public void checkGetPrice() {
        // Максимальная разница сравнения цены при которой можно считать проверяемые цены равными
        float deltaForSimilarPrice = 0;

        //Создаем булку
        Bun bun = new Bun(bunsName, price);

        //Проверяем, что при вызове getPrice получается верная стоимость булочки
        assertEquals(
            "Полученная цена булочки не совпадает с ожидаемой",
            price,
            bun.getPrice(),
            deltaForSimilarPrice
        );
    }
}