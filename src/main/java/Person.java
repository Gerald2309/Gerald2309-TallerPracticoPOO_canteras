import java.util.Date;
/**
 * Esta clase modela un objeto persona
 * @author Geraldine Echeverri Ayala
 */
public class Person {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    /**
     * Este método obtiene el nombre de la persona
     * @return nombre de la persona
     */
    public String getName() {
        return name;
    }

    /**
     * Este método actualiza el nombre de la persona
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
