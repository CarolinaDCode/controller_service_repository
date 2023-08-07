package academy.atl.propiedades.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public class EmailRepository {
    @PersistenceContext
    private EntityManager baseDeDatos;

    @Transactional
    public void guardarEmail(String emailDelUsuario) {
        String consultaSql = "INSERT INTO lead (email) VALUES (:paramEmail)";
        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail", emailDelUsuario)
                .executeUpdate();
    }

    @Transactional
    public void eliminarEmail(String emailDelUsuario) {
        String consultaSql = "DELETE FROM Lead WHERE email = :paramEmail";
        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail", emailDelUsuario)
                .getResultList();
    }
}
