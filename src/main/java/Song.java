import java.util.Date;

/**
 * Esta clase modela canciones
 * @author Geraldine Echeverri Ayala
 */
public class Song {
    public String gender;
    private String name;
    private String artist;
    private Date releaseDate;
    protected String album;

    /**
     * Método creado para obtener el género de la canción
     * @return genero de la canción
     */
    public String getGender() {
        return gender;
    }

    /**
     * Método creado para atualizar el género de la canción
     * @param gender genero de la canción
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Método creado para obtener el nombre de la canción
     * @return nombre de la canción
     */

    public String getName() {
        return name;
    }

    /**
     * Método creado para atualizar el nombre de la canción
     * @param name nombre de la canción
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método creado para obtener el nombre del artista
     * @return nombre del artista
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Método para modificar el nombre del artista
     * @param artist Nombre del artista
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Método creado para obtener la fecha de lanzamiento de la canción
     * @return fecha de lanzamiento de la canción
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * Método creado para atualizar la fecha de lanzamiento de la canción
     * @param releaseDate fecha de lanzamiento de la canción
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * Este método indica la popularidad según el género de la canción.
     */
    private void popularity(){
        switch (this.gender){
            case "reggae":
                System.out.println("El genero " +this.gender + " fue muy popular en los años 2000");
                break;

            case "rock":
                System.out.println("El genero " +this.gender + " fue muy popular en los años 70s");
                break;

            case "pop":
                System.out.println("El genero " +this.gender + " fue muy popular a partir del año 2010");
                break;
        }
    }
}
