

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;


public class SelecionarProdutoTest {
  private WebDriver driver;
  private WebDriverWait wait;

  @BeforeEach
    public void iniciar() {
        driver = new ChromeDriver(); // instanciar o objeto do Selenium como ChromeDriver
        wait = new WebDriverWait(driver, Duration.ofMillis(1000)); // Inicialização correta
    }


  @AfterEach
  public void finalizar() {
    driver.quit();
  }

  @Test
  public void selecionarProduto() {
    driver.get("https://www.saucedemo.com/");
    WebDriverManager.chromedriver().setup();
    driver.manage().window().maximize(); // maximiza a janela do browser



    // Login
    WebElement usernameInput = driver.findElement(By.cssSelector("*[data-test=\"username\"]"));
    usernameInput.sendKeys("standard_user");

    WebElement passwordInput = driver.findElement(By.cssSelector("*[data-test=\"password\"]"));
    passwordInput.sendKeys("secret_sauce");

    WebElement loginButton = driver.findElement(By.cssSelector("*[data-test=\"login-button\"]"));
    loginButton.click();

    // Selecionar produto
    WebElement itemName = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"inventory-item-name\"]")));
    itemName.click();

    WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"add-to-cart\"]")));
    addToCartButton.click();

    WebElement cartBadge = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"shopping-cart-badge\"]")));
    cartBadge.click();

    // Asserções no carrinho
    WebElement itemQuantity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("*[data-test=\"item-quantity\"]")));
    WebElement cartItemName = driver.findElement(By.cssSelector("*[data-test=\"inventory-item-name\"]"));
    WebElement cartItemPrice = driver.findElement(By.cssSelector("*[data-test=\"inventory-item-price\"]"));

    assertThat(itemQuantity.getText(), is("1"));
    assertThat(cartItemName.getText(), is("Sauce Labs Backpack"));
    assertThat(cartItemPrice.getText(), is("$29.99"));

    // Checkout
    WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"checkout\"]")));
    checkoutButton.click();

    WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("*[data-test=\"firstName\"]")));
    firstNameInput.sendKeys("ju");

    WebElement lastNameInput = driver.findElement(By.cssSelector("*[data-test=\"lastName\"]"));
    lastNameInput.sendKeys("jo");

    WebElement postalCodeInput = driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]"));
    postalCodeInput.sendKeys("123");

    WebElement continueButton = driver.findElement(By.cssSelector("*[data-test=\"continue\"]"));
    continueButton.click();

    WebElement finishButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"finish\"]")));
    finishButton.click();

    // Asserção final de mensagem e retor
    WebElement completeHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("*[data-test=\"complete-header\"]")));
    assertThat(completeHeader.getText(), is("Thank you for your order!"));

    // Localizar e clicar no botão do menu
    WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
    menuButton.click();

    // Clicar em um item do menu (por exemplo, logout)
    WebElement logoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
    logoutButton.click();
  
  }
}
