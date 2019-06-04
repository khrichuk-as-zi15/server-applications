package ex4_Flowers;

import ex4_Flowers.classes.FlowersBasketsBouquetsFabric;
import static ex4_Flowers.Utils.ApplicationUtils.*;
import static ex4_Flowers.Utils.PropertiesFileUtils.*;

public class Main {
    /**
     * Метод запуска приложения
     * @param args параметр не обрабатывается при запуске приложения
     */
    public static void main(String[] args) {
        // загружаем автопараметры для запуска приложения в файл типа Properties
        savePropertiesStartupToFile("load.properties");

        // создадим фабрику объектов для работы приложения
        FlowersBasketsBouquetsFabric myFabric = createMyFabric();

        // демонстрация работы со списком объектов, содержащего корзины цветов
        workBasketsByMyFabric(myFabric);

        // демонстрация работы со списком объектов, содержащего букеты цветов
        workBouquetsByMyFabric(myFabric);

    }
}
