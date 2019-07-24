package Plantify;

import com.codename1.io.*;
import com.codename1.ui.events.ActionListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderService {
        // Json parser
        private ArrayList<Order> ParseListeUserJson(String json){
            ArrayList<Order> listOrders = new ArrayList<>();
            try {
                JSONParser parser = new JSONParser ();
                Map<String , Object> test = parser.parseJSON(new CharArrayReader (json.toCharArray()));
                List<Map<String , Object>> list = (List<Map<String , Object>>) test.get("root");
                for (Map<String , Object> obj : list){
                    Order order = new Order();
                    float id = Float.parseFloat(obj.get("id").toString());
                    order.setId((int)id);
                    order.setCreatedAt(obj.get("created_at").toString());
                    order.setValidatedAt(obj.get("validated_at").toString());
                    float totalPrice = Float.parseFloat(obj.get("total_price").toString());
                    order.setTotalPrice(totalPrice);
                    order.setNote(obj.get("note").toString());
                    listOrders.add(order);
                }
            }catch (IOException ex){
                System.out.println(ex.getMessage());
                System.out.println("error Json parser !");
            }
            return listOrders;
        }
        ArrayList<Order> listOrders;
        public ArrayList<Order> getAllOrders() {
            ConnectionRequest request = new ConnectionRequest ();
            String url = "http://localhost:8000/api/orders";
            request.setUrl(url);
            request.setHttpMethod("GET");
            request.addResponseListener(evt -> {
                listOrders = ParseListeUserJson(new String(request.getResponseData()));
                //System.out.println(listOrders.get(0));
            });
            NetworkManager.getInstance().addToQueueAndWait(request);
            return listOrders;
        }
    String resp="";
    public String deleteProduct(String id){

        ConnectionRequest con = new ConnectionRequest ();
        con.setUrl("http://127.0.0.1:8000/api/order/delete/"+id);
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