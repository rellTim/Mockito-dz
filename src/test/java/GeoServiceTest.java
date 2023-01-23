import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.entity.Country;
import ru.netology.i18n.entity.Location;

public class GeoServiceTest {
    @Test
    void test_geo_service_impl() { // Проверить работу метода public Location byIp(String ip)

        Location expected = new Location("Moscow", Country.RUSSIA, null, 0);
        GeoServiceImpl geoServiceImpl = new GeoServiceImpl();

        Location preferences = geoServiceImpl.byIp("172.");

        Assertions.assertEquals(expected, preferences);
    }
}
