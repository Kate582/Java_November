package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletionTests() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().wd.findElement(By.name("selected[]")).click();
    app.getGroupHelper().wd.findElement(By.name("delete")).click();
    app.getGroupHelper().returnToGroupPage();
  }

}
