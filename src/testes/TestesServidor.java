/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import servidor.bean.ServidorBean;
import javax.persistence.EntityManager;
import setor.bean.SetorBean;
import util.ConexaoJPA;

/**
 *
 * @author barto
 */
public class TestesServidor {

    public static void main(String[] args) {
        SetorBean sb = new SetorBean();
        sb.setNome("Nucleo de TI");
        sb.setEmail("nti@gmail.com.br");
        sb.setSigla("NTI");
        sb.setRamal("1544");

        ServidorBean s = new ServidorBean();
        s.setNome("Augusto Parmalat");
        s.setMatricula("13897");
        s.setSetor(sb);

        sb.setResponsavel(s);

        EntityManager em = ConexaoJPA.getConexao();
        em.getTransaction().begin();
        em.persist(s);
        em.persist(sb);
        em.getTransaction().commit();

        em.close();
        ConexaoJPA.fechar();

    }

}
