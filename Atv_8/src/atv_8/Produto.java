/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv_8;

/**
 *
 * @author Pedro Ferreira Martins <'11201100435'>
 */
public class Produto {
    
    private int codigo;
    private String descricao;
    private double valor_unit;
    private double qnt_vendida;
    
    // Serve para possibilitar a conversão dos dados:
    private double qnt_v;
    
    private double total_vendas;
    
    public void SetCod(int codigo){
        this.codigo = codigo;
    }
    public int GetCod(){
        return codigo;
    }
    
    public void SetDesc(String descricao){
        this.descricao = descricao;
    }
    public String GetDesc(){
        return descricao;
    }
    
    public void SetVU(double v_u){
        this.valor_unit = v_u;
    }
    public double GetVU(){
        return valor_unit;
    }
    
    public void SetQV(double q_v){
        this.qnt_vendida = q_v;
    }
    public double GetQV(){
        return qnt_vendida;
    }
    
    
    // Cálculo final:
    public void Calcular_Total(){
        
        total_vendas = qnt_vendida*valor_unit;
        
        System.out.println("O total de vendas deste produto foi de: R$" + total_vendas + ".");
    }
}
