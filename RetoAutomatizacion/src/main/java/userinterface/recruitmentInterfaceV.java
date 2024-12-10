package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class recruitmentInterfaceV extends PageObject {

    public static final Target CANDIDATES_PAGE = Target.the("Candidates_Page").located(By.xpath("//a[text()='Candidates']"));

    public static final Target DATA_SORTING_LIST = Target.the("Data_Sorting_List").located(By.xpath("(//div[@role='columnheader']//i)[8]"));
                                                                                                                                     //input[@placeholder='Type here'])[1]
    public static final Target DATA_SORTING_OPT = Target.the("Data_Sorting_Option").located(By.xpath("(//div[@role='columnheader']//i)[10]"));

    public static final String VACANCY = "(//div[@role='rowgroup'])[2]/div[%d]//div[2]/div[1]";

    public static final String CANDIDATE_NAME = "(//div[@role='rowgroup'])[2]/div[%d]//div[3]/div[1]";

    public static final String STATUS = "(//div[@role='rowgroup'])[2]/div[%d]//div[6]/div[1]";

}
