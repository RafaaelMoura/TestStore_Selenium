package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login2Steps {
    
    WebDriver driver;
    String url = "http://teststore.automationtesting.co.uk/login?back=my-account";

    @Before
    public void setup(){

        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver();

    }

    @After
    public void exit(){

        driver.quit();

}

    @Dado("que o usuario está na tela de login")
public void que_o_usuario_está_na_tela_de_login() {

    driver.get(url);
   
}
    @Quando("preenche o campo de {string} e {string}")
public void preenche_o_campo_de_email_e(String email, String password) {
    //E-mail
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys(email);
   //password
   driver.findElement(By.name("password")).click();
   driver.findElement(By.name("password")).sendKeys(password);

}
    @E("clica no botão SIGN IN")
public void clica_no_botão_sign_in() {

    driver.findElement(By.id("submit-login")).click();
   
}
    @Então("deve o usuario deve ter {string}")
public void deve_o_usuario_deve_ter(String resultado) {


     if(resultado == "Login com sucesso"){

        String validacao1 = driver.getCurrentUrl();

        assertEquals("http://teststore.automationtesting.co.uk/my-account", validacao1);


    }
    
    else if(resultado == "Login com invalido"){

        String validacao2 = driver.findElement(By.tagName("li")).getText();
       
        assertEquals("Authentication failed.", validacao2);

    }
     
}
}
