package Plantify;

import com.codename1.l10n.SimpleDateFormat;
import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.spinner.Picker;
import com.codename1.ui.util.Resources;

import java.util.Date;

/**
 * GUI builder created Form
 *
 * @author shai
 */
public class CalendarForm extends BaseForm {

    //-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Calendar gui_Calendar_1 = new com.codename1.ui.Calendar();

    public CalendarForm() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }

    public CalendarForm(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
        setLayout(BoxLayout.y());
        setScrollableY(true);
        getContentPane().setScrollVisible(false);
        getToolbar().setUIID("Container");
        Button b = new Button(" ");
        b.setUIID("Container");
        getToolbar().setTitleComponent(b);
        getTitleArea().setUIID("Container");
        installSidemenu(resourceObjectInstance);
        gui_Calendar_1.setTwoDigitMode(true);

        Picker p = new Picker();
        b.addActionListener(e -> {
            p.pressed();
            p.released();
        });
        p.addActionListener(e -> {
            gui_Calendar_1.setCurrentDate(p.getDate());
            gui_Calendar_1.setSelectedDate(p.getDate());
            gui_Calendar_1.setDate(p.getDate());
        });
        p.setFormatter(new SimpleDateFormat("MMMM"));
        p.setDate(new Date());
        p.setUIID("CalendarDateTitle");
        Container cnt = BoxLayout.encloseY(
                p,
                new Label(resourceObjectInstance.getImage("calendar-separator.png"), "CenterLabel")
        );

        BorderLayout bl = (BorderLayout) gui_Calendar_1.getLayout();
        Component combos = bl.getNorth();
        gui_Calendar_1.replace(combos, cnt, null);


        add(createEntry(resourceObjectInstance, false, "10:15", "11:45", "3B, 2nd Floor", "Design Review", "Bryant Ford, Ami Koehler", "contact-a.png", "contact-b.png", "contact-c.png"));
        add(createEntry(resourceObjectInstance, true, "12:20", "13:20", "Taco Bell", "Lunch", "Detra Mcmunn, Ami Koehler", "contact-b.png", "contact-c.png"));
        add(createEntry(resourceObjectInstance, false, "16:15", "17:10", "3B, 2nd Floor", "Design Meeting", "Bryant Ford, Ami Koehler, Detra Mcmunn", "contact-a.png"));
    }

    private Container createEntry(Resources res, boolean selected, String startTime, String endTime, String location, String title, String attendance, String... images) {
        Component time = new Label(startTime, "CalendarHourUnselected");
        if (selected) {
            time.setUIID("CalendarHourSelected");
        }

        Container circleBox = BoxLayout.encloseY(new Label(res.getImage("label_round-selected.png")),
                new Label("-", "OrangeLine"),
                new Label("-", "OrangeLine")
        );

        Container cnt = new Container(BoxLayout.x());
        for (String att : images) {
            cnt.add(res.getImage(att));
        }
        Container mainContent = BoxLayout.encloseY(
                BoxLayout.encloseX(
                        new Label(title, "SmallLabel"),
                        new Label("-", "SmallThinLabel"),
                        new Label(startTime, "SmallThinLabel"),
                        new Label("-", "SmallThinLabel"),
                        new Label(endTime, "SmallThinLabel")),
                new Label(attendance, "TinyThinLabel"),
                cnt
        );

        Label redLabel = new Label("", "RedLabelRight");
        FontImage.setMaterialIcon(redLabel, FontImage.MATERIAL_LOCATION_ON);
        Container loc = BoxLayout.encloseY(
                redLabel,
                new Label("Location:", "TinyThinLabelRight"),
                new Label(location, "TinyBoldLabel")
        );

        mainContent = BorderLayout.center(mainContent).
                add(BorderLayout.WEST, circleBox);

        return BorderLayout.center(mainContent).
                add(BorderLayout.WEST, FlowLayout.encloseCenter(time)).
                add(BorderLayout.EAST, loc);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.GridLayout(2, 1));
        setTitle("");
        setName("CalendarForm");
        addComponent(gui_Calendar_1);
        gui_Calendar_1.setName("Calendar_1");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!

    @Override
    protected boolean isCurrentCalendar() {
        return true;
    }

    @Override
    protected void initGlobalToolbar() {
        setToolbar(new Toolbar(true));
    }


}
