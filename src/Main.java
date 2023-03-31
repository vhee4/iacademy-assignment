public class Main {
    public static void main(String[] args) {
        Club Chelsea = new Club();
        Chelsea.setClubName("Chelsea");
        Chelsea.setClubCaptain("Thiago Silva");
        Chelsea.setClubCoach("Graham Potter");
        Chelsea.setClubStadium("Stamford Bridge");
        Chelsea.displayMessage();

        Club manchesterUnited = new Club();
        manchesterUnited.setClubName("Manchester United");
        manchesterUnited.setClubCaptain("Bruno Fernandes");
        manchesterUnited.setClubCoach("Erik Hen Tag");
        manchesterUnited.setClubStadium("Old Trafford");
        manchesterUnited.displayMessage();

        Club Arsenal = new Club();
        Arsenal.setClubName("Arsenal");
        Arsenal.setClubCaptain("Martin Odegaard");
        Arsenal.setClubCoach("Mikel Arteta");
        Arsenal.setClubStadium("Emirates Stadium");
        Arsenal.displayMessage();

        Club manchesterCity = new Club();
        manchesterCity.setClubName("Manchester City");
        manchesterCity.setClubCaptain("Gundogan");
        manchesterCity.setClubCoach("Pep Guardiola");
        manchesterCity.setClubStadium("Etihad Stadium");
        manchesterCity.displayMessage();

        Club Liverpool = new Club();
        Liverpool.setClubName("Liverpool");
        Liverpool.setClubCaptain("Jordan Hendensen");
        Liverpool.setClubCoach("Jurgen Klopp");
        Liverpool.setClubStadium("Anfield");
        Liverpool.displayMessage();
    }
}

//Arsernal, Martin Odegaard, Mikel Arteta, Emirates Stadium
//Chelsea, Thiago Silva, Graham Potter, Stamford Bridge
//Manchester United, Bruno Fernandes, Erik Ten Hag, Old Trafford
//Manchester City, Gundogan, Pep Guardiola, Etihad Stadium
//Liverpool, Jordan Hendensen, Jurgen Klopp, Anfield