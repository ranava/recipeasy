package dev.ryoung.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

/**
 * Initial comments
 * 
 * @author ryoung
 */
public class RecipesAtoZ extends JDialog {

    /**
     * Creates new form RecipesAZ
     */
    public RecipesAtoZ(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mainPanel = new JPanel();
        headerPanel = new JPanel();
        jLabel1 = new JLabel();
        recipe1 = new JLabel();
        recipe2 = new JLabel();
        recipe3 = new JLabel();
        recipe4 = new JLabel();
        recipe5 = new JLabel();
        recipe6 = new JLabel();
        recipe7 = new JLabel();
        recipe8 = new JLabel();
        recipe9 = new JLabel();
        recipe10 = new JLabel();
        recipe11 = new JLabel();
        recipe12 = new JLabel();
        recipe14 = new JLabel();
        recipe16 = new JLabel();
        recipe17 = new JLabel();
        recipe15 = new JLabel();
        recipe18 = new JLabel();
        recipe19 = new JLabel();
        recipe20 = new JLabel();
        recipe21 = new JLabel();
        recipe22 = new JLabel();
        recipe23 = new JLabel();
        recipe24 = new JLabel();
        recipe25 = new JLabel();
        nextPageButton = new JButton();
        recipe13 = new JLabel();
        recipe26 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new Dimension(800, 650));
        setMinimumSize(new Dimension(800, 650));
        setPreferredSize(new Dimension(800, 650));

        mainPanel.setBackground(new Color(51, 51, 51));

        headerPanel.setBackground(new Color(153, 0, 0));
        headerPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        jLabel1.setFont(new Font("Chalkduster", 1, 48)); 
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Recipes");

        GroupLayout headerPanelLayout = new GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        Font font = new Font("Tahoma", 0, 14);

        recipe1.setFont(font); 
        recipe1.setForeground(new Color(255, 255, 255));
        recipe1.setText("You have111111 no recipes!");

        recipe2.setFont(font); 
        recipe2.setForeground(new Color(255, 255, 255));
        recipe2.setText("You have 222222no recipes!");

        recipe3.setFont(font); 
        recipe3.setForeground(new Color(255, 255, 255));
        recipe3.setText("You have n3333o recipes!");

        recipe4.setFont(font); 
        recipe4.setForeground(new Color(255, 255, 255));
        recipe4.setText("You have 4444no recipes!");

        recipe5.setFont(font); 
        recipe5.setForeground(new Color(255, 255, 255));
        recipe5.setText("You have n5555o recipes!");

        recipe6.setFont(font); 
        recipe6.setForeground(new Color(255, 255, 255));
        recipe6.setText("You have no 666recipes!");

        recipe7.setFont(font); 
        recipe7.setForeground(new Color(255, 255, 255));
        recipe7.setText("You have no re777cipes!");

        recipe8.setFont(font); 
        recipe8.setForeground(new Color(255, 255, 255));
        recipe8.setText("You have no recip888es!");

        recipe9.setFont(font); 
        recipe9.setForeground(new Color(255, 255, 255));
        recipe9.setText("You have no re999cipes!");

        recipe10.setFont(font); 
        recipe10.setForeground(new Color(255, 255, 255));
        recipe10.setText("You have no rec10101ipes!");

        recipe11.setFont(font); 
        recipe11.setForeground(new Color(255, 255, 255));
        recipe11.setText("You have no rec11111ipes!");

        recipe12.setFont(font); 
        recipe12.setForeground(new Color(255, 255, 255));
        recipe12.setText("You have no re121212cipes!");
        
        recipe13.setFont(font); 
        recipe13.setForeground(new Color(255, 255, 255));
        recipe13.setText("You have no 262626recipes!");

        recipe14.setFont(font); 
        recipe14.setForeground(new Color(255, 255, 255));
        recipe14.setText("You have no 1414141recipes!");

        recipe15.setFont(font); 
        recipe15.setForeground(new Color(255, 255, 255));
        recipe15.setText("You have no151515 recipes!");
        
        recipe16.setFont(font); 
        recipe16.setForeground(new Color(255, 255, 255));
        recipe16.setText("You have no161616 recipes!");

        recipe17.setFont(font); 
        recipe17.setForeground(new Color(255, 255, 255));
        recipe17.setText("You have no 171717recipes!");

        recipe18.setFont(font); 
        recipe18.setForeground(new Color(255, 255, 255));
        recipe18.setText("You have no 181818recipes!");

        recipe19.setFont(font); 
        recipe19.setForeground(new Color(255, 255, 255));
        recipe19.setText("You have no 1919190recipes!");

        recipe20.setFont(font); 
        recipe20.setForeground(new Color(255, 255, 255));
        recipe20.setText("You have n202020o recipes!");

        recipe21.setFont(font); 
        recipe21.setForeground(new Color(255, 255, 255));
        recipe21.setText("You have no212121 recipes!");

        recipe22.setFont(font); 
        recipe22.setForeground(new Color(255, 255, 255));
        recipe22.setText("You have no22222 recipes!");

        recipe23.setFont(font); 
        recipe23.setForeground(new Color(255, 255, 255));
        recipe23.setText("You have 232323no recipes!");

        recipe24.setFont(font); 
        recipe24.setForeground(new Color(255, 255, 255));
        recipe24.setText("You have242424 no recipes!");

        recipe25.setFont(font); 
        recipe25.setForeground(new Color(255, 255, 255));
        recipe25.setText("You have 2525no recipes!");

        recipe26.setFont(font); 
        recipe26.setForeground(new Color(255, 255, 255));
        recipe26.setText("You have n272727o recipes!");
        
        nextPageButton.setBackground(new Color(153, 0, 0));
        nextPageButton.setFont(new Font("Tahoma", 0, 18)); 
        nextPageButton.setText("Page 2");

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(recipe6)
                            .addComponent(recipe7)
                            .addComponent(recipe8)
                            .addComponent(recipe9)
                            .addComponent(recipe10)
                            .addComponent(recipe11)
                            .addComponent(recipe12)
                            .addComponent(recipe5)
                            .addComponent(recipe13)
                            .addComponent(recipe4)
                            .addComponent(recipe3)
                            .addComponent(recipe2)
                            .addComponent(recipe1))
                        .addGap(217, 217, 217)
                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(recipe14)
                            .addComponent(recipe15)
                            .addComponent(recipe16)
                            .addComponent(recipe17)
                            .addComponent(recipe26)
                            .addComponent(recipe18)
                            .addComponent(recipe25)
                            .addComponent(recipe24)
                            .addComponent(recipe23)
                            .addComponent(recipe22)
                            .addComponent(recipe20)
                            .addComponent(recipe19)
                            .addComponent(recipe21))))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextPageButton, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(headerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe1)
                    .addComponent(recipe14))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe2)
                    .addComponent(recipe15))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe3)
                    .addComponent(recipe16))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe4)
                    .addComponent(recipe17))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe5)
                    .addComponent(recipe18))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe6)
                    .addComponent(recipe19))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe7)
                    .addComponent(recipe20))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe8)
                    .addComponent(recipe21))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe9)
                    .addComponent(recipe22))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe10)
                    .addComponent(recipe23))
                .addGap(12, 12, 12)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe11)
                    .addComponent(recipe24))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe12)
                    .addComponent(recipe25))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(recipe13)
                    .addComponent(recipe26))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextPageButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RecipesAtoZ.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(RecipesAtoZ.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(RecipesAtoZ.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(RecipesAtoZ.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                RecipesAtoZ dialog = new RecipesAtoZ(new JFrame(), true);
                dialog.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JButton nextPageButton;
    private JLabel jLabel1;
    private JLabel recipe9;
    private JLabel recipe10;
    private JLabel recipe11;
    private JLabel recipe12;
    private JLabel recipe14;
    private JLabel recipe16;
    private JLabel recipe17;
    private JLabel recipe15;
    private JLabel recipe19;
    private JLabel recipe1;
    private JLabel recipe20;
    private JLabel recipe21;
    private JLabel recipe22;
    private JLabel recipe23;
    private JLabel recipe24;
    private JLabel recipe25;
    private JLabel recipe13;
    private JLabel recipe26;
    private JLabel recipe2;
    private JLabel recipe4;
    private JLabel recipe5;
    private JLabel recipe18;
    private JLabel recipe3;
    private JLabel recipe6;
    private JLabel recipe7;
    private JLabel recipe8;
    private JPanel mainPanel;
    private JPanel headerPanel;
    // End of variables declaration                   
}