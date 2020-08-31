package Interacao;

import Pagina.CadastroProspectPage;
import org.openqa.selenium.support.ui.Select;

public class CadastroProspectInteracao extends CadastroProspectPage {

    public void clicarNovoCadastro(){
        botaoNovoCadastro.click();
    }

    public void selecionarCadastroProspect(){
        novoProspect.click();
    }

    public void preencherCampoNome(String nome){
        campoNome.sendKeys(nome);
    }

    public void preencherCampoTelefone(String telefone){
        campoTelefone.sendKeys(telefone);
    }

    public void preencherCampoEmail(String email){
        campoEmail.sendKeys(email);
    }

    public void preencherCampoDataNascimentol(String dataNascimento){
        campoDataNascimento.sendKeys(dataNascimento);
    }

    public void preencherCampoCPF(String cpf){
        campoCPF.sendKeys(cpf);
    }

    public void selecionarRadioMasculino(){
        campoRadioMasculino.click();
    }

    public void selecionarNoComboComoConheceuHaux(String valor){
        cboComoConheceuHaux.click();
        cboComoConheceuHaux.sendKeys(valor);
    }

    public void clicarSalvar(){
        botaoSalvar.click();
    }
}
