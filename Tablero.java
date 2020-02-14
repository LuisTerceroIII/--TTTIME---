import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tablero implements ActionListener{

    protected String jugador;
    private int turno = -1;
    private Tablero mesa;
    private Frame ventana;
    protected Button[][] botones = new Button[3][3];
    private GridLayout tablero;
    private Label marca;
   
    

    public void lanzarVentana(){
        ventana = new Frame("Tic-Tac-Toe - Time!");
        ventana.setSize(500,500);
        ventana.setBackground(Color.WHITE);
        ventana.setLayout(tablero = new GridLayout(3,3,15,15));
        ventana.setVisible(true);
    }

    public void crearBotones(){
         
         botones[0][0] = new Button("1");
         botones[0][0].setActionCommand("");
         botones[0][0].addActionListener(this);
         botones[0][1] = new Button("2");
         botones[0][1].addActionListener(this);
         botones[0][2] = new Button("3");
         botones[0][2].addActionListener(this);
         botones[1][0] = new Button("4");
         botones[1][0].addActionListener(this);
         botones[1][1] = new Button("5");
         botones[1][1].addActionListener(this);
         botones[1][2] = new Button("6");
         botones[1][2].addActionListener(this);
         botones[2][0] = new Button("7");
         botones[2][0].addActionListener(this);
         botones[2][1] = new Button("8");
         botones[2][1].addActionListener(this);
         botones[2][2] = new Button("9");
         botones[2][2].addActionListener(this);
         }

    public void agregarBotones(){
        //botones = new Button[3][3];
        ventana.add(botones[0][0]);
        ventana.add(botones[0][1]);
        ventana.add(botones[0][2]);
        ventana.add(botones[1][0]);
        ventana.add(botones[1][1]);
        ventana.add(botones[1][2]);
        ventana.add(botones[2][0]);
        ventana.add(botones[2][1]);
        ventana.add(botones[2][2]);    
    }
    
    public void ifGanador(){
          VentanaGanador ventanaGanador = new VentanaGanador();
        if(botones[0][0].getBackground() == Color.ORANGE && botones[0][1].getBackground()==Color.ORANGE && botones[0][2].getBackground()==Color.ORANGE){
            System.out.println("Me imprimo si gana El jugador Naranja");
            jugador="Naranja";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[1][0].getBackground() == Color.ORANGE && botones[1][1].getBackground()==Color.ORANGE && botones[1][2].getBackground()==Color.ORANGE){
            System.out.println("Me imprimo si gana El jugador Naranja");
            jugador="Naranja";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[2][0].getBackground() == Color.ORANGE && botones[2][1].getBackground()==Color.ORANGE && botones[2][2].getBackground()==Color.ORANGE){
            System.out.println("Me imprimo si gana El jugador Naranja");
            jugador="Naranja";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[0][0].getBackground() == Color.ORANGE && botones[1][0].getBackground()==Color.ORANGE && botones[2][0].getBackground()==Color.ORANGE){
            System.out.println("Me imprimo si gana El jugador Naranja");
            jugador="Naranja";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[0][1].getBackground() == Color.ORANGE && botones[1][1].getBackground()==Color.ORANGE && botones[2][1].getBackground()==Color.ORANGE){
            System.out.println("Me imprimo si gana El jugador Naranja");
            jugador="Naranja";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[0][2].getBackground() == Color.ORANGE && botones[1][2].getBackground()==Color.ORANGE && botones[2][2].getBackground()==Color.ORANGE){
            System.out.println("Me imprimo si gana El jugador Naranja");
            jugador="Naranja";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[0][0].getBackground() == Color.ORANGE && botones[1][1].getBackground()==Color.ORANGE && botones[2][2].getBackground()==Color.ORANGE){
            System.out.println("Me imprimo si gana El jugador Naranja");
            jugador="Naranja";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[2][0].getBackground() == Color.ORANGE && botones[1][1].getBackground()==Color.ORANGE && botones[0][2].getBackground()==Color.ORANGE){
            System.out.println("Me imprimo si gana El jugador Naranja");
            jugador="Naranja";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
            //FIN VALIDACIONES JUGADOR NARANJA.
        }else if(botones[0][0].getBackground() == Color.MAGENTA && botones[0][1].getBackground()==Color.MAGENTA && botones[0][2].getBackground()==Color.MAGENTA){
                System.out.println("Me imprimo si gana El jugador Magenta");
                jugador="Magenta";
                ventanaGanador.lanzarWinnerFrame();
                ventanaGanador.addComponents();
                ventana.setVisible(false);
        }else if(botones[1][0].getBackground() == Color.MAGENTA && botones[1][1].getBackground()==Color.MAGENTA && botones[1][2].getBackground()==Color.MAGENTA){
            System.out.println("Me imprimo si gana El jugador Magenta");
            jugador="Magenta";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[2][0].getBackground() == Color.MAGENTA && botones[2][1].getBackground()==Color.MAGENTA && botones[2][2].getBackground()==Color.MAGENTA){
            System.out.println("Me imprimo si gana El jugador Magenta");
            jugador="Magenta";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[0][0].getBackground() == Color.MAGENTA && botones[1][0].getBackground()==Color.MAGENTA && botones[2][0].getBackground()==Color.MAGENTA){
            System.out.println("Me imprimo si gana El jugador Magenta");
            jugador="Magenta";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[0][1].getBackground() == Color.MAGENTA && botones[1][1].getBackground()==Color.MAGENTA && botones[2][1].getBackground()==Color.MAGENTA){
            System.out.println("Me imprimo si gana El jugador Magenta");
            jugador="Magenta";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[0][2].getBackground() == Color.MAGENTA && botones[1][2].getBackground()==Color.MAGENTA && botones[2][2].getBackground()==Color.MAGENTA){
            System.out.println("Me imprimo si gana El jugador Magenta");
            jugador="Magenta";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[0][0].getBackground() == Color.MAGENTA && botones[1][1].getBackground()==Color.MAGENTA && botones[2][2].getBackground()==Color.MAGENTA){
            System.out.println("Me imprimo si gana El jugador Magenta");
            jugador="Magenta";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[2][0].getBackground() == Color.MAGENTA && botones[1][1].getBackground()==Color.MAGENTA && botones[0][2].getBackground()==Color.MAGENTA){
            System.out.println("Me imprimo si gana El jugador Magenta");
            jugador="Magenta";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }else if(botones[0][0].isEnabled()== false && botones[0][1].isEnabled()==false&& botones[0][2].isEnabled()==false&& botones[1][0].isEnabled()==false&& botones[1][1].isEnabled()==false&& botones[1][2].isEnabled()==false&& botones[2][0].isEnabled()==false&& botones[2][1].isEnabled()==false&& botones[2][2].isEnabled()==false){
            System.out.println("Nadie ha Ganado");
            jugador="Magenta";
            ventanaGanador.lanzarWinnerFrame();
            ventanaGanador.addComponents();
            ventana.setVisible(false);
        }
    }
    
    public void limpiar(){
        for(int i = 0; i<3;i++){
        botones[i][i].setEnabled(true);
        botones[i][i].setBackground(Color.white);
        }
    }
    
    public void cerrar(){
        ventana.setVisible(false);
    }
    
    
    public void actionPerformed(ActionEvent e){
        
    Button  boton = (Button) e.getSource();
    if(turno == -1){
        boton.setBackground(Color.ORANGE); 
        boton.setEnabled(false); 
        jugador = "orange";
        turno = 1;
        ifGanador();
    }else{
        if(turno == 1){
            boton.setBackground(Color.MAGENTA);
            boton.setEnabled(false);
            turno = -1;
            jugador = "magenta";
            ifGanador();    
        }
     }      
  }
    
public static void main(String[]args){
        
 
        VentanaInicio entrada = new VentanaInicio();
        entrada.crearYLanzarVentanaInicio();
        entrada.agregarComponentes();

}
}