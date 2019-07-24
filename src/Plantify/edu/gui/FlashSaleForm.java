package Plantify.edu.gui;


import Plantify.*;
import Plantify.edu.entities.FlashSale;
import Plantify.edu.entities.Product;
import Plantify.edu.services.FlashSaleService;
import com.codename1.components.ImageViewer;
import com.codename1.ui.*;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;

import java.util.ArrayList;
import java.util.List;

public class FlashSaleForm extends BaseForm {





        Form f2;
        int idcom = 0;

        Label nomProds;
        Form f;

        private EncodedImage ei;
        public static List<Product> p = new ArrayList<> ();
        int occ = 0;
        private Resources theme;
        float prixTot = 0;

        Resources res;



        public FlashSaleForm() {




            installSidemenu(res.getGlobalResources());
            Image selection = res.getGlobalResources().getImage("selection-in-sidemenu.png");

            Image inboxImage = null;
            if (isCurrentInbox()) inboxImage = selection;

            Image trendingImage = null;
            if (isCurrentTrending()) trendingImage = selection;

            Image calendarImage = null;
            if (isCurrentCalendar()) calendarImage = selection;

            Image statsImage = null;
            if (isCurrentStats()) statsImage = selection;



            theme = UIManager.initFirstTheme("/theme");

            f2 = new Form(" Liste des FlashSales",new BoxLayout(BoxLayout.Y_AXIS));
            f = new Form("Produit", new BoxLayout(BoxLayout.Y_AXIS));
            Container c11 = new Container(new BoxLayout(BoxLayout.Y_AXIS));
            Container panier = new Container(new BoxLayout(BoxLayout.Y_AXIS));

            Button affiche = new Button("Ajouter FlashSale ");



            Button inboxButton = new Button("Forum");
            inboxButton.setUIID("SideCommand");
            inboxButton.getAllStyles().setPaddingBottom(0);
            Container inbox = FlowLayout.encloseMiddle(inboxButton,
                    new Label("18", "SideCommandNumber"));
            inbox.setLeadComponent(inboxButton);
            inbox.setUIID("SideCommand");
            inboxButton.addActionListener(e ->new PostFormAll ().getF2 ().show());
            f2.getToolbar().addComponentToSideMenu(inbox);

           f2.getToolbar().addCommandToSideMenu("Delivery", calendarImage, e -> new CalendarForm(res).show());
            f2.getToolbar().addCommandToSideMenu("Order", null, e -> {
            });
            f2.getToolbar().addCommandToSideMenu("Category", trendingImage, e -> new CategoryForm ().getF2 ().show());

            f2.getToolbar().addCommandToSideMenu("Produits", trendingImage, e -> new AffablerProducts().getF2 ().show());
            f2.getToolbar().addCommandToSideMenu("Flashsale", trendingImage, e -> new FlashSaleForm().getF2 ().show());


            // spacer
            f2.getToolbar().addComponentToSideMenu(new Label(" ", "SideCommand"));
            f2.getToolbar().addComponentToSideMenu(new Label(res.getGlobalResources().getImage("profile_image.png"), "Container"));
            f2.getToolbar().addComponentToSideMenu(new Label("Detra Mcmunn", "SideCommandNoPad"));
            f2.getToolbar().addComponentToSideMenu(new Label("Long Beach, CA", "SideCommandSmall"));
            f2.getToolbar().addCommandToSideMenu("Log Out", null, e -> new SignInForm ().show());

            // affiche.setVisible(false);

            FlashSaleService service = new FlashSaleService();
            List<FlashSale> array = service.getListFlash();

            for (int i = 0; i < array.size(); i++) {
                FlashSale Flash = array.get(i);
                GridLayout layout=new GridLayout(2,2);
                c11.setLayout(layout);
                //image

                ImageViewer image = new ImageViewer();
                Image placeholder = Image.createImage(100, 100, 0xbfc9d2);
                EncodedImage encImage = EncodedImage.createFromImage(placeholder, false);
                Image img = URLImage.createToStorage (encImage, Flash.getName (), Flash.getImage(), URLImage.RESIZE_SCALE);
                image.setImage(img);
                img.getWidth();


                //image
                Container eq1 = new Container(new BoxLayout(BoxLayout.Y_AXIS));
                Container eq2 = new Container(new BoxLayout(BoxLayout.X_AXIS));
                Button b=new Button( Flash.getName ());
                b.addActionListener ( evt -> new  FlashSaleDetails(res.getGlobalResources() ,Flash).show () );

                Label lb = new Label(Flash.getName());
                Label lb3 = new Label("" + Flash.getId());
                Label qt = new Label("" + Flash.getDescription());
                Label lb2 = new Label(String.valueOf(Flash.getPrice()));
              //  Label qt2 = new Label(String.format("%s", Flash.getDiscount_end_date()));
                eq1.add(lb);
                eq1.add(lb2);
              //  eq1.add(qt2);
                eq1.add(lb3);
                eq1.add(qt);
                eq1.add(image);
                eq1.addComponent(b);
                eq2.add(eq1);


                c11.add(eq2);

            }



            f2.add(c11);
            f2.add(affiche);
            affiche.addActionListener(e -> new AjoutFlashSale ().show());



//            @Override
//            public void actionPerformed(ActionEvent evt) {
//                for (int i = 0; i < p.size(); i++) {
//
//
//
//                    Container c3 = new Container(new BoxLayout(BoxLayout.X_AXIS));
//                    Container c4 = new Container(new BoxLayout(BoxLayout.Y_AXIS));
//
//                    Container c5 = new Container(new BoxLayout(BoxLayout.Y_AXIS));
//                    Label lb = new Label(p.get(i).getName());
//                    Label lb3 = new Label("" + p.get(i).getId());
//                    Label qt = new Label("" + p.get(i).getDescription());
//                    Label lb2 = new Label("price :" + p.get(i).getPrice());
//                    TextField nvr = new TextField();
//                    // nvr.setUIID("1");
//                    c5.add(lb);
//                    c5.add(nvr);
//                    c5.add(lb2);
//                    c3.add(c4);
//                    c3.add(c5);
//                    panier.add(c3);
//                }
//                Button Commander = new Button("Commander");
//               // Button VoirCommande = new Button("Voir Commande");
//                VoirCommande.setVisible(false);
//                panier.add(Commander);
//                panier.add(VoirCommande);
//
//
//                f.show();
//


            f2.add(panier);
            f2.show ();
        }




        public Form getF2() {
            return f2;
        }

        public void setF2(Form f2) {
            this.f2 = f2;
        }

        public Form getF() {
            return f;
        }
    }
