import br.com.sisbov.application.controller.CadastroController;
import br.com.sisbov.application.controller.LoginController;
import br.com.sisbov.application.view.Tela_Login;
import br.com.sisbov.application.view.Tela_de_Cadastro;

public class SisBovStarter {
    public static void main(String[] args) {
        Tela_Login login = new Tela_Login();
        Tela_de_Cadastro tela_de_cadastro = new Tela_de_Cadastro();

        LoginController loginController = new LoginController(login);
        CadastroController cadastroController = new CadastroController(tela_de_cadastro, login);

        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
}
