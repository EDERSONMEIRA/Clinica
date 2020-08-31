package Testes;

import Interacao.LoginInteracao;
import Utils.BaseTeste;
import Utils.DriverFactory;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginTeste extends BaseTeste {
    private LoginInteracao login = PageFactory.initElements(DriverFactory.getDriver(), LoginInteracao.class);


    @Before
    public void configurar() {
        DriverFactory.getDriver().get("localhost/");
    }

    @Test
    public void loginSucesso(){
        login.preencherCampoNome("admin");
        login.preencherCampoSenha("1234");
        login.clicarBotaoLogar();
    }


}
