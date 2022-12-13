# Singleton

En el main llamaremos al objeto de la siguiente manera:

package singletoncod;

public class SingletonCOD {
    public static void main(String[] args) {

        System.out.println( Metodos.user1.getUsuario());
        System.out.println(Metodos.user1.getToken());

        Metodos.geNuevoUsuario();
    }
}


Mientras que lo haremos de la siguiente manera para crear los objetos:

package singletoncod;

public class SingletonCOD {
    public static void main(String[] args) {

        System.out.println( Metodos.user1.getUsuario());
        System.out.println(Metodos.user1.getToken());

        Metodos.geNuevoUsuario();
    }
}

