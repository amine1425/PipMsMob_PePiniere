package Plantify.edu.gui;

import Plantify.BaseForm;
import Plantify.InboxForm;
import Plantify.SingInFormAfterRegistration;
import Plantify.edu.entities.Delivery;
import Plantify.edu.services.CrudDelivery;
import com.codename1.ui.*;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;

import java.util.List;




public class DeleveryViewForm extends BaseForm {


    Form f2;
    int idcom = 0;

    Label nomProds;
    Form f;

    CrudDelivery service = new CrudDelivery();
    private EncodedImage ei;

    private Resources theme;


    Resources res;



    public DeleveryViewForm() {




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

        f2 = new Form(" Liste des Delivery ",new BoxLayout(BoxLayout.Y_AXIS));
        f = new Form("Produit", new BoxLayout(BoxLayout.Y_AXIS));
        Container c11 = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        Container panier = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        Container Commandes = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        Container VoirCommande = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        Button payer = new Button("Payer");




        Button inboxButton = new Button("Forum");
        inboxButton.setUIID("SideCommand");
        inboxButton.getAllStyles().setPaddingBottom(0);
        Container inbox = FlowLayout.encloseMiddle(inboxButton,
                new Label("18", "SideCommandNumber"));
        inbox.setLeadComponent(inboxButton);
        inbox.setUIID("SideCommand");
        inboxButton.addActionListener(e -> new InboxForm ().show());
        f2.getToolbar().addComponentToSideMenu(inbox);

        f2.getToolbar().addCommandToSideMenu("Delivery", statsImage, null);
        f2.getToolbar().addCommandToSideMenu("Order", calendarImage, null );
        f2.getToolbar().addCommandToSideMenu("Category", trendingImage, e -> new CategoryForm ().getF2 ().show());

        f2.getToolbar().addCommandToSideMenu("Produits", trendingImage,e -> {
        });
        f2.getToolbar().addCommandToSideMenu("Flashsale", null, e -> new FlashSaleForm().getF2 ().show());




        // spacer
        f2.getToolbar().addComponentToSideMenu(new Label(" ", "SideCommand"));
        f2.getToolbar().addComponentToSideMenu(new Label(res.getGlobalResources().getImage("profile_image.png"), "Container"));
        f2.getToolbar().addComponentToSideMenu(new Label("Detra Mcmunn", "SideCommandNoPad"));
        f2.getToolbar().addComponentToSideMenu(new Label("Long Beach, CA", "SideCommandSmall"));
        getToolbar().addCommandToSideMenu("Log Out", null, e -> new SingInFormAfterRegistration ().show());

        // affiche.setVisible(false);


        List<Delivery> array = service.getListDeliv ();

        for (int i = 0; i < array.size(); i++) {
            Delivery prod = array.get(i);
            GridLayout layout=new GridLayout(2,2);
            c11.setLayout(layout);
//            //image
//
//            ImageViewer image = new ImageViewer();
//            Image placeholder = Image.createImage(100, 100, 0xbfc9d2);
//            EncodedImage encImage = EncodedImage.createFromImage(placeholder, false);
//            Image img = URLImage.createToStorage (encImage, prod.getName (), prod.getImage(), URLImage.RESIZE_SCALE);
//            image.setImage(img);
//            img.getWidth();
//
//
//            //image
            Container eq1 = new Container(new BoxLayout(BoxLayout.Y_AXIS));
            Container eq2 = new Container(new BoxLayout(BoxLayout.X_AXIS));
            Button b=new Button( prod.getOrder () +"Delivery");
            b.addActionListener ( evt -> new  DetailDelivery (res.getGlobalResources() ,prod).show () );

            Label lb = new Label(prod.getOrder ());
            Label lb3 = new Label("" + prod.getId());
            Label qt = new Label("" + prod.getAdress ());
            Label lb2 = new Label(String.valueOf(prod.getStatus ()));
            Label qt2 = new Label(String.format("%s", prod.getValidated_at ()));
            eq1.add(lb);
            eq1.add(lb2);
            eq1.add(qt2);
            eq1.add(lb3);
            eq1.add(qt);
           // eq1.add(image);
            eq1.addComponent(b);
            eq2.add(eq1);


            c11.add(eq2);

        }



        f2.add(c11);




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
