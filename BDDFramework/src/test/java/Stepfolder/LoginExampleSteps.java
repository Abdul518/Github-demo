package Stepfolder;

import Base.BaseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.*;
import io.cucumber.java.en.*;

import cucumber.api.java.en.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginExampleSteps extends BaseUtil {
    private BaseUtil base;

    public LoginExampleSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        System.out.println("I navigate to the login page");
    }





    @And("I enter the following for Login")

    public void i_enter_the_following_for_Login( DataTable table)
    {

        System.out.println("I enter the following Login information");

        List<List<String>> data = table.asLists(String.class);
        String username= data.get(1).get(0);
        String  password= data.get(1).get(1);
        System.out.println("username after compiling program is " +username);
        System.out.println("password after compiling program is " +password);
        System.out.println(data.get(1).get(0));
        System.out.println(data.get(1).get(1));

       /* public class User
        {
            public String username;
            public String password;

            public User(String userName, String passWord) {
                username = userName;
                password = passWord;
            }

          //Creat an array list with name users to store user names in an array.

            List<User>users = new ArrayList<User>();

        */


    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        System.out.println("I click the login button");

    }

    @Then("I should see the userform pag")
    public void i_should_see_the_userform_pag() {

                System.out.println("I should see the userform homepage");
        System.out.println("The Webbrowser Driver is   "+base.StepInfo);
    }

    @And("I enter ([^\"]*) and ([^\"]*)")
    public void iEnterUsernameAndPassword(String username, String password) {

        System.out.println("UserName for the scenerio outline example is  " +username);
        System.out.println("Password for the scenerio outline example is "+password);
    }
}
