package arboles;
import javax.swing.JPanel;

public class Arbol {
    // Creacion de los nodos de cada rama del arbol
    public class Nodo {
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave; 

        // Contenido de arbol
        public Nodo (int indice){
            llave = indice;
            derecha = null;
            izquierda = null;
            padre = null;
        }
    }

    public static Nodo raiz;
    
    public Arbol(){
        raiz = null;
    }

    // Metodo para insertar valores dentro de los nodos del arbol
    public void insertar(int i){
        Nodo nuevo = new Nodo(i);// el contenido del nuevo nodo sera = a la informacion agregada por usuario

        // Si es el inicio del arbol, se establece como la raiz el nodo insertado
        if (raiz == null){
            raiz = nuevo;
        } else {
            Nodo auxiliar = raiz;
            while (auxiliar != null){
                nuevo.padre = auxiliar;
                if (nuevo.llave >= auxiliar.llave){
                    auxiliar = auxiliar.derecha;
                } else {
                    auxiliar = auxiliar.izquierda;
                }
            }
            // Metodo para unir nodos
            if (nuevo.llave < nuevo.padre.llave){
                nuevo.padre.izquierda = nuevo;
            } else {
                nuevo.padre.derecha = nuevo;
            }
        }
    }
    // ---------------------------------------------------------------------------


    public boolean buscar(Nodo raiz, int x) {
        if (raiz == null) {
            return (false);
        }
        int compara = ((Comparable) raiz.llave).compareTo(x);
        if (compara > 0) {
            return (buscar(raiz.izquierda, x));
        } else if (compara < 0) {
            return (buscar(raiz.derecha, x));
        } else {
            return (true);
        }
    }
    
    public int borrar(int x) {
        if (!this.buscar(this.raiz, x))  return 0;
        
        Nodo z = borrar(this.raiz, x);
        this.raiz = z;
        return x;

    }

    private Nodo borrar(Nodo raiz, int x) {
        if (raiz == null) return null;	
        
        int compara = ((Comparable) raiz.llave).compareTo(x);
        if (compara > 0) {
            raiz.izquierda = (borrar(raiz.izquierda, x));
        } else if (compara < 0) {
            raiz.derecha = (borrar(raiz.derecha , x));
        } else {
            if (raiz.izquierda != null && raiz.derecha != null) {
                /*
                 *	Buscar el menor de los derechos y lo intercambia por el dato
                 *	que desea borrar. La idea del algoritmo es que el dato a borrar 
                 *	se coloque en una hoja o en un nodo que no tenga una de sus ramas.
                 **/
                Nodo cambiar = buscarMin(raiz.derecha);
                int aux = cambiar.llave;
                cambiar.llave = (raiz.llave);
                raiz.llave = (aux);
                raiz.derecha = (borrar(raiz.derecha, x));
            } else {
                raiz = (raiz.izquierda != null) ? raiz.izquierda : raiz.derecha;
            }
        }
        return raiz;
    }
    
    private Nodo buscarMin(Nodo r) {
        for (; r.izquierda != null; r = r.derecha);
        return (r);
    }
    //--------------------------------------------------------------------
    
    static String inc = "";
    public String postOrden(Nodo raiz){
          
        if (raiz != null){
            postOrden(raiz.izquierda);
            postOrden(raiz.derecha);
            inc = String.format("%s%d, ", inc, raiz.llave);
        }
        return inc;
    }
    public String preOrden(Nodo raiz){
        if (raiz != null){
            inc = String.format("%s%d, ", inc, raiz.llave);
            preOrden(raiz.izquierda); //pasa a
            preOrden(raiz.derecha);
        }
        return inc;
    }
    public String inOrden(Nodo raiz){
        if (raiz != null){
            inOrden(raiz.izquierda);
            inc = String.format("%s%d, ", inc, raiz.llave);
            inOrden(raiz.derecha);
        }
        return inc;
    }
    
    public JPanel getdibujo() {
        return new Grafico1(this);
    }
}
