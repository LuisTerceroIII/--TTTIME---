

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaGanador extends Tablero implements ActionListener{

    Frame ventanaGanador = new Frame("Â¡Hay un Ganador!");
    Label mensajeGanador = new Label("HAZ GANADO Â¡IMPRESIONANTE!" + jugador);//ACA DEBERIA APARECER:"Ha ganado el jugador " + jugador" PERO JUGADOR ME SALE NULL, 
    Button reinicio = new Button("Reiniciar");                          //POR AHORA LO SACO, PERO DEBE SER CORREGIDO
    Button salir = new Button("Salir");
    Tablero table = new Tablero();

    public void lanzarWinnerFrame(){
        ventanaGanador.setSize(600,300);
        ventanaGanador.setLayout(null);
        ventanaGanador.setBackground(Color.white);
        ventanaGanador.setResizable(false);
        ventanaGanador.setVisible(true);
    }

    public void addComponents(){
        ventanaGanador.add(mensajeGanador);
        mensajeGanador.setBounds(240, 70, 350, 50);
        ventanaGanador.add(reinicio);
        reinicio.setBounds(120, 150, 150, 50);
        reinicio.addActionListener(this);
        ventanaGanador.add(salir);
        salir.setBounds(320,150,150, 50);
        salir.addActionListener(this);
    }


 
@Override
    public void actionPerformed(ActionEvent e){
        try{Button boton = (Button) e.getSource();
            if(boton==reinicio){
                table.lanzarVentana();
                table.crearBotones();
                table.agregarBotones();
                ventanaGanador.setVisible(false);
            }else if(boton == salir){
                ventanaGanador.setVisible(false);
                
            }
        }catch(Exception x){
            System.out.println("WHY!!!??" + x.getMessage());//Â¿Que me queda con valor null?
        }
    }

    
}
