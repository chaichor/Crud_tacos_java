/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Menu;
import vista.frmMenu;

/**
 *
 * @author Estudiante
 */
public class ctrlMenu implements MouseListener,KeyListener
{       
        private Menu ModeloMenu;
private frmMenu vistaMenu;

//crear constructor de la clase

      public ctrlMenu (Menu ModeloQuePido, frmMenu vistaQuePido){

      this.ModeloMenu = ModeloQuePido;
      
      this.vistaMenu = vistaQuePido;

//siempre poner todos los botones que vamos a ocupar
vistaQuePido.btnAgregar.addMouseListener(this);
vistaQuePido.jtbMenu.addMouseListener(this);
vistaQuePido.btnEliminar.addMouseListener(this);
vistaQuePido.btnActualizar.addMouseListener(this);



ModeloMenu.Mostrar(vistaQuePido.jtbMenu);

}

    public ctrlMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vistaMenu.btnAgregar){
        
        
            ModeloMenu.setNombre(vistaMenu.txtNombre.getText());
            ModeloMenu.setPrecio(Double.parseDouble(vistaMenu.txtPrecio.getText()));
            ModeloMenu.setIngredientes(vistaMenu.txtIngredientes.getText());
            
            ModeloMenu.Guardar();
            
            ModeloMenu.Mostrar(vistaMenu.jtbMenu);

            
        }
        
        if(e.getSource() == vistaMenu.btnEliminar){
        
        ModeloMenu.Eliminar(vistaMenu.jtbMenu);
        ModeloMenu.Mostrar(vistaMenu.jtbMenu);
        
        }
        
        if(e.getSource() == vistaMenu.jtbMenu){
        
            ModeloMenu.setNombre(vistaMenu.txtNombre.getText());
            ModeloMenu.setPrecio(Double.parseDouble(vistaMenu.txtPrecio.getText()));
            ModeloMenu.setIngredientes(vistaMenu.txtIngredientes.getText());
            
            ModeloMenu.Actualizar(vistaMenu.jtbMenu);
            ModeloMenu.Mostrar(vistaMenu.jtbMenu);

        }
        
        if(e.getSource() == vistaMenu.btnEliminar){
        
        ModeloMenu.Eliminar(vistaMenu.jtbMenu);
        ModeloMenu.Mostrar(vistaMenu.jtbMenu);
        
        }
    }
    

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}


    