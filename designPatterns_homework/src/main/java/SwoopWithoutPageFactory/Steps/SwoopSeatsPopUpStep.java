package SwoopWithoutPageFactory.Steps;

import SwoopWithoutPageFactory.Pages.SwoopSeatsPopUpPage;
import org.testng.Assert;

public class SwoopSeatsPopUpStep {
    SwoopSeatsPopUpPage seatsPopUpPage = new SwoopSeatsPopUpPage();
    SwoopMovieInfoPageStep infoPageStep = new SwoopMovieInfoPageStep();

    public SwoopSeatsPopUpStep validatePopUpMovieName()
    {
        Assert.assertEquals(infoPageStep.movieName, seatsPopUpPage.movieHeaderName);
        return this;
    }
    public SwoopSeatsPopUpStep validatePopUpCinemaName()
    {
        //ამაზე მიწერს რო დისფლეიდ არარი ხან არი
        Assert.assertEquals("კავეა ისთ ფოინთი", seatsPopUpPage.movieHeaderCinemaName);
        return this;
    }
    public SwoopSeatsPopUpStep chooseSeat()
    {
        seatsPopUpPage.avalaibleSeatButton.click();
        return this;
    }

}
