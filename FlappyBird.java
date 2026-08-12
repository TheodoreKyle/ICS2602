import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FlappyBird extends JPanel implements KeyListener {
// Game variables
private int birdY = 200;
private int birdX = 50;
private int pipeX = 500;
private int pipeY;
private int score = 0;
private boolean gameOver = false;
private Random random = new Random();

// Game constants
private final int BIRD_SIZE = 30;
private final int PIPE_WIDTH = 50;
private final int GAP = 100;

public FlappyBird() {
addKeyListener(this);
setFocusable(true);
setBackground(Color.CYAN); 
Timer timer = new Timer(16, _ -> update()); 
timer.start();
}

private void update() {
if (!gameOver) {
birdY += 2; // gravity
pipeX -= 2; // pipe movement

if (pipeX < -PIPE_WIDTH) {
pipeX = 500;
pipeY = random.nextInt(300);
}

checkCollision();
}
repaint();
}

private void checkCollision() {
if (birdY + BIRD_SIZE > getHeight() || birdY < 0) {
gameOver = true;
}
if (pipeX < birdX + BIRD_SIZE && pipeX + PIPE_WIDTH > birdX) {
if (birdY < pipeY || birdY + BIRD_SIZE > pipeY + GAP) {
gameOver = true;
}
}
}

@Override
public void paintComponent(Graphics g) {
super.paintComponent(g);
g.setColor(Color.BLACK);
g.fillOval(birdX, birdY, BIRD_SIZE, BIRD_SIZE); // bird
g.fillRect(pipeX, 0, PIPE_WIDTH, pipeY); // top pipe
g.fillRect(pipeX, pipeY + GAP, PIPE_WIDTH, getHeight()); // bottom pipe
g.drawString("Score: " + score, 10, 20);
if (gameOver) {
g.drawString("Game Over! Press Space to restart.", 100, getHeight() / 2);
}
}

@Override
public void keyTyped(KeyEvent e) {}

@Override
public void keyPressed(KeyEvent e) {
if (e.getKeyCode() == KeyEvent.VK_SPACE) {
if (gameOver) {
restart();
} else {
birdY -= 20; // jump
}
}
}

@Override
public void keyReleased(KeyEvent e) {}

private void restart() {
birdY = 200;
pipeX = 500;
score = 0;
gameOver = false;
}

public static void main(String[] args) {
JFrame frame = new JFrame("Flappy Bird");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(new FlappyBird());
frame.setSize(600, 600);
frame.setVisible(true);
}
}