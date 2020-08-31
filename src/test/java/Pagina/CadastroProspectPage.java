package Pagina;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroProspectPage {
    @FindBy(xpath = "//button[. = \"Novo cadastro\"]/span/span")
    protected WebElement botaoNovoCadastro;

    @FindBy(xpath = "//span[. = \"Prospect\"]")
    protected WebElement novoProspect;

    @FindBy(xpath = "//input[contains(@class,'MuiInputBase-input MuiInput-input')]")
    protected WebElement campoNome;

    @FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[2]")
    protected WebElement campoTelefone;

    @FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[3]")
    protected WebElement campoEmail;

    @FindBy(xpath = "//label[text()='Data de Nascimento']/following::input")
    protected WebElement campoDataNascimento;

    @FindBy(xpath = "//label[text()='CPF']/following::input")
    protected WebElement campoCPF;

    @FindBy(xpath = "(//label[text()='CPF']/following::input)[3]")
    protected WebElement campoRadioMasculino;

    @FindBy(id = "Como conheceu a Haux")
    protected WebElement cboComoConheceuHaux;

    @FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[1]")
    protected WebElement campoNomeLogin;

    @FindBy(xpath ="(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[2]")
    protected WebElement campoSenha;

    @FindBy(tagName = "button")
    protected WebElement botaoLogar;

    @FindBy(xpath = "//div[contains(@class,'MuiGrid-root saveButton')]//button[1]")
    protected WebElement botaoSalvar;



}
