/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop.assignment;

/**
 *
 * @author User
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class RegisterOrLogin extends javax.swing.JFrame {
    
    
    private Map<String, User> userDataBase = new HashMap<>();
    
    public RegisterOrLogin() {
        initComponents();
        click();
    }
                    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        RegisterButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        registrationDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setText("Password");

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel2.setText("Email");

        emailField.setBackground(new java.awt.Color(204, 255, 204));
        emailField.setText("");
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }

            private void emailFieldActionPerformed(ActionEvent evt) {
                registerUser();}
        });

        passwordField.setBackground(new java.awt.Color(204, 255, 204));

        RegisterButton.setBackground(new java.awt.Color(0, 153, 51));
        RegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterButton.setText("Register");

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }

            private void LoginButtonActionPerformed(ActionEvent evt) {
                loginUser();}
        });

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Already have an account ?");

        messageLabel.setForeground(new java.awt.Color(255, 51, 51));
        messageLabel.setText("");

        registrationDate.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 211, Short.MAX_VALUE)
                                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(registrationDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registrationDate)
                .addGap(8, 8, 8)
                .addComponent(messageLabel)
                .addGap(20, 20, 20)
                .addComponent(RegisterButton)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26))
        
        );

        pack();
    }// </editor-fold> 
    
    private void click(){
        RegisterButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            registerUser();
        }
        });
        LoginButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            loginUser();
        }});
    }
    
    private void registerUser(){
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        if(isValidEmail(email) && isValidPassword(password) && !userDataBase.containsKey(email)){
            LocalDateTime registrationdate = LocalDateTime.now();
            registrationDate.setText("Registration date: "+registrationdate);
            User newUser = new User(email,password, registrationdate);
            userDataBase.put(email, newUser);
            messageLabel.setText("Registration successful!");
        }
        else{
            messageLabel.setText("Invalid email or password or email already registered.");
        }
    }
    
    private void loginUser(){
        String email= emailField.getText();
        String password = new String(passwordField.getPassword());
        
        if (userDataBase.containsKey(email) && userDataBase.get(email).getPassword().equals(password)) {
            messageLabel.setText("Login successful!");
        }
        else{
            messageLabel.setText("Invalid email or password.");
                }
    }
    private boolean isValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.matches(emailRegex, email);
}
    private boolean isValidPassword(String password){
        String passwordRegex = "[a-zA-Z]{5,30}[0-9]{1,5}[!@#$%^&*()<>?_]{1,5}";
        return Pattern.matches(passwordRegex, password);
    }
    
    /**
     * @param args the command line arguments
     */
    public void LoginOrRegister() {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterOrLogin().setVisible(true);
            }
        });
        
    }
    
    
    


    // Variables declaration - do not modify                     
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel registrationDate;
    // End of variables declaration                   
}


class User {
    private String email;
    private String password;
    private LocalDateTime registrationDate;

    public User(String email, String password, LocalDateTime registrationDate) {
        this.email = email;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    Object get(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
            

    
}

    