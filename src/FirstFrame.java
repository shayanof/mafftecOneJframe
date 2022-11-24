import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstFrame {
     JFrame mainFrame = new JFrame();
    JPanel mainFramePanel= new JPanel();
     JPanel chauforrPanel= new JPanel();
     JPanel bilarPanel= new JPanel();
    JPanel addChaforrPanel = new JPanel();

    JButton chauforr  = new JButton("Chauförr");
    JButton bilar  = new JButton("Bilar");


    JButton showPersonInfo= new JButton("Visa Info");
    JButton addPerson = new JButton("Add Person");

    JButton back= new JButton("bak");
    public static int intJcomboBoxNameCounter=0;

    public static String []chaforrNames=new String[1000];
    public static JComboBox jComboBoxNames =new JComboBox(chaforrNames);

//             Add Persson button staff   ///////
    int i;
    public String[] personInfo= new String[]{};
    JTextField sirname =new JTextField();
    JTextField famlyname =new JTextField();
    JTextField phonenumber =new JTextField();
    JTextField emailfield =new JTextField();
    JLabel l1 = new JLabel("Namn");
    JLabel l2 =new JLabel(" Efternamn");
    JLabel l3 = new JLabel("Telefon");
    JLabel l4 = new JLabel("Email");
    JLabel l5 = new JLabel("Behörighet");

    JRadioButton r1= new JRadioButton("B");
    JRadioButton r2= new JRadioButton("BE");
    JRadioButton r3= new JRadioButton("C");
    JRadioButton r4= new JRadioButton("CE");
    JRadioButton r5= new JRadioButton("D");
    JRadioButton r6= new JRadioButton("DE");
    JRadioButton r7= new JRadioButton("C+D");
    JRadioButton r8= new JRadioButton("CE+DE");

    JButton avbryt=new JButton("Avbryt");
    ButtonGroup bg=new ButtonGroup();
    JButton spara= new JButton("Spara");
    public String name;
    public String efternamn;
    public String telefon;
    public String email;
    public String behorighet;
//       **************************************   //


    FirstFrame(){












//***************************************************************************************
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.setSize(1000,1000);
        mainFrame.setResizable(false);

        mainFramePanel.setSize(1000,1000);
        mainFramePanel.setLayout(null);

        chauforrPanel.setSize(1000,1000);
        chauforrPanel.setLayout(null);

        bilarPanel.setSize(1000,1000);
        bilarPanel.setLayout(null);



        mainFrame.add(mainFramePanel);
        mainFrame.add(chauforrPanel);
        mainFrame.add(bilarPanel);

        addChaforrPanel.setVisible(false);
        back.setBounds(10,900,100,30);

        //********************************* Chauförr button ***************************//


        chauforr.setBounds(100,10,100,30);
        mainFramePanel.add(chauforr );

        chauforr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                chaforrButtonMetod();
            }
        });

        //*********************************  Bilar button  ***************************//

        bilar.setBounds(800,10,100,30);
        mainFramePanel.add(bilar);
        bilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bilarButtonMetod();

            }
        });

        //***************************** show personinfo Button *********************//




        showPersonInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {





            }
        });

    };


    //////////////////////////////////////////// /////// ///////////////////////////////////////////////////////////////
    //////////////////////////////////////////// /////// ///////////////////////////////////////////////////////////////
    //////////////////////////////////////////// METODS ////////////////////////////////////////////////////////////////
    ////////////////////////////////////////// start from //////////////////////////////////////////////////////////////
    //////////////////////////////////////////// here //////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////*********** /////////////////////////////////////////////////////////////

    //********************************** Chaforr Button Metod ************************************//

    public void chaforrButtonMetod (){
        mainFramePanel.setVisible(false);
        chauforrPanel.setVisible(true);
        chauforrPanel.add(back);

        JLabel l1=new JLabel("Välj ett namn");
        l1. setBounds(20,50,100,30);
        chauforrPanel.add(l1);

        chauforrPanel.add(jComboBoxNames);
        jComboBoxNames.setBounds(20,100,200,50);

        chauforrPanel.add(showPersonInfo);
        showPersonInfo.setBounds(240,100,100,30);

        chauforrPanel.add(addPerson);
        addPerson.setBounds(20,175,100,30);




        // ********************* Add Person Button *********************//


        addPerson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addChaforrPanel.setSize(1000,1000);
                addChaforrPanel.setLayout(null);
                mainFrame.add(addChaforrPanel);

                mainFramePanel.setVisible(false);
                chauforrPanel.setVisible(false);
                mainFrame.revalidate();
                addChaforrPanel.revalidate();



                sirname.setBounds(20,40,200,30);
                famlyname.setBounds(250,40,200,30);
                phonenumber.setBounds(20,110,200,30);
                emailfield.setBounds(250,110,200,30);

                l1.setBounds(20,800,100,30);
                l2.setBounds(250,810,100,30);
                l3.setBounds(20,880,200,30);
                l4.setBounds(250,880,200,30);
                l5.setBounds(20,970,200,30);



                r1.setActionCommand("B");
                r1.setBounds(10,200,50,30);
                r2.setActionCommand("BE");
                r2.setBounds(60,200,50,30);
                r3.setActionCommand("C");
                r3.setBounds(110,200,50,30);
                r4.setActionCommand("CE");
                r4.setBounds(160,200,50,30);
                r5.setActionCommand("D");
                r5.setBounds(210,200,50,30);
                r6.setActionCommand("DE");
                r6.setBounds(260,200,50,30);
                r7.setActionCommand("C+D");
                r7.setBounds(340,200,50,30);
                r8.setActionCommand("CE+DE");
                r8.setBounds(390,200,70,30);

                spara.setBounds(100,400,100,30);
                avbryt.setBounds(250,400,100,30);


                addChaforrPanel.add(l1);
                addChaforrPanel.add(l2);
                addChaforrPanel.add(l3);
                addChaforrPanel.add(l4);
                addChaforrPanel.add(l5);

                addChaforrPanel.add(sirname);
                addChaforrPanel.add(famlyname);
                addChaforrPanel.add(phonenumber);
                addChaforrPanel.add(emailfield);

                addChaforrPanel.add(r1);
                addChaforrPanel.add(r2);
                addChaforrPanel.add(r3);
                addChaforrPanel.add(r4);
                addChaforrPanel.add(r5);
                addChaforrPanel.add(r6);
                addChaforrPanel.add(r7);
                addChaforrPanel.add(r8);
                bg.add(r1);bg.add(r2); bg.add(r3);bg.add(r4); bg.add(r5);bg.add(r6);bg.add(r7);bg.add(r8);

                addChaforrPanel.add(spara);
                addChaforrPanel.add(avbryt);

                addChaforrPanel.setVisible(true);





            }
        });


        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backButtonMetod();
            }
        });
    }
    //**************************************************************


    //********************************** Bilar Button Metod ************************************//

    public void bilarButtonMetod(){

        mainFramePanel.setVisible(false);
        chauforrPanel.setVisible(false);
        bilarPanel.setVisible(true);
        bilarPanel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backButtonMetod();
            }
        });
    }
    //************************************************************************************************






    //********************************** back Button Metod ************************************//
    public void backButtonMetod(){
        chauforrPanel.setVisible(false);
        bilarPanel.setVisible(false);
        mainFramePanel.setVisible(true);


    }

}
