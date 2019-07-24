package Plantify.edu.utils;

import Plantify.edu.entities.User;
import com.codename1.io.*;
import com.codename1.ui.events.ActionListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserController {

    int response=-1;
    ArrayList<User> ListUser = new ArrayList<>();

    public int connection(String email,String pwd) {

        ConnectionRequest con = new ConnectionRequest();// création d'une nouvelle demande de connexion
        String Url = "http://127.0.0.1:8000/api/users" ;// création de l'URL
        con.setUrl(Url);// Insertion de l'URL de notre demande de connexion
        con.setHttpMethod("GET");
        con.addResponseListener((e) -> {
            String str = new String(con.getResponseData());//Récupération de la réponse du serveur
            if (str.equals("Unexpected")==false){
                System.out.println(str);//Affichage de la réponse serveur sur la console
                JSONParser j = new JSONParser();// Instanciation d'un objet JSONParser permettant le parsing du résultat json
                try {
                    Map<String, Object> user = j.parseJSON(new CharArrayReader(new String(con.getResponseData()).toCharArray()));
                    System.out.println(user);
                    List<Map<String, Object>> list = (List<Map<String, Object>>) user.get("root");
                    for (Map<String, Object> obj : list) {
                        User u=new User();
                        float id = Float.parseFloat(obj.get("id").toString());
                        u.setId((int)id);
                        u.setPassword(obj.get("password").toString());
                        u.setEmail(obj.get("email").toString());
                           ListUser.add(u);
                    }
                        System.out.println(ListUser);

                    if (ListUser.get(1).toString().equals(pwd.toString()) && ListUser.get(2).toString().equals(email.toString()) )
                    {
                        response=1;
                    } else {
                        response=1;
                    }
//                    if(user.get("file")!=null){
//                        userConnectee.setFile(user.get("file").toString());}
//                    if(user.get("path")!=null){
//                        userConnectee.setPath(user.get("path").toString());}

                }catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }}
        });
        NetworkManager.getInstance().addToQueueAndWait(con);// Ajout de notre demande de connexion à la file d'attente du NetworkManager
        return response;
    }



    String resp="";
    public String addUser(String name,String Prenom, /*String image,*/String CIN , String email, String password){ //} ,int idUser,int idCategory){

         ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/users/new");
        con.setHttpMethod ( "POST" );
        con.addArgument("first_name", name);
        con.addArgument("last_name", Prenom);
        //con.addArgument("image", image);
        con.addArgument("cin", CIN);
        con.addArgument("email", email);
        con.addArgument("password",password);
        con.addArgument ( "coordinate_lat","1");
        con.addArgument ( "coordinate_Lng","2");
        con.addArgument ( "address","address" );
        con.addArgument ( "status","status" );
      //  con.addArgument("roles","['\'SELLER\'', null]");

        con.addResponseListener(new ActionListener<NetworkEvent> () {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                try {
                    resp = new String(con.getResponseData());
                    System.out.println(resp);
                }
                catch(Exception e){
                    e.getMessage();
                }
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);//pour etablir la conx
        System.err.println ( resp );
        return resp;
    }

    public String deleteUser(String id){

        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/users/delete/"+id);
        con.setHttpMethod ( "DELETE" );

        // con.addArgument("id", id);

        con.addResponseListener(new ActionListener<NetworkEvent> () {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                try {
                    resp = new String(con.getResponseData());
                    System.out.println(resp);
                }
                catch(Exception e){
                    e.getMessage();
                }
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        System.err.println ( resp );
        return resp;
    }

}

