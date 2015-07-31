package br.com.social.projetocamus.repository;

import br.com.social.projetocamus.domain.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author wn02
 */
//@Repository
public class UsuarioRepository {

//    @PersistenceContext
//    private EntityManager entityManager;

//    @Transactional
//    public void salvarUsuario(Usuario usuario) {
//        entityManager.persist(usuario);
//    }
//
//    @Transactional
//    public void excluirUsuario(Integer id) {
//        Usuario usuario = entityManager.find(Usuario.class, id);
//        entityManager.remove(usuario);
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<Usuario> listaUsuarios() {
//        Query query = entityManager.createQuery("Select u from Usuario u order by u.codigo");
//        return query.getResultList();
//    }
}
