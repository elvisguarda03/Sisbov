import br.com.sisbov.application.controller.*;
import br.com.sisbov.application.view.Tela_Inicial;
import br.com.sisbov.application.view.Tela_Login;
import br.com.sisbov.application.view.Tela_Principal;
import br.com.sisbov.application.view.Tela_de_Cadastro;

public class SisBovStarter {
    public static void main(String[] args) {
        Tela_Login login = new Tela_Login();
        Tela_Inicial telaInicial = new Tela_Inicial();
        Tela_de_Cadastro tela_de_cadastro = new Tela_de_Cadastro();
        Tela_Principal telaPrincipal = new Tela_Principal();

        LoginController loginController = new LoginController(login, telaPrincipal);
        CadastroController cadastroController = new CadastroController(tela_de_cadastro, login);
        AnimalController animalController = new AnimalController(telaPrincipal);
        RacaController racaController = new RacaController(telaPrincipal);
        TipoAnimalController tipoAnimalController = new TipoAnimalController(telaPrincipal);
        VacinaController vacinaController = new VacinaController(telaPrincipal);
        FazendaController fazendaController = new FazendaController(telaPrincipal);

        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
}
