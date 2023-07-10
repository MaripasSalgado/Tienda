package com.Tienda.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable{

    private static final long serialVersionUID = 11;
    @Id
    @GeneratedValue
    @Column(name="id_producto")
    private Long idProducto;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;

    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;

    public Producto() {
    }


    
}
