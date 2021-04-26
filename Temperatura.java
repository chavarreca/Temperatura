import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Temperatura extends JFrame implements ActionListener{
	JFrame cuadro; 
	JLabel etiqueta,resultado;
	JButton boton1,boton2;
	JTextField texto;
		
	private float cent,kelv;
		
	public Temperatura(){
		cuadro = new JFrame(); 
		etiqueta = new JLabel("TEMPERATURA");
		resultado = new JLabel("Introduzca los grados");
		boton1 = new JButton("C* -> K*");
		boton2 = new JButton("K* -> C*");
		texto = new JTextField();
		
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		
		cuadro.setVisible(true);		
		cuadro.setTitle("Conversor de Temperatura");
		cuadro.setBounds(250,250,450,300);
		cuadro.setLocation(300,200);
		cuadro.setResizable(false);
		cuadro.setLayout(new GridLayout(2,3));
		cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cuadro.add(etiqueta);
		cuadro.add(boton1);
		cuadro.add(boton2);
		cuadro.add(texto);
		cuadro.add(resultado);
		}
	
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == boton1){
			String grados = texto.getText();
			cent = Float.parseFloat(grados);
			kelv = (cent + 273.15f);
			grados = Float.toString(kelv);
			resultado.setText(grados + " K");
		}
		else if(evt.getSource() == boton2){
			String grados = texto.getText();
			kelv = Float.parseFloat(grados);
			cent = (kelv - 273.15f);
			grados = Float.toString(cent);
			resultado.setText(grados + " C");	
		}
	}
	
	public static void main(String[] arg){
		new Temperatura();
	}
}

/*
NOMBRE: Arredondo Carbajal Salvador
MATERIA: Programación Orientada a Objetos
TEMA: Interfaz Gráfica de Usuario
Practica 1
OPCIÓN 3: Conversor de Temperatura
FECHA: 26/04/2021
GRUPO: 2CM11
*/