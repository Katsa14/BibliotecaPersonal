 package com.java.juli.biblioteca.mislibros;

 public class Usuario{

    private String nombre_usuario;
    private String contraseña_usuario;
    private String fecha_nacimiento; 

    public String getNombre_Usuario(){
 
        return nombre_usuario;

    }

    public void setNombre_Usuario(String nombre_usuario){

        this.nombre_usuario = nombre_usuario;
    }

    public  String getContraseña_Usuario(){

        return contraseña_usuario;

    }

    public void setContraseña_Usuario(String contraseña_usuario){

        this.contraseña_usuario = contraseña_usuario;

    }

    public String getFecha_Nacimiento(){

        return fecha_nacimiento;

    }

    public void setFecha_Nacimiento(String fecha_nacimiento){

        this.fecha_nacimiento = fecha_nacimiento;
    }

 
 }