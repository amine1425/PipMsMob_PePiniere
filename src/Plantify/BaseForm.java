package Plantify;

import Plantify.edu.gui.*;
import com.codename1.ui.*;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.util.Resources;

/**
 * Utility methods common to forms e.g. for binding the side menu
 *
 * @author Shai Almog
 */
public class BaseForm extends Form {
    public void installSidemenu(Resources res) {
        Image selection = res.getImage("selection-in-sidemenu.png");

        Image inboxImage = null;
        if (isCurrentInbox()) inboxImage = selection;

        Image trendingImage = null;
        if (isCurrentTrending()) trendingImage = selection;

        Image calendarImage = null;
        if (isCurrentCalendar()) calendarImage = selection;

        Image statsImage = null;
        if (isCurrentStats()) statsImage = selection;

        Button inboxButton = new Button("Forum", inboxImage);
        inboxButton.setUIID("SideCommand");
        inboxButton.getAllStyles().setPaddingBottom(0);
        Container inbox = FlowLayout.encloseMiddle(inboxButton,
                new Label("18", "SideCommandNumber"));
        inbox.setLeadComponent(inboxButton);
        inbox.setUIID("SideCommand");
        inboxButton.addActionListener(e -> new PostFormAll ().getF2 ().show());
        getToolbar().addComponentToSideMenu(inbox);

       // getToolbar().addCommandToSideMenu("Stats", statsImage, e -> new StatsForm(res).show());
        getToolbar().addCommandToSideMenu("Delivery", calendarImage, e -> new DeleveryViewForm ().getF2 ().show());
        getToolbar().addCommandToSideMenu("Order", null, e -> { new OrderForm (res).show();
        });
        getToolbar().addCommandToSideMenu("Category", trendingImage, e -> new CategoryForm ().getF2 ().show());


        getToolbar().addCommandToSideMenu("Produits", trendingImage, e -> new AffablerProducts().getF2 ().show());
        getToolbar().addCommandToSideMenu("Flashsale", null, e -> new FlashSaleForm().getF2 ().show());



        // spacer
        getToolbar().addComponentToSideMenu(new Label(" ", "SideCommand"));
        getToolbar().addComponentToSideMenu(new Label(res.getImage("profile_image.png"), "Container"));
        getToolbar().addComponentToSideMenu(new Label("Detra Mcmunn", "SideCommandNoPad"));
        getToolbar().addComponentToSideMenu(new Label("Long Beach, CA", "SideCommandSmall"));
        getToolbar().addCommandToSideMenu("Log Out", null, e -> new SingInFormAfterRegistration ().show());
    }



    protected boolean isCurrentInbox() {
        return false;
    }

    protected boolean isCurrentTrending() {
        return false;
    }

    protected boolean isCurrentCalendar() {
        return false;
    }

    protected boolean isCurrentStats() {
        return false;
    }
}
