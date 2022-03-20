import java.util.Date;

public class Song {

    public String gender;
    private String name;
    private String artist;
    private Date releaseDate;
    protected String album;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    private void popularity(){
        switch (this.gender){
            case "reggae":
                System.out.println("El genero " +this.gender + " fue muy popular en los años 2000");
                break;

            case "rock":
                System.out.println("El genero " +this.gender + " fue muy popular en los años 70s");
                break;

            case "pop":
                System.out.println("El genero " +this.gender + " fue muy popular a partir del año 2015");
                break;
        }
    }
}
