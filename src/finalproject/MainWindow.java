/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import com.sun.glass.events.KeyEvent;
import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random; 
import javax.swing.*;
/**
 *
 * @author Shinozaki Kirishima
 */
public class MainWindow extends javax.swing.JFrame {
    //static long startTime;
    //static long endTime;
    public MainWindow() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setOpacity(0.95f);
        this.scaleIcon();
        // upon running the program, delete previous contents of our output file || if file does not exist, create one 
        File file = new File("Output.txt");
        if(!file.exists())
        {
            try 
            {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try{
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.print("");  // flush contens
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, ex);  
        }
        //welcome message
        final ImageIcon icon1 = new ImageIcon("Joptionpane/welcome.gif");
        JOptionPane.showMessageDialog(null, "", "Welcome !!!",
        JOptionPane.INFORMATION_MESSAGE, icon1);
    } 
    // private fields for title bar 
    private int x;
    private int y;
    // setters 
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    // function to scale header image to label size 
    public void scaleIcon()
    {
        // store image path
        String imgPath = "src\\Images\\headerIcon.png";
        ImageIcon icon = new ImageIcon(imgPath);
        // scale image to fit the label 
        Image img = icon.getImage();
        Image scaleImage = img.getScaledInstance(this.headerIcon.getWidth(), this.headerIcon.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaleImage);
        this.headerIcon.setIcon(scaledIcon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        headerIcon = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        goToOutputFile = new javax.swing.JPanel();
        home1 = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        panelH = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        typeOfQuestion = new javax.swing.JComboBox<>();
        numberOfQuestions = new javax.swing.JTextField();
        enter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(110, 89, 222));

        titleBar.setBackground(new java.awt.Color(54, 33, 89));
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit.png"))); // NOI18N
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizeBtnMousePressed(evt);
            }
        });

        title.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        title.setForeground(new java.awt.Color(153, 153, 255));
        title.setText("Exam Question Bank ");

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBarLayout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(minimizeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBtn)
                .addContainerGap())
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addGroup(titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitBtn)
                    .addComponent(minimizeBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        headerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/headerIcon.png"))); // NOI18N

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(headerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 90));

        sidePanel.setBackground(new java.awt.Color(54, 33, 89));

        homePanel.setBackground(new java.awt.Color(54, 33, 89));
        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainWindow.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MainWindow.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MainWindow.this.mouseExited(evt);
            }
        });

        home.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        goToOutputFile.setBackground(new java.awt.Color(54, 33, 89));
        goToOutputFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToOutputFileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                goToOutputFilemouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                goToOutputFilemouseExited(evt);
            }
        });

        home1.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        home1.setForeground(new java.awt.Color(255, 255, 255));
        home1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home1.setText("Open output file.");

        javax.swing.GroupLayout goToOutputFileLayout = new javax.swing.GroupLayout(goToOutputFile);
        goToOutputFile.setLayout(goToOutputFileLayout);
        goToOutputFileLayout.setHorizontalGroup(
            goToOutputFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        goToOutputFileLayout.setVerticalGroup(
            goToOutputFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, goToOutputFileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(goToOutputFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                .addComponent(goToOutputFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 140, 470));

        centerPanel.setBackground(new java.awt.Color(204, 204, 255));
        centerPanel.setLayout(new java.awt.CardLayout());

        panelH.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Please Enter the Type of Questions:");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Please Enter the Number of Questions:");

        typeOfQuestion.setForeground(new java.awt.Color(0, 0, 0));
        typeOfQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True/False", "Multiple Choice" }));
        typeOfQuestion.setOpaque(false);

        numberOfQuestions.setForeground(new java.awt.Color(0, 0, 0));
        numberOfQuestions.setOpaque(false);
        numberOfQuestions.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOfQuestionsKeyTyped(evt);
            }
        });

        enter.setForeground(new java.awt.Color(0, 0, 0));
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHLayout = new javax.swing.GroupLayout(panelH);
        panelH.setLayout(panelHLayout);
        panelHLayout.setHorizontalGroup(
            panelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addGroup(panelHLayout.createSequentialGroup()
                .addGroup(panelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberOfQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeOfQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelHLayout.setVerticalGroup(
            panelHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(typeOfQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberOfQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        centerPanel.add(panelH, "card2");

        jPanel2.add(centerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 260, 470));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
        // event for when mouse is clicked 
        if(evt.getSource() == this.homePanel)
        {
            this.panelH.setVisible(true);
        }
    }//GEN-LAST:event_mouseClicked

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        // code when mouse cursor enters the tab
        if(evt.getSource() == homePanel)
        {
            homePanel.setBackground(new Color(85, 65, 118));
        }
    }//GEN-LAST:event_mouseEntered

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
        // code when mouse cursor exits the tab
        if(evt.getSource() == homePanel)
        {
            homePanel.setBackground(new Color(54, 33, 89));
        }
    }//GEN-LAST:event_mouseExited

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // code for exit button 
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        // code for when the mouse is pressed
        this.setX(evt.getX());
        this.setY(evt.getY());
    }//GEN-LAST:event_titleBarMousePressed

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        // code for when the mouse is pressed and dragged 
        int x1 = evt.getXOnScreen();
        int y1 = evt.getYOnScreen();
        this.setLocation(x1-this.x, y1-y);
    }//GEN-LAST:event_titleBarMouseDragged

    private void minimizeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMousePressed
        // code for minimize 
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMousePressed

    private void numberOfQuestionsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOfQuestionsKeyTyped
        // restrict filed to only allow input of numbers 
        char character = evt.getKeyChar();
        if(!(Character.isDigit(character)||(character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE) || (character==KeyEvent.VK_PERIOD))){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Error! Enter Numbers Only.");  
        }
        if((character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_numberOfQuestionsKeyTyped
   
    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
       // initialize fields 
       int count=1;
       int questionLength=0;
       int maxQuestions=15;
       String line;
       String fileName="";
       String[] multipleChoice = new String[4];
       int[] keys = new int[maxQuestions+1];
       String[] trueFalse = new String[2];
       Question newQuestion;
       Node newNode;
       //startTime = System.currentTimeMillis();
       // get and store the selected item 
        String type=typeOfQuestion.getSelectedItem().toString();
        int numQuestions = Integer.parseInt(numberOfQuestions.getText());  // get the number inputted by the user
       // initialize a new array of linked lists 
       linkedList[] Questions = new linkedList[maxQuestions+1];
       for(int i=1;i<(maxQuestions+1);i++) 
       {
                Questions[i]=new linkedList();           
       }
        // check the type of questions the user requested || set filname according to user request
        if(type.equals("True/False")) fileName="TrueFalseQuestions.txt";
        if(type.equals("Multiple Choice")) fileName="MultipleChoiceQuestions.txt";         
        try {
            Scanner in = new Scanner(new FileReader(fileName));  // initialize scanner object and read file
            // while loop, while the file has a next line, and the count is less that the max question
            while(in.hasNextLine() && count< (maxQuestions+1) )
            {
                if(!( line = in.nextLine()).isEmpty())  // check if the line is not empty 
                {
                    newQuestion = new Question();  // initialize a new instance of question object 
                    newQuestion.setQ(line);  // set the question to line     
                    // check the type of questions the user requested 
                    if(type.equals("Multiple Choice"))  // if Multiple Choice is selected 
                    {
                         for(int i=0;i<4;i++)  // iteratively store the possible answers from the file to our multipleChoice array
                         {
                            line = in.nextLine();
                            multipleChoice[i]=line;
                         }
                         newQuestion.setAnswers(Arrays.toString(multipleChoice)); // set the possible answers  
                     } 
                    if(type.equals("True/False"))  // if True/False is selected 
                    {
                         for(int i=0;i<2;i++)  // iteratively store the possible answers from the file to our trueFalse array
                         {
                            line = in.nextLine();
                            trueFalse[i]=line;
                         }
                         newQuestion.setAnswers(Arrays.toString(trueFalse));  // set the possible answers  
                     } 
                    line = in.nextLine();  // get next line 
                    newQuestion.setAns(line.charAt(0));  // store and set the valid answer
                    
                        // store keys in a key array 
                        keys[count] = newQuestion.getQ().length();
                        int hashKey = keys[count] % maxQuestions + 1;  // Hash function to get hash key value  
                        
                        if(Questions[hashKey].isEmpty()) {  // check if the question array of linked lists is empty 
                             newNode = new Node(newQuestion);  // initialize new node 
                             Questions[hashKey].setFirstlink(newNode);  // set the first link to new node at the hashkey position
                          }
                        else {  // else 
                             Questions[hashKey].addLast(newQuestion);  // add the new node at the last position          
                         }
                        count++;  // increment the count 
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
//         System.out.println("PRINT RESULTS AFTER!");
//           for(int i=1;i<(maxQuestions+1);i++) {
//               if(! (Questions[i].isEmpty()) ) {
//                   System.out.println("LENGTH : "+Questions[i].questionsToString().length()+" INDEX : "+i+" DATA : " +Questions[i]);
//               }
//            }
//            System.out.println(Arrays.toString(keys));
//            System.out.println("End of File\n\n"); 
            int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};  // initialize array to be shuffled 
            int length = arr.length;  // store the length of the array
            randomizeArray(arr, length);  // shuffle the array
            int questionNumber = Integer.parseInt(numberOfQuestions.getText());  // parse and store the user input
            // after shuffling array, and i is less than the inputted numbers, search the array and output.
            for(int i = 0; i < questionNumber; i++)
            {
                search(arr[i], Questions, keys);
            }
            //endTime = System.currentTimeMillis();
           // System.out.println("Linear Search Took " + (endTime - startTime));
    }//GEN-LAST:event_enterActionPerformed

    private void goToOutputFilemouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToOutputFilemouseEntered
        // code when mouse cursor enters the tab
        if(evt.getSource() == goToOutputFile)
        {
            goToOutputFile.setBackground(new Color(85, 65, 118));
        }
    }//GEN-LAST:event_goToOutputFilemouseEntered

    private void goToOutputFilemouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToOutputFilemouseExited
       // code when mouse cursor exits the tab
        if(evt.getSource() == goToOutputFile)
        {
            goToOutputFile.setBackground(new Color(54, 33, 89));
        }
    }//GEN-LAST:event_goToOutputFilemouseExited

    private void goToOutputFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToOutputFileMouseClicked
        // event for when mouse is clicked 
        try{
            Desktop.getDesktop().open(new java.io.File("Output.txt"));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_goToOutputFileMouseClicked
    // search function 
    public boolean search(int rand, linkedList[] list, int keys[])
    {
        //startTime = System.currentTimeMillis();
        // fields
        int maxSize = 15;  // max size for array 
        int value = keys[rand]; // value at position 6 in array 
        int hashKey = value % maxSize + 1;  // hash the value at key[rand] to get the index value in the question array 
        Node curr = list[hashKey].getFirstLink();  // initialize a node to iterate through the list
        String storeQuestion;
        String storeChoices;
        char storeAnswer;
        // while the current node is not null
        while (curr!=null) {
            if (curr.question.getQ().length() == value) // if the length of the the question equals the value the question is found 
            {
                 storeQuestion = curr.question.getQ();  // get the current question 
                 storeChoices =curr.question.getAnswers();  // get the current  choices 
                 storeAnswer = curr.question.getAns();  // get the current answer
                 // initialize a new file object 
                 File file = new File("Output.txt");
                 // if the file does not exist, create it
                 if (!file.exists()) {
                     try {
                         file.createNewFile();
                     } catch (IOException ex) {
                         Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                     }
                }
                FileWriter fw = null;  // initialize file writer object 
                try {
                    fw = new FileWriter(file.getAbsoluteFile(), true);  // get the absolute file and set to true so it would not overwrite current data
                } catch (IOException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }  // append items to file   // append items to file 
                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.append(storeQuestion+"\n");
                    bw.append("Choices : "+storeChoices+"\n");
                    bw.append("Answer : "+storeAnswer+"\n");
                } catch (IOException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
//                 System.out.println("key val: " + value);
//                 System.out.println("index : " + hashKey);
//                 System.out.println("item : " + curr.question.getQ());
//                 System.out.println("CHOICES : "+ curr.question.getAnswers());
//                System.out.println("the question was found.");
                return true;  // return true 
            }  // if not found in the current node, search the next node n the list
            curr=curr.next;
            //endTime = System.currentTimeMillis();
            //System.out.println("Linear Search Took " + (endTime - startTime));
        }
//        System.out.println("Node was not found in the array.");
        return false;  // the the node is not present in the array, return false
    }
    // function to shuffle an array of numbers, where n the the length of the array
    public void randomizeArray(int[] array, int n)
    {
        // create a random object
        Random rand = new Random();
        // from the last element swap one by one
        for(int i = n-1; i > 0; i--)
        {
            // store random index from i - 0 in integer variable
            int randValue = rand.nextInt(i+1);
            // swap array[i] with the random element 
            int tempVariable = array[i];
            array[i] = array[randValue];
            array[randValue] = tempVariable;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centerPanel;
    private javax.swing.JButton enter;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JPanel goToOutputFile;
    private javax.swing.JLabel headerIcon;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home1;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JTextField numberOfQuestions;
    private javax.swing.JPanel panelH;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titleBar;
    private javax.swing.JPanel topPanel;
    private javax.swing.JComboBox<String> typeOfQuestion;
    // End of variables declaration//GEN-END:variables
}
