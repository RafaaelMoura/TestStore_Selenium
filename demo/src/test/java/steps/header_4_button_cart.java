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

public class header_4_button_cart {

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

@Dado("que o usuário esta na tela home do site")
public void que_o_usuário_esta_na_tela_home_do_site() {
    driver.get(url);
}
@Quando("ele tenta acessar o carrinho sem ter feito login")
public void ele_tenta_acessar_o_carrinho_sem_ter_feito_login() {

    driver.findElement(By.cssSelector(".shopping-cart"));

}
@Então("usuário deve ter vizualização do {string}")
public void usuário_deve_ter_vizualização_do(String carrinho) {

    if(carrinho == "sucesso"){
       String validacao = driver.findElement(By.cssSelector("hidden-sm-down")).getText();
        assertEquals("Cart", validacao); }

}

}

    