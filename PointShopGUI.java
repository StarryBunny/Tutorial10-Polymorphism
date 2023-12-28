 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop.assignment;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PointShopGUI {
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel merchandisePanel;
    private JPanel treePanel;

    public PointShopGUI() {
        frame = new JFrame("Point Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        mainPanel = new JPanel();
        frame.add(mainPanel);

        createMainPage();
        createMerchandisePage();
        createTreePage();

        showMainPage();
    }

    private void createMainPage() {
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel welcomeLabel = new JLabel("Welcome to Point Shop!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));

        gbc.gridwidth = 2; // Spanning two columns
        mainPanel.add(welcomeLabel, gbc);

        gbc.gridwidth = 1; // Reset gridwidth

        gbc.gridy++;
        JButton purchaseButton = new JButton("Purchase Merchandise");
        purchaseButton.setPreferredSize(new Dimension(200, 40));
        purchaseButton.addActionListener(e -> showMerchandisePage());
        mainPanel.add(purchaseButton, gbc);

        gbc.gridy++;
        JButton plantTreeButton = new JButton("Plant a Tree");
        plantTreeButton.setPreferredSize(new Dimension(200, 40));
        plantTreeButton.addActionListener(e -> showTreePage());
        mainPanel.add(plantTreeButton, gbc);
    }

    public void createMerchandisePage() {
        
        merchandisePanel = new JPanel(new GridLayout(5, 2));

        JLabel idLabel = new JLabel("Merchandise ID:");
        JTextField idField = new JTextField();

        JLabel quantityLabel = new JLabel("Number of Purchase:");
        JTextField quantityField = new JTextField();

        JLabel addressLabel = new JLabel("Delivery Address:");
        JTextField addressField = new JTextField();

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> showMainPage());

        JButton orderButton = new JButton("Place Order");
        orderButton.addActionListener(e -> {
            String id = idField.getText();
            String quantity = quantityField.getText();
            String address = addressField.getText();

            if (id.isEmpty() || quantity.isEmpty() || address.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.");
            } else {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("MerchandiseOrder.txt", true))) {
                    writer.write("ID: " + id + ", Quantity: " + quantity + ", Address: " + address + "\n");
                    writer.flush();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                // Show order successful popup
                JOptionPane.showMessageDialog(frame, "Order Successful!");
            }
        });

        merchandisePanel.add(idLabel);
        merchandisePanel.add(idField);
        merchandisePanel.add(quantityLabel);
        merchandisePanel.add(quantityField);
        merchandisePanel.add(addressLabel);
        merchandisePanel.add(addressField);
        merchandisePanel.add(orderButton);
        merchandisePanel.add(exitButton);
    }

    private void createTreePage() {
        treePanel = new JPanel(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Tree Name:");
        JTextField nameField = new JTextField();

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> showMainPage());

        JButton plantButton = new JButton("Plant Tree");
        plantButton.addActionListener(e -> {
            String treeName = nameField.getText();

            if (treeName.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter a tree name.");
            } else {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("TreePlantOrder.txt", true))) {
                    writer.write("Tree Name: " + treeName + "\n");
                    writer.flush();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                // Show order successful popup
                JOptionPane.showMessageDialog(frame, "Order Successful!");
            }
        });

        treePanel.add(nameLabel);
        treePanel.add(nameField);
        treePanel.add(plantButton);
        treePanel.add(exitButton);
    }

    private void showMainPage() {
        mainPanel.removeAll();
        createMainPage();
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private void showMerchandisePage() {
        mainPanel.removeAll();
        mainPanel.add(merchandisePanel);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private void showTreePage() {
        mainPanel.removeAll();
        mainPanel.add(treePanel);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public void display() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PointShopGUI pointShop = new PointShopGUI();
            pointShop.display();
        });
    }
}
