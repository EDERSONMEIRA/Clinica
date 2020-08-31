package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static Utils.Propriedades.senha;
import static Utils.Propriedades.usuario;

public class BaseTeste {
    @After
    public void finalizar(){
        DriverFactory.killDriver();
    }

    @BeforeClass
    public static void inicializar() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    public static void efetuarLogin(){
        DriverFactory.getDriver().findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[1]")).sendKeys(usuario);
        DriverFactory.getDriver().findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[2]")).sendKeys(senha);
        DriverFactory.getDriver().findElement(By.tagName("button")).click();
    }

    public void esperar(int segundos){
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
    }
}
