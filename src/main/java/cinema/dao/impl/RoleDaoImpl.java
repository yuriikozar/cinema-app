package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getByName(String roleName) {
        try (Session session = super.factory.openSession()) {
            Query<Role> getRoleByNameQuery = session.createQuery("FROM Role r "
                    + "WHERE roleName = :roleName", Role.class);
            getRoleByNameQuery.setParameter("roleName", Role.RoleName.valueOf(roleName));
            return getRoleByNameQuery.uniqueResultOptional();

        } catch (Exception e) {
            throw new DataProcessingException("Can`t get role by role name: " + roleName, e);
        }
    }
}
