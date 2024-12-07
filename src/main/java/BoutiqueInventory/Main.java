package boutiqueInventory;

import boutiqueInventory.ui.LoginPage;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Inicializa la aplicación
        SwingUtilities.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }
}