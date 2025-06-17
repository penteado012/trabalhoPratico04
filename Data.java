package com.mycompany.trabalhopraticojava04;


import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

public class Data {

    Scanner scanner = new Scanner(System.in);
    //Atributos
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        while (true) {
            System.out.println("Digite o dia: ");
            int Dia = scanner.nextInt();

            if (Dia >= 1 && Dia <= 31) {
                dia = Dia;
                break;
            } else {
                System.out.println("Dia invalido! Digite um valor correto!!!");
            }
        }

        while (true) {
            System.out.println("Digite o mes:");
            int Mes = scanner.nextInt();

            if (Mes >= 1 && Mes <= 12) {
                if (Mes == 2 && dia > 29) {
                    System.out.println("Mes invalido! Digite um valor correto!!!");
                } else {
                    mes = Mes;
                    break;
                }
            } else {
                System.out.println("Mes invalido! Digite um valor correto!!!");
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
                        System.out.println(Ano + " nao e bissexto. Digite um ano bissexto!");
                    }
                } else {
                    // Para outros dias, qualquer ano valido serve
                    ano = Ano;
                    break;
                }
            } else {
                System.out.println("Ano invalido! Digite um valor correto!!!");
            }
        }

    }

    public Data(int d, int m, int a) {

        while (true) {
            if (m < 1 || m > 12) {
                System.out.println("Mês inválido! Digite novamente:");
                m = scanner.nextInt();
                continue;
            }

            if (a <= 0) {
                System.out.println("Ano inválido! Digite novamente:");
                a = scanner.nextInt();
                continue;
            }

            if (!diaValido(d, m, a)) {
                System.out.println("Dia inválido para esse mês/ano! Digite novamente:");
                d = scanner.nextInt();
                continue;
            }

            break;
        }

        dia = d;
        mes = m;
        ano = a;
    }

    public void entraDia(int d) {
        while (!diaValido(d, mes, ano)) {
            System.out.println("Dia inválido para o mês " + mes + " e ano " + ano + ". Digite novamente:");
            d = scanner.nextInt();
        }

        dia = d;
    }

    public void entraMes(int m) {
        while (m < 1 || m > 12) {
            System.out.println("Mes invalido! Digite novamente: ");
            m = scanner.nextInt();
        }

        mes = m;
    }

    public void entraAno(int a) {
        while (true) {
            if (a > 0) {
                if (mes == 2 && dia == 29) {
                    if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)) {
                        break;
                    } else {
                        System.out.println(a + " nao e bissexto. Digite um ano bissexto! Digite novamente");
                        a = scanner.nextInt();
                    }
                } else {
                    break;
                }
            } else {
                System.out.println("Ano invalido! Digite novamente: ");
                a = scanner.nextInt();
            }

        }

        ano = a;
    }

    public void entraDia() {
        while (true) {
            System.out.println("Digite o dia: ");
            int d = scanner.nextInt();

            if (dia >= 1 && dia <= 31) {
                dia = d;
                break;
            } else {
                System.out.println("Dia invalido! Digite um valor correto!!!");
            }
        }
    }

    public void entraMes() {
        while (true) {
            System.out.println("Digite o mes:");
            int m = scanner.nextInt();

            if (mes >= 1 && mes <= 12) {
                if (mes == 2 && dia > 29) {
                    System.out.println("Mes invalido! Digite um valor correto!!!");
                } else {
                    mes = m;
                    break;
                }
            } else {
                System.out.println("Mes invalido! Digite um valor correto!!!");
            }
        }

    }

    public void entraAno() {
        while (true) {
            System.out.println("Digite o Ano");
            int a = scanner.nextInt();

            if (a > 0) {
                // Se for 29 de fevereiro, ano precisa ser bissexto
                if (mes == 2 && dia == 29) {
                    if ((bissexto(a))) {
                        ano = a;
                        break;
                    } else {
                        System.out.println(a + " nao e bissexto. Digite um ano bissexto!");
                    }
                } else {
                    ano = a;
                    break;
                }
            } else {
                System.out.println("Ano invalido! Digite um valor correto!!!");
            }
        }
    }

    public int retDia() {
        return dia;
    }

    public int retMes() {
        return mes;
    }

    public int retAno() {
        return ano;
    }

    public void mostra1() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public void mostra2() {
        String mesExtenso = "";
        
        switch (mes) {
            case 1 -> mesExtenso = "janeiro";
            case 2 -> mesExtenso = "fevereiro";
            case 3 -> mesExtenso = "março";
            case 4 -> mesExtenso = "abril";
            case 5 -> mesExtenso = "maio";
            case 6 -> mesExtenso = "junho";
            case 7 -> mesExtenso = "julho";
            case 8 -> mesExtenso = "agosto";
            case 9 -> mesExtenso = "setembro";
            case 10 -> mesExtenso = "outubro";
            case 11 -> mesExtenso = "novembro";
            case 12 -> mesExtenso = "dezembro";
            default -> throw new AssertionError();
        }
        
        System.out.println(dia+"/"+mesExtenso+"/"+ano);
    }
    
    private boolean bissexto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }
    
    public boolean bissexto() {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }
    
    private boolean diaValido(int dia, int mes, int ano) {
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (mes == 2 && bissexto(ano)) {
            return dia >= 1 && dia <= 29;
        }

        return dia >= 1 && dia <= diasPorMes[mes - 1];
    }
        
    public int diasTranscorridos(){
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if(bissexto(ano)){
            diasMes[1] = 29;
        }
        
        int soma = 0;
        
        for(int i = 0; i < mes - 1; i++){
            soma += diasMes[i];
        }
        
        soma+=dia;
        
        return soma;
    }
    
    public static void apresentaDataAtual(){
        Date dataAtualDate = new Date();
        DateFormat dataAtualFormat = DateFormat.getDateInstance(DateFormat.FULL);
        
        System.out.println("Data atual (classe Data)" + dataAtualDate);
        System.out.println("Data atual (classe DateFormat) " + dataAtualFormat.format(dataAtualDate));
    }

}
