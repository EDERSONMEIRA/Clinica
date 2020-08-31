package Pagina;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroClientePage {



    @FindBy(xpath = "//button[. = \"Novo cadastro\"]/span/span")
    protected WebElement botaoNovoCadastro;

    @FindBy(xpath = "//span[. = \"Cliente\"]")
    protected WebElement novoCliente;

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

    @FindBy(xpath = "(//label[text()='CPF']/following::input)[2]")
    protected WebElement campoRadioFeminino;

    @FindBy(id = "Como conheceu a Haux")
    protected WebElement cboComoConheceuHaux;

    @FindBy(id = "demo-simple-select")
    protected WebElement cboCliente;

    @FindBy(xpath = "//li[@data-value='At Home']")
    protected WebElement valorAtHome;

    @FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[1]")
    protected WebElement campoNomeLogin;

    @FindBy(xpath ="(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[2]")
    protected WebElement campoSenha;

    @FindBy(tagName = "button")
    protected WebElement botaoLogar;

    @FindBy(xpath = "//label[text()='CEP']/following::input")
    protected WebElement campoCep;

    @FindBy(xpath = "(//span[text()='endereço']/following::input)[2]")
    protected WebElement campoLogradouro;

    @FindBy(xpath = "(//span[text()='endereço']/following::input)[3]")
    protected WebElement campoNumeroEnderco;

    @FindBy(xpath = "//input[@placeholder='Apartamento, Bloco...']")
    protected WebElement campoComplementoEndereco;

    @FindBy(xpath = "//label[text()='Bairro']/following::input")
    protected WebElement campoBairro;

    @FindBy(xpath = "//label[text()='Cidade']/following::input")
    protected WebElement campoCidade;

    @FindBy(id = "UF")
    protected WebElement cboUf;

    @FindBy(xpath = "(//span[@class='textStyle'])[2]")
    protected WebElement botaoSalvarEGerarContrato;

    @FindBy(xpath = "//div[text()='Cliente cadastrado com sucesso.']/following-sibling::div")
    protected WebElement msgCadastroComSucesso;
}
