import java.util.ArrayList;
/**
 * Esta clase modela el objeto fruta 
 * @author Geraldine Echeverri Ayala
 */
public class Fruit {

    public String name;
    private float averageWight;
    public ArrayList<String> colors;

    /**
     * Método para obtener el color de la fruta
     * @return Color fruta
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Método para modificar el color de la fruta
     * @param colors Color fruta
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
