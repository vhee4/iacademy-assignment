public class Club {
    private String clubName;
    private String clubCaptain;
    private String clubCoach;
    private String clubStadium;


//setter and getter


    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
    public String getClubName(){
        return clubName;
    }
    public String getClubCaptain() {
        return clubCaptain;
    }

    public void setClubCaptain(String clubCaptain) {
        this.clubCaptain = clubCaptain;
    }

    public String getClubCoach() {
        return clubCoach;
    }

    public void setClubCoach(String clubCoach) {
        this.clubCoach = clubCoach;
    }

    public String getClubStadium() {
        return clubStadium;
    }

    public void setClubStadium(String clubStadium) {
        this.clubStadium = clubStadium;
    }

    public void displayMessage(){
        System.out.printf("CLUB INFO:\nClub Name: %s\nClub Captain: %s\nClub Coach: %s\nClub Stadium: %s\n\n", getClubName(), getClubCaptain(), getClubCoach(), getClubStadium());
    }
}
