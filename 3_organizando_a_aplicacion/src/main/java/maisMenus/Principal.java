/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maisMenus;

import com.mycompany._organizando_a_aplicacion.FormEvent;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

/**
 *
 * @author a22dianart
 */
public class Principal extends JFrame {

    JTextArea textArea;

    public Principal() {

        super("Aplicación");

        setLayout(new BorderLayout());

        setJMenuBar(createMenuBar()); //O MENU BAR

        textArea = new JTextArea();
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        add(textArea, BorderLayout.CENTER);

        setSize(600, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu casaMenu = new JMenu("Casa");
        casaMenu.setMnemonic(KeyEvent.VK_C);
        casaMenu.setIcon(createIcon("/casinha.png")); //usei unha imaxe de 20px/20px

        //habitacions submenu
        JMenu habitacionsMenu = new JMenu("Habitacións");
        JMenuItem habitacion1item = new JMenuItem("Habitación 1");
        JMenuItem habitacion2item = new JMenuItem("Habitación 2");
        habitacion1item.setToolTipText("Selecciona a habitación 1");
        habitacion2item.setEnabled(false);

        //salon submenu
        JCheckBoxMenuItem salonMenu = new JCheckBoxMenuItem("Salón", rootPaneCheckingEnabled);
        salonMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        //botons
        JRadioButtonMenuItem cocinhaItem = new JRadioButtonMenuItem("Cociña");
        JRadioButtonMenuItem banhoItem = new JRadioButtonMenuItem("Baño");
        ButtonGroup group = new ButtonGroup();
        group.add(cocinhaItem);
        group.add(banhoItem);
        cocinhaItem.setSelected(true);
        cocinhaItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        banhoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));

        //EXTRAS
        JMenu extrasMenu = new JMenu("Extras");
        extrasMenu.setMnemonic(KeyEvent.VK_E);
        JMenuItem garaxeItem = new JMenuItem("Garaxe");
        JMenuItem trasteiroItem = new JMenuItem("Trasteiro");
        garaxeItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.ALT_MASK));
        trasteiroItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.ALT_MASK));

        habitacionsMenu.add(habitacion1item);
        habitacionsMenu.add(habitacion2item);
        extrasMenu.add(garaxeItem);
        extrasMenu.add(trasteiroItem);
        casaMenu.add(habitacionsMenu);
        casaMenu.add(salonMenu);
        casaMenu.add(new JSeparator());
        casaMenu.add(cocinhaItem);
        casaMenu.add(banhoItem);
        menuBar.add(casaMenu);
        menuBar.add(extrasMenu);

        cocinhaItem.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    textArea.append("Cociña. Estado activado \n");
                    textArea.append("Baño. Estado desactivado \n");
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    textArea.append("Cociña. Estado desactivado \n");
                    textArea.append("Baño. Estado activado \n");
                }
            }
        });
        salonMenu.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    textArea.append("Salón. Estado activado \n");
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    textArea.append("Salón. Estado desactivado \n");
                }
            }
        });

        habitacion1item.addActionListener(new ActionListener() {
            int numVeces = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {
                numVeces++;
                textArea.append("Pulsaches na habitación 1 " + numVeces + " veces \n");
            }
        });

        garaxeItem.addActionListener(new ActionListener() {
            int numVeces = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {
                numVeces++;
                textArea.append("Pulsaches no garaxe " + numVeces + " veces \n");
            }
        });

        trasteiroItem.addActionListener(new ActionListener() {
            int numVeces = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {
                numVeces++;
                textArea.append("Pulsaches no trasteiro " + numVeces + " veces \n");
            }
        });

        return menuBar;
    }

    private ImageIcon createIcon(String path) {
        URL url = getClass().getResource(path);
        if (url == null) {
            System.err.println("Unable to load image: " + path);
        }
        ImageIcon icon = new ImageIcon(url);
        return icon;
    }

}
