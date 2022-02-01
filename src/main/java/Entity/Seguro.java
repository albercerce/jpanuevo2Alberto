package Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "SEGURO", uniqueConstraints = {@UniqueConstraint(columnNames = {"idseguro"})})
public class Seguro {
    private int idseguro;
    private String nif;
    private String nombre;
    private String ape1;
    private String ape2;
    private int edad;
    private int sexo;
    private String casado;
    private int numhijos;
    private Timestamp fechacreacion;
    private String tiposeguro;
    private boolean mayorEdad;
    private DateFormat fechaNacimiento;
    private LocalDateTime hora;

    public Seguro() {
    }

    public Seguro(int idseguro, String nif, String nombre, String ape1, String ape2, int edad,
                  int sexo, String casado, int numhijos, Timestamp fechacreacion,
                  String tiposeguro, boolean mayorEdad, DateFormat fechaNacimiento, LocalDateTime hora) {
        this.idseguro = idseguro;
        this.nif = nif;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.edad = edad;
        this.sexo = sexo;
        this.casado = casado;
        this.numhijos = numhijos;
        this.fechacreacion = fechacreacion;
        this.tiposeguro = tiposeguro;
        this.mayorEdad = edad>=18;
        this.fechaNacimiento = fechaNacimiento;
        this.hora = hora;
    }

    public Seguro(String nif, String nombre, String ape1, String ape2, int edad,
                  int sexo, String casado, int numhijos, Timestamp fechacreacion,
                  String tiposeguro, boolean mayorEdad, DateFormat fechaNacimiento, LocalDateTime hora) {

        this.nif = nif;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.edad = edad;
        this.sexo = sexo;
        this.casado = casado;
        this.numhijos = numhijos;
        this.fechacreacion = fechacreacion;
        this.tiposeguro = tiposeguro;
        this.mayorEdad = edad>=18;
        this.fechaNacimiento = fechaNacimiento;
        this.hora = hora;
    }

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDSEGURO", nullable = false)
    public int getIdseguro() {
        return idseguro;
    }

    public void setIdseguro(int idseguro) {
        this.idseguro = idseguro;
    }

    @Basic
    @Column(name = "NIF", nullable = false, length = 255)
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Basic
    @Column(name = "NOMBRE", nullable = true, length = 255)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "APE1", nullable = true, length = 255)
    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    @Basic
    @Column(name = "APE2", nullable = true, length = 255)
    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    @Basic
    @Column(name = "EDAD", nullable = true)
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Basic
    @Column(name = "SEXO", nullable = true)
    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    @Basic
    @Column(name = "CASADO", nullable = true, length = 1)
    public String getCasado() {
        return casado;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }

    @Basic
    @Column(name = "NUMHIJOS", nullable = true)
    public int getNumhijos() {
        return numhijos;
    }

    public void setNumhijos(int numhijos) {
        this.numhijos = numhijos;
    }

    @Basic
    @Column(name = "FECHACREACION", nullable = true)
    public Timestamp getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Timestamp fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    @Basic
    @Column(name = "TIPOSEGURO", nullable = true, length = 255)
    public String getTiposeguro() {
        return tiposeguro;
    }

    public void setTiposeguro(String tiposeguro) {
        this.tiposeguro = tiposeguro;
    }

    @Basic
    @Column(name = "MAYOREDAD")
    public Boolean getMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(Boolean mayorEdad) {
        this.mayorEdad = edad >= 18;
    }

    @Basic
    @Column(name = "FECHANACIMIENTO", nullable = true, length = 255)
    public DateFormat getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(DateFormat fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Basic
    @Column(name = "HORA", nullable = true, length = 255)
    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.ape2 = ape2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seguro)) return false;
        Seguro seguro = (Seguro) o;
        return getIdseguro() == seguro.getIdseguro() && getEdad() == seguro.getEdad() && getSexo() == seguro.getSexo() && getNumhijos() == seguro.getNumhijos() && Objects.equals(getNif(), seguro.getNif()) && Objects.equals(getNombre(), seguro.getNombre()) && Objects.equals(getApe1(), seguro.getApe1()) && Objects.equals(getApe2(), seguro.getApe2()) && Objects.equals(getCasado(), seguro.getCasado()) && Objects.equals(getFechacreacion(), seguro.getFechacreacion()) && Objects.equals(getTiposeguro(), seguro.getTiposeguro());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdseguro(), getNif(), getNombre(), getApe1(), getApe2(), getEdad(), getSexo(), getCasado(), getNumhijos(), getFechacreacion(), getTiposeguro());
    }

    @Override
    public String toString() {
        return "Seguro{" +
                "idseguro=" + idseguro +
                ", nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ape1='" + ape1 + '\'' +
                ", ape2='" + ape2 + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", casado='" + casado + '\'' +
                ", numhijos=" + numhijos +
                ", fechacreacion=" + fechacreacion +
                ", tiposeguro='" + tiposeguro + '\'' +
                ", mayorEdad=" + mayorEdad +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
