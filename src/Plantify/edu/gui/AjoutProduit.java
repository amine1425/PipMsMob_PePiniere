package Plantify.edu.gui;

import Plantify.BaseForm;
import Plantify.edu.entities.Category;
import Plantify.edu.services.CrudCategory;
import Plantify.edu.services.CrudStore;
import com.codename1.components.FloatingActionButton;
import com.codename1.ui.AutoCompleteTextField;
import com.codename1.ui.Dialog;
import com.codename1.ui.FontImage;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.plaf.RoundBorder;

import java.util.Collections;
import java.util.List;


public class AjoutProduit extends BaseForm {

    //-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_Container_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_Container_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_Label_4 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_Label_3 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_2 = new com.codename1.ui.Label();
    private com.codename1.ui.TextArea gui_Text_Area_1 = new com.codename1.ui.TextArea();
    private com.codename1.ui.Label gui_Label_6 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_1_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_Container_2_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_Label_1_1 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_4_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_Label_4_1 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_3_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_Label_3_1 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_2_1 = new com.codename1.ui.Label();
    private com.codename1.ui.TextArea gui_Text_Area_1_1 = new com.codename1.ui.TextArea();
    private com.codename1.ui.Label gui_Label_7 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_1_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_Container_2_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_Label_1_2 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_4_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_Label_4_2 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_3_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_Label_3_2 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_2_2 = new com.codename1.ui.Label();
    private com.codename1.ui.TextArea gui_Text_Area_1_2 = new com.codename1.ui.TextArea();
    private com.codename1.ui.Label gui_Label_8 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_1_3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_Container_2_3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_Label_1_3 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_4_3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_Label_4_3 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_3_3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_Label_3_3 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_2_3 = new com.codename1.ui.Label();
    private com.codename1.ui.TextArea gui_Text_Area_1_3 = new com.codename1.ui.TextArea();
    private com.codename1.ui.Label gui_Label_9 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_1_4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_Container_1_4_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_Container_2_4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_Label_1_4 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_4_4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_Container_4_4_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_Label_4_4 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_4_4_2 = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Container_3_4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui_Container_3_4_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));

    private com.codename1.ui.Label gui_Label_3_4_2 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_3_4 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_2_4 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_2_4_2 = new com.codename1.ui.Label();

    private com.codename1.ui.TextArea gui_Text_Area_1_4 = new com.codename1.ui.TextArea();
    private com.codename1.ui.Label gui_Label_5 = new com.codename1.ui.Label();
    public AjoutProduit() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    public AjoutProduit(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);

        getToolbar().setTitleComponent(
                FlowLayout.encloseCenterMiddle(
                        new Label ("Ajouter un produit", "Title"),
                        new Label("19", "InboxNumber")
                )
        );

        installSidemenu(resourceObjectInstance);

        getToolbar().addCommandToRightBar("", resourceObjectInstance.getImage("toolbar-profile-pic.png"), e -> {
        });

        gui_Label_5.setShowEvenIfBlank(true);
        gui_Label_6.setShowEvenIfBlank(true);
        gui_Label_7.setShowEvenIfBlank(true);
        gui_Label_8.setShowEvenIfBlank(true);
        gui_Label_9.setShowEvenIfBlank(true);

        gui_Text_Area_1.setRows(2);
        gui_Text_Area_1.setColumns(100);
        gui_Text_Area_1.setEditable(true);
        gui_Text_Area_1_1.setRows(2);
        gui_Text_Area_1_1.setColumns(100);
        gui_Text_Area_1_1.setEditable(true);
        gui_Text_Area_1_2.setRows(2);
        gui_Text_Area_1_2.setColumns(100);
        gui_Text_Area_1_2.setEditable(true);
        gui_Text_Area_1_3.setRows(2);
        gui_Text_Area_1_3.setColumns(100);
        gui_Text_Area_1_3.setEditable(true);
        gui_Text_Area_1_4.setRows(2);
        gui_Text_Area_1_4.setColumns(100);
        gui_Text_Area_1_4.setEditable(true);

        FloatingActionButton fab = FloatingActionButton.createFAB( FontImage.MATERIAL_ADD);
        RoundBorder rb = (RoundBorder) fab.getUnselectedStyle().getBorder();
        rb.uiid(true);
        fab.bindFabToContainer(getContentPane());
        fab.addActionListener(e -> {
            CrudStore cr = new CrudStore ();
            cr.addProduct (gui_Text_Area_1.getText () , gui_Text_Area_1_1.getText (),  "http://res.cloudinary.com/will-team-genie/image/upload/v1563705301/symfony-listing/a27wijty543ikoiemvqz.png", "1" ,  gui_Text_Area_1_2.getText (),  gui_Text_Area_1_3.getText ());
            Dialog.show("le Produit "+gui_Text_Area_1.getText ()+" a été ajouté","", "voir tout les produit", null);

            new AffablerProducts().getF2 ().show();
        });
    }

    @Override
    protected boolean isCurrentInbox() {
        return true;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    protected void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setTitle("InboxForm");
        setName("InboxForm");
        addComponent(gui_Container_1);
        gui_Container_1.setName("Container_1");
        gui_Container_1.addComponent(com.codename1.ui.layouts.BorderLayout.EAST, gui_Container_2);
        gui_Container_2.setName("Container_2");
        gui_Container_2.addComponent(gui_Label_1);
        gui_Label_1.setText("1");
        gui_Label_1.setUIID("SmallFontLabel");
        gui_Label_1.setName("Label_1");
        gui_Container_1.addComponent(com.codename1.ui.layouts.BorderLayout.WEST, gui_Container_4);
        gui_Container_4.setName("Container_4");
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container_4.addComponent(gui_Label_4);
        gui_Label_4.setUIID("Padding2");
        gui_Label_4.setName("Label_4");
        gui_Label_4.setIcon(resourceObjectInstance.getImage("label_round.png"));
        gui_Container_1.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Container_3);
        gui_Container_3.setName("Container_3");
        gui_Container_3.addComponent(gui_Label_3);
        gui_Container_3.addComponent(gui_Label_2);
        gui_Container_3.addComponent(gui_Text_Area_1);
        gui_Label_3.setText("Nom de Produit");
        gui_Label_3.setName("Label_3");
        gui_Label_2.setText("name");
        gui_Label_2.setUIID("RedLabel");
        gui_Label_2.setName("Label_2");
        gui_Text_Area_1.setText("tapez pour modifie le nom du produit");
        gui_Text_Area_1.setEditable ( true );
        gui_Text_Area_1.setUIID("SmallFontLabel");
        gui_Text_Area_1.setName("Text_Area_1");
        gui_Container_2.setName("Container_2");
        gui_Container_4.setName("Container_4");
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container_3.setName("Container_3");
        addComponent(gui_Label_6);
        addComponent(gui_Container_1_1);
        gui_Container_1_1.setName("Container_1_1");
        gui_Container_1_1.addComponent(com.codename1.ui.layouts.BorderLayout.EAST, gui_Container_2_1);
        gui_Container_2_1.setName("Container_2_1");
        gui_Container_2_1.addComponent(gui_Label_1_1);
        gui_Label_1_1.setText("2");
        gui_Label_1_1.setUIID("SmallFontLabel");
        gui_Label_1_1.setName("Label_1_1");
        gui_Container_1_1.addComponent(com.codename1.ui.layouts.BorderLayout.WEST, gui_Container_4_1);
        gui_Container_4_1.setName("Container_4_1");
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4_1.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container_4_1.addComponent(gui_Label_4_1);
        gui_Label_4_1.setUIID("Padding2");
        gui_Label_4_1.setName("Label_4_1");
        gui_Label_4_1.setIcon(resourceObjectInstance.getImage("label_round-selected.png"));
        gui_Container_1_1.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Container_3_1);
        gui_Container_3_1.setName("Container_3_1");
        gui_Container_3_1.addComponent(gui_Label_3_1);
        gui_Container_3_1.addComponent(gui_Label_2_1);
        gui_Container_3_1.addComponent(gui_Text_Area_1_1);
        gui_Label_3_1.setText("Description du produit");
        gui_Label_3_1.setName("Label_3_1");
        gui_Label_2_1.setText("Description");
        gui_Label_2_1.setUIID("RedLabel");
        gui_Label_2_1.setName("Label_2_1");
        gui_Text_Area_1_1.setText("tapez pour modifie la description du produit");
        gui_Text_Area_1_1.setEditable ( true );
        gui_Text_Area_1_1.setUIID("SmallFontLabel");
        gui_Text_Area_1_1.setName("Text_Area_1_1");
        gui_Container_2_1.setName("Container_2_1");
        gui_Container_4_1.setName("Container_4_1");
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4_1.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container_3_1.setName("Container_3_1");
        addComponent(gui_Label_7);
        addComponent(gui_Container_1_2);
        gui_Container_1_2.setName("Container_1_2");
        gui_Container_1_2.addComponent(com.codename1.ui.layouts.BorderLayout.EAST, gui_Container_2_2);
        gui_Container_2_2.setName("Container_2_2");
        gui_Container_2_2.addComponent(gui_Label_1_2);
        gui_Label_1_2.setText("3");
        gui_Label_1_2.setUIID("SmallFontLabel");
        gui_Label_1_2.setName("Label_1_2");
        gui_Container_1_2.addComponent(com.codename1.ui.layouts.BorderLayout.WEST, gui_Container_4_2);
        gui_Container_4_2.setName("Container_4_2");
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4_2.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container_4_2.addComponent(gui_Label_4_2);
        gui_Label_4_2.setUIID("Padding2");
        gui_Label_4_2.setName("Label_4_2");
        gui_Label_4_2.setIcon(resourceObjectInstance.getImage("label_round.png"));
        gui_Container_1_2.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Container_3_2);
        gui_Container_3_2.setName("Container_3_2");
        gui_Container_3_2.addComponent(gui_Label_3_2);
        gui_Container_3_2.addComponent(gui_Label_2_2);
        gui_Container_3_2.addComponent(gui_Text_Area_1_2);
        gui_Label_3_2.setText("Prix de Produit");
        gui_Label_3_2.setName("Label_3_2");
        gui_Label_2_2.setText("Dinar TN");
        gui_Label_2_2.setUIID("RedLabel");
        gui_Label_2_2.setName("Label_2_2");
        gui_Text_Area_1_2.setText("tapez pour saisir le prix de produit");
        gui_Text_Area_1_2.setEditable ( true );
        gui_Text_Area_1_2.setUIID("SmallFontLabel");
        gui_Text_Area_1_2.setName("Text_Area_1_2");
        gui_Container_2_2.setName("Container_2_2");
        gui_Container_4_2.setName("Container_4_2");
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4_2.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container_3_2.setName("Container_3_2");
        addComponent(gui_Label_8);
        addComponent(gui_Container_1_3);
        gui_Container_1_3.setName("Container_1_3");
        gui_Container_1_3.addComponent(com.codename1.ui.layouts.BorderLayout.EAST, gui_Container_2_3);
        gui_Container_2_3.setName("Container_2_3");
        gui_Container_2_3.addComponent(gui_Label_1_3);
        gui_Label_1_3.setText("4");
        gui_Label_1_3.setUIID("SmallFontLabel");
        gui_Label_1_3.setName("Label_1_3");
        gui_Container_1_3.addComponent(com.codename1.ui.layouts.BorderLayout.WEST, gui_Container_4_3);
        gui_Container_4_3.setName("Container_4_3");
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4_3.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container_4_3.addComponent(gui_Label_4_3);
        gui_Label_4_3.setUIID("Padding2");
        gui_Label_4_3.setName("Label_4_3");
        gui_Label_4_3.setIcon(resourceObjectInstance.getImage("label_round.png"));
        gui_Container_1_3.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Container_3_3);
        gui_Container_3_3.setName("Container_3_3");
        gui_Container_3_3.addComponent(gui_Label_3_3);
        gui_Container_3_3.addComponent(gui_Label_2_3);
        gui_Container_3_3.addComponent(gui_Text_Area_1_3);
        gui_Label_3_3.setText("Quantité");
        gui_Label_3_3.setName("Label_3_3");
        gui_Label_2_3.setText("en piece");
        gui_Label_2_3.setUIID("RedLabel");
        gui_Label_2_3.setName("Label_2_3");
        gui_Text_Area_1_3.setText("tapez pour saisir la quantité");
        gui_Text_Area_1_3.setEditable ( true );
        gui_Text_Area_1_3.setUIID("SmallFontLabel");
        gui_Text_Area_1_3.setName("Text_Area_1_3");
        gui_Container_2_3.setName("Container_2_3");
        gui_Container_4_3.setName("Container_4_3");
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4_3.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container_3_3.setName("Container_3_3");
        addComponent(gui_Label_9);
        addComponent(gui_Container_1_4);
        gui_Container_1_4.setName("Container_1_4");
        gui_Container_1_4.addComponent(com.codename1.ui.layouts.BorderLayout.EAST, gui_Container_2_4);
        gui_Container_2_4.setName("Container_2_4");
        gui_Container_2_4.addComponent(gui_Label_1_4);
        gui_Label_1_4.setText("5");
        gui_Label_1_4.setUIID("SmallFontLabel");
        gui_Label_1_4.setName("Label_1_4");
        gui_Container_1_4.addComponent(com.codename1.ui.layouts.BorderLayout.WEST, gui_Container_4_4);
        gui_Container_4_4.setName("Container_4_4");
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4_4.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container_4_4.addComponent(gui_Label_4_4);
        gui_Label_4_4.setUIID("Padding2");
        gui_Label_4_4.setName("Label_4_4");
        gui_Label_4_4.setIcon(resourceObjectInstance.getImage("label_round.png"));
        gui_Container_1_4.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Container_3_4);
        gui_Container_3_4.setName("Container_3_4");
        gui_Container_3_4.addComponent(gui_Label_3_4);
        gui_Container_3_4.addComponent(gui_Label_2_4);
        gui_Container_3_4.addComponent(gui_Text_Area_1_4);
        gui_Label_3_4.setText("Ajouter une image");
        gui_Label_3_4.setName("Label_3_4");
        gui_Label_2_4.setText("ou bien coller votre lien");
        gui_Label_2_4.setUIID("RedLabel");
        gui_Label_2_4.setName("Label_2_4");
        gui_Text_Area_1_4.setText("tapez pour modifier le lien");
        gui_Text_Area_1_4.setUIID("SmallFontLabel");
        gui_Text_Area_1_4.setName("Text_Area_1_4");
        gui_Container_2_4.setName("Container_2_4");
        gui_Container_4_4.setName("Container_4_4");
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4_4.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container_3_4.setName("Container_3_4");
        addComponent(gui_Label_5);
        gui_Container_1.setName("Container_1");
        gui_Label_6.setText("");
        gui_Label_6.setUIID("Separator");
        gui_Label_6.setName("Label_6");
        gui_Container_1_1.setName("Container_1_1");
        gui_Label_7.setText("");
        gui_Label_7.setUIID("Separator");
        gui_Label_7.setName("Label_7");
        gui_Container_1_2.setName("Container_1_2");
        gui_Label_8.setText("");
        gui_Label_8.setUIID("Separator");
        gui_Label_8.setName("Label_8");
        gui_Container_1_3.setName("Container_1_3");
        gui_Label_9.setText("");
        gui_Label_9.setUIID("Separator");
        gui_Label_9.setName("Label_9");
        gui_Container_1_4.setName("Container_1_4");
        gui_Label_5.setText("");
        gui_Label_5.setUIID("Separator");
        gui_Label_5.setName("Label_5");

//        //image*********************************
//        ImageViewer img = new ImageViewer();
//        EncodedImage placeHolder = EncodedImage.createFromImage(resourceObjectInstance.getImage("skate-park.jpg"), false);
//        URLImage urlImg =URLImage
//                .createToStorage(placeHolder,gui_Label_3.getText (), gui_Text_Area_1_4.getText ());
//        img.setImage(urlImg);
//        urlImg.fetch();
//        ScaleImageLabel sl = new ScaleImageLabel(urlImg);
//        sl.setBackgroundType( Style.BACKGROUND_IMAGE_SCALED_FILL);
//        gui_Container_3_4.add( BorderLayout.CENTER, sl);
//        sl = new ScaleImageLabel(urlImg);
//        sl.setBackgroundType( Style.BACKGROUND_IMAGE_SCALED_FILL);
//        gui_Container_3_4.add(BorderLayout.CENTER, sl);
////image ****************************************************




        addComponent ( gui_Container_1_4_2 );
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4_4_2.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container_4_4_2.addComponent(gui_Label_4_4_2);
        gui_Label_4_4_2.setUIID("Padding2");
        gui_Label_4_4_2.setName("Label_4_4");
        gui_Label_4_4_2.setIcon(resourceObjectInstance.getImage("label_round.png"));
        gui_Container_1_4_2.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Container_3_4_2);
        gui_Container_3_4_2.setName("Container_3_4");
        gui_Container_3_4_2.addComponent(gui_Label_3_4_2);
        gui_Container_3_4_2.addComponent(gui_Label_2_4_2);
       // for(Category cat :)

         CrudCategory service = new CrudCategory();
        List<Category> array = service.getListCat();




        String[] listeVilles=new String[]{""};//{"Lomé","Paris","Londres","Santo Domingo","Bangkok","Pattaya","Punta Cana"};
        for (int i = 0; i < array.size(); i++) {
           Category prod = array.get(i);
            List name = Collections.singletonList ( prod.getName () );

               listeVilles=new String[]{String.valueOf ( name )};


        }
        AutoCompleteTextField text=new AutoCompleteTextField( listeVilles );





        gui_Container_3_4_2.add(new AutoCompleteTextField( String.valueOf ( array ) ));
        gui_Label_3_4_2.setText("ajouter une Category");
        gui_Label_3_4_2.setName("Label_3_4");
        // gui_Label_2_4.setText("ou bien coller votre lien");
        gui_Label_2_4_2.setUIID("RedLabel");
        gui_Label_2_4_2.setName("Label_2_4");
        gui_Container_2_4.setName("Container_2_4");
        gui_Container_4_4_2.setName("Container_4_4");
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4_4_2.getLayout()).setAlign(com.codename1.ui.Component.CENTER);





    }


}
