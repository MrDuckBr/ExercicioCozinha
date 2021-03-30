import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ingrediente {

    private String nome;
    private LocalDate dataDeValidade;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Ingrediente(String nome ,String dataDeValidade) {
        this.nome = nome;
        this.dataDeValidade = LocalDate.parse(dataDeValidade,formato);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String valor) {
        this.dataDeValidade = LocalDate.parse(valor,formato);
    }




}
