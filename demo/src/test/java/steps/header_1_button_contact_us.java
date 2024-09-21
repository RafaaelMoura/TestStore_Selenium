package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.pt.Então;

public class header_1_button_contact_us {
    
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


@Dado("que o usuário está na tela principal <home>")
public void que_o_usuário_está_na_tela_principal_home() {
  driver.get(url);
}
@Quando("clica no botão {string}")
public void clica_no_botão(String string) {
  driver.findElement(By.id("contact-link")).click();
    
}
@Então("usuario deve ter acesso a pagina de {string}")
public void usuario_deve_ter_acesso_a_pagina_de(String contatos) {

  String validacao = driver.getCurrentUrl();
  assertEquals("https://teststore.automationtesting.co.uk/index.php?controller=contact", validacao);
    
}


}
