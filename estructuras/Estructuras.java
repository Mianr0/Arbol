package estructuras;

public class Estructuras {

    public static void main(String[] args) {

        Arbol arbol = new Arbol();

        arbol.insertar(4, "mandarinas");
        arbol.insertar(6, "manzanas");
        arbol.insertar(1, "toronjas");
        arbol.insertar(10, "toronjas");
        arbol.insertar(100, "toronjas");
        arbol.insertar(3, "toronjas");
        arbol.insertar(37, "toronjas");

        arbol.recorrer(arbol.raiz);
    }
}