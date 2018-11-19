package com.telRan.ashkelon.com.telRan.ashkelon.tests;

import com.telRan.ashkelon.com.telRan.ashkelon.provider.StaticProvider;
import com.telRan.ashkelon.com.telRan.ashkelon.data.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {





    @Test(dataProvider = "validContacts", dataProviderClass = StaticProvider.class)
    public void testContactCreation(ContactData contact) {
        initContactCreation();


        fillContactForm(contact);


        submitContactCreation();
    }


}
