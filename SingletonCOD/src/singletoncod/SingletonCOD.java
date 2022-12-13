
package singletoncod;

public class SingletonCOD {
    public static void main(String[] args) {

        System.out.println( Metodos.user1.getUsuario());
        System.out.println(Metodos.user1.getToken());

        Metodos.geNuevoUsuario();
    }
}