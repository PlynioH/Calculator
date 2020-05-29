package com.company;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        int op;
        double num1, num2, resultado = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("\t\tCalculadora\n\nDigite a Opção desejada:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        op=input.nextInt();

        System.out.print("Digite o Primeiro Número: ");
        num1=input.nextDouble();

        System.out.print("Digite o Segundo Número: ");
        num2=input.nextDouble();

        if(op==1)
        {
            resultado = num1 + num2;
        }
        else if(op==2)
        {
            resultado = num1 - num2;
        }
        else if(op==3)
        {
            resultado = num1 * num2;
        }
        else if(op==4)
        {
            resultado = num1 / num2;
        }

        System.out.println("O Resultado é: " + resultado);
    }
}
