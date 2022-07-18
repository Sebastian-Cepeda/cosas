import java.io.Serializable;

public class Empresa implements Serializable {

    private String nomnre;
    private long NIT;

    public Empresa(String nomnre, long NIT) {
        this.nomnre = nomnre;
        this.NIT = NIT;
    }

    public String getNomnre() {
        return nomnre;
    }

    public void setNomnre(String nomnre) {
        this.nomnre = nomnre;
    }

    public long getNIT() {
        return NIT;
    }

    public void setNIT(long NIT) {
        this.NIT = NIT;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nomnre='" + nomnre + '\'' +
                ", NIT=" + NIT +
                '}';
    }
}
