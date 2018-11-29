package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("group1", "header group1", "footer group1"));
    submitGroupCreation();
    returnToGroupPage();
    Logout();
  }

}
