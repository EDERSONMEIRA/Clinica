package Testes;

import Interacao.CadastroClienteInteracao;
import Utils.BaseTeste;
import Utils.DriverFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class CadastroClienteTeste extends BaseTeste {

    private CadastroClienteInteracao cadastroClienteInteracao = PageFactory.initElements(DriverFactory.getDriver(), CadastroClienteInteracao.class);


    @Before
    public void configurar() {
        DriverFactory.getDriver().get("localhost/");
    }


    @Test
    public void cadastroNovoCliente(){
        efetuarLogin();
        esperar(2);
        cadastroClienteInteracao.clicarNovoCadastro();
        cadastroClienteInteracao.selecionarCadastroCliente();

        cadastroClienteInteracao.preencherCampoNome("Pedro Lucas");
        cadastroClienteInteracao.preencherCampoTelefone("55123456789");
        cadastroClienteInteracao.preencherCampoEmail("pedro.lucas@gmail.com");
        cadastroClienteInteracao.preencherCampoDataNascimentol("09061990");
        cadastroClienteInteracao.preencherCampoCPF("05386798081");
        cadastroClienteInteracao.selecionarRadioMasculino();
        cadastroClienteInteracao.selecionarNoComboComoConheceuHaux("Site");
        cadastroClienteInteracao.selecionarNoComboCliente("At Home");

        cadastroClienteInteracao.preencherCep("91751680");
        cadastroClienteInteracao.preencherLogradouro("rua Praia de Belas");
        cadastroClienteInteracao.preencherNumeroEndereco("333");
        cadastroClienteInteracao.preencherCampoComplemento("Sala 01");
        cadastroClienteInteracao.preencherCampoBairro("Centro");
        cadastroClienteInteracao.preencherCampoCidade("Porto Algre");
        cadastroClienteInteracao.preencherSelecionarEstado("RS");
        cadastroClienteInteracao.clicarSalvarEGerarContrato();

        Assert.assertEquals("Cliente cadastrado com sucesso.",cadastroClienteInteracao.msgCadastroComSucesso());
    }

    @Test
    public void camposObrigatorioCadastroCliente(){
        efetuarLogin();
        esperar(2);
        cadastroClienteInteracao.clicarNovoCadastro();
        cadastroClienteInteracao.selecionarCadastroCliente();

        cadastroClienteInteracao.preencherCampoNome("");
        cadastroClienteInteracao.preencherCampoTelefone("");
        cadastroClienteInteracao.preencherCampoEmail("");
        cadastroClienteInteracao.preencherCampoDataNascimentol("");
        cadastroClienteInteracao.preencherCampoCPF("");
        cadastroClienteInteracao.selecionarRadioMasculino();
        cadastroClienteInteracao.selecionarNoComboComoConheceuHaux("");
        cadastroClienteInteracao.selecionarNoComboCliente("");

        cadastroClienteInteracao.preencherCep("");
        cadastroClienteInteracao.preencherLogradouro("");
        cadastroClienteInteracao.preencherNumeroEndereco("");
        cadastroClienteInteracao.preencherCampoComplemento("");
        cadastroClienteInteracao.preencherCampoBairro("");
        cadastroClienteInteracao.preencherCampoCidade("");
        cadastroClienteInteracao.preencherSelecionarEstado("");
        cadastroClienteInteracao.clicarSalvarEGerarContrato();
    }

}
