package questions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.recruitmentInterfaceV;

public class verifyRecruitment implements Question<Boolean> {

    private final String expectedVacancy;
    private final String expectedCandidateName;
    private final String expectedStatus;

    public verifyRecruitment(String expectedVacancy, String expectedCandidateName, String expectedStatus) {
        this.expectedVacancy = expectedVacancy;
        this.expectedCandidateName = expectedCandidateName;
        this.expectedStatus = expectedStatus;
    }

    public static verifyRecruitment withValues(String vacancy, String candidateName, String status) {
        return new verifyRecruitment(vacancy, candidateName, status);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int rowIndex = 1;
        boolean found = false;

        while (true) {
            try {
                String vacancyXPath = String.format(recruitmentInterfaceV.VACANCY, rowIndex);
                String candidateNameXPath = String.format(recruitmentInterfaceV.CANDIDATE_NAME, rowIndex);
                String statusXPath = String.format(recruitmentInterfaceV.STATUS, rowIndex);

                String actualVacancy = actor.asksFor(Text.of(Target.the("Vacancy").located(By.xpath(vacancyXPath))).asString());
                String actualCandidateName = actor.asksFor(Text.of(Target.the("Candidate Name").located(By.xpath(candidateNameXPath))).asString());
                String actualStatus = actor.asksFor(Text.of(Target.the("Status").located(By.xpath(statusXPath))).asString());

                if (actualVacancy.equals(expectedVacancy) &&
                        actualCandidateName.equals(expectedCandidateName) &&
                        actualStatus.equals(expectedStatus)) {
                    found = true;
                    break;
                }

                rowIndex++;
            } catch (Exception e) {
                break;
            }
        }

        return found;
    }
}
