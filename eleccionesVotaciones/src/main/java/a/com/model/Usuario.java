/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Yesid
 */
public class Usuario implements Serializable {

    private List<Usuario> usuarioLista = new ArrayList();
    private String nombre;
    private String apellido;
    private int edad;
    private Date fecha_Nacimiento;
    private UploadedFile foto;
    private String sexo;
    private int votos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public UploadedFile getFoto() {
        return foto;
    }

    public void setFoto(UploadedFile foto) {
        this.foto = foto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public List<Usuario> getUsuarioLista() {
        return usuarioLista;
    }

    public void setUsuarioLista(List<Usuario> usuarioLista) {
        this.usuarioLista = usuarioLista;
    }

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int edad, Date fecha_Nacimiento, UploadedFile foto, String sexo, int votos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.foto = foto;
        this.sexo = sexo;
        this.votos = votos;
    }

    public void guardar() {

        usuarioLista.add(new Usuario(nombre, apellido, edad, fecha_Nacimiento, foto, sexo, votos));

        
    }

}
