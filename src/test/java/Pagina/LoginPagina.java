package Pagina;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagina {
    @FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[1]")
    protected WebElement campoNome;

    @FindBy(xpath ="(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[2]")
    protected WebElement campoSenha;

    @FindBy(tagName = "button")
    protected WebElement botaoLogar;

    @FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text CTAPrimaryButton marginRemove\"]/span[@class=\"MuiTouchRipple-root\"]")
    protected WebElement botaoNovoCadastro;
}
