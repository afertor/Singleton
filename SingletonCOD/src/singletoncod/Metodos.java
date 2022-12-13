package singletoncod;
public class Metodos {
    private String usuario = "";
    private String token ="";

   private Metodos(String usuario,String token){
        this.usuario = usuario;
        this.token = token;
    }
    private Metodos() {
    }
    public void setUsuario(){

    }
    public String getUsuario() {
        return usuario;
    }
    public String getToken() {
        return token;
    }

    public static Metodos user1 = new Metodos("Adrian","3214ER");

   private static Metodos user2 = null;

   public static Metodos geNuevoUsuario(){
       if (user2 == null){
           user2 = new Metodos();
       }
       return user2;
   }


}