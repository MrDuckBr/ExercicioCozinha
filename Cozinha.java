import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Cozinha{
    private String tipo;
    private LocalTime horaDeAbertura;
    private LocalTime horaDeFechamento;
    private String pratoPrincipal;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("H:mm");


    public Cozinha(String tipo, String horaAbertura, String horaFechamento, String pratoPrincipal) {
        this.tipo = tipo;
        this.horaDeAbertura = LocalTime.parse(horaAbertura,formato);
        this.horaDeFechamento = LocalTime.parse(horaFechamento,formato);
        this.pratoPrincipal = pratoPrincipal;

    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalTime getHoraDeAbertura() {
        return horaDeAbertura;
    }

    public void setHoraDeAbertura(String horaDeAbertura) {
        this.horaDeAbertura = LocalTime.parse(horaDeAbertura,formato);
    }

    public LocalTime getHoraDeFechamento() {
        return horaDeFechamento;
    }

    public void setHoraDeFechamento(String horaDeFechamento) {
        this.horaDeFechamento = LocalTime.parse(horaDeFechamento,formato);
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente valor) {
        ingredientes.add(valor);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }



    @Override
    public String toString() {
        return "Cozinha: " + tipo + '\n'+
                "Horário de Abertura = " + horaDeAbertura + "H\n"+
                "Horário de Fechamento = " + horaDeFechamento + "H\n"+
                "Prato Principal=" + pratoPrincipal +'\n'+
                "Ingredientes do Restaurante= " + impressaoIngredientes() + '\n'+
                "Funcionarios do Restaurante: \n" + impressaoFuncionarios() ;

    }

    public String impressaoIngredientes(){
        String valores= "";
        for (Ingrediente a: ingredientes) {
            valores += a.getNome() + ", ";
        }
        return valores;
    }

    public String impressaoFuncionarios(){
        String valores= "";
        for (Funcionario a: funcionarios) {
            valores += a.getNome() + ": " + a.getAtividade() + '\n';
        }
        return valores;
    }

}
