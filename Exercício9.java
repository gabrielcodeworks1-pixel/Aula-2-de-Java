/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Exercicio9 {
    public static void main (String [] args) {
        
        double valorCompra = 150.00; // Defina aqui o valor da compra
        double valorFinal;

        if (valorCompra > 100) {
            valorFinal = valorCompra - (valorCompra * 0.10); // Desconto de 10%
        } else {
            valorFinal = valorCompra - (valorCompra * 0.05); // Desconto de 5%
        }

        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Valor final com desconto: R$ " + valorFinal);
    }
