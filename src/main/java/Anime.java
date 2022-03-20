import java.util.Date;
/**
 * Esta clase modela animes
 * @author Geraldine Echeverri Ayala
 */
public class Anime {

    private Date publicationDate;
    protected String gender;
    private int seasons;
    private String name;
    protected int chapters;
    public boolean inBroadcast;


    /**
     * Método para obtener el día de publicación del anime
     * @return Día de publicación del anime
     */
    public Date getPublicationDate() {
        return publicationDate;
    }

    /**
     * Método para modificar el día de publicación del anime 
     * @param publicationDate Día de publicación del anime
     */
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * Método para obtener el género del anime
     * @return género del anime
     */
    public String getGender() {
        return gender;
    }

    /**
     * Método para modificar el género del anime
     * @param gender genero del anime
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *  Método para obtener el número de temporadas del anime
     * @return Temporadas del anime
     */
    public int getSeasons() {
        return seasons;
    }

    /**
     *  Método para modificar el número de temporadas del anime
     * @param seasons cantidad de temporadas del anime 
     */
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    /**
     * Método para obtener el nombre del anime 
     * @return nombre del anime
     */
    public String getName() {
        return name;
    }

    /**
     * Método para modificar el nombre del anime
     * @param name nombre del anime
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para identificar si el anime es largo o corto
     */
    protected void itsLong(){
        if(this.chapters > 25){

            System.out.println("anime " +this.name+" is long");
        }
        else {
            System.out.println("anime " +this.name+" is not long");

        }
    }
}
