package com.telran.repeat.tests;

import com.telran.repeat.model.Contact;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
  @Test
  public void createContactTest() {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new Contact("Moshe", "Coen", "Tel-Aviv", "gg@hh.com", "134455566"));
    app.getContactHelper().confirmContactCreation();
  }
}
