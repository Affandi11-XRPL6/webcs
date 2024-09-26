import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class DetailedMindMap extends JPanel {
    private Map<String, Point> nodes = new HashMap<>();
    private Map<String, String[]> connections = new HashMap<>();

    public DetailedMindMap() {
        // Simpul-simpul
        nodes.put("Sejarah Pra-Aksara", new Point(300, 50));
        nodes.put("Pra-Aksara", new Point(300, 150));
        nodes.put("Periode-Pendahuluan Peradaban", new Point(100, 250));
        nodes.put("Wilayah dan Peradaban Pra-Aksara", new Point(300, 250));
        nodes.put("Situs dan Penemuan Penting", new Point(500, 250));
        nodes.put("Pentingnya Studi Pra-Aksara", new Point(300, 350));
        // Menambahkan simpul tambahan
        nodes.put("Paleolitikum dan Mesolitikum", new Point(100, 250));
        nodes.put("Neolitikum", new Point(100, 300));
        nodes.put("Peradaban Mesopotamia", new Point(300, 300));
        nodes.put("Peradaban Mesir Kuno", new Point(300, 350));
        nodes.put("Situs Arkeologi terkenal lainnya", new Point(500, 300));
        nodes.put("Göbekli Tepe", new Point(500, 350));
        nodes.put("Cave of Lascaux", new Point(500, 400));

        // Koneksi antara simpul-simpul
        connections.put("Sejarah Pra-Aksara", new String[]{"Pra-Aksara"});
        connections.put("Pra-Aksara", new String[]{"Periode-Pendahuluan Peradaban", "Wilayah dan Peradaban Pra-Aksara", "Situs dan Penemuan Penting", "Pentingnya Studi Pra-Aksara"});
        // Menambahkan koneksi tambahan
        connections.put("Periode-Pendahuluan Peradaban", new String[]{"Paleolitikum dan Mesolitikum", "Neolitikum"});
        connections.put("Wilayah dan Peradaban Pra-Aksara", new String[]{"Peradaban Mesopotamia", "Peradaban Mesir Kuno", "Situs Arkeologi terkenal lainnya"});
        connections.put("Situs dan Penemuan Penting", new String[]{"Göbekli Tepe", "Cave of Lascaux"});

        JFrame frame = new JFrame("Mind Map Sejarah Pra-Aksara yang Lebih Rinci");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setSize(600, 450);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (String node : nodes.keySet()) {
            Point point = nodes.get(node);
            g.setColor(Color.BLUE);
            g.fillOval(point.x, point.y, 120, 40);
            g.setColor(Color.WHITE);
            g.drawString(node, point.x + 20, point.y + 20);
        }
        g.setColor(Color.BLACK);
        for (String from : connections.keySet()) {
            Point startPoint = nodes.get(from);
            String[] toNodes = connections.get(from);
            for (String to : toNodes) {
                Point endPoint = nodes.get(to);
                g.drawLine(startPoint.x + 60, startPoint.y + 20, endPoint.x + 60, endPoint.y);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DetailedMindMap::new);
    }
}
