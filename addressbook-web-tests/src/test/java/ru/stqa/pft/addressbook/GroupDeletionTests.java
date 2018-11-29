package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDeletionTests() throws Exception {
    wd.findElement(By.linkText("groups")).click();
    wd.findElement(By.name("selected[]")).click();
    wd.findElement(By.name("delete")).click();
    wd.findElement(By.linkText("group page")).click();
  }

}
