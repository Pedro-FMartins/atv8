/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv_8;

import java.util.Scanner;
/**
 *
 * @author Pedro Ferreira Martins <'11201100435'>
 */
public class Faturmento {
    
    public static void main(String[] args) {
        
        // Importando a função "Scanner" do Java.
        Scanner sc = new Scanner(System.in);
        Produto x = new Produto();
        
        System.out.println(" ___________________________ ");
        System.out.println("|                           |");
        System.out.println("| Total de Vendas - Diário  |");
        System.out.println("|          Padaria          |");
        System.out.println("|___________________________| \n");
        
        // Input de dados:
        System.out.println("-> Informe os seguintes dados para a realização do cálculo:\n");
        
        // Descrição do produto a ser calculado:
        System.out.println("Descrição do produto: ");
        String descricao = sc.nextLine();
        x.SetDesc(descricao);
        System.out.println();
        
        // Código do produto em questão:
        System.out.println("Código do produto: ");
        int codigo = sc.nextInt();
        x.SetCod(codigo);
        System.out.println();
        
        // Valor da unidade do produto:
        System.out.println("Valor unitário do produto: ");
        double v_u = sc.nextDouble();
        x.SetVU(v_u);
        System.out.println();
        
        // Quantidade vendas deste produto no dia:
        System.out.println("Quantidade vendida deste produto: ");
        double q_v = sc.nextDouble();
        x.SetQV(codigo);
        System.out.println();
        
        // Display do valor total de vendas do produto no dia:
        x.Calcular_Total();
        
    }
    
}
