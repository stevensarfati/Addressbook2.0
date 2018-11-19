package com.telRan.ashkelon.com.telRan.ashkelon.provider;

import com.telRan.ashkelon.com.telRan.ashkelon.data.ContactData;
import com.telRan.ashkelon.com.telRan.ashkelon.data.GroupData;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaticProvider {


    @DataProvider
    public static Iterator<Object[]> validGroups() throws IOException {
        List<Object[]> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/groups.csv"));
        String line = reader.readLine();
        while(line != null)
        {
            String[] split = line.split(";");
            list.add(new Object[] {new GroupData()
                    .withGroupName(split[0])
                    .withGroupHeader(split[1])
                    .withGroupFooter(split[2])} );
            line = reader.readLine();
        }

        return list.iterator();
    }

    @DataProvider
    public static Iterator<Object[]> validContacts() throws IOException {
        List<Object[]> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/contacts.csv"));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(";");
            list.add(new Object[]{new ContactData()
                    .withfName(split[0])
                    .withlName(split[1])
                    .withAddress(split[2])
                    .withEmail(split[3])
                    .withPhoneHome(split[4])});
            line = reader.readLine();
        }

        return list.iterator();
    }
}
