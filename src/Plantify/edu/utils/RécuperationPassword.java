package Plantify.edu.utils;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;
import com.codename1.ui.Dialog;

import java.util.Map;

public class RécuperationPassword {

    

    public boolean recuperationpassw(String email) {

        ConnectionRequest con = new ConnectionRequest();// création d'une nouvelle demande de connexion
        String Url = "http://127.0.0.1:8000/api/test" ;// création de l'URL
        con.setUrl(Url);// Insertion de l'URL de notre demande de connexion
        con.setHttpMethod("GET");
       // con.addArgument("email", email);
        con.addResponseListener((e) -> {
            String str = new String(con.getResponseData());//Récupération de la réponse du serveur
            if (str.equals("Unexpected")==false){
                System.out.println(str);//Affichage de la réponse serveur sur la console
                JSONParser j = new JSONParser();// Instanciation d'un objet JSONParser permettant le parsing du résultat json
                try {
                    Map<String, Object> mail = j.parseJSON(new CharArrayReader (new String(con.getResponseData()).toCharArray()));
                    System.out.println(mail);
                   String test = mail.get("test").toString();

                    if(test == "OK"){
                        Dialog.show("mail envoyé a ","", "OK", null);

                    };

                }catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }}
        });
        NetworkManager.getInstance().addToQueueAndWait(con);// Ajout de notre demande de connexion à la file d'attente du NetworkManager
        return true;
    }

}

