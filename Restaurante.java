import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class Restaurante {



    public static void main(String[] args) {
        Cozinha mineira = new Cozinha("Mineira","14:00","20:00","Feijoada");
        mineira.setIngredientes(new Ingrediente("Feijao", "22/12/2022"));
        mineira.setIngredientes(new Ingrediente("Farinha","22/12/2022"));
        mineira.setIngredientes(new Ingrediente("Arroz","22/12/2022"));
        mineira.setIngredientes(new Ingrediente("Carne de Porco","22/12/2022"));
        mineira.setIngredientes(new Ingrediente("Linguiça","22/12/2022"));

        mineira.setFuncionarios(new Funcionario("João","Cozinheiro"));
        mineira.setFuncionarios(new Funcionario("Maria","Chefe"));
        mineira.setFuncionarios(new Funcionario("Abreu","Chapeiro"));
        mineira.setFuncionarios(new Funcionario("Joaquina","Cozinheiro"));



        Cozinha chinesa = new Cozinha("Chinesa","10:00","21:00","Yakissoba");
        chinesa.setIngredientes(new Ingrediente("Champignon","22/08/2022"));
        chinesa.setIngredientes(new Ingrediente("Brócolis","22/08/2022"));
        chinesa.setIngredientes(new Ingrediente("Macarrão","22/08/2022"));
        chinesa.setIngredientes(new Ingrediente("Carne","22/08/2022"));

        chinesa.setFuncionarios(new Funcionario("João","Cozinheiro"));
        chinesa.setFuncionarios(new Funcionario("Maria","Chefe"));
        chinesa.setFuncionarios(new Funcionario("Abreu","Chapeiro"));



        Cozinha italiana = new Cozinha("Italiana","13:00","22:00","Yakissoba");
        italiana.setIngredientes(new Ingrediente("Molho","22/08/2022"));
        italiana.setIngredientes(new Ingrediente("Macarrão","22/08/2022"));
        italiana.setIngredientes(new Ingrediente("Carne","22/08/2022"));


        italiana.setFuncionarios(new Funcionario("João","Cozinheiro"));
        italiana.setFuncionarios(new Funcionario("Maria","Chefe"));


        System.out.println(mineira.toString());
        System.out.println(chinesa.toString());
        System.out.println(italiana.toString());
    }



}