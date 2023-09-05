package contabil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pagamentos pagamentos = new Pagamentos();
        PIS pis = new PIS();
        IPI ipi = new IPI();
        
        String tipo;
        String continuar = "";
        
        do {
            Scanner sc = new Scanner (System.in);
            System.out.println("\nDigite o tipo de imposto (PIS / IPI): ");
            tipo = sc.next();
            
            switch(tipo) {
                case "pis": case "PIS": {
                    System.out.println("Digite o valor do débito: ");
                    pis.setDebito(sc.nextFloat());
                    
                    System.out.println("Digite o valor do crédito: ");
                    pis.setCredito(sc.nextFloat());
                    
                    pagamentos.impostos.add(pis.mostrarDescricao() + " — R$" + Float.toString(pis.calcularImposto()));
                    System.out.println("Valor de R$" + pis.calcularImposto() + " adicionado à lista de pagamentos de impostos");
                    break;
                }
                
                case "ipi": case "IPI": {
                    System.out.println("Digite o valor total: ");
                    ipi.setBase(sc.nextFloat());
                    
                    System.out.println("Digite a alíquota (%): ");
                    ipi.setAliquota(sc.nextFloat());
                    
                    pagamentos.impostos.add(ipi.mostrarDescricao() + " — R$" + Float.toString(ipi.calcularImposto()));
                    System.out.println("Valor de R$" + ipi.calcularImposto() + " adicionado à lista de pagamentos de impostos");
                    break;
                }
                
                case "pare": case "PARE": {
                    System.out.println("Sistema finalizado!");
                    continuar = "PARE"; 
                    break;
                }
                
                default: System.out.println("Erro! Verifique o tipo de imposto enviado"); break;
            } 
        } while(!continuar.equals("PARE"));
        
        System.out.println("Segue a lista de impostos a pagar: ");
        for (String imposto : pagamentos.impostos) System.out.println(imposto);
    }
}
