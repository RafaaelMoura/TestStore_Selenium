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

public class header_3_access_login {
    
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

@Dado("que o usuario está na tela de login")
public void que_o_usuario_está_na_tela_de_login(){
    driver.get(url);
    driver.findElement(By.className("user-info")).click();
    

}
@Quando("preenche o campo de {string} e {string}")
public void preenche_o_campo_de_e(String email, String password){
    
    driver.findElement(By.id("field-email")).click();
    driver.findElement(By.id("field-email")).sendKeys(email);

    driver.findElement(By.id("field-password")).click();
    driver.findElement(By.id("field-password")).sendKeys(password);
    
    
}

@E("clica no botão SIGN IN")
public void clica_no_botão_sign_in(){
    driver.findElement(By.id("submit-login")).click();
}

@Então("deve o usuario deve ter {string}")
public void deve_o_usuario_deve_ter(String resultado) {

    if(resultado == "Login valido"){
        String validacao = driver.getCurrentUrl();
        assertEquals("https://teststore.automationtesting.co.uk/index.php", validacao);
        String validacao1 = driver.findElement(By.className("account")).getText();
        assertEquals("Rafael Moura", validacao1);
    }
 
    if(resultado == "Login invalido"){
        String validacao2 = driver.findElement(By.cssSelector("help-block")).getText();
        assertEquals("Authentication failed.", validacao2);

    }

    if(resultado == "Login invalido"){
        String validacao3 = driver.getCurrentUrl();
        assertEquals("https://teststore.automationtesting.co.uk/index.php?controller=authentication?back=https%3A%2F%2Fteststore.automationtesting.co.uk%2Findex.php", validacao3);
    }


    
}

}
