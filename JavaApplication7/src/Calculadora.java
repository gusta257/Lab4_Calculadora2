import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Luis Esturban 17256
 * @author Gustavo De Leon 17085
 */
public class Calculadora implements CalculadoraI{
   private static Calculadora calc; 
   public static Calculadora getInstance(){ 
      if (calc == null){ 
          calc = new Calculadora();
      }
      return calc;
  }
    StackFactory sFactory = new StackFactory();

    /**Metodo para calcular los datos que se encuentran en el archivo
     * @param exp
     */
    @Override
    public String calcular(String exp,String rpt) {
        Stack<Integer> vector = sFactory.getStack(rpt);
        int n1;//primer numero ingresado/leido
        int n2; //segundo numero ingresado/leido
        int num;//variable para contener el valor como numero 
        int resp;//respuesta de la suma/resta/multiplicacion/division
        String fin;//contiene el string del resultado final de la pila
        char letra;//variable para controlar el digito que se esta seleccionando
        
        //Ciclo para recorrer el archivo caracter por caracter
        for (int i = 0; i < exp.length(); i++) {
            letra = exp.charAt(i);
            //verifica que el caracter no sea un espacio
            if (letra != ' '){ 
                //si el caracter es un numero entre 0 a 9 
                if(letra >= '0' && letra <= '9'){ 
                    num = Integer.parseInt("" + exp.charAt(i));
                    vector.push(num);
                }
                //si es el simbolo de + hace la suma entre los numeros 
                else if ((letra == '+')){
                    n1 = vector.pop();
                    n2 = vector.pop();
                    resp = n1+n2;
                    vector.push(resp);
                }
                //si es el simbolo de - hace la resta entre los numeros 
                else if ((letra == '-')){ 
                    n2 = vector.pop();
                    n1 = vector.pop();
                    resp = n1-n2;
                    vector.push(resp);
                }
                //si es el simbolo de * hace la multiplicacion entre los numeros 
                else if ((letra == '*')){ 
                    n1 = vector.pop();
                    n2 = vector.pop();
                    resp = n1*n2;
                    vector.push(resp);
                }
                //si es el simbolo de / hace la division entre los numeros 
                else if ((letra == '/')){ 
                    n2 = vector.pop();
                    n1 = vector.pop();
                    resp = n1/n2;
                    vector.push(resp);
                }
            }
        }
        //fin pasa de tipo stack a tipo string 
        fin = vector.pop()+"";
        return fin;
    }
}