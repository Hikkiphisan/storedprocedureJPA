package org.example.springjpastoreproceduce.repository;

import org.example.springjpastoreproceduce.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Transactional
//Tất cả những thao tác trong phương thức sẽ là thực thị giao dịch, chỉ cfn có một lỗi xảy ra thì giao dịch sẽ bị rollback, giữ cho CSDL ở trạng thái nhất quán,
@Repository
public class CustomerRepository implements ICustomerRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean saveWithStoredProcedure(Customer customer) {
        String sql = "CALL Insert_Customer(:firstName, :lastName)";
        Query query = entityManager.createNativeQuery(sql);
        query.setParameter("firstName", customer.getFirstName());
        query.setParameter("lastName", customer.getLastName());
        return query.executeUpdate() != 0;
    }
}