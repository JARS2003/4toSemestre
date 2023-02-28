package utilerias.matematicas;

import estructuraslineales.PilaEstatica;

public class ExpresionesMatematicas {

    public static String infijaAPostfija(String infija){
        return "";
    }

    public static String infijaAPrefija(String infija){
        return "";
    }

    public static Double evaluarPostfija (String postfija){
        //a 8 + 3 x * 4 z ^ / -
        //0 1 2 3 4 5 6 7 8 9 10, posiciones
        PilaEstatica pila = new PilaEstatica(postfija.length());

        for (int cadaToken = 0; cadaToken < postfija.length(); cadaToken++){
            //1. Tokenizar izq-der
            char token = postfija.charAt(cadaToken);

            //2. Si es opernado, meter a la pila
            if (esOperando("" + token) == true){
                boolean resultadoPila = pila.poner("" + token);
                if (resultadoPila == false){
                    return null;
                }
            } else { //es operador
                //3. Si es operador, sacar 2 operandos
                // (el primero es op2)
                String operando2 = (String) pila.quitar();
                String operando1 = (String) pila.quitar();

                if (operando1 == null || operando2 == null){
                    return null;
                } else {
                    //Aplicar la operacion con ellos
                    Double resultadoParcial = operacicon(Double.parseDouble(operando1), Double.parseDouble(operando2), token);
                    //Meter el resultado en la pila
                    if (resultadoParcial == null){
                        return null;
                    } else {
                        boolean resultadoPila = pila.poner("" + resultadoParcial);
                        if (resultadoPila == false){
                            return null;
                        }
                    }
                }
            }
        }
        //4. el resultado final esta en la pila.
        String resultadoFinal = (String)pila.quitar();
        if (resultadoFinal != null) {
            return Double.parseDouble(resultadoFinal);
        } else {
            return null;
        }
    }
    public static Double evaluarPrefija (String prefija){
        //a 8 + 3 x * 4 z ^ / -
        //0 1 2 3 4 5 6 7 8 9 10, posiciones
        PilaEstatica pila = new PilaEstatica(prefija.length());

        for (int cadaToken =prefija.length()-1 ; cadaToken >=0; cadaToken--){
            //1. Tokenizar der-izq
            char token = prefija.charAt(cadaToken);

            //2. Si es opernado, meter a la pila
            if (esOperando("" + token) == true){
                boolean resultadoPila = pila.poner("" + token);
                if (resultadoPila == false){
                    return null;
                }
            } else { //es operador
                //3. Si es operador, sacar 2 operandos
                // (el primero es op2)
                String operando1 = (String) pila.quitar();
                String operando2 = (String) pila.quitar();

                if (operando1 == null || operando2 == null){
                    return null;
                } else {
                    //Aplicar la operacion con ellos
                    Double resultadoParcial = operacicon(Double.parseDouble(operando1), Double.parseDouble(operando2), token);
                    //Meter el resultado en la pila
                    if (resultadoParcial == null){
                        return null;
                    } else {
                        boolean resultadoPila = pila.poner("" + resultadoParcial);
                        if (resultadoPila == false){
                            return null;
                        }
                    }
                }
            }
        }
        //4. el resultado final esta en la pila.
        String resultadoFinal = (String)pila.quitar();
        if (resultadoFinal != null) {
            return Double.parseDouble(resultadoFinal);
        } else {
            return null;
        }
    }

    public static boolean esOperando(String token){
        if(token.equalsIgnoreCase("+")){
            return false;
        } else if(token.equalsIgnoreCase("-")){
            return false;
        } else if(token.equalsIgnoreCase("/")){
            return false;
        } else if(token.equalsIgnoreCase("*")){
            return false;
        } else if(token.equalsIgnoreCase("^")){
            return false;
        } else if(token.equalsIgnoreCase("%")){
            return false;
        } else if(token.equalsIgnoreCase("(")){
            return false;
        } else if(token.equalsIgnoreCase(")")){
            return false;
        }
        return true;
    }

    public static Double operacicon(double operando1, double operando2, char operador){
        if(operador=='+'){
            return operando1 + operando2;
        } else if (operador=='-') {
            return operando1 - operando2;
        } else if (operador=='/') {
            if(operando2==0){
                return null;
            }
            return operando1/operando2;
        } else if(operador=='*'){
            return operando1*operando2;
        } else if(operador=='^'){
            return Math.pow(operando2, operando1);
        } else if (operador=='%') {
            return operando1%operando2;
        }
        return null;
    }
}