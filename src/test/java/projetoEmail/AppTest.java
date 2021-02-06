package projetoEmail;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

public class AppTest {
	
	@org.junit.Test
	public void testeEmail()throws Exception {
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();

		stringBuilderTextoEmail.append("Olá, <br/><br/>");
		stringBuilderTextoEmail.append("VocÊ esta recebendo acesso ao curso de Java <br/><br/>");
		stringBuilderTextoEmail.append("Para ter acesso clique no botão abaixo. <br/><br/>");
		
		stringBuilderTextoEmail.append("<b>Login:</b> alex@ashahshas</br>");
		stringBuilderTextoEmail.append("<b>Senha:</b> alex@ashahshas</br></br>");
		

		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://www.uol.com.br/\" style=\"color:#2525a7; background-color:#99da39; padding:14px 25px; text-align:center; display:inline-block; border-radius: 30px; font-size:20px; font-family: courier; border: 3px solid green; text-decoration:none;\">Acessar portal </a><br/><br/>");
		
		stringBuilderTextoEmail.append("<span style=\"font-size:8px\">Ass.: Alex do Jdev Treinamento</span>");
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("jvvillasb@gmail.com", "Boi do Piauí", "Testando Email", stringBuilderTextoEmail.toString());
		
		
		enviaEmail.enviarEmailAnexo(true);
		
		Thread.sleep(5000);
		
	}
   
}

