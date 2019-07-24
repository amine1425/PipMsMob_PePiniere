package Plantify.edu.services;

import Plantify.edu.entities.User;
import com.codename1.io.*;
import com.codename1.ui.events.ActionListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CrudUser {
    public ArrayList<User> Login(String email, String password){
        ArrayList<User> ListUser = new ArrayList<>();
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://127.0.0.1:8000/api/users"+email+"/"+password);
        con.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                JSONParser jsonp = new JSONParser();
                try{
                    Map<String, Object> user = jsonp.parseJSON(new CharArrayReader(new String(con.getResponseData()).toCharArray()));
                    System.out.println(user);
                    // System.out.println(prods);
                    List<Map<String, Object>> list = (List<Map<String, Object>>) user.get("root");
                    for (Map<String, Object> obj : list) {
                        User u=new User();
                        float id = Float.parseFloat(obj.get("id").toString());
                        u.setId((int)id);
                        u.setPassword(obj.get("password").toString());
                        u.setCin(obj.get("cin").toString());




                        ListUser.add(u);

                    }
                } catch (IOException ex) {

                }


            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        return ListUser;


    }
    public void Register(User u){
        ConnectionRequest con = new ConnectionRequest();
        String Url="";

        System.out.println("user ajouté");
        con.setUrl(Url);

        con.addResponseListener((evt) -> {
            String str = new String(con.getResponseData());
            System.out.println(str);
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
    }

}
