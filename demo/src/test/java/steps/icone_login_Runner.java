package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;

public class icone_login_Runner {

     
    WebDriver driver;
    String url = "http://teststore.automationtesting.co.uk/";

    @Before
    public void setup(){

        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver();

    }

    @After
    public void exit(){

        driver.quit();

}

    @Dado("que o usuário está na tela principal")
public void que_o_usuário_está_na_tela_principal() {

    driver.get(url);
    
}
    @Quando("clica no botão <signIn>")
public void clica_no_botão_signIn() {

    driver.findElement(By.className("user-info")).click();
    
}
    @Então("usuário deve ter acesso a {string}")
public void usuário_deve_ter_acesso_a(String conta) {

     if(conta == "acesso a conta"){

        String validacao1 = driver.findElement(By.id("submit-login")).getText();

        assertEquals("SIGN IN", validacao1);

   }    
    
}

}
 

      