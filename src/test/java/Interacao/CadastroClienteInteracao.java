package Interacao;

import Pagina.CadastroClientePage;
import org.openqa.selenium.support.ui.Select;

import java.util.UnknownFormatConversionException;

public class CadastroClienteInteracao extends CadastroClientePage {

    public void clicarNovoCadastro(){
        botaoNovoCadastro.click();
    }

    public void selecionarCadastroCliente(){
        novoCliente.click();
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

    public void selecionarRadioFeminino(){
        campoRadioMasculino.click();
    }

    public void selecionarNoComboComoConheceuHaux(String valor){
        cboComoConheceuHaux.click();
        cboComoConheceuHaux.sendKeys(valor);
    }

    public void selecionarNoComboCliente(String valor){
        cboCliente.click();
        valorAtHome.click();
    }


    public void preencherCep(String cep){
        campoCep.sendKeys(cep);
    }

    public void preencherLogradouro(String logradouro){
        campoLogradouro.sendKeys(logradouro);
    }

    public void preencherNumeroEndereco(String numero){
        campoNumeroEnderco.sendKeys(numero);
    }

    public void preencherCampoComplemento(String complemento){
        campoComplementoEndereco.sendKeys(complemento);
    }

    public void preencherCampoBairro(String bairro){
        campoBairro.sendKeys(bairro);
    }

    public void preencherCampoCidade(String cidade){
        campoCidade.sendKeys(cidade);
    }

    public void preencherSelecionarEstado(String uf){
        cboUf.click();
        cboUf.sendKeys(uf);
    }

    public void clicarSalvarEGerarContrato(){
        botaoSalvarEGerarContrato.click();
    }

    public String msgCadastroComSucesso(){
       return msgCadastroComSucesso.getText();
    }







}
