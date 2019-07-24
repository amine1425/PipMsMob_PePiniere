package Plantify;
import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class OrderLineService {

    private ArrayList<OrderLine> ParseListeUserJson(String json){
        ArrayList<OrderLine> listOrderLine = new ArrayList<>();
        try {
            JSONParser parser = new JSONParser ();
            Map<String , Object> test = parser.parseJSON(new CharArrayReader (json.toCharArray()));
            List<Map<String , Object>> list = (List<Map<String , Object>>) test.get("root");
            for (Map<String , Object> obj : list){
                OrderLine orderLine = new OrderLine ();
                float id = Float.parseFloat(obj.get("id").toString());
                orderLine.setId((int)id);

                float quantity = Float.parseFloat(obj.get("quantity").toString());
                orderLine.setQuantity((int)quantity);

                float price = Float.parseFloat(obj.get("price").toString());
                orderLine.setPrice(price);

                listOrderLine.add(orderLine);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
            System.out.println("error Json parser !");
        }
        return listOrderLine;
    }
    ArrayList<OrderLine> listOrderLine;
    public ArrayList<OrderLine> getAllOrderLines() {
        ConnectionRequest request = new ConnectionRequest ();
        String url = "http://localhost:8000/api/orders";
        request.setUrl(url);
        request.setHttpMethod("GET");
        request.addResponseListener(evt -> {
            listOrderLine = ParseListeUserJson(new String(request.getResponseData()));
            //System.out.println(listOrderLine.get(5));
            //System.out.println(listOrderLine);
        });
        NetworkManager.getInstance().addToQueueAndWait(request);
        return listOrderLine;
    }



}
