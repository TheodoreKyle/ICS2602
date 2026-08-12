import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.time.*; 
import java.time.format.*;
public class Choa_Billing_System implements ActionListener {
    private Frame f; 
    private Panel title, prices, p2, p3, p4, bottomPanel, infoPanel, optimization;
    private TextField[] tf = new TextField[44];
    private Button compute, cancel, clear;

    public Choa_Billing_System() { 
        f = new Frame("TheodoreKyle's Fruit Stand");

        title = new Panel();
        prices = new Panel(new GridLayout(3, 3, 5, 4));
        p2 = new Panel(); 
        p3 = new Panel(new GridLayout(6, 1, 5, 10));
        p4 = new Panel(new FlowLayout(FlowLayout.LEFT)); 
        bottomPanel = new Panel(new BorderLayout()); 
        infoPanel = new Panel(new GridLayout(2, 2, 5, 5)); 
        optimization = new Panel(new GridLayout(3, 1)); // To organize all panels to be used

        for (int i = 0; i < tf.length; i++) {
            tf[i] = new TextField(10);
            tf[i].setPreferredSize(new Dimension(150, 150));
        }

        compute = new Button("Compute");
        cancel = new Button("Cancel Order");
        clear = new Button("Clear");
    }

    public void startApp() {
        f.setLayout(new BorderLayout());

        p2.setLayout(new BorderLayout());

        Panel header = new Panel(new GridLayout(1, 4));
        header.add(new Label("Order ID", Label.CENTER));
        header.add(new Label("Order Description", Label.CENTER));
        header.add(new Label("Quantity", Label.CENTER));
        header.add(new Label("Sub-Total", Label.CENTER));
        p2.add(header, BorderLayout.NORTH);

        Panel tablePanel = new Panel(new GridLayout(9, 1, 5, 2));
        int tfIndex = 0;
        for (int i = 0; i < 9; i++) {
            Panel row = new Panel(new GridLayout(1, 4, 20, 2));
            for (int j = 0; j < 4; j++) 
                row.add(tf[tfIndex++]);
            tablePanel.add(row);
        }
        p2.add(tablePanel, BorderLayout.CENTER);

        for (int i = 1; i < tf.length; i++) {
            if (i % 4 == 1 || i % 4 == 3 || i >= 36) {
                tf[i].setEditable(false);  // Description and Sub-Total text fields are not editable because
                if (i == 38)                 // they should be fully dependent on the other text fields.
                    i += 2;                  // Same goes for the other textfields at the bottom.
            }
        }

        Map<String, String> fruitMap = new HashMap<>(); // Order ID -> Description
        fruitMap.put("A", "Apple");
        fruitMap.put("LZ", "Lanzones");
        fruitMap.put("CCN", "Coconut");
        fruitMap.put("MGS", "Mangosteen"); 
        fruitMap.put("WTM", "Watermelon");
        fruitMap.put("O", "Orange");
        fruitMap.put("TM", "Tomato");
        fruitMap.put("JP", "Java Plum");
        fruitMap.put("PY", "Papaya");

        Map<String, Integer> fruitPrices = new HashMap<>(); // Description -> Pricing
        fruitPrices.put("Apple", 40);
        fruitPrices.put("Lanzones", 3);
        fruitPrices.put("Coconut", 50);
        fruitPrices.put("Mangosteen", 6);
        fruitPrices.put("Watermelon", 220);
        fruitPrices.put("Orange", 55);
        fruitPrices.put("Tomato", 20);
        fruitPrices.put("Java Plum", 15);
        fruitPrices.put("Papaya", 130);

        for (int i = 0; i <= 32; i += 4) {  // This first for loop checks the content of Order ID. If there exists an Order ID,
            int index = i;                  // it will automatically put Order Description.
            tf[index].addTextListener(e -> {
                String input = tf[index].getText().toUpperCase().trim();
                String fruit = fruitMap.getOrDefault(input, "");
                tf[index + 1].setText(fruit);

                String quantityText = tf[index + 2].getText().trim();  // If the Order ID changes, this will be triggered. 
                if (fruitPrices.containsKey(fruit) && !quantityText.isEmpty()) {
                    try {
                        int quantity = Integer.parseInt(quantityText);
                        tf[index + 3].setText(String.valueOf(quantity * fruitPrices.get(fruit)));  // The calculation of sub-total is triggered both here
                    }                                                                             // and in the 2nd for loop. This part is an automatic 
                    catch (NumberFormatException nfe) {                                           // calculation of Sub-Total with the help of TextListener
                        tf[index + 3].setText("");
                    }
                } else {
                    tf[index + 2].setText("");
                    tf[index + 3].setText("");
                }
            });
        }

        for (int i = 2; i <= 36; i += 4) {
            int index = i;
            tf[index].addTextListener(e -> {
                String fruit = tf[index - 1].getText().trim();
                String quantityText = tf[index].getText().trim();

                if (fruitPrices.containsKey(fruit) && !quantityText.isEmpty()) {
                    try {
                        int quantity = Integer.parseInt(quantityText);
                        tf[index + 1].setText(String.valueOf(quantity * fruitPrices.get(fruit)));
                    } catch (NumberFormatException ex) {
                        tf[index + 1].setText("");
                    }
                } else {                               // The reason for the 2 loops and if-else statements is that if the user
                    tf[index].setText("");           // clears anything in the Order ID and there is content in both the Quantity
                    tf[index + 1].setText("");       // and Sub-Total, those text fields will be automatically cleared.
                }
            });                                        // This part does not account for the "Clear" button yet.
        }

        Panel row1 = new Panel(new FlowLayout(FlowLayout.LEFT));   // I placed these panels on the startApp() to easily
        row1.add(new Label("Total Order:"));                  // check the alignments of the labels and textfields
        row1.add(tf[36]);
        p3.add(row1);

        Panel row2 = new Panel(new FlowLayout(FlowLayout.LEFT));
        row2.add(new Label("Total Amount:"));
        row2.add(tf[37]);
        p3.add(row2);

        Panel row3 = new Panel(new FlowLayout(FlowLayout.LEFT));
        row3.add(new Label("Tax:"));
        row3.add(tf[38]);
        p3.add(row3);

        Panel row4 = new Panel(new FlowLayout(FlowLayout.LEFT));
        row4.add(new Label("Discount:"));
        row4.add(tf[39]);
        p3.add(row4);

        Panel row5 = new Panel(new FlowLayout(FlowLayout.LEFT));
        row5.add(new Label("Amount Tendered:"));
        row5.add(tf[40]);
        p3.add(row5);

        Panel row6 = new Panel(new FlowLayout(FlowLayout.LEFT));
        row6.add(new Label("Change:"));
        row6.add(tf[41]);
        p3.add(row6);

        compute.addActionListener(this);
        cancel.addActionListener(this);
        clear.addActionListener(this);

        title.setLayout(new BorderLayout());
        Label welcome = new Label("Welcome to TheodoreKyle's Fruit Stand", Label.CENTER);  // Designing the title and the prices
        welcome.setFont(new Font("Arial", Font.BOLD, 24));
        title.add(welcome, BorderLayout.NORTH);

        prices.add(new Label("(A) Apple : PHP40") {{
            setFont(new Font("Arial", Font.BOLD, 16));
            setForeground(Color.RED);
        }});
        prices.add(new Label("(LZ) Lanzones : PHP3") {{
            setFont(new Font("Arial", Font.BOLD, 16));
            setForeground(new Color(196, 164, 132)); 
        }});
        prices.add(new Label("(CCN) Coconut : PHP50") {{
            setFont(new Font("Arial", Font.BOLD, 16));
            setForeground(new Color(0, 100, 0));
        }});
        prices.add(new Label("(MGS) Mangosteen : PHP6") {{
            setFont(new Font("Arial", Font.BOLD, 16));
            setForeground(new Color(149, 53, 83));
        }});
        prices.add(new Label("(WTM) Watermelon : PHP220") {{
            setFont(new Font("Arial", Font.BOLD, 16));
            setForeground(new Color(0xFA25AA));
        }});
        prices.add(new Label("(O) Orange : PHP55") {{
            setFont(new Font("Arial", Font.BOLD, 16));
            setForeground(new Color(255, 160, 0));
        }});
        prices.add(new Label("(TM) Tomato : PHP20") {{
            setFont(new Font("Arial", Font.BOLD, 16));
            setForeground(new Color(255, 127, 127)); 
        }});
        prices.add(new Label("(JP) Java Plum : PHP15") {{
            setFont(new Font("Arial", Font.BOLD, 16));
            setForeground(new Color(120, 40, 120));
        }});
        prices.add(new Label("(PY) Papaya : PHP130") {{
            setFont(new Font("Arial", Font.BOLD, 16));
            setForeground(new Color(229, 103, 23));
        }});
        title.add(prices, BorderLayout.CENTER);

        optimization.add(title);
        optimization.add(p2);
        optimization.add(p3);
        p4.add(compute);
        p4.add(cancel);
        p4.add(clear);
        
        infoPanel.add(new Label("Cashier Name: "));
        infoPanel.add(tf[42]);
        
        infoPanel.add(new Label("Date of Transaction: "));
        infoPanel.add(tf[43]);

        bottomPanel.add(p4, BorderLayout.NORTH);
        bottomPanel.add(infoPanel, BorderLayout.WEST);
        
        f.add(optimization, BorderLayout.CENTER);
        f.add(bottomPanel, BorderLayout.SOUTH);
        f.setBackground(new Color(204, 255, 204));
        f.addWindowListener(new CloseButton());
        f.setSize(700,820);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source == compute) {
            int quantity_sum = 0, subtotal_sum = 0;
            try {
                for (int i = 2; i <= 36; i += 4) {
                    String quantity_text = tf[i].getText().trim();
                    String subtotal_text = tf[i + 1].getText().trim();

                    if (!quantity_text.isEmpty() && !subtotal_text.isEmpty()) {
                        int quantity = Integer.parseInt(quantity_text);
                        int subtotal = Integer.parseInt(subtotal_text);
                        quantity_sum += quantity;
                        subtotal_sum += subtotal;
                    }
                }
                tf[36].setText("" + quantity_sum);
                tf[37].setText("" + subtotal_sum);
                tf[38].setText("" + String.format("%.2f", subtotal_sum * 0.12));

                String tax_text = tf[38].getText();
                double tax = Double.parseDouble(tax_text);

                if (tf[40] != null) {
                    String cash_text = tf[40].getText();
                    double cash = Double.parseDouble(cash_text);
                    String disc_text = tf[39].getText().trim();
                    if (!disc_text.isEmpty()) {
                        int disc = Integer.parseInt(disc_text);
                        tf[41].setText("" + String.format("%.2f", cash - (subtotal_sum - (subtotal_sum * disc / 100.0) + tax)));  // Single-lined formula for computing with discount
                    } else {
                        tf[41].setText("" + String.format("%.2f", cash - (subtotal_sum + tax)));  // Single-lined formula for no discount
                    }
                }
                tf[42].setText("Theodore Kyle Choa");
                
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formattedDate = myDateObj.format(myFormatObj);
                tf[43].setText(formattedDate);
            } 
            catch (NumberFormatException nfe) {}
        }
        if (source == cancel)
            System.exit(0);
        if (source == clear)
            for (int i = 0; i < tf.length; i++)
                tf[i].setText("");
    }

    private class CloseButton extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Choa_Billing_System application = new Choa_Billing_System();
        application.startApp();
    }
} 