package Plantify.edu.services;

import Plantify.edu.entities.FlashSale;
import com.codename1.io.*;
import com.codename1.ui.events.ActionListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlashSaleService {



        ArrayList<FlashSale> ListFlash;
        private ArrayList<FlashSale> ParseListeFlashJson(String json) {
            ArrayList<FlashSale> listeFlashSale = new ArrayList<> ();
            try {
                JSONParser parser = new JSONParser();
                Map<String, Object> Flash = parser.parseJSON(new CharArrayReader(json.toCharArray()));
                List<Map<String, Object>> list = (List<Map<String, Object>>) Flash.get("root");
                for (Map<String, Object> obj : list) {
                    FlashSale prod = new FlashSale();

                    if(obj != null) {
                        float id = Float.parseFloat(obj.get("id").toString());
                        prod.setId((int) id);
                        // List sellerr = (List) obj.get("seller");
                        prod.setDescription(obj.get("description").toString());
                        prod.setName(obj.get("name").toString());
                        prod.setImage(obj.get("image").toString());
                        float prp=Float.parseFloat(obj.get("price").toString());
                        prod.setPrice((int) prp);
                        prod.setBeginDate(obj.get("begin_date").toString());
                        prod.setEndDate(obj.get("end_date").toString());


                        listeFlashSale.add(prod);

                    } }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                System.out.println("error Json parser !");
            }
            return listeFlashSale;
        }

        public  ArrayList<FlashSale> getListFlash ( ) {
            ConnectionRequest con = new ConnectionRequest();
            con.setUrl("http://127.0.0.1:8000/api/flash-sales");
            con.setHttpMethod("GET");
            con.addResponseListener((e) -> {
                String str = new String(con.getResponseData());//Récupération de la réponse du serveur
                System.out.println(str);
                //Affichage de la réponse serveur sur la console
                ListFlash =new ArrayList<>(ParseListeFlashJson(str));
            });
            NetworkManager.getInstance().addToQueueAndWait (con);//addToQueue(con);

            return ListFlash;
        }
            /* "id": 1,
        "description": "c'est bon",
        "name": "flashsale 1",
        "begin_date": "2019-07-22T23:47:25+00:00",
        "end_date": "2019-07-22T23:47:26+00:00",
        "price": 150.0,
        "image": "http://res.cloudinary.com/will-team-genie/image/upload/v1563705301/symfony-listing/a27wijty543ikoiemvqz.png",
        "products": []*/


        String resp="";
        public String addFlashSale(String name,String description, String image , String price){

            ConnectionRequest con = new ConnectionRequest();
            con.setUrl("http://127.0.0.1:8000/api/flash-sales/new");
            con.setHttpMethod ( "POST" );
            con.addArgument("description", description);
            con.addArgument("name", name);
            con.addArgument("begin_date","2019-07-21T10:34:55+00:00");
            con.addArgument("end_date","2019-07-21T10:34:55+00:00");
            con.addArgument("price", price);
            con.addArgument("image", image);


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

        public String deleteFlashSale(String id){

            ConnectionRequest con = new ConnectionRequest();
            con.setUrl("http://127.0.0.1:8000/api/flash-sales/delete/"+id);
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