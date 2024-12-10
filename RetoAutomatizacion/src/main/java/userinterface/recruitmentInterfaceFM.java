package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class recruitmentInterfaceFM extends PageObject {

    public static final Target RECRUITMENT = Target.the("Recruitment").located(net.serenitybdd.core.annotations.findby.By.xpath("//span[text()='Recruitment']"));
    public static final Target ADD = Target.the("Add").located(By.xpath("//button[text()=' Add ']"));

    public static final Target FIRST_NAME = Target.the("First_Name").located(By.xpath("//input[@placeholder='First Name']"));
    public static final Target MIDDLE_NAME = Target.the("Middle_Name").located(By.xpath("//input[@placeholder='Middle Name']"));
    public static final Target LASTNAME = Target.the("Last_Name").located(By.xpath("//input[@placeholder='Last Name']"));

    public static final Target VACANCY_LIST = Target.the("Vacancy_List_Dropdown").located(By.xpath("//div[text()='-- Select --']"));
    public static final Target VACANCY_OPT = Target.the("Vacancy_Option").located(By.xpath("//div[@role='option']//span[text()='Payroll Administrator']"));

    public static final Target EMAIL = Target.the("Email").located(By.xpath("(//input[@placeholder='Type here'])[1]"));
    public static final Target CONTACT_NUMBER = Target.the("Contact_Number").located(By.xpath("(//input[@placeholder='Type here'])[2]"));

    public static final Target BROWSE_FILE_INPUT = Target.the("File_Input").located(By.xpath("//input[@type='file']"));

    public static final Target SAVE = Target.the("Save").located(By.xpath("//button[@type='submit']"));
}
