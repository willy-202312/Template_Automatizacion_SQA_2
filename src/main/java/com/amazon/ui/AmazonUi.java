package com.amazon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AmazonUi {

    public static final Target BTN_CATEGORY = Target.the("Categoria1").located(By.xpath("(//a[@class='a-link-normal see-more truncate-1line'])[1]"));
    public static final Target BTN_CATEGORY2 = Target.the("Categoria2").located(By.xpath("(//a[@class='bxc-grid-overlay__link'])[3]"));
    public static final Target BTN_PRODUCT = Target.the("Elegir Producto").located(By.xpath("(//img[@class='s-image'])[2]"));
    public static final Target ADD_PRODUCTCART = Target.the("Adicionar al Carro").located(By.xpath("//input[@id='add-to-cart-button']"));
    public static final Target BACK_CATALOG = Target.the("Volver al Catalogo").located(By.xpath("//a[@id='nav-logo-sprites']"));
    public static final Target BTN_CATEGOR3 = Target.the("Categoria3").located(By.xpath("(//span[@class='a-truncate-cut'])[2]"));
    public static final Target BTN_CATEGOR4 = Target.the("Categoria4").located(By.xpath("//img[@alt='Ahorra en PHILIPS y más']"));
    public static final Target BTN_PRODUCT2 = Target.the("Elegir Producto2").located(By.xpath("(//div[@class='a-section octopus-dlp-image-shield'])[4]"));
    public static final Target ADD_PRODUCTCART2 = Target.the("Adicionar al Carro").located(By.xpath("//input[@id='add-to-cart-button']"));
    public static final Target CONFIRM_BUY = Target.the("Confirmar Compra").located(By.xpath("//input[@name='proceedToRetailCheckout']"));

}
