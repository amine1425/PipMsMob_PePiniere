package Plantify.edu.services;

import Plantify.edu.entities.Category;
import com.codename1.io.*;
import com.codename1.ui.events.ActionListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class CrudCategory {


    ArrayList<Category> ListCate;
    private ArrayList<Category> ParseListeProdJson(String json) {
        ArrayList<Category> listProduits = new ArrayList<>();
        try {
            JSONParser parser = new JSONParser();
            Map<String, Object> produits = parser.parseJSON(new CharArrayReader (json.toCharArray()));
            List<Map<String, Object>> list = (List<Map<String, Object>>) produits.get("root");
            for (Map<String, Object> obj : list) {
                Category prod = new Category();

                if(obj != null) {
                    float id = Float.parseFloat(obj.get("id").toString());
                    prod.setId((int) id);
                    // List sellerr = (List) obj.get("seller");
                    prod.setDescription(obj.get("description").toString());
                    prod.setName(obj.get("name").toString());
                    listProduits.add(prod);

                } }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error Json parser !");
        }
        return listProduits;
    }

    public ArrayList<Category> getListCat() {
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/categories");
        con.setHttpMethod("GET");
        con.addResponseListener((e) -> {
            String str = new String(con.getResponseData());//Récupération de la réponse du serveur
            System.out.println(str);
            //Affichage de la réponse serveur sur la console
            ListCate =new ArrayList<>(ParseListeProdJson(str));
        });
        NetworkManager.getInstance().addToQueueAndWait (con);//addToQueue(con);

        return ListCate;
    }


    String resp="";
    public String addCategory(String name,String description){ //, String image,String status , String price, String quantity){ //} ,int idUser,int idCategory){

        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/categories/new");
        con.setHttpMethod ( "POST" );
        con.addArgument("name", name);
        con.addArgument("description", description);

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

    public String deleteCategory(String id){

        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/categories/delete/"+id);
        con.setHttpMethod ( "DELETE" );



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
