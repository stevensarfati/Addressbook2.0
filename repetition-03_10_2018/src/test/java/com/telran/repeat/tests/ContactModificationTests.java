package com.telran.repeat.tests;

import com.telran.repeat.model.Contact;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactModificationTests extends  TestBase {
  @BeforeMethod
  public void ensurePreconditions() {
    app.getNavigationHelper().openHomePage();
    if (!app.getContactHelper().isContactPresent()) {
      app.getContactHelper().createContact();
    }
  }

  @Test
  public void testsContactModification(){
    app.getNavigationHelper().openHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new Contact()
            .setfName("hh")
            .setlName("jj")
            .setAddress("ssssss")
            .setPhoneHome("1233445678")
            .setEmail("gdgdg@gmail.com"));
    app.getContactHelper().confirmContactModification();
    }

}
