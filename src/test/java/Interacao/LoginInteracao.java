package Interacao;

import Pagina.LoginPagina;

public class LoginInteracao extends LoginPagina{
    public void preencherCampoNome(String usuario){
        campoNome.sendKeys(usuario);
    }

    public void preencherCampoSenha(String senha){
        campoSenha.sendKeys(senha);
    }

    public void clicarBotaoLogar(){
        botaoLogar.click();
    }

    public void clicarBotaoNovoCadastro(){
        botaoNovoCadastro.click();
    }
}
