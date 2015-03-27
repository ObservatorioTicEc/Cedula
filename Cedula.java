public class HelloWorld{

     public static void main(String []args){
        String cedula = "1725412867";
        Boolean v_digitos = false;
        Boolean v_tercero = false;
        Boolean v_provincia = false;
        Boolean v_ultimo = false;
        int k = 0;
        int a;
        int prov;
        int[] coef = {2,1,2,1,2,1,2,1,2};
        int[] ced = {0,0,0,0,0,0,0,0,0,0};
        
        for(int n = 0 ; n<=9 ; n++){
            ced[n] = Character.getNumericValue(cedula.charAt(n));
        }
        
        //Valida numero valido con 10 digitos
        v_digitos = cedula.matches("[0-9]{10}");
        
        //Valida tercer digito menor a 6
        if(ced[2] < 6){v_tercero = true;}
        
        //Valida dos primeros digitos entre 01 y 24 
        prov = ced[0]*10 + ced[1]; 
        if(prov >= 1 && prov <= 24){v_provincia = true;}
        
        //Valida ultimo digito con algoritmo de verificacion
        for(int n = 0 ; n<=8 ; n++){
            a = ced[n] * coef[n];
            if( a >=10 ){a = a - 9;}
            k = k + a;
        }        
        int v = (k/10+1)*10-k;
        if (v >= 10){v = 0;} 
        if (v == ced[9]){v_ultimo = true;}
        
        System.out.println(v)  ;
     }
}
