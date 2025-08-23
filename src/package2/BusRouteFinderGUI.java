package package2;

import package1.BusData;
import package1.BusData.Bus;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class BusRouteFinderGUI extends JFrame {

    private JTextField stopField;
    private JTextArea resultArea;
    private JButton searchButton, clearButton;

    public BusRouteFinderGUI() {
        setTitle("Bus Route & Schedule Finder");
        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // ===== Input Panel =====
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JLabel stopLabel = new JLabel("Enter Stop:");
        stopField = new JTextField(20);
        searchButton = new JButton("Search");
        clearButton = new JButton("Clear");

        inputPanel.add(stopLabel);
        inputPanel.add(stopField);
        inputPanel.add(searchButton);
        inputPanel.add(clearButton);

        // ===== Result Area =====
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(resultArea);

        // ===== Add Components =====
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // ===== Event Listeners =====
        searchButton.addActionListener(e -> searchBusRoutes());
        stopField.addActionListener(e -> searchBusRoutes());
        clearButton.addActionListener(e -> {
            stopField.setText("");
            resultArea.setText("");
        });
    }

    private void searchBusRoutes() {
        String stop = stopField.getText().trim();
        if (stop.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a stop name.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        List<Bus> buses = BusData.getBuses();
        int foundCount = 0;
        StringBuilder sb = new StringBuilder();

        sb.append("[").append(stop.toUpperCase()).append("] வழியாக செல்லும் பேருந்துகள்:\n\n");

        for (Bus bus : buses) {
            for (int i = 0; i < bus.stops.size(); i++) {
                String s = bus.stops.get(i);
                if (s.equalsIgnoreCase(stop)) {
                    foundCount++;
                    String timeAtStop = bus.stopTimes.get(i);
                    sb.append(String.format("%d. Bus: %-12s | Route: %-15s → %-15s | Time: %s\n",
                            foundCount, bus.busNumber, bus.startCity, bus.endCity, timeAtStop));
                    break;
                }
            }
        }

        if (foundCount == 0) {
            sb.append("\nமன்னிக்கவும், உங்கள் தற்போதைய நிறுத்தம்/இடம் பற்றிய தரவு எங்களிடம் இல்லை\n")
                    .append("விரைவில் புதுப்பிக்கப்படும் ....!\n")
                    .append("----🙏 நன்றி வணக்கம் 🙏----");
        } else {
            sb.append("\nமொத்த பேருந்துகள்: ").append(foundCount);
        }

        resultArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BusRouteFinderGUI().setVisible(true);
        });
    }
}
