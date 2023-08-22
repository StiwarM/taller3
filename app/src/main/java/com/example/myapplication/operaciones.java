package com.example.myapplication;

public class operaciones {
    public String nota(String numero1, String numero2,String numero3,String numero4){
        int resultado = Integer.valueOf(numero1) + Integer.valueOf(numero2) + Integer.valueOf(numero3) + Integer.valueOf(numero4);
        return String.valueOf(resultado);
    }
}
