/*Panel de biencenida
|-----------------------------------------------------------------------|
|                                                                       |
|                                                                       |
|                       Tic Tac Toe Time                                | //Â¿Existira un metodo exit para salir de ventanas
|                                                                       | // y luego abrir otra con un setVisible(true)?
|                                                                       |                                                   |       __________________  __________________                          |
|       |Iniciar Partida |  |   Salir         |                         | //Ventana unica, en manejo de botones cerramos
|       ------------------  ------------------                          | // esta y pasamos a otra
|                                                                       |
|                                                                       |
|_______________________________________________________________________|
                                                                                        */

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicio implements ActionListener{
    /*Nota: Cambiar layout null, por un gridLayout*/
    Label bienvenida = new Label("Tic- Tac- Toe- Time");
    Button iniciar = new Button("Iniciar Partida");
    Button salir = new Button("Salir");
    Frame entrada = new Frame();
    Frame ventana = new Frame();
    Tablero tab = new Tablero();
    
    public void crearYLanzarVentanaInicio(){
    entrada.setSize(600,300);
    entrada.setLayout(null);
    entrada.setBackground(Color.white);
    entrada.setResizable(false);
    entrada.setVisible(true);
    }

    public void agregarComponentes(){
        entrada.add(bienvenida);
        bienvenida.setBounds(240, 70, 350, 50);
        entrada.add(iniciar);
        iniciar.setBounds(120, 150, 150, 50);
        iniciar.addActionListener(this);
        entrada.add(salir);
        salir.setBounds(320,150,150, 50);
        salir.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        Button boton = (Button) e.getSource();
        if(boton == iniciar){
            tab.lanzarVentana();
            tab.crearBotones();
            tab.agregarBotones();
            entrada.setVisible(false);
        }else if(boton == salir){
            entrada.setVisible(false);
        }
    }
    }
