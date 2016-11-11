package test.soap.sample;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by pshynin on 11/9/16.
 */
public class GeoIpServiceTests {

  @Test
  public void testMyIp()  {
    //получаем по последниму Soap12 и помещаем в локальную переменную
    GeoIP geoIP = new GeoIPService().getGeoIPServiceSoap12().getGeoIP("194.28.29.152");
    assertEquals(geoIP.getCountryCode(), "RUS");
  }

  @Test
  public void testInvalidIp()  {
    //получаем по последниму Soap12 и помещаем в локальную переменную
    GeoIP geoIP = new GeoIPService().getGeoIPServiceSoap12().getGeoIP("194.28.29.xxx");
    assertEquals(geoIP.getCountryCode(), "RUS");
  }
}
