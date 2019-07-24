package Plantify.edu.gui;

import Plantify.BaseForm;
import Plantify.edu.entities.Category;
import Plantify.edu.services.CrudCategory;
import com.codename1.components.FloatingActionButton;
import com.codename1.ui.Dialog;
import com.codename1.ui.FontImage;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.RoundBorder;
import com.codename1.ui.util.Resources;



public class DetailCategory extends BaseForm {


    //-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_Container_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.components.MultiButton gui_Multi_Button_1 = new com.codename1.components.MultiButton();
    private com.codename1.components.MultiButton gui_LA = new com.codename1.components.MultiButton();
    private com.codename1.ui.Container gui_imageContainer1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_Container_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.TextArea gui_Text_Area_1 = new com.codename1.ui.TextArea();
    private com.codename1.ui.Button gui_Button_1 = new com.codename1.ui.Button();
    private com.codename1.ui.Label gui_separator1 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_null_1_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.components.MultiButton gui_null_1_1_1 = new com.codename1.components.MultiButton();
    private com.codename1.components.MultiButton gui_newYork = new com.codename1.components.MultiButton();
    private com.codename1.ui.Container gui_imageContainer2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_Container_3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.TextArea gui_Text_Area_2 = new com.codename1.ui.TextArea();
    private com.codename1.ui.Button gui_Button_2 = new com.codename1.ui.Button();
    private com.codename1.ui.Label gui_Label_1_1_1 = new com.codename1.ui.Label();
    public DetailCategory () {
        this(com.codename1.ui.util.Resources.getGlobalResources()   , Category.class );
    }
    public DetailCategory (com.codename1.ui.util.Resources resourceObjectInstance  , Category product) {
        initGuiBuilderComponents(resourceObjectInstance ,  product);
        gui_separator1.setShowEvenIfBlank(true);
        gui_Label_1_1_1.setShowEvenIfBlank(true);




        installSidemenu(resourceObjectInstance);
        getToolbar().addMaterialCommandToRightBar("", FontImage.MATERIAL_PUBLIC, e -> {
        });

        FontImage.setMaterialIcon(gui_LA, FontImage.MATERIAL_LOCATION_ON);
        gui_LA.setIconPosition( BorderLayout.EAST);

        FontImage.setMaterialIcon(gui_newYork, FontImage.MATERIAL_LOCATION_ON);
        gui_newYork.setIconPosition(BorderLayout.EAST);

        gui_Text_Area_2.setRows(2);
        gui_Text_Area_2.setColumns(100);
        gui_Text_Area_2.setGrowByContent(false);
        gui_Text_Area_2.setEditable(false);
        gui_Text_Area_1.setRows(2);
        gui_Text_Area_1.setColumns(100);
        gui_Text_Area_1.setGrowByContent(false);
        gui_Text_Area_1.setEditable(false);
    }

    public DetailCategory (Resources globalResources, Class<Category> productClass) {
        super ();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance , Category product) {


//        //image*********************************
//        ImageViewer img = new ImageViewer();
//        EncodedImage placeHolder = EncodedImage.createFromImage(resourceObjectInstance.getImage("skate-park.jpg"), false);
//        URLImage urlImg =URLImage
//                .createToStorage(placeHolder,product.getName(), product.getImage());
//        img.setImage(urlImg);
//        urlImg.fetch();
//        ScaleImageLabel sl = new ScaleImageLabel(urlImg);
//        sl.setBackgroundType( Style.BACKGROUND_IMAGE_SCALED_FILL);
//        gui_imageContainer1.add(BorderLayout.CENTER, sl);
//        sl = new ScaleImageLabel(urlImg);
//        sl.setBackgroundType( Style.BACKGROUND_IMAGE_SCALED_FILL);
//        gui_imageContainer2.add(BorderLayout.CENTER, sl);
////image ****************************************************



        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setTitle( "Nom : \n"+ product.getName ());
        setName("TrendingForm");
//        addComponent(gui_Container_1);
//        gui_Container_1.setName("Container_1");
//        gui_Container_1.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Multi_Button_1);
//        gui_Container_1.addComponent(com.codename1.ui.layouts.BorderLayout.EAST, gui_LA);
//        gui_Multi_Button_1.setUIID("Label");
//        gui_Multi_Button_1.setName("Multi_Button_1");
//        gui_Multi_Button_1.setIcon(resourceObjectInstance.getImage("contact-c.png")); //contact-c
//        gui_Multi_Button_1.setPropertyValue("line1", "SellerName");
//        gui_Multi_Button_1.setPropertyValue("line2", "@seller");
//        gui_Multi_Button_1.setPropertyValue("uiid1", "Label");
//        gui_Multi_Button_1.setPropertyValue("uiid2", "RedLabel");
//        gui_LA.setUIID("Label");
//        gui_LA.setName("LA");
//        gui_LA.setPropertyValue("line1", product.getDiscount_end_date());
//        gui_LA.setPropertyValue("line2", "Disponible");
//        gui_LA.setPropertyValue("uiid1", "SlightlySmallerFontLabel");
//        gui_LA.setPropertyValue("uiid2", "Price" + product.getPrice ());
        addComponent(gui_imageContainer1);
        gui_imageContainer1.setName("imageContainer1");
        gui_imageContainer1.addComponent(com.codename1.ui.layouts.BorderLayout.SOUTH, gui_Container_2);
        gui_Container_2.setName("Container_2");
        gui_Container_2.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Text_Area_1);
        gui_Container_2.addComponent(com.codename1.ui.layouts.BorderLayout.EAST, gui_Button_1);
        gui_Text_Area_1.setText(product.getDescription ());
        gui_Text_Area_1.setUIID("SlightlySmallerFontLabelLeft");
        gui_Text_Area_1.setName("Text_Area_1");
        gui_Button_1.setText("");
        gui_Button_1.setUIID("Label");
        gui_Button_1.setName("Button_1");
        com.codename1.ui.FontImage.setMaterialIcon(gui_Button_1, "".charAt(0));


        FloatingActionButton fab = FloatingActionButton.createFAB( FontImage.MATERIAL_CLOSE);
        RoundBorder rb = (RoundBorder) fab.getUnselectedStyle().getBorder();
        rb.uiid(true);
        fab.bindFabToContainer(getContentPane());
        fab.addActionListener(e -> {
            CrudCategory cr = new CrudCategory ();
            // cr.deleteProduct (Integer.toString(product.getId ()));
            if(cr.deleteCategory (Integer.toString(product.getId ()))!=null){
                Dialog.show("la Categorie "+product.getName ()+" a été supprimé","", "voir tout les produit", null);

                AffablerProducts af = new AffablerProducts ();
                af.show ();

            }
        });

    }




    @Override
    protected boolean isCurrentTrending() {
        return true;
    }
}
