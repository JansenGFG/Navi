import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NavigationSystemGUI implements ActionListener {
    //ab hier nicht weiterles
    private JFrame frame;
    private JPanel menuPanel, ausgabePanel, kurzDistPanel, sperrePanel, sperreListPanel, neueStrPanel, neueSperrPanel;
    private CardLayout cardLayout;

    public NavigationSystemGUI() {
        frame = new JFrame("Navi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();

        menuPanel = new JPanel();
        JButton kurzStrButton = new JButton("Kurze Strecke");
        kurzStrButton.addActionListener(this);
        JButton neuVerbButton = new JButton("Neue Verbindung");
        neuVerbButton.addActionListener(this);
        JButton sperrButton = new JButton("Sperren Verwalten");
        sperrButton.addActionListener(this);
        JButton ausgButton = new JButton("Ausgabe Routen");
        ausgButton.addActionListener(this);
        
        menuPanel.add(kurzStrButton);
        menuPanel.add(neuVerbButton);
        menuPanel.add(sperrButton);
        menuPanel.add(ausgButton);
        menuPanel.setLayout(new GridLayout(4, 1, 50, 40));
        

        JButton menuButtonAusg = new JButton("Menu");
        menuButtonAusg.addActionListener(this);
        ausgabePanel = new JPanel();
        ausgabePanel.add(menuButtonAusg);
        ausgabePanel.setLayout(new GridLayout(1, 1, 50, 40));
        
        
        JButton menuButtonSperr = new JButton("Menu");
        menuButtonSperr.addActionListener(this);
        JButton sperrListButton = new JButton("Sperren Anzeigen");
        sperrListButton.addActionListener(this);
        JButton sperrNeuButton = new JButton("Neue Sperre");
        sperrNeuButton.addActionListener(this);
        
        sperrePanel = new JPanel();
        sperrePanel.add(sperrNeuButton);
        sperrePanel.add(sperrListButton);
        sperrePanel.add(menuButtonSperr);
        sperrePanel.setLayout(new GridLayout(3, 1, 50, 40));
        
        
        JButton menuButtonNeuVer = new JButton("Menu");
        menuButtonNeuVer.addActionListener(this);
        JButton neuVerbBesButton = new JButton("Neue Verbindung Bestaetigen");
        neuVerbBesButton.addActionListener(this);

        neueStrPanel = new JPanel();
        neueStrPanel.add(neuVerbBesButton);
        neueStrPanel.add(menuButtonNeuVer);
        neueStrPanel.setLayout(new GridLayout(2, 1, 50, 40));
        
        JButton distBerechnButton = new JButton("Schnellsten Weg Berechnen");
        distBerechnButton.addActionListener(this);
        JButton menuButtonKurzD = new JButton("Menu");
        menuButtonKurzD.addActionListener(this);
        
        kurzDistPanel = new JPanel();
        kurzDistPanel.add(distBerechnButton);
        kurzDistPanel.add(menuButtonKurzD);
        kurzDistPanel.setLayout(new GridLayout(2,1,50,40));
        

        JPanel contentPane = new JPanel(cardLayout);
        contentPane.add(menuPanel, "menuPanel");
        contentPane.add(ausgabePanel, "ausgabePanel");
        contentPane.add(sperrePanel, "sperrePanel");
        contentPane.add(neueStrPanel, "neueStrPanel");
        contentPane.add(kurzDistPanel, "kurzDistPanel");

        frame.setContentPane(contentPane);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        switch (event.getActionCommand()) {
            case "Ausgabe Routen":
                cardLayout.show(frame.getContentPane(), "ausgabePanel");
                break;
            case "Menu":
                cardLayout.show(frame.getContentPane(), "menuPanel");
                break;
            case "Sperren Verwalten":
                cardLayout.show(frame.getContentPane(), "sperrePanel");
                break;
            case "Neue Verbindung":
                cardLayout.show(frame.getContentPane(), "neueStrPanel");
                break;
            case "Kurze Strecke":
                cardLayout.show(frame.getContentPane(), "kurzDistPanel");
        }
    }
}
