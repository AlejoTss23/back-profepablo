package com.pps.pps.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "caja")
public class CajaModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "numeroTropa", length = 60, nullable = false, unique = true)
    private int numeroTropa;
    @Column(name = "fechaFaena", length = 60, nullable = false)
    private String fechaFaena;
    @Column(name = "fechaVencimiento", length = 60, nullable = false)
    private String fechaVencimiento;
    @Column(name = "procedencia", length = 60, nullable = false)
    private String procedencia;
    @Column(name = "tipoCorte", length = 60, nullable = false)
    private String tipoCorte;
    @Column( name= "pesoNeto", length = 60, nullable = false)
    private Float pesoNeto;
    @Column( name= "QR", length = 60, nullable = false)
    private int QR;
    @Column(name = "codigoBarra", length = 60, nullable= false)
    private int codigoBarra;

    public CajaModelo() {

    }

    public CajaModelo(long id, int numeroTropa, String fechaFaena, String fechaVencimiento, String procedencia,
            String tipoCorte, Float pesoNeto, int qR, int codigoBarra) {
        this.id = id;
        this.numeroTropa = numeroTropa;
        this.fechaFaena = fechaFaena;
        this.fechaVencimiento = fechaVencimiento;
        this.procedencia = procedencia;
        this.tipoCorte = tipoCorte;
        this.pesoNeto = pesoNeto;
        QR = qR;
        this.codigoBarra = codigoBarra;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumeroTropa() {
        return numeroTropa;
    }

    public void setNumeroTropa(int numeroTropa) {
        this.numeroTropa = numeroTropa;
    }

    public String getFechaFaena() {
        return fechaFaena;
    }

    public void setFechaFaena(String fechaFaena) {
        this.fechaFaena = fechaFaena;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(String tipoCorte) {
        this.tipoCorte = tipoCorte;
    }

    public Float getPesoNeto() {
        return pesoNeto;
    }

    public void setPesoNeto(Float pesoNeto) {
        this.pesoNeto = pesoNeto;
    }

    public int getQR() {
        return QR;
    }

    public void setQR(int qR) {
        QR = qR;
    }

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    
}

