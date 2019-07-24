package Plantify.edu.services;

import Plantify.edu.entities.Post;
import com.codename1.io.*;
import com.codename1.ui.events.ActionListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class CrudPost {


    ArrayList<Post> ListProd;
    private ArrayList<Post> ParseListeProdJson(String json) {
        ArrayList<Post> listProduits = new ArrayList<>();
        try {
            JSONParser parser = new JSONParser();
            Map<String, Object> produits = parser.parseJSON(new CharArrayReader (json.toCharArray()));
            List<Map<String, Object>> list = (List<Map<String, Object>>) produits.get("root");
            for (Map<String, Object> obj : list) {
                Post prod = new Post();

                if(obj != null) {
                    float id = Float.parseFloat(obj.get("id").toString());
                    prod.setId (obj.get("id").toString());
                    prod.setContent (obj.get("content").toString());
                    prod.setUser ( obj.get("user").toString());
                    prod.setImage(obj.get("image").toString());
                    //prod.setCreatedAt (obj.get("createdAt").toString());


                    listProduits.add(prod);

                } }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error Json parser !");
        }
        return listProduits;
    }

    public ArrayList<Post> getListPost() {
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/posts");
        con.setHttpMethod("GET");
        con.addResponseListener((e) -> {
            String str = new String(con.getResponseData());//Récupération de la réponse du serveur
            System.out.println(str);
            //Affichage de la réponse serveur sur la console
            ListProd =new ArrayList<>(ParseListeProdJson(str));
        });
        NetworkManager.getInstance().addToQueueAndWait (con);//addToQueue(con);

        return ListProd;
    }


    String resp="";
    public String addPost(String content, String image,String user ){

        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/posts/new");
        con.setHttpMethod ( "POST" );
        con.addArgument("content", content);
        con.addArgument("image", image);
        con.addArgument("user", user);
        con.addArgument("created_at","2019-07-21T10:34:55+00:00");
        con.addArgument("updated_at","2019-07-21T10:34:55+00:00");

//        con.addArgument("seller",Integer.toString(idUser));
//        con.addArgument("category",Integer.toString(idCategory));


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

    public String deletePost(String id){

        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/posts/delete/"+id);
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