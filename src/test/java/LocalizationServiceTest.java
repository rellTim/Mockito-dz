import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.i18n.LocalizationServiceImpl;
import ru.netology.i18n.entity.Country;

public class LocalizationServiceTest {
    @Test
    void test_localization_service_impl() { // Проверить работу метода public String locale(Country country)
        String expected = "Добро пожаловать";
        LocalizationServiceImpl localizationService1 = new LocalizationServiceImpl();

        String preferences = localizationService1.locale(Country.RUSSIA);

        Assertions.assertEquals(expected, preferences);
    }
}
