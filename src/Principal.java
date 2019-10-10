public class Principal {
     public static int sumaPositivos1(int[] vector){
         return sumaPositivos1Rec(vector, 0, vector.length - 1);
     }

    public static int sumaPositivos2(int[] vector){
         return sumaPositivos2Rec(vector, 0, vector.length - 1);
    }

    public static int sumaPositivos1Rec(int[] vector, int inicio, int fin) {
        int mitad = (inicio + fin) / 2;
        if(inicio == fin) return vector[inicio] > 0 ? vector[inicio] : 0;
        else return sumaPositivos1Rec(vector, inicio, mitad) + sumaPositivos1Rec(vector, mitad + 1, fin);
    }

    public static int sumaPositivos2Rec(int[] vector, int inicio, int fin) {
         int mitad = (inicio + fin)/2;
         if (inicio==fin) return vector[inicio] > 0 ? vector[inicio] : 0;
         else if ((vector[inicio] < vector[fin]) && (vector[inicio] < 0) && (vector[fin] < 0)) return 0;
         else return sumaPositivos2Rec(vector, inicio, mitad) + sumaPositivos2Rec(vector, mitad + 1, fin);
    }
}
