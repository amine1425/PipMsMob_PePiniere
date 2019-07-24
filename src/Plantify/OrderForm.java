
package Plantify;

import com.codename1.components.MultiButton;
import com.codename1.ui.*;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;

import java.util.ArrayList;


public class OrderForm extends BaseForm {


    Form form = new Form ("Orders" , BoxLayout.y());




    private void GetOrderContainer(Order order) {
        Container nameContainer = new Container ( BoxLayout.x());
        Label nameSale = new Label (order.getNote());
        nameContainer.add(nameSale);
        nameContainer.add(new Label (order.getCreatedAt()));
        nameContainer.add(new Label (order.getValidatedAt()));
        nameContainer.add(new Label (order.getTotalPrice().toString()));
        form.add(nameContainer);
        form.show();
    }


    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance, Order order) {

        getToolbar().addCommandToRightBar("", resourceObjectInstance.getImage("toolbar-profile-pic.png"), e -> {
            new InboxForm (resourceObjectInstance).show();
        });


        Container gui_Container_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
        MultiButton gui_Multi_Button_1 = new com.codename1.components.MultiButton();
        MultiButton gui_LA = new com.codename1.components.MultiButton();
        Container gui_imageContainer1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
        Container gui_Container_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());

        Container gui_Container_4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());

        MultiButton gui_Multi_Button_4 = new com.codename1.components.MultiButton();
        MultiButton gui_LA4 = new com.codename1.components.MultiButton();

        MultiButton gui_Text_Area_1 = new com.codename1.components.MultiButton();
        MultiButton goToDetailsButton = new com.codename1.components.MultiButton();

        MultiButton gui_Text_Area_3 = new com.codename1.components.MultiButton();
        MultiButton goToDetailsButton2 = new com.codename1.components.MultiButton();

        Label gui_separator1 = new com.codename1.ui.Label();

        Label gui_separator2 = new com.codename1.ui.Label();
        Container gui_null_1_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
        MultiButton gui_null_1_1_1 = new com.codename1.components.MultiButton();
        MultiButton gui_newYork = new com.codename1.components.MultiButton();
        Container gui_imageContainer2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
        Container gui_Container_3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
        TextArea gui_Text_Area_2 = new com.codename1.ui.TextArea();
        Button gui_Button_2 = new com.codename1.ui.Button();
        Label gui_Label_1_1_1 = new com.codename1.ui.Label();
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setTitle("Commands");
        setName("Commands" + order.getTotalPrice());
        addComponent(gui_Container_1);
        gui_Container_1.setName("Container_1");
        gui_Container_1.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Multi_Button_1);
        gui_Container_1.addComponent(com.codename1.ui.layouts.BorderLayout.EAST, gui_LA);
        gui_Multi_Button_1.setUIID("Label");
        gui_Multi_Button_1.setName("Multi_Button_1");
        //gui_Multi_Button_1.setIcon(resourceObjectInstance.getImage("contact-c.png"));
        gui_Multi_Button_1.setPropertyValue("line1", "Date De Creation");
        gui_Multi_Button_1.setPropertyValue("line2", "Date De Validation");
        gui_Multi_Button_1.setPropertyValue("uiid1", "Label");
        gui_Multi_Button_1.setPropertyValue("uiid2", "RedLabel");
        gui_LA.setUIID("Label");
        gui_LA.setName("LA");
        //gui_LA.setPropertyValue("line1", "3 minutes ago");
        gui_LA.setPropertyValue("line1", order.getCreatedAt());
        //gui_LA.setPropertyValue("line2", "in Los Angeles");
        gui_LA.setPropertyValue("line2", order.getValidatedAt());
        gui_LA.setPropertyValue("uiid1", "SlightlySmallerFontLabel");
        gui_LA.setPropertyValue("uiid2", "RedLabelRight");



        addComponent(gui_Container_2);
        gui_Container_2.setName("Container_2");
        gui_Container_2.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Text_Area_1);
        gui_Container_2.addComponent(com.codename1.ui.layouts.BorderLayout.EAST, goToDetailsButton);

        gui_Text_Area_1.setUIID("Label");
        gui_Text_Area_1.setName("Multi_Button_1");

        gui_Text_Area_1.setPropertyValue("line1", "Description");
        gui_Text_Area_1.setPropertyValue("line2", "Prix Total");
        gui_Text_Area_1.setPropertyValue("uiid1", "Label");
        gui_Text_Area_1.setPropertyValue("uiid2", "RedLabel");
        goToDetailsButton.setUIID("Label");
        goToDetailsButton.setName("LA");
        //gui_LA.setPropertyValue("line1", "3 minutes ago");
        goToDetailsButton.setPropertyValue("line1", order.getNote());
        //gui_LA.setPropertyValue("line2", "in Los Angeles");
        goToDetailsButton.setPropertyValue("line2", order.getTotalPrice().toString());
        goToDetailsButton.setPropertyValue("uiid1", "SlightlySmallerFontLabel");
        goToDetailsButton.setPropertyValue("uiid2", "RedLabelRight");





        //FloatingActionButton fab = FloatingActionButton.createFAB( FontImage.MATERIAL_CLOSE);
        //RoundBorder rb = (RoundBorder) fab.getUnselectedStyle().getBorder();
        //rb.uiid(true);
        //fab.bindFabToContainer(getContentPane());
        //fab.addActionListener(e -> {

        Button inboxButton = new Button ("delete");
        inboxButton.setUIID("SideCommand");
        inboxButton.getAllStyles().setPaddingBottom(0);

        inboxButton.addActionListener(e -> {



       // Button del=new Button("Delete");
        //del.addActionListener ( evt -> {
            OrderService orderService = new OrderService ();

            // cr.deleteProduct (Integer.toString(product.getId ()));
            if(orderService.deleteProduct (Integer.toString(order.getId ()))!=null){
                Dialog.show("la commande "+order.getId ()+" a été supprimé","", "voir tout les Command", null);


            }
        });


        addComponent(gui_Container_4);
        gui_Container_4.setName("Delete");
        gui_Container_4.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Multi_Button_4);
        gui_Multi_Button_4.setPropertyValue("line1", "Suprimer");
        gui_Multi_Button_4.setPropertyValue("uiid1", "RedLabel");
        gui_Multi_Button_4.setLeadComponent(inboxButton);

        //gui_Multi_Button_4.add(del);


        addComponent(gui_separator2);
        gui_Container_2.setName("Container_2");
        addComponent(gui_separator1);
        gui_Container_3.setName("Container_3");
        addComponent(gui_Label_1_1_1);
        gui_Container_1.setName("Container_1");
        gui_imageContainer1.setName("imageContainer1");
        gui_separator1.setUIID("Separator");
        gui_separator1.setName("separator1");
        gui_null_1_1.setName("null_1_1");
        gui_Label_1_1_1.setUIID("Separator");
        gui_Label_1_1_1.setName("Label_1_1_1");
        //-------------------------------------------------------------------------------
        //   get FlashSale Image
        //-------------------------------------------------------------------------------
        gui_separator1.setShowEvenIfBlank(true);
        gui_Label_1_1_1.setShowEvenIfBlank(true);



        gui_Text_Area_2.setRows(2);
        gui_Text_Area_2.setColumns(100);
        gui_Text_Area_2.setGrowByContent(false);
        gui_Text_Area_2.setEditable(false);


    }// </editor-fold>

    public void getAllOrders() {
        OrderService orderService = new OrderService ();
        ArrayList<Order> orders = orderService.getAllOrders();
        for (Order order : orders) {
            //GetFlashSaleContainer(flashSale);
            //  initGuiBuilderComponents(resourceObjectInstance, flashSale);

            System.out.println(order.getNote());
        }
    }

    public OrderForm (Resources resourceObjectInstance) {
        OrderService orderService = new OrderService ();
        ArrayList<Order> orders = orderService.getAllOrders();
        for (Order order : orders) {
            //GetOrderContainer(order);
            initGuiBuilderComponents(resourceObjectInstance, order);
            //System.out.println(order.getNote());
        }
    }








    }