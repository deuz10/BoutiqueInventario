package boutiqueInventory.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {
    private JTextField txtProductName;
    private JTextField txtProductDescription;
    private JTextField txtProductPrice;
    private JTextField txtProductStock;
    private JTextField txtSellProductName;
    private JTextField txtSellQuantity;
    private JTextArea txtAreaOutput;

    // Lista para almacenar productos
    private List<Product> productList;

    public MainFrame() {
        productList = new ArrayList<>(); // Inicializar la lista de productos

        setTitle("Gestión de Inventario de Boutique");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Crear panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Crear panel de entrada de productos
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2, 10, 10)); // 5 filas, 2 columnas

        // Agregar componentes al panel de entrada
        inputPanel.add(new JLabel("Nombre del Producto:"));
        txtProductName = new JTextField();
        inputPanel.add(txtProductName);

        inputPanel.add(new JLabel("Descripción:"));
        txtProductDescription = new JTextField();
        inputPanel.add(txtProductDescription);

        inputPanel.add(new JLabel("Precio:"));
        txtProductPrice = new JTextField();
        inputPanel.add(txtProductPrice);

        inputPanel.add(new JLabel("Stock:"));
        txtProductStock = new JTextField();
        inputPanel.add(txtProductStock);

        // Crear panel de botones para productos
        JPanel buttonPanel = new JPanel();
        JButton btnAdd = new JButton("Agregar Producto");
        JButton btnRemove = new JButton("Eliminar Producto");
        JButton btnList = new JButton("Listar Productos");

        // Agregar acción a los botones
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar producto
                String name = txtProductName.getText();
                String description = txtProductDescription.getText();
                double price = Double.parseDouble(txtProductPrice.getText());
                int stock = Integer.parseInt(txtProductStock.getText());

                // Crear un nuevo producto y agregarlo a la lista
                Product newProduct = new Product(name, description, price, stock);
                productList.add(newProduct);
                txtAreaOutput.append("Producto agregado: " + newProduct + "\n");

                // Limpiar campos de texto
                clearInputFields();
            }
        });

        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar producto
                String name = txtProductName.getText();
                productList.removeIf(product -> product.getName().equalsIgnoreCase(name));
                txtAreaOutput.append("Producto eliminado: " + name + "\n");

                // Limpiar campos de texto
                clearInputFields();
            }
        });

        btnList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para listar productos
                txtAreaOutput.append("Listando productos:\n");
                for (Product product : productList) {
                    txtAreaOutput.append(product + "\n");
                }
            }
        });

        buttonPanel.add(btnAdd);
        buttonPanel.add(btnRemove);
        buttonPanel.add(btnList);

        // Crear panel de ventas
        JPanel salesPanel = new JPanel();
        salesPanel.setLayout(new GridLayout(3, 2, 10, 10));

        salesPanel.add(new JLabel("Nombre del Producto a Vender:"));
        txtSellProductName = new JTextField();
        salesPanel.add(txtSellProductName);

        salesPanel.add(new JLabel("Cantidad a Vender:"));
        txtSellQuantity = new JTextField();
        salesPanel.add(txtSellQuantity);

        JButton btnSell = new JButton("Registrar Venta");
        salesPanel.add(btnSell);

        // Agregar acción al botón de venta
        btnSell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para registrar una venta
                String name = txtSellProductName.getText();
                int quantity = Integer.parseInt(txtSellQuantity.getText());

                for (Product product : productList) {
                    if (product.getName().equalsIgnoreCase(name)) {
                        if (product.getStock() >= quantity) {
                            product.setStock(product.getStock() - quantity);
                            txtAreaOutput.append("Venta registrada: " + quantity + " de " + name + "\n");
                        } else {
                            txtAreaOutput.append("Stock insuficiente para " + name + "\n");
                        }
                        break;
                    }
                }

                // Limpiar campos de texto
                txtSellProductName.setText("");
                txtSellQuantity.setText("");
            }
        });

        // Crear área de salida
        txtAreaOutput = new JTextArea();
        txtAreaOutput.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaOutput);

        // Agregar componentes al panel principal
        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(salesPanel, BorderLayout.SOUTH);
        panel.add(scrollPane, BorderLayout.EAST);

        // Agregar panel principal a la ventana
        add(panel);
    }

    private void clearInputFields() {
        txtProductName.setText("");
        txtProductDescription.setText("");
        txtProductPrice.setText("");
        txtProductStock.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}

// Clase Product para representar un producto
class Product {
    private String name;
    private String description;
    private double price;
    private int stock;

    public Product(String name, String description, double price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", Descripción: " + description + ", Precio: " + price + ", Stock: " + stock;
    }
}