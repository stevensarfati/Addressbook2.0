package com.telran.repeat.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactDeletionTests extends  TestBase {
    @BeforeMethod
            public void ensurePreconditions()
    {
      app.getNavigationHelper().openHomePage();
      if(!app.getContactHelper().isContactPresent()){
        app.getContactHelper().createContact();
      }

    }

    @Test
    public void testContactDeletion(){
      int before = app.getContactHelper().getContactCount();
    app.getContactHelper().selectContactByIndex(0);
    app.getContactHelper().deleteContact();
    app.getContactHelper().confirmAlert();
  }
}
