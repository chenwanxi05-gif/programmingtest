package org.example;

import javax.swing.*;
import java.awt.*;

public class ModuleleaderGUI {
    private Departmentsystem departmentsystem;

    public ModuleleaderGUI(departmentsystem) {

        // 保存 HospitalSystem 对象
        this.departmentsystem = departmentsystem;


        JFrame frame = new JFrame("Module leader system");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 7, 10, 10));

        JLabel studentname = new JLabel();
        JLabel CID = new JLabel();
        JLabel studenttype = new JLabel();
        JLabel Independent_Programming_Test = new JLabel();
        JLabel AI_Assisted_Programming_Test = new JLabel();
        JLabel Software_Design_Viva = new JLabel();
        JLabel Total = new JLabel();


        panel.add(studentname);
        panel.add(CID);
        panel.add(studenttype);
        panel.add(Independent_Programming_Test);
        panel.add(AI_Assisted_Programming_Test);
        panel.add(Software_Design_Viva);
        panel.add(Total);

        frame.add(panel);

    }
    public void updateDisplay(){
        List<String> studentCIDs = studentinformationrequest.getCIDs();
        for(int i = 0; i< GUIs.length();i++){
            String studentCID = studentCIDs[i];
            String inforamtion = Departmentsystem.getStudentInformation();

            Labels[i].setText(
                    "<html><b>" + Studentname + "</b><br><br>"
                            + information
                            + "</html>"
            );

        }
    }
}
