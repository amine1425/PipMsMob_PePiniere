package Plantify.edu.services;

import Plantify.edu.entities.Delivery;
import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class CrudDelivery {


    ArrayList<Delivery> ListProd;
    private ArrayList<Delivery> ParseListeProdJson(String json) {
        ArrayList<Delivery> listProduits = new ArrayList<>();
        try {
            JSONParser parser = new JSONParser();
            Map<String, Object> produits = parser.parseJSON(new CharArrayReader (json.toCharArray()));
            List<Map<String, Object>> list = (List<Map<String, Object>>) produits.get("root");
            for (Map<String, Object> obj : list) {
                Delivery prod = new Delivery();

                if(obj != null) {
                    float id = Float.parseFloat(obj.get("id").toString());
                    prod.setId((int) id);
                   //  List orderr = (List) obj.get("order");
                    prod.setAdress (obj.get("address").toString());
                    prod.setStatus (obj.get("status").toString());
                   // prod.setOrder (orderr.get ( 2 ).toString());
                  //  prod.setValidated_at (obj.get("validatedAt").toString());
                    //   prod.setDiscount_end_date (obj.get("discount_end_date").toString());
                    //prod.setSeller(sellerr.get(0).toString());

                    listProduits.add(prod);

                } }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error Json parser !");
        }
        return listProduits;
    }

    public ArrayList<Delivery> getListDeliv() {
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/deliveries");
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


//    String resp="";
//    public String addDelivery(String address,String order, String status){
//
//        ConnectionRequest con = new ConnectionRequest();
//        con.setUrl("http://127.0.0.1:8000/api/delivery/new");
//        con.setHttpMethod ( "POST" );
//        // ?titre="+titre+"&description="+description+"&nbrParticipant="+nbrParticipant+"&privilege="+privilege+"&ville="+ville+"&user="+idUser
//
//        con.addArgument("address", address);
//        con.addArgument("order", order);
//        con.addArgument("status", status);
//        con.addArgument("validatedAt","2019-07-21T10:34:55+00:00");
////        con.addArgument("seller",Integer.toString(idUser));
////        con.addArgument("category",Integer.toString(idCategory));
//
//        con.addResponseListener(new ActionListener<NetworkEvent> () {
//            @Override
//            public void actionPerformed(NetworkEvent evt) {
//                try {
//                    resp = new String(con.getResponseData());
//                    System.out.println(resp);
//                }
//                catch(Exception e){
//                    e.getMessage();
//                }
//            }
//        });
//        NetworkManager.getInstance().addToQueueAndWait(con);//pour etablir la conx
//        System.err.println ( resp );
//        return resp;
//    }
//
//    public String deleteDelivery(String id){
//
//        ConnectionRequest con = new ConnectionRequest();
//        con.setUrl("http://127.0.0.1:8000/api/products/delivery/"+id);
//        con.setHttpMethod ( "DELETE" );
//
//        // con.addArgument("id", id);
//
//        con.addResponseListener(new ActionListener<NetworkEvent> () {
//            @Override
//            public void actionPerformed(NetworkEvent evt) {
//                try {
//                    resp = new String(con.getResponseData());
//                    System.out.println(resp);
//                }
//                catch(Exception e){
//                    e.getMessage();
//                }
//            }
//        });
//        NetworkManager.getInstance().addToQueueAndWait(con);
//        System.err.println ( resp );
//        return resp;
//    }
}