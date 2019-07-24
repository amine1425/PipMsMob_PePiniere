package Plantify.edu.services;

import Plantify.edu.entities.Product;
import com.codename1.io.*;
import com.codename1.ui.events.ActionListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CrudStore {


    ArrayList<Product> ListProd;
    private ArrayList<Product> ParseListeProdJson(String json) {
        ArrayList<Product> listProduits = new ArrayList<>();
        try {
            JSONParser parser = new JSONParser();
            Map<String, Object> produits = parser.parseJSON(new CharArrayReader(json.toCharArray()));
            List<Map<String, Object>> list = (List<Map<String, Object>>) produits.get("root");
            for (Map<String, Object> obj : list) {
                Product prod = new Product();

                if(obj != null) {
                    float id = Float.parseFloat(obj.get("id").toString());
                    prod.setId((int) id);
                   // List sellerr = (List) obj.get("seller");
                    prod.setDescription(obj.get("description").toString());
                    prod.setName(obj.get("name").toString());
                    prod.setImage(obj.get("image").toString());
                    prod.setPrice (obj.get("price").toString());

//                    List category = (List) obj.get("category");
//                    prod.setCategory (category.get ( 2 ).toString());
//                    Map<String, Object> parent = (Map<String, Object>) obj.get("category");
//                    String idp=parent.get("name").toString();
//                    prod.setCategory(idp);

                    listProduits.add(prod);

                } }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error Json parser !");
        }
        return listProduits;
    }

    public ArrayList<Product> getListProd() {
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/products");
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
    public String addProduct(String name,String description, String image,String status , String price, String quantity){ //} ,int idUser,int idCategory){

        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/products/new");
        con.setHttpMethod ( "POST" );
        // ?titre="+titre+"&description="+description+"&nbrParticipant="+nbrParticipant+"&privilege="+privilege+"&ville="+ville+"&user="+idUser

        con.addArgument("name", description);
        con.addArgument("description", description);
        con.addArgument("image", image);
        con.addArgument("status", status);
        con.addArgument("price", price);
        con.addArgument("discountEndDate","2019-07-21T10:34:55+00:00");
        con.addArgument("discountBeginDate","2019-07-21T10:34:55+00:00");
        con.addArgument("discount",Integer.toString(1));
        con.addArgument("quantity",quantity);
        con.addArgument("seller",Integer.toString(1));
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

    public String deleteProduct(String id){

        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/products/delete/"+id);
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