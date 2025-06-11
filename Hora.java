package trabalhopratico04;
import java.util.Scanner;

public class Hora {
    Scanner scanner = new Scanner(System.in);
    //Atributos
    private int dia;
    private int mes;
    private int ano;
    public Hora()
    {        
        while(true)
        {
            System.out.println("Digite o dia: ");
            int Dia = scanner.nextInt();
            
            if(Dia >= 1 && Dia <= 31)
            {
                dia = Dia;
                break;
            }else {
                System.out.println("Dia inválido! Digite um valor correto!!!");
            }              
        }
        
        while(true){
            System.out.println("Digite o mês:");
            int Mes = scanner.nextInt();
            
            if(Mes >= 1 && Mes <= 12)
            {
                if (Mes == 2 && dia > 29) {
                    System.out.println("Mês inválido! Digite um valor correto!!!");
                } else {
                    mes = Mes;
                    break;
                }
            } else {
                System.out.println("Mês inválido! Digite um valor correto!!!");
            }
        }
        
        while (true) {
            System.out.println("Digite o Ano");
            int Ano = scanner.nextInt();

            if (Ano > 0) {
                // Se for 29 de fevereiro, ano precisa ser bissexto
                if (mes == 2 && dia == 29) {
                    if ((Ano % 400 == 0) || (Ano % 4 == 0 && Ano % 100 != 0)) {
                        ano = Ano;
                        break;
                    } else {
                        System.out.println(Ano + " não é bissexto. Digite um ano bissexto!");
                    }
                } else {
                    // Para outros dias, qualquer ano válido serve
                    ano = Ano;
                    break;
                }
            } else {
                System.out.println("Ano inválido! Digite um valor correto!!!");
            }
        }     
        

    }
    
    
}
