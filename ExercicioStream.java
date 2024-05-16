
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alves.ferreira
 */

public class ExercicioStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome e o sexo separados por virgulas: ");
        System.out.println("Exemplo: João-m, Maria-f,... ");
        
        String stringDigitada = sc.nextLine();
        String[] palavras = stringDigitada.split(",");
        
        List<String> nomes = new ArrayList<>();
        
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].contains("f")) {
                nomes.add(palavras[i]);
            }
            if (palavras[i].contains("m")) {
                nomes.add(palavras[i]);
            }
        }
        
        List<String> femininos = nomes.stream()
                .filter(nome -> nome.endsWith("-f"))
                .collect(Collectors.toList());
        for (String feminino : femininos) {
            System.out.println(feminino);
        }
                
    }
}
