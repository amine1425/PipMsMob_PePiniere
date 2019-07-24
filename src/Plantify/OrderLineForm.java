package Plantify;


import com.codename1.components.MultiButton;
import com.codename1.ui.*;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;

import java.util.ArrayList;

public class OrderLineForm extends BaseForm {


    Form form = new Form ("OrderLine" , BoxLayout.y());
    private Resources resources;




//    private void GetOrderContainer(OrderLine orderLine) {
//        Container nameContainer = new Container(BoxLayout.x());
//        Label nameSale = new Label(orderLine.getName());
//        nameContainer.add(nameSale);
//        nameContainer.add(new Label(orderLine.getDescription()));
//        form.add(nameContainer);
//        form.show();
//    }


    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance, OrderLine orderLine) {
        Container gui_Container_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
        MultiButton gui_Multi_Button_1 = new com.codename1.components.MultiButton();
        MultiButton gui_LA = new com.codename1.components.MultiButton();
        Container gui_imageContainer1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
        Container gui_Container_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
        TextArea gui_Text_Area_1 = new com.codename1.ui.TextArea();
        Button goToDetailsButton = new com.codename1.ui.Button();
        Label gui_separator1 = new com.codename1.ui.Label();
        Container gui_null_1_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
        MultiButton gui_null_1_1_1 = new com.codename1.components.MultiButton();
        MultiButton gui_newYork = new com.codename1.components.MultiButton();
        Container gui_imageContainer2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
        Container gui_Container_3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
        TextArea gui_Text_Area_2 = new com.codename1.ui.TextArea();
        Button gui_Button_2 = new com.codename1.ui.Button();
        Label gui_Label_1_1_1 = new com.codename1.ui.Label();
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setTitle("Vente Flash");
        setName("Vente Flash" + orderLine.getPrice());
        addComponent(gui_Container_1);
        gui_Container_1.setName("Container_1");
        gui_Container_1.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Multi_Button_1);
        gui_Container_1.addComponent(com.codename1.ui.layouts.BorderLayout.EAST, gui_LA);
        gui_Multi_Button_1.setUIID("Label");
        gui_Multi_Button_1.setName("Multi_Button_1");
        gui_Multi_Button_1.setIcon(resourceObjectInstance.getImage("contact-c.png"));
        gui_Multi_Button_1.setPropertyValue("line1", "Ami Koehler");
        gui_Multi_Button_1.setPropertyValue("line2", "@dropperidiot");
        gui_Multi_Button_1.setPropertyValue("uiid1", "Label");
        gui_Multi_Button_1.setPropertyValue("uiid2", "RedLabel");
        gui_LA.setUIID("Label");
        gui_LA.setName("LA");
        //gui_LA.setPropertyValue("line1", "3 minutes ago");
        gui_LA.setPropertyValue("line1", orderLine.getQuantity());
        //gui_LA.setPropertyValue("line2", "in Los Angeles");
        gui_LA.setPropertyValue("line2", orderLine.getQuantity());
        gui_LA.setPropertyValue("uiid1", "SlightlySmallerFontLabel");
        gui_LA.setPropertyValue("uiid2", "RedLabelRight");
        addComponent(gui_Container_2);
        gui_Container_2.setName("Container_2");
        gui_Container_2.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Text_Area_1);
        gui_Container_2.addComponent(com.codename1.ui.layouts.BorderLayout.EAST, goToDetailsButton);
        gui_Text_Area_1.setPropertyValue("uiid2", orderLine.getPrice());
        gui_Text_Area_1.setUIID("SlightlySmallerFontLabelLeft");
        gui_Text_Area_1.setName("Text_Area_1");
        goToDetailsButton.setText("");
        goToDetailsButton.addActionListener(e -> System.out.println("no test"));
        goToDetailsButton.setUIID("Label");
        goToDetailsButton.setName("Button_1");
        com.codename1.ui.FontImage.setMaterialIcon(goToDetailsButton,"".charAt(0));
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
        gui_Text_Area_1.setRows(2);
        gui_Text_Area_1.setColumns(100);
        gui_Text_Area_1.setGrowByContent(false);
        gui_Text_Area_1.setEditable(false);


    }// </editor-fold>



    public OrderLineForm (Resources resourceObjectInstance) {
        OrderLineService orderLineService = new OrderLineService();
        ArrayList<OrderLine> orderLines = orderLineService.getAllOrderLines();
        for (OrderLine orderLine : orderLines) {
            //GetOrderContainer(order);
            initGuiBuilderComponents(resourceObjectInstance, orderLine);
        }
    }




}
