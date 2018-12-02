package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void TestsContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().SelectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Ivan", "Petrov", "Home", "Moscow, Red Square"));
    app.getContactHelper().submitContactModification();
  }

}
