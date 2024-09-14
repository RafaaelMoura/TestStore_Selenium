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

public class header_2_button_sign_in {

     
    WebDriver driver;
    String url = "https://teststore.automationtesting.co.uk/index.php";

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
public void que_o_usuário_está_na_tela_principal(){

    driver.get(url);

}

@Quando("clica no botão <signIn>")
public void clica_no_botão_sign_in() {
    
    driver.findElement(By.className("user-info")).click();
}
@Então("usuário deve ter acesso a {string}")
public void usuário_deve_ter_acesso_a(String conta) {
    
    if(conta == "sucesso"){
        String validacao = driver.findElement(By.id("submit-login")).getText();
        assertEquals("Sign in", validacao);
    }

}


}
 

      