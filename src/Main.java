import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando listas para armazenar nomes femininos e masculinos
        List<String> nomesFemininos = new ArrayList<>();
        List<String> nomesMasculinos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes seguidos por F ou M, separados por vírgula:");

        String entrada = scanner.nextLine();

        String[] partes = entrada.split(",");
        for (String parte : partes) {
            String[] dados = parte.split("-");
            if (dados.length == 2) {
                String nome = dados[0].trim();
                String sexo = dados[1].trim().toUpperCase();
                if (sexo.equals("F")) {
                    nomesFemininos.add(nome);
                } else if (sexo.equals("M")) {
                    nomesMasculinos.add(nome);
                }

        }

        }
        Collections.sort(nomesFemininos);
        Collections.sort(nomesMasculinos);


        System.out.println("Nomes Femininos ordenados:");
        for (String nomeFeminino : nomesFemininos) {
            System.out.println(nomeFeminino);
        }

        System.out.println("\nNomes Masculinos ordenados:");
        for (String nomeMasculino : nomesMasculinos) {
            System.out.println(nomeMasculino);
        }



}}