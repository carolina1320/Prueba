package co.com.choucair.certification.proyectobase.userinterface;

import  net.serenitybdd.core.pages.PageObject;
import  net.serenitybdd.screenplay.targets.Target;
import  org.openqa.selenium.By;


public class SearchCoursePage extends  PageObject {
    public static final Target BUTTON_UC = Target.the( targetElementName "Seleccciona la universidad Choucair")
            .located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE =Target.the( targetElementName "Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the( targetElementName "Dar click para buscar el curso")
            .located(By.id("//button[@class= 'btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the( targetElementName "Dar click para buscar el curso")
            .located(By.xpath("//H4[contains(text(),'Recuros Automatizacion Bancolombia')]"));



}