/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levantamentos.bean;

import inventario.bean.InventarioBean;
import itemPatrimonial.bean.ItemPatrimonialBean;
import java.io.Serializable;
import localidade.bean.LocalidadeBean;
import servidor.bean.ServidorBean;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author barto
 */
@Entity
public class LevantamentoBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private InventarioBean inventario;
    @ManyToOne
    private LocalidadeBean localidade;
    @OneToOne
    private ServidorBean inventariante;
    @OneToMany
    private ArrayList<ItemPatrimonialBean> itensLevantados;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public InventarioBean getInventario() {
        return inventario;
    }

    public void setInventario(InventarioBean inventario) {
        this.inventario = inventario;
    }

    public LocalidadeBean getLocalidade() {
        return localidade;
    }

    public void setLocalidade(LocalidadeBean localidade) {
        this.localidade = localidade;
    }

    public ServidorBean getInventariante() {
        return inventariante;
    }

    public void setInventariante(ServidorBean inventariante) {
        this.inventariante = inventariante;
    }

    public ArrayList<ItemPatrimonialBean> getItensLevantados() {
        return itensLevantados;
    }

    public void setItensLevantados(ArrayList<ItemPatrimonialBean> itensLevantados) {
        this.itensLevantados = itensLevantados;
    }
}
