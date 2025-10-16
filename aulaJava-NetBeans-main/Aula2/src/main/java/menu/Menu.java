
package menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class Menu extends JFrame{
    
    JMenuBar barra = new JMenuBar(); 
    
    JMenu Menu1 = new JMenu("Arquivo");
    JMenu Menu2 = new JMenu("Opções");
    
    JMenuItem item1 = new JMenuItem();
    
    public Menu(){
        setJMenuBar(barra);
        barra.add(Menu1);
        barra.add(Menu2);
        Menu2.add(item1);
        
        
        
        setTitle("Titulo Janela");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new Menu();
    }
}
