package MySeleniumSessionsClasses.MySeleniumSessionsClasses;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Ignore;
import MySeleniumSessionsClasses.MySeleniumSessionsClasses.selenium.GoogleUtils;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Ignore
    @Test
    public void casoDePruebaTitleHP()
    {
    	GoogleUtils google = new GoogleUtils();
    	String title=google.getTitle();
        assertTrue(title.equals("Google"));
        
    }
        @Ignore
    @Test
    public void casoDePruebaUrlSearch(){
    	
    	GoogleUtils google = new GoogleUtils();
    	String url=google.getUrlSearch();
        assertFalse(url.equals("https://www.google.com/search?q=webdriver&sxsrf=AOaemvLdMmb1F4mN_aUY8YqVZJP61zmU7g%3A1638849166636&source=hp&ei=jtquYZ38Io-iqtsPzfu0uAg&iflsig=ALs-wAMAAAAAYa7onoVLumYhexCV2bk-P9PMVkP9Amkv&ved=0ahUKEwid-6fz5ND0AhUPkWoFHc09DYcQ4dUDCAc&uact=5&oq=webdriver&gs_lcp=Cgdnd3Mtd2l6EAMyBwgAELEDEEMyCggAEIAEEIcCEBQyCggAEIAEEIcCEBQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgcIIxDqAhAnUG9Yb2DSCGgBcAB4AIABe4gBe5IBAzAuMZgBAKABAqABAbABCg&sclient=gws-wiz"));
    }
        @Ignore
    @Test
    public void casoDePruebaBarraDeBusqueda() {
    	GoogleUtils google = new GoogleUtils();
    	assertTrue(google.isQueryBarBlank());
    	
    }
        @Ignore
    @Test
    public void casoDePruebaCalculadoraWebHP() {
    	GoogleUtils google = new GoogleUtils();
    	
    	
    	assertTrue(google.calculate("1","3").equals("4"));
    	assertTrue(google.calculate("2","3").equals("5"));
    	assertTrue(google.calculate("3","3").equals("6"));
    	
    }
        @Ignore
    @Test
    public void casoDePruebaCalculadoraWebUP() {
    	GoogleUtils google = new GoogleUtils();
    	
    	
    	assertFalse(google.calculate("2","3").equals("1"));
    	assertFalse(google.calculate("2","3").equals("0"));
    	assertFalse(google.calculate("4","3").equals("-500"));
    	
    }
    
    
    

}
