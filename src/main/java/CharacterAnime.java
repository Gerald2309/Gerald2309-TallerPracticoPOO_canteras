import java.util.Date;

public class CharacterAnime {

    private String name;
    private float height;
    public String anime;
    protected Date dateBirth;
    protected boolean haveMagicPower;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isHaveMagicPower() {
        return haveMagicPower;
    }

    public void setHaveMagicPower(boolean haveMagicPower) {
        this.haveMagicPower = haveMagicPower;
    }
}
