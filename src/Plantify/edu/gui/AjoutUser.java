package Plantify.edu.gui;

import Plantify.BaseForm;
import Plantify.SingInFormAfterRegistration;
import Plantify.edu.utils.UserController;
import com.codename1.components.FloatingActionButton;
import com.codename1.ui.Dialog;
import com.codename1.ui.FontImage;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.plaf.RoundBorder;




public class AjoutUser extends BaseForm {

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
    private com.codename1.ui.Label gui_Label_3_4 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_3_4_2 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_2_4 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_Label_2_4_2 = new com.codename1.ui.Label();
    private com.codename1.ui.TextArea gui_Text_Area_1_4 = new com.codename1.ui.TextArea();
    private com.codename1.ui.TextArea gui_Text_Area_1_4_2 = new com.codename1.ui.TextArea();
    private com.codename1.ui.Label gui_Label_5 = new com.codename1.ui.Label();
    public AjoutUser() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    public AjoutUser(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);

        getToolbar().setTitleComponent(
                FlowLayout.encloseCenterMiddle(
                        new Label ("Inscription", "Title"),
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
            UserController cr = new UserController ();

            //gui_Text_Area_1_4_2  gui_Text_Area_1_4_2
            //gui_Text_Area_1_4
            if(gui_Text_Area_1_4_2.getText ().equals (gui_Text_Area_1_4.getText ())){
            cr.addUser (gui_Text_Area_1.getText () /*nom*/ , gui_Text_Area_1_1.getText () /*prenom*/ ,  /*"http://res.cloudinary.com/will-team-genie/image/upload/v1563705301/symfony-listing/a27wijty543ikoiemvqz.png",*/ gui_Text_Area_1_2.getText () /*CIN*/,  gui_Text_Area_1_3.getText () /*email */,gui_Text_Area_1_4_2.getText ()/* password*/);

            Dialog.show("Bienvenue "+gui_Text_Area_1.getText ()+"\n Connecter vous","", "se Connecté", null);

            SingInFormAfterRegistration af = new SingInFormAfterRegistration ();
            af.show ();}

            if(!gui_Text_Area_1_4_2.getText ().equals (gui_Text_Area_1_4.getText ())) {
                Dialog.show(" "+gui_Text_Area_1.getText ()+"\n Verifier","", "Votre mot de passe", null);

            } else{
                SingInFormAfterRegistration af = new SingInFormAfterRegistration ();
                af.show ();
            }
        });
    }

    @Override
    protected boolean isCurrentInbox() {
        return true;
    }
            //gui_Label_3
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
        gui_Label_3.setText("entrer votre nom");
        gui_Label_3.setName("Label_3");
        //gui_Label_2.setText("name");
        gui_Label_2.setUIID("RedLabel");
        gui_Label_2.setName("Label_2");
        gui_Text_Area_1.setText("Votre Nom");
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
        gui_Label_3_1.setText(" entrer votre prenom");
        gui_Label_3_1.setName("Label_3_1");
       // gui_Label_2_1.setText("Description");
        gui_Label_2_1.setUIID("RedLabel");
        gui_Label_2_1.setName("Label_2_1");
        gui_Text_Area_1_1.setText("votre prenom");
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
        gui_Label_3_2.setText("entre votre CIN");
        gui_Label_3_2.setName("Label_3_2");
       // gui_Label_2_2.setText("Dinar TN");
        gui_Label_2_2.setUIID("RedLabel");
        gui_Label_2_2.setName("Label_2_2");
        gui_Text_Area_1_2.setText("votre CIN");
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
        gui_Label_3_3.setText("entrer votre email");
        gui_Label_3_3.setName("Label_3_3");
        gui_Label_2_3.setText("en piece");
        gui_Label_2_3.setUIID("RedLabel");
        gui_Label_2_3.setName("Label_2_3");
        gui_Text_Area_1_3.setText("tapez pour saisir votre email");  //gui_Text_Area_1_3 email // gui_Text_Area_1_4_2 password
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
        gui_Label_3_4.setText("entrer votre Mot de passe");
        gui_Label_3_4.setName("Label_3_4");
       // gui_Label_2_4.setText("ou bien coller votre lien");
        gui_Label_2_4.setUIID("RedLabel");
        gui_Label_2_4.setName("Label_2_4");
        gui_Text_Area_1_4.setText("votre Mot de passe");
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
        gui_Container_3_4_2.addComponent(gui_Text_Area_1_4_2);
        gui_Label_3_4_2.setText("Réentrer votre Mot de passe");
        gui_Label_3_4_2.setName("Label_3_4");
        // gui_Label_2_4.setText("ou bien coller votre lien");
        gui_Label_2_4_2.setUIID("RedLabel");
        gui_Label_2_4_2.setName("Label_2_4");
        gui_Text_Area_1_4_2.setText("Verifier votre Mot de passe");
        gui_Text_Area_1_4_2.setUIID("SmallFontLabel");
        gui_Text_Area_1_4_2.setName("Text_Area_1_4");
        gui_Container_2_4.setName("Container_2_4");
        gui_Container_4_4_2.setName("Container_4_4");
        ((com.codename1.ui.layouts.FlowLayout) gui_Container_4_4_2.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
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

                //gui_Text_Area_1_4_2
                //gui_Text_Area_1_4

    }


}
