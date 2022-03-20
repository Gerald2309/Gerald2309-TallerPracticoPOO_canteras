import java.util.Date;
/**
 * Esta clase modela personajes de anime 
 * @author Geraldine Echeverri Ayala
 */
public class CharacterAnime {

    private String name;
    private float height;
    public String anime;
    protected Date dateBirth;
    protected boolean haveMagicPower;

    /**
     * Método para obtener el nombre del personaje del anime
     * @return Nombre del personaje
     */
    public String getName() {
        return name;
    }

    /**
     * Método para modificar el nombre del personaje del anime
     * @param name Nombre del personaje
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para obtener el nombre del anime del cual es el personaje
     * @return Anime de donde es el personaje
     */
    public String getAnime() {
        return anime;
    }

    /**
     * Método para modificar el nombre del anime del cual es el personaje
     * @param anime Nombre anime 
     */
    public void setAnime(String anime) {
        this.anime = anime;
    }

    /**
     * Método para obtener el día en que nació el personaje
     * @return Fecha de nacimiento
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Método para modificar el día en el que nació el personaje
     * @param dateBirth Fecha de nacimiento
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Método para obtener la altura del personaje
     * @return Altura del personaje
     */
    public float getHeight() {
        return height;
    }

    /**
     * Método para modificar la altura del personaje
     * @param height Altura del personaje
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Método para obtener el poder mágico del personaje
     * @return Poder mágico
     */
    public boolean isHaveMagicPower() {
        return haveMagicPower;
    }

    /**
     * Método para modificar el poder mágico del personaje
     * @param haveMagicPower Poder mágico
     */
    public void setHaveMagicPower(boolean haveMagicPower) {
        this.haveMagicPower = haveMagicPower;
    }
}
