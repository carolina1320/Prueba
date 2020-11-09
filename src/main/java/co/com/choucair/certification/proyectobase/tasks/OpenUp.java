package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Tasks {
        private ChoucairAcademyPage choucairAcademyPage;
        public static OpenUp thePage() {
            return Tasks.instrumented(OpenUp.class);
        }

        @Override
        Public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Opne.browserOn(choucairAcademyPage));

    }

}
