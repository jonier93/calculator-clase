package com.example.app_repaso;

public class Calculator {
    private int numero1;
    private int numero2;
    private int resultado;


    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int oper) {
        if (oper==1){
            resultado = numero1 + numero2; // Sumar
        }
        else if (oper==2) {
            resultado = numero1 - numero2; // Restar
        }
        else if (oper==3) {
            resultado = numero1 * numero2; // Multiplicar
        }
        else {
            resultado = numero1 / numero2; // Dividir
        }
    }

}
