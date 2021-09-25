package com.actividad.actividad.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    private String nombres;
    private String apaterno;
    private String amaterno;

    @JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    private String email;
    private String estado;
    private String celular;
    private String direccion;
    private String login;
    private String password;
    private String dni;
    private int idTipoUsuario;
    private int idUbigeo;
}
