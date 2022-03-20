import java.util.Date;

public class Anime {

    private Date publicationDate;
    protected String gender;
    private int seasons;
    private String name;
    protected int chapters;
    public boolean inBroadcast;


    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void itsLong(){
        if(this.chapters > 25){
            System.out.println("anime " +this.name+" is long");
        }
        else {

            System.out.println("anime " +this.name+" is not long");

        }
    }
}
