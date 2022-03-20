/**
 * Esta clase modela número de la cuenta y estado
 * @author Geraldine Echeverri Ayala
 */
public class BankAccount {

    private int accountNumber;
    protected  boolean activated;

    /**
     * Devuelve el estado de la cuenta
     * @return 
     */
    public boolean getActivated() {
        return activated;
    }

    /**
     * Actualiza el estado de la cuenta
     * @param activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
