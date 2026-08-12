import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BillingSystem extends JFrame {

    JTextField qtyOriginal, qtySpicy, qtyGarlic;
    JTextField qtyFries, qtyMashed, qtyColeslaw;
    JTextField subtotalField, taxField, discountField, totalField, tenderedField, changeField;
    JLabel totalQtyLabel;

    final int PRICE_ORIGINAL = 100;
    final int PRICE_SPICY = 110;
    final int PRICE_GARLIC = 120;
    final int PRICE_FRIES = 50;
    final int PRICE_MASHED = 60;
    final int PRICE_COLESLAW = 40;

    public BillingSystem() {
        setTitle("Kristian’s Fried Chicken - Billing System");
        setSize(580, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Title
        JLabel title = new JLabel("Kristian’s Fried Chicken - Billing System");
        title.setFont(new Font("SansSerif", Font.BOLD, 16));
        title.setForeground(Color.RED);
        title.setBounds(60, 10, 460, 30);
        add(title);

        // Headers
        addStyledLabel("OrderID", 20, 50);
        addStyledLabel("Sub-Total", 100, 50);
        addStyledLabel("Order Description", 220, 50);
        addStyledLabel("Quantity", 420, 50);

        // Main Dishes
        addItemRow(1, "Original Fried Chicken", PRICE_ORIGINAL, 80);
        qtyOriginal = lastQtyField;

        addItemRow(2, "Spicy Fried Chicken", PRICE_SPICY, 110);
        qtySpicy = lastQtyField;

        addItemRow(3, "Garlic Fried Chicken", PRICE_GARLIC, 140);
        qtyGarlic = lastQtyField;

        // Side Dishes
        addItemRow(4, "Fries", PRICE_FRIES, 180);
        qtyFries = lastQtyField;

        addItemRow(5, "Mashed Potato", PRICE_MASHED, 210);
        qtyMashed = lastQtyField;

        addItemRow(6, "Coleslaw", PRICE_COLESLAW, 240);
        qtyColeslaw = lastQtyField;

        // Total Quantity
        totalQtyLabel = addStyledLabel("Total Quantity: ", 20, 280);

        // Subtotal, tax, discount, total
        addStyledLabel("Sub Total:", 20, 310);
        subtotalField = addField("", 150, 310, false);

        addStyledLabel("Tax (12%):", 20, 340);
        taxField = addField("", 150, 340, false);

        addStyledLabel("Discount:", 20, 370);
        discountField = addField("", 150, 370, true);

        addStyledLabel("Total Amount:", 20, 400);
        totalField = addField("", 150, 400, false);

        addStyledLabel("Amount Tendered:", 20, 430);
        tenderedField = addField("1000", 150, 430, true);

        addStyledLabel("Change:", 20, 460);
        changeField = addField("", 150, 460, false);

        // Buttons
        JButton computeBtn = styledButton("COMPUTE", 50, 510);
        computeBtn.addActionListener(e -> computeTotal());
        add(computeBtn);

        JButton cancelBtn = styledButton("CANCEL ORDER", 190, 510);
        cancelBtn.addActionListener(e -> clearFields());
        add(cancelBtn);

        JButton clearBtn = styledButton("CLEAR", 350, 510);
        clearBtn.addActionListener(e -> clearFields());
        add(clearBtn);

        // Footer
        JLabel cashier = new JLabel("Cashier Name: YOURNAME");
        cashier.setBounds(20, 560, 200, 30);
        cashier.setFont(new Font("SansSerif", Font.PLAIN, 12));
        add(cashier);

        JLabel date = new JLabel("Date: " + java.time.LocalDate.now());
        date.setBounds(350, 560, 200, 30);
        date.setFont(new Font("SansSerif", Font.PLAIN, 12));
        add(date);

        setVisible(true);
    }

    JTextField lastQtyField;

    private void addItemRow(int id, String name, int price, int y) {
        addStyledLabel(String.valueOf(id), 20, y);
        addField(String.valueOf(price), 100, y, false);
        addStyledLabel(name, 220, y);
        lastQtyField = addField("1", 420, y, true);
    }

    private JTextField addField(String text, int x, int y, boolean editable) {
        JTextField field = new JTextField(text);
        field.setBounds(x, y, 100, 25);
        field.setEditable(editable);
        field.setFont(new Font("SansSerif", Font.PLAIN, 12));
        add(field);
        return field;
    }

    private JLabel addStyledLabel(String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, 180, 25);
        label.setFont(new Font("SansSerif", Font.BOLD, 12));
        label.setForeground(Color.BLACK);
        add(label);
        return label;
    }

    private JButton styledButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 120, 30);
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setFont(new Font("SansSerif", Font.BOLD, 12));
        return button;
    }

    private void computeTotal() {
        try {
            int q1 = Integer.parseInt(qtyOriginal.getText().trim());
            int q2 = Integer.parseInt(qtySpicy.getText().trim());
            int q3 = Integer.parseInt(qtyGarlic.getText().trim());
            int q4 = Integer.parseInt(qtyFries.getText().trim());
            int q5 = Integer.parseInt(qtyMashed.getText().trim());
            int q6 = Integer.parseInt(qtyColeslaw.getText().trim());

            if (q1 < 0 || q2 < 0 || q3 < 0 || q4 < 0 || q5 < 0 || q6 < 0) {
                throw new NumberFormatException("Quantity cannot be negative.");
            }

            int totalQty = q1 + q2 + q3 + q4 + q5 + q6;
            int subtotal = (q1 * PRICE_ORIGINAL) + (q2 * PRICE_SPICY) + (q3 * PRICE_GARLIC)
                         + (q4 * PRICE_FRIES) + (q5 * PRICE_MASHED) + (q6 * PRICE_COLESLAW);

            double tax = subtotal * 0.12;
            double discount = 0;

            if (!discountField.getText().isEmpty()) {
                discount = Double.parseDouble(discountField.getText().trim());
                if (discount < 0) throw new NumberFormatException("Discount cannot be negative.");
            }

            double total = subtotal + tax - discount;
            double tendered = Double.parseDouble(tenderedField.getText().trim());
            if (tendered < total) {
                JOptionPane.showMessageDialog(this, "Tendered amount is less than total.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double change = tendered - total;

            totalQtyLabel.setText("Total Quantity: " + totalQty);
            subtotalField.setText(String.valueOf(subtotal));
            taxField.setText(String.format("%.2f", tax));
            totalField.setText(String.format("%.2f", total));
            changeField.setText(String.format("%.2f", change));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.\n" + ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        qtyOriginal.setText("");
        qtySpicy.setText("");
        qtyGarlic.setText("");
        qtyFries.setText("");
        qtyMashed.setText("");
        qtyColeslaw.setText("");

        discountField.setText("");
        subtotalField.setText("");
        taxField.setText("");
        totalField.setText("");
        tenderedField.setText("");
        changeField.setText("");
        totalQtyLabel.setText("Total Quantity: ");
    }

    public static void main(String[] args) {
        new BillingSystem();
    }
}