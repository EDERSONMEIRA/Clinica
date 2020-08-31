package Testes;

import Interacao.CadastroClienteInteracao;
import Interacao.CadastroProspectInteracao;
import Utils.BaseTeste;
import Utils.DriverFactory;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class CadastroProspectTeste extends BaseTeste {
    private CadastroProspectInteracao cadastroProspectInteracao = PageFactory.initElements(DriverFactory.getDriver(), CadastroProspectInteracao.class);


    @Before
    public void configurar() {
        DriverFactory.getDriver().get("localhost/");
    }


    @Test
    public void cadastroProspect(){
        efetuarLogin();
        esperar(2);
        cadastroProspectInteracao.clicarNovoCadastro();
        cadastroProspectInteracao.selecionarCadastroProspect();

        cadastroProspectInteracao.preencherCampoNome("Pedro Lucas");
        cadastroProspectInteracao.preencherCampoTelefone("55123456789");
        cadastroProspectInteracao.preencherCampoEmail("pedro.lucas@gmail.com");
        cadastroProspectInteracao.preencherCampoDataNascimentol("09061990");
        cadastroProspectInteracao.preencherCampoCPF("25918972048");
        cadastroProspectInteracao.selecionarRadioMasculino();
        cadastroProspectInteracao.selecionarNoComboComoConheceuHaux("Telefone");
        cadastroProspectInteracao.clicarSalvar();
    }

}
