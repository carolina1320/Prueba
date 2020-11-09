package co.com.choucair.certification.proyectobase.model;


import java.util.List;

public class AcademyChoucairData {
    public AcademyChoucairData(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public String getStrUser() {
        return strUser;
    }

    public void setStrUser(String strUser) {
        this.strUser = strUser;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrCourse() {
        return strCourse;
    }

    public void setStrCourse(String strCourse) {
        this.strCourse = strCourse;
    }

    private String strUser;
    private String strPassword;
    private String strCourse;


    @Given("^than Rose wants to learn automation at the academy Choucair$")
    public void thanRosewantsTolearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled( requiredActor "Rose").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }

    @When("^she search for the course on the choucair academy platform$")
    public void sheSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData)
            throws Exception {
        OnStage.theActorlnTheSpotlight().attemptsTo(Buscar.the(academyChoucairData.get(0).getStrCourse()));

    }
    @Then("^she finds the course called$")
    public void sheFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(List<AcademyChoucairData> academyChoucairData)throws Exception {
            OnStage.theActorlnTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));






    }
