package com.telran.repeat.tests;

import com.telran.repeat.model.Contact;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


public class ContactCreationTests extends TestBase {

  @BeforeMethod
  public void ensurePrecondition(){
    if(!app.getContactHelper().isOnTheHomePage()){
      app.getNavigationHelper().openHomePage();
    }
  }
  @Test
  public void createContactTest() throws IOException {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new Contact()
                    .setfName("Moshe")
                    .setlName("Coen")
                    .setAddress("Tel Aviv")
                    .setEmail("gg@gmail.com")
                    .setPhoneHome("123456789"));
    app.getContactHelper().confirmContactCreation();

  }
}
