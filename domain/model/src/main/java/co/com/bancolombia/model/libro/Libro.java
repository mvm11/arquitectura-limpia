package co.com.bancolombia.model.libro;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Libro {

    private String id;
    private String titulo;
    private String autor;
    private String genero;

    public Libro() {
    }

    public Libro(String id, String titulo, String autor, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
