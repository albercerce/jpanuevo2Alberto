package Entity;

import javax.persistence.*;
import java.sql.Timestamp;
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

    public Seguro() {
    }

    public Seguro(int idseguro, String nif, String nombre, String ape1, String ape2, int edad,
                  int sexo, String casado, int numhijos, Timestamp fechacreacion,
                  String tiposeguro) {
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
    }

    public Seguro(String nif, String nombre, String ape1, String ape2, int edad,
                  int sexo, String casado, int numhijos, Timestamp fechacreacion,
                  String tiposeguro) {

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
    }

    @Id
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
                '}';
    }
}
