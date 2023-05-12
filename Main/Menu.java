package Main;

import java.util.Scanner;

public class Menu {
    public static void Menu1(){
        System.out.println("\t Entrar :");
        System.out.println("\t Cadastrar: ");
    }

public static void main(String[] args){
    int opcao;
    Scanner entrada = new Scanner(System.in);

    do{
        Menu1();
        opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                String Login;
                String Senha;

                break;
            case 2:

            default:
                break;
        }
    }
}
}


