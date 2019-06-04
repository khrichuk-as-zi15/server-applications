package ex4_Flowers.interfaces;

import ex4_Flowers.enums.EFlowerCategory;
import ex4_Flowers.enums.EFlowerColor;

/**
 * Расширение интерфейса для реализации в классах цветок. Содержит дополнение в виде поля цена цветка
 */
public interface IFlowerForSale extends IFlower {
    // цена цветка
    float flowerCost = 0.00f;

    /**
     * Метод должен возвращать цену цветка
     * @return должен возвращать текстовое значение имени категории цветка
     */
    float getFlowerCost();

    /**
     * Метод должен устанавливать значение цены цветка
     * @param flowerCost содержит значение цены цветка
     */
    void setFlowerCost(float flowerCost);
}
