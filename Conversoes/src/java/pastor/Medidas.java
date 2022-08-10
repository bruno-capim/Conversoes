/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastor;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Medidas {
    double velocidade, temperatura, distancia, massa, milha_H, fehreinheit, jardas, libras, resul_v, resul_t, resul_d, resul_m, resul_mh, resul_f,resul_jrds,resul_lb;  
    
    public void calcular(){
        resul_v = velocidade * 0.621;
        
        resul_t = ((temperatura * 9) /5) +32;
        
        resul_d = distancia * 1.093;
        
        resul_m = massa * 2.205;
    }
    
    public void apagar(){
        
        resul_v = 0;
        resul_t = 0;
        resul_d = 0;
        resul_m = 0;

        velocidade = 0;
        distancia = 0;
        massa = 0;
        temperatura = 0;
        
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getMilha_H() {
        return milha_H;
    }

    public void setMilha_H(double milha_H) {
        this.milha_H = milha_H;
    }

    public double getFehreinheit() {
        return fehreinheit;
    }

    public void setFehreinheit(double fehreinheit) {
        this.fehreinheit = fehreinheit;
    }

    public double getJardas() {
        return jardas;
    }

    public void setJardas(double jardas) {
        this.jardas = jardas;
    }

    public double getLibras() {
        return libras;
    }

    public void setLibras(double libras) {
        this.libras = libras;
    }

    public double getResul_v() {
        return resul_v;
    }

    public void setResul_v(double resul_v) {
        this.resul_v = resul_v;
    }

    public double getResul_t() {
        return resul_t;
    }

    public void setResul_t(double resul_t) {
        this.resul_t = resul_t;
    }

    public double getResul_d() {
        return resul_d;
    }

    public void setResul_d(double resul_d) {
        this.resul_d = resul_d;
    }

    public double getResul_m() {
        return resul_m;
    }

    public void setResul_m(double resul_m) {
        this.resul_m = resul_m;
    }

    public double getResul_mh() {
        return resul_mh;
    }

    public void setResul_mh(double resul_mh) {
        this.resul_mh = resul_mh;
    }

    public double getResul_f() {
        return resul_f;
    }

    public void setResul_f(double resul_f) {
        this.resul_f = resul_f;
    }

    public double getResul_jrds() {
        return resul_jrds;
    }

    public void setResul_jrds(double resul_jrds) {
        this.resul_jrds = resul_jrds;
    }

    public double getResul_lb() {
        return resul_lb;
    }

    public void setResul_lb(double resul_lb) {
        this.resul_lb = resul_lb;
    }
}


   

