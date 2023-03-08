package edu.kiltro.segundasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Ola turma, sejam bem-vindos");
        String primeiroNome = "Juan";
        String segundoNome = "Perez";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}