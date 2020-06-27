import java.util.Scanner;

public class ListaEnlazada2 {
    static Nodo primerN = new Nodo(1); // Variable estatica para ultimo nodo
    static Nodo ultmoN = primerN; // Variable estatica para ultimo nodo
    static Nodo tempoN = null; // Variable estatica para nodo temporal
    static Nodo anteriorN = null; // Variable estatica para anterior nodo

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); // Declaracion objeto Scanner para entrada Data
        boolean opc = true; // Bandera para SWITCH
        int opcion = 0;
        // Se asigna valores a la Lista enlazada
        ultmoN = ultmoN.sigNodo = new Nodo(2); // añadidura de nodos(elementos) en la lista
        ultmoN = ultmoN.sigNodo = new Nodo(3); // añadidura de nodos(elementos) en la lista
        ultmoN = ultmoN.sigNodo = new Nodo(4); // añadidura de nodos(elementos) en la lista

        System.out.println("Valores actuales de la Lista");
        imprimirNodos(primerN);
        do{
            System.out.printf("Ingrese la opcion deseada.\n1.Eliminar Nodo especifico\n" +
                    "2.Insertar Nodo Inicio\n3.Insertar Nodo al final\n4.Salir\n");
            opcion = entrada.nextInt(); // Entrada de opcion deseada por el usuario
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor que desea borrar de la lista");
                    int valor = entrada.nextInt();  //Entrada de valor deseada por el usuario
                    eliminarEspecifico(valor); // Metodo eliminar valor de una lista enlazada
                    imprimirNodos(primerN); // Metodo para imprimir los nodos de una lista enlazada
                    break;
                case 2:
                    System.out.println("Ingrese el valor que desea añadir al inicio de la lista");
                    valor = entrada.nextInt();  // Entrada de valor deseada por el usuario
                    insertarInicio(valor); // Metodo insertar valor al inicio de una lista enlazada
                    imprimirNodos(primerN);
                    break;
                case 3:
                    System.out.println("Ingrese el valor que desea añadir al final de la lista");
                    valor = entrada.nextInt();  // Entrada de valor deseada por el usuario
                    insertarFinal(valor); // Metodo insertar valor al Final de una lista enlazada
                    imprimirNodos(primerN);
                    break;
                case 4:
                    opc = false; // Fin del ciclo repetitivo
                    break;
            }
        } while (opc);
    }
    // Metodo para imprimir los nodos
    public static void imprimirNodos( Nodo primerN){
        while (primerN != null){ // Se establece la condición final para finalizar el ciclo
            System.out.printf("%s\t", primerN.valor);
            primerN = primerN.sigNodo; // Permite “iterar” los valores de la lista enlazada
        }
        System.out.println();
    }
    // Metodo para eliminar un nodo especifico buscando su valor en la lista
    public static Object eliminarEspecifico (int valor){
        anteriorN = primerN; // Se toma el primer nodo
        tempoN = primerN.sigNodo;// Se toma el nodo que prosigue al primero
        while (tempoN != null && tempoN.valor != valor){ // Se itera hasta encontar el valor
            anteriorN = anteriorN.sigNodo;
            tempoN = tempoN.sigNodo;
        }
        if (tempoN != null){ // Se evalua si es igual al nulo, es decir donde fue encontrado
            anteriorN.sigNodo =  tempoN.sigNodo;
            if (tempoN == ultmoN)  ultmoN = anteriorN; // Se intercambia finalmente el ultimo con un 2do condicional
        }
        return primerN;
    }
    //Metodo para insertar al inicio el nuevo nodo
    public static Object insertarInicio (int valor){
        Nodo nuevoN = new Nodo(valor, primerN); // Creacion del nuevo nodo con el segundo constructor
        primerN = nuevoN;
        return primerN;
    }
    // Metodo para insertar al final el nuevo nodo
    public static Object insertarFinal (int valor){
        ultmoN = ultmoN.sigNodo = new Nodo(valor);// el valor ultmo lista agrega un nuevo nodo , el nuevo final
        return primerN;
    }
}
// Clase para crear nodos de la lista enlazada
class Nodo {
    public int valor;
    public Nodo sigNodo;
    // Constructor 1 que acepta la creacion del nodo y un valor nulo al final
    public Nodo(int valor) {
        //this.valor = valor;
        this(valor, null);
    }
    // Constructor 2 que acepta la creacion del nodo y con el nodo siguiente
    public Nodo(int valor, Nodo nodo) {
        this.valor = valor;
        this.sigNodo = nodo;
    }
}